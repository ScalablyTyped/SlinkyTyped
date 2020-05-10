package typingsSlinky.extjs.Ext.grid

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellContext extends IBase {
  /** [Property] (Boolean) */
  var isCellContext: js.UndefOr[Boolean] = js.native
}

object ICellContext {
  @scala.inline
  def apply(): ICellContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellContext]
  }
  @scala.inline
  implicit class ICellContextOps[Self <: ICellContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCellContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCellContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCellContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCellContext")(js.undefined)
        ret
    }
  }
  
}

