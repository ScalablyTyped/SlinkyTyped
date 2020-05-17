package typingsSlinky.aframe.mod.global.AFRAME.THREE

import typingsSlinky.three.constantsMod.Mapping
import typingsSlinky.three.constantsMod.TextureDataType
import typingsSlinky.three.constantsMod.TextureFilter
import typingsSlinky.three.constantsMod.Wrapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.THREE.DepthTexture")
@js.native
class DepthTexture protected ()
  extends typingsSlinky.three.mod.DepthTexture {
  def this(
    width: Double,
    heighht: Double,
    `type`: js.UndefOr[TextureDataType],
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[TextureFilter],
    minFilter: js.UndefOr[TextureFilter],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

