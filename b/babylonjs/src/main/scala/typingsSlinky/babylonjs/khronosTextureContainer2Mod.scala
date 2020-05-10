package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/khronosTextureContainer2", JSImport.Namespace)
@js.native
object khronosTextureContainer2Mod extends js.Object {
  @js.native
  class KhronosTextureContainer2 protected () extends js.Object {
    def this(engine: ThinEngine) = this()
    var _determineTranscodeFormat: js.Any = js.native
    def uploadAsync(data: js.typedarray.ArrayBufferView, internalTexture: InternalTexture): js.Promise[Unit] = js.native
  }
  
  /* static members */
  @js.native
  object KhronosTextureContainer2 extends js.Object {
    var _ModulePromise: js.Any = js.native
    var _TranscodeFormat: js.Any = js.native
    /**
      * Checks if the given data starts with a KTX2 file identifier.
      * @param data the data to check
      * @returns true if the data is a KTX2 file or false otherwise
      */
    def IsValid(data: js.typedarray.ArrayBufferView): Boolean = js.native
  }
  
}

