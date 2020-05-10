package typingsSlinky.extjs.Ext.toolbar

import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFill extends IComponent {
  /** [Property] (Boolean) */
  var isFill: js.UndefOr[Boolean] = js.native
}

object IFill {
  @scala.inline
  def apply(): IFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFill]
  }
  @scala.inline
  implicit class IFillOps[Self <: IFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFill")(js.undefined)
        ret
    }
  }
  
}

