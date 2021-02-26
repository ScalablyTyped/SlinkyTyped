package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.tasksMod.Task
import typingsSlinky.fastGlob.typesMod.MicromatchOptions
import typingsSlinky.fastGlob.typesMod.ReaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("fast-glob/out/providers/provider", JSImport.Default)
  @js.native
  abstract class default[T] protected () extends Provider[T] {
    def this(_settings: typingsSlinky.fastGlob.settingsMod.default) = this()
  }
  
  @js.native
  trait Provider[T] extends StObject {
    
    /* protected */ def _getMicromatchOptions(): MicromatchOptions = js.native
    
    /* protected */ def _getReaderOptions(task: Task): ReaderOptions = js.native
    
    /* protected */ def _getRootDirectory(task: Task): String = js.native
    
    val _settings: typingsSlinky.fastGlob.settingsMod.default = js.native
    
    val deepFilter: typingsSlinky.fastGlob.deepMod.default = js.native
    
    val entryFilter: typingsSlinky.fastGlob.entryMod.default = js.native
    
    val entryTransformer: typingsSlinky.fastGlob.transformersEntryMod.default = js.native
    
    val errorFilter: typingsSlinky.fastGlob.errorMod.default = js.native
    
    def read(_task: Task): T = js.native
  }
  object Provider {
    
    @scala.inline
    def apply[T](
      _getMicromatchOptions: () => MicromatchOptions,
      _getReaderOptions: Task => ReaderOptions,
      _getRootDirectory: Task => String,
      _settings: typingsSlinky.fastGlob.settingsMod.default,
      deepFilter: typingsSlinky.fastGlob.deepMod.default,
      entryFilter: typingsSlinky.fastGlob.entryMod.default,
      entryTransformer: typingsSlinky.fastGlob.transformersEntryMod.default,
      errorFilter: typingsSlinky.fastGlob.errorMod.default,
      read: Task => T
    ): Provider[T] = {
      val __obj = js.Dynamic.literal(_getMicromatchOptions = js.Any.fromFunction0(_getMicromatchOptions), _getReaderOptions = js.Any.fromFunction1(_getReaderOptions), _getRootDirectory = js.Any.fromFunction1(_getRootDirectory), _settings = _settings.asInstanceOf[js.Any], deepFilter = deepFilter.asInstanceOf[js.Any], entryFilter = entryFilter.asInstanceOf[js.Any], entryTransformer = entryTransformer.asInstanceOf[js.Any], errorFilter = errorFilter.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[Provider[T]]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider[_], T] (val x: Self with Provider[T]) extends AnyVal {
      
      @scala.inline
      def setDeepFilter(value: typingsSlinky.fastGlob.deepMod.default): Self = StObject.set(x, "deepFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryFilter(value: typingsSlinky.fastGlob.entryMod.default): Self = StObject.set(x, "entryFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryTransformer(value: typingsSlinky.fastGlob.transformersEntryMod.default): Self = StObject.set(x, "entryTransformer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorFilter(value: typingsSlinky.fastGlob.errorMod.default): Self = StObject.set(x, "errorFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: Task => T): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_getMicromatchOptions(value: () => MicromatchOptions): Self = StObject.set(x, "_getMicromatchOptions", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_getReaderOptions(value: Task => ReaderOptions): Self = StObject.set(x, "_getReaderOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_getRootDirectory(value: Task => String): Self = StObject.set(x, "_getRootDirectory", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_settings(value: typingsSlinky.fastGlob.settingsMod.default): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
