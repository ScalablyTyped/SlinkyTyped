package typingsSlinky.blueprintjsCore.controlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwitchProps extends IControlProps {
  /**
    * Text to display inside the switch indicator when unchecked.
    */
  var innerLabel: js.UndefOr[String] = js.native
  /**
    * Text to display inside the switch indicator when checked.
    * If `innerLabel` is provided and this prop is omitted, then `innerLabel`
    * will be used for both states.
    * @default innerLabel
    */
  var innerLabelChecked: js.UndefOr[String] = js.native
}

object ISwitchProps {
  @scala.inline
  def apply(): ISwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISwitchProps]
  }
  @scala.inline
  implicit class ISwitchPropsOps[Self <: ISwitchProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInnerLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerLabelChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerLabelChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerLabelChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerLabelChecked")(js.undefined)
        ret
    }
  }
  
}

