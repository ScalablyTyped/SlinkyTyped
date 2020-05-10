package typingsSlinky.pixiJs

import typingsSlinky.pixiJs.PIXI.Extract
import typingsSlinky.pixiJs.PIXI.Prepare
import typingsSlinky.pixiJs.PIXI.accessibility.AccessibilityManager
import typingsSlinky.pixiJs.PIXI.interaction.InteractionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccessibility extends js.Object {
  var accessibility: AccessibilityManager = js.native
  var extract: Extract = js.native
  var interaction: InteractionManager = js.native
  var prepare: Prepare = js.native
}

object AnonAccessibility {
  @scala.inline
  def apply(
    accessibility: AccessibilityManager,
    extract: Extract,
    interaction: InteractionManager,
    prepare: Prepare
  ): AnonAccessibility = {
    val __obj = js.Dynamic.literal(accessibility = accessibility.asInstanceOf[js.Any], extract = extract.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], prepare = prepare.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessibility]
  }
  @scala.inline
  implicit class AnonAccessibilityOps[Self <: AnonAccessibility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: AccessibilityManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtract(value: Extract): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteraction(value: InteractionManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrepare(value: Prepare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

