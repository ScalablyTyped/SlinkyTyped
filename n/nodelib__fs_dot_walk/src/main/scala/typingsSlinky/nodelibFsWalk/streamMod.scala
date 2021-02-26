package typingsSlinky.nodelibFsWalk

import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("@nodelib/fs.walk/out/providers/stream", JSImport.Default)
  @js.native
  class default protected () extends StreamProvider {
    def this(_root: String, _settings: typingsSlinky.nodelibFsWalk.settingsMod.default) = this()
  }
  
  @js.native
  trait StreamProvider extends StObject {
    
    val _reader: typingsSlinky.nodelibFsWalk.readersAsyncMod.default = js.native
    
    val _root: js.Any = js.native
    
    val _settings: js.Any = js.native
    
    val _stream: Readable = js.native
    
    def read(): Readable = js.native
  }
  object StreamProvider {
    
    @scala.inline
    def apply(
      _reader: typingsSlinky.nodelibFsWalk.readersAsyncMod.default,
      _root: js.Any,
      _settings: js.Any,
      _stream: Readable,
      read: () => Readable
    ): StreamProvider = {
      val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _stream = _stream.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[StreamProvider]
    }
    
    @scala.inline
    implicit class StreamProviderMutableBuilder[Self <: StreamProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: () => Readable): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_reader(value: typingsSlinky.nodelibFsWalk.readersAsyncMod.default): Self = StObject.set(x, "_reader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_root(value: js.Any): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stream(value: Readable): Self = StObject.set(x, "_stream", value.asInstanceOf[js.Any])
    }
  }
}
