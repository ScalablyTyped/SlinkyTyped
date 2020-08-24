package typingsSlinky.aframe.mod.THREE

import typingsSlinky.three.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.SpotLight")
@js.native
class SpotLight protected ()
  extends typingsSlinky.three.mod.SpotLight {
  def this(
    color: js.UndefOr[Color | String | Double],
    intensity: js.UndefOr[Double],
    distance: js.UndefOr[Double],
    angle: js.UndefOr[Double],
    penumbra: js.UndefOr[Double],
    decay: js.UndefOr[Double]
  ) = this()
}

