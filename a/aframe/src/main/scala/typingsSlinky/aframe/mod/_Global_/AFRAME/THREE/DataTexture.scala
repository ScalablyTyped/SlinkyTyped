package typingsSlinky.aframe.mod._Global_.AFRAME.THREE

import typingsSlinky.three.constantsMod.Mapping
import typingsSlinky.three.constantsMod.PixelFormat
import typingsSlinky.three.constantsMod.TextureDataType
import typingsSlinky.three.constantsMod.TextureEncoding
import typingsSlinky.three.constantsMod.TextureFilter
import typingsSlinky.three.constantsMod.Wrapping
import typingsSlinky.three.polyfillsMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.THREE.DataTexture")
@js.native
class DataTexture protected ()
  extends typingsSlinky.three.mod.DataTexture {
  def this(
    data: TypedArray,
    width: Double,
    height: Double,
    format: js.UndefOr[PixelFormat],
    `type`: js.UndefOr[TextureDataType],
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[TextureFilter],
    minFilter: js.UndefOr[TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[TextureEncoding]
  ) = this()
}

