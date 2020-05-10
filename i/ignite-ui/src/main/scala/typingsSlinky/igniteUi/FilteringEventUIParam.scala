package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteringEventUIParam extends js.Object {
  /**
  	 * Used to obtain reference to array which contains expressions supported by [$.ig.DataSource](ig.datasource).
  	 */
  var expression: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to obtain reference to igCombo.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object FilteringEventUIParam {
  @scala.inline
  def apply(): FilteringEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringEventUIParam]
  }
  @scala.inline
  implicit class FilteringEventUIParamOps[Self <: FilteringEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.undefined)
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
  }
  
}

