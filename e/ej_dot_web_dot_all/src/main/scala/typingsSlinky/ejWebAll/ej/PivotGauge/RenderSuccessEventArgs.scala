package typingsSlinky.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderSuccessEventArgs extends js.Object {
  /** returns the custom object bound with the control.
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** returns the HTML element of PivotGauge control.
    */
  var element: js.UndefOr[js.Any] = js.native
}

object RenderSuccessEventArgs {
  @scala.inline
  def apply(): RenderSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderSuccessEventArgs]
  }
  @scala.inline
  implicit class RenderSuccessEventArgsOps[Self <: RenderSuccessEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customObject")(js.undefined)
        ret
    }
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

