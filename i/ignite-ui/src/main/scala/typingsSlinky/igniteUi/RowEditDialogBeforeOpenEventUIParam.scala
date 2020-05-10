package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowEditDialogBeforeOpenEventUIParam extends js.Object {
  /**
  	 * Gets a reference to row edit dialog DOM element.
  	 */
  var dialogElement: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object RowEditDialogBeforeOpenEventUIParam {
  @scala.inline
  def apply(): RowEditDialogBeforeOpenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEditDialogBeforeOpenEventUIParam]
  }
  @scala.inline
  implicit class RowEditDialogBeforeOpenEventUIParamOps[Self <: RowEditDialogBeforeOpenEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogElement(value: js.Any): Self = {
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

