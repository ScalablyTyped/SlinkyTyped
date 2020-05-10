package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferUpdateChangedEventUIParam extends js.Object {
  /**
  	 * Gets the defer update value.
  	 */
  var deferUpdate: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets a reference to the data selector.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object DeferUpdateChangedEventUIParam {
  @scala.inline
  def apply(): DeferUpdateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeferUpdateChangedEventUIParam]
  }
  @scala.inline
  implicit class DeferUpdateChangedEventUIParamOps[Self <: DeferUpdateChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdate")(js.undefined)
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

