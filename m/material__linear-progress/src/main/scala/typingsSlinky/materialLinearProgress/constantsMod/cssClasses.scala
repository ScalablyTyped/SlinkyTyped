package typingsSlinky.materialLinearProgress.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialLinearProgress.materialLinearProgressStrings.`mdc-linear-progress--closed`
import typingsSlinky.materialLinearProgress.materialLinearProgressStrings.`mdc-linear-progress--indeterminate`
import typingsSlinky.materialLinearProgress.materialLinearProgressStrings.`mdc-linear-progress--reversed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var CLOSED_CLASS: `mdc-linear-progress--closed` = js.native
  var INDETERMINATE_CLASS: `mdc-linear-progress--indeterminate` = js.native
  var REVERSED_CLASS: `mdc-linear-progress--reversed` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    CLOSED_CLASS: `mdc-linear-progress--closed`,
    INDETERMINATE_CLASS: `mdc-linear-progress--indeterminate`,
    REVERSED_CLASS: `mdc-linear-progress--reversed`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(CLOSED_CLASS = CLOSED_CLASS.asInstanceOf[js.Any], INDETERMINATE_CLASS = INDETERMINATE_CLASS.asInstanceOf[js.Any], REVERSED_CLASS = REVERSED_CLASS.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCLOSED_CLASS(value: `mdc-linear-progress--closed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_CLASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINDETERMINATE_CLASS(value: `mdc-linear-progress--indeterminate`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INDETERMINATE_CLASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREVERSED_CLASS(value: `mdc-linear-progress--reversed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REVERSED_CLASS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

