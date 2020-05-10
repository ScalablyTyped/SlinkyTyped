package typingsSlinky.ejWebAll.ej.PivotTreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrillSuccessEventArgs extends js.Object {
  /** return the HTML element of PivotTreeMap control.
    */
  var element: js.UndefOr[js.Any] = js.native
}

object DrillSuccessEventArgs {
  @scala.inline
  def apply(): DrillSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrillSuccessEventArgs]
  }
  @scala.inline
  implicit class DrillSuccessEventArgsOps[Self <: DrillSuccessEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
  }
  
}

