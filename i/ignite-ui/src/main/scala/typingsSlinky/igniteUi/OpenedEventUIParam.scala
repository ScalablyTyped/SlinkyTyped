package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenedEventUIParam extends js.Object {
  /**
  	 * Used to obtain reference to menu widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object OpenedEventUIParam {
  @scala.inline
  def apply(): OpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenedEventUIParam]
  }
  @scala.inline
  implicit class OpenedEventUIParamOps[Self <: OpenedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

