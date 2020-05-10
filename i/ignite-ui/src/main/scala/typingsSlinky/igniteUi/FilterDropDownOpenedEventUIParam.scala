package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterDropDownOpenedEventUIParam extends js.Object {
  /**
  	 * A reference to the drop down.
  	 */
  var dropDownElement: js.UndefOr[String] = js.native
  /**
  	 * A reference to the hierarchy.
  	 */
  var hierarchy: js.UndefOr[js.Any] = js.native
}

object FilterDropDownOpenedEventUIParam {
  @scala.inline
  def apply(): FilterDropDownOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDropDownOpenedEventUIParam]
  }
  @scala.inline
  implicit class FilterDropDownOpenedEventUIParamOps[Self <: FilterDropDownOpenedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropDownElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownElement")(js.undefined)
        ret
    }
    @scala.inline
    def withHierarchy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchy")(js.undefined)
        ret
    }
  }
  
}

