package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterDialogContentsRenderedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the filtering dialog DOM element.
  	 */
  var dialogElement: js.UndefOr[String] = js.native
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object FilterDialogContentsRenderedEventUIParam {
  @scala.inline
  def apply(): FilterDialogContentsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogContentsRenderedEventUIParam]
  }
  @scala.inline
  implicit class FilterDialogContentsRenderedEventUIParamOps[Self <: FilterDialogContentsRenderedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogElement")(js.undefined)
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

