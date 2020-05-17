package typingsSlinky.reactNativeMaterialDropdown.mod

import typingsSlinky.reactNativeMaterialDropdown.anon.PartialDropDownPropsAbsoluteRTLLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownData extends js.Object {
  /** Label to be shown */
  var label: js.UndefOr[String] = js.native
  /** Props for this item */
  var props: js.UndefOr[PartialDropDownPropsAbsoluteRTLLayout] = js.native
  /** Value of item */
  var value: String = js.native
}

object DropDownData {
  @scala.inline
  def apply(value: String): DropDownData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownData]
  }
  @scala.inline
  implicit class DropDownDataOps[Self <: DropDownData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
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
    def withProps(value: PartialDropDownPropsAbsoluteRTLLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
  }
  
}

