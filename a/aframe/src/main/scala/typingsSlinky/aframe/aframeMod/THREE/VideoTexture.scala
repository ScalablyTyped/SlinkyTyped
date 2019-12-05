package typingsSlinky.aframe.aframeMod.THREE

import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.three.srcConstantsMod.Mapping
import typingsSlinky.three.srcConstantsMod.PixelFormat
import typingsSlinky.three.srcConstantsMod.TextureDataType
import typingsSlinky.three.srcConstantsMod.TextureFilter
import typingsSlinky.three.srcConstantsMod.Wrapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.VideoTexture")
@js.native
class VideoTexture protected ()
  extends typingsSlinky.three.threeMod.VideoTexture {
  def this(
    video: HTMLVideoElement,
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[TextureFilter],
    minFilter: js.UndefOr[TextureFilter],
    format: js.UndefOr[PixelFormat],
    `type`: js.UndefOr[TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

