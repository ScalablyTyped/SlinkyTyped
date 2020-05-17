package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawTexture extends Texture {
  var _engine: js.Any = js.native
  /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  var format: Double = js.native
  /**
    * Updates the texture underlying data.
    * @param data Define the new data of the texture
    */
  def update(data: js.typedarray.ArrayBufferView): Unit = js.native
}

