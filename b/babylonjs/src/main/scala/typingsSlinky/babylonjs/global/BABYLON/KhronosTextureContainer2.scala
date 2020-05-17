package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.KhronosTextureContainer2")
@js.native
class KhronosTextureContainer2 protected ()
  extends typingsSlinky.babylonjs.BABYLON.KhronosTextureContainer2 {
  def this(engine: typingsSlinky.babylonjs.BABYLON.ThinEngine) = this()
}

/* static members */
@JSGlobal("BABYLON.KhronosTextureContainer2")
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

