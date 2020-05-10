package typingsSlinky.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zooming extends js.Object {
  /** Enables or disables the horizontal scrollbar.
    * @Default {false}
    */
  var enableScrollbar: js.UndefOr[Boolean] = js.native
}

object Zooming {
  @scala.inline
  def apply(): Zooming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zooming]
  }
  @scala.inline
  implicit class ZoomingOps[Self <: Zooming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScrollbar")(js.undefined)
        ret
    }
  }
  
}

