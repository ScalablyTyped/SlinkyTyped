package typingsSlinky.extjs.Ext.menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISeparator extends IItem {
  /** [Config Option] (String) */
  var separatorCls: js.UndefOr[String] = js.native
}

object ISeparator {
  @scala.inline
  def apply(): ISeparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISeparator]
  }
  @scala.inline
  implicit class ISeparatorOps[Self <: ISeparator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeparatorCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparatorCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorCls")(js.undefined)
        ret
    }
  }
  
}

