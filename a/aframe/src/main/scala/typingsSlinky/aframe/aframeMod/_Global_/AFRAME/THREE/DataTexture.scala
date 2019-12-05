package typingsSlinky.aframe.aframeMod._Global_.AFRAME.THREE

import typingsSlinky.three.srcConstantsMod.Mapping
import typingsSlinky.three.srcConstantsMod.PixelFormat
import typingsSlinky.three.srcConstantsMod.TextureDataType
import typingsSlinky.three.srcConstantsMod.TextureEncoding
import typingsSlinky.three.srcConstantsMod.TextureFilter
import typingsSlinky.three.srcConstantsMod.Wrapping
import typingsSlinky.three.srcPolyfillsMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.THREE.DataTexture")
@js.native
class DataTexture protected ()
  extends typingsSlinky.three.threeMod.DataTexture {
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

