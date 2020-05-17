package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawTexture3D extends Texture {
  var _engine: js.Any = js.native
  /** Gets or sets the texture format to use */
  var format: Double = js.native
  /**
    * Update the texture with new data
    * @param data defines the data to store in the texture
    */
  def update(data: js.typedarray.ArrayBufferView): Unit = js.native
}

