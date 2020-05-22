package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CubeMapInfo extends js.Object {
  /**
    * The pixel array for the back face.
    * This is stored in format, left to right, up to down format.
    */
  var back: Nullable[js.typedarray.ArrayBufferView]
  /**
    * The pixel array for the down face.
    * This is stored in format, left to right, up to down format.
    */
  var down: Nullable[js.typedarray.ArrayBufferView]
  /**
    * The format of the texture.
    *
    * RGBA, RGB.
    */
  var format: Double
  /**
    * The pixel array for the front face.
    * This is stored in format, left to right, up to down format.
    */
  var front: Nullable[js.typedarray.ArrayBufferView]
  /**
    * Specifies whether the texture is in gamma space.
    */
  var gammaSpace: Boolean
  /**
    * The pixel array for the left face.
    * This is stored in format, left to right, up to down format.
    */
  var left: Nullable[js.typedarray.ArrayBufferView]
  /**
    * The pixel array for the right face.
    * This is stored in format, left to right, up to down format.
    */
  var right: Nullable[js.typedarray.ArrayBufferView]
  /**
    * The size of the cubemap stored.
    *
    * Each faces will be size * size pixels.
    */
  var size: Double
  /**
    * The type of the texture data.
    *
    * UNSIGNED_INT, FLOAT.
    */
  var `type`: Double
  /**
    * The pixel array for the up face.
    * This is stored in format, left to right, up to down format.
    */
  var up: Nullable[js.typedarray.ArrayBufferView]
}

object CubeMapInfo {
  @scala.inline
  def apply(
    format: Double,
    gammaSpace: Boolean,
    size: Double,
    `type`: Double,
    back: Nullable[js.typedarray.ArrayBufferView] = null,
    down: Nullable[js.typedarray.ArrayBufferView] = null,
    front: Nullable[js.typedarray.ArrayBufferView] = null,
    left: Nullable[js.typedarray.ArrayBufferView] = null,
    right: Nullable[js.typedarray.ArrayBufferView] = null,
    up: Nullable[js.typedarray.ArrayBufferView] = null
  ): CubeMapInfo = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], gammaSpace = gammaSpace.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], back = back.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CubeMapInfo]
  }
}

