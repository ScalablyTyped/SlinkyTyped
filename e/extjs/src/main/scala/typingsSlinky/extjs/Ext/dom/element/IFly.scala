package typingsSlinky.extjs.Ext.dom.element

import typingsSlinky.extjs.Ext.dom.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFly extends IElement {
  /** [Property] (Boolean) */
  var isFly: js.UndefOr[Boolean] = js.native
}

object IFly {
  @scala.inline
  def apply(): IFly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFly]
  }
  @scala.inline
  implicit class IFlyOps[Self <: IFly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFly")(js.undefined)
        ret
    }
  }
  
}

