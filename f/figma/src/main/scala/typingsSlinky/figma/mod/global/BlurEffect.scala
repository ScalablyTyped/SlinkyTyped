package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.BACKGROUND_BLUR
import typingsSlinky.figma.figmaStrings.LAYER_BLUR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlurEffect extends Effect {
  val radius: Double = js.native
  val `type`: LAYER_BLUR | BACKGROUND_BLUR = js.native
  val visible: Boolean = js.native
}

object BlurEffect {
  @scala.inline
  def apply(radius: Double, `type`: LAYER_BLUR | BACKGROUND_BLUR, visible: Boolean): BlurEffect = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurEffect]
  }
  @scala.inline
  implicit class BlurEffectOps[Self <: BlurEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: LAYER_BLUR | BACKGROUND_BLUR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

