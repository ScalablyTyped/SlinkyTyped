package typingsSlinky.fastGlob.providerMod

import typingsSlinky.fastGlob.tasksMod.Task
import typingsSlinky.fastGlob.typesMod.MicromatchOptions
import typingsSlinky.fastGlob.typesMod.ReaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider[T] extends js.Object {
  
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
  implicit class ProviderOps[Self <: Provider[_], T] (val x: Self with Provider[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_getMicromatchOptions(value: () => MicromatchOptions): Self = this.set("_getMicromatchOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_getReaderOptions(value: Task => ReaderOptions): Self = this.set("_getReaderOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getRootDirectory(value: Task => String): Self = this.set("_getRootDirectory", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_settings(value: typingsSlinky.fastGlob.settingsMod.default): Self = this.set("_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepFilter(value: typingsSlinky.fastGlob.deepMod.default): Self = this.set("deepFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryFilter(value: typingsSlinky.fastGlob.entryMod.default): Self = this.set("entryFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryTransformer(value: typingsSlinky.fastGlob.transformersEntryMod.default): Self = this.set("entryTransformer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorFilter(value: typingsSlinky.fastGlob.errorMod.default): Self = this.set("errorFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: Task => T): Self = this.set("read", js.Any.fromFunction1(value))
  }
}
