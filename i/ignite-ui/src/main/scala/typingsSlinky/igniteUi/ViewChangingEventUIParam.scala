package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewChangingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the currently selected view.
  	 */
  var currentSelectedView: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the newly selected view.
  	 */
  var newSelectedView: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ViewChangingEventUIParam {
  @scala.inline
  def apply(): ViewChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewChangingEventUIParam]
  }
  @scala.inline
  implicit class ViewChangingEventUIParamOps[Self <: ViewChangingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSelectedView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSelectedView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSelectedView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSelectedView")(js.undefined)
        ret
    }
    @scala.inline
    def withNewSelectedView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSelectedView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSelectedView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSelectedView")(js.undefined)
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

