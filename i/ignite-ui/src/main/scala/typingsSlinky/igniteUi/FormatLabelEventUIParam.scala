package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatLabelEventUIParam extends js.Object {
  /**
  	 * Used to obtain the maximum value of the bullet graph scale.
  	 */
  var actualMaximumValue: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to obtain the minimum value of the bullet graph scale.
  	 */
  var actualMinimumValue: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to obtain the string value of the label.
  	 */
  var label: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to obtain reference to the bullet graph widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to obtain the value on the the bullet graph scale associated with the label.
  	 */
  var value: js.UndefOr[js.Any] = js.native
}

object FormatLabelEventUIParam {
  @scala.inline
  def apply(): FormatLabelEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatLabelEventUIParam]
  }
  @scala.inline
  implicit class FormatLabelEventUIParamOps[Self <: FormatLabelEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualMaximumValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualMaximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualMaximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withActualMinimumValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualMinimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualMinimumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

