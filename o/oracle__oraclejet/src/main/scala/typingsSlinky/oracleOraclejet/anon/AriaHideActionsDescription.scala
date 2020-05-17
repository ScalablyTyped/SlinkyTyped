package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AriaHideActionsDescription extends js.Object {
  var ariaHideActionsDescription: js.UndefOr[String] = js.native
  var ariaShowEndActionsDescription: js.UndefOr[String] = js.native
  var ariaShowStartActionsDescription: js.UndefOr[String] = js.native
}

object AriaHideActionsDescription {
  @scala.inline
  def apply(): AriaHideActionsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaHideActionsDescription]
  }
  @scala.inline
  implicit class AriaHideActionsDescriptionOps[Self <: AriaHideActionsDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaHideActionsDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHideActionsDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaHideActionsDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHideActionsDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaShowEndActionsDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaShowEndActionsDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaShowEndActionsDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaShowEndActionsDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaShowStartActionsDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaShowStartActionsDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaShowStartActionsDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaShowStartActionsDescription")(js.undefined)
        ret
    }
  }
  
}

