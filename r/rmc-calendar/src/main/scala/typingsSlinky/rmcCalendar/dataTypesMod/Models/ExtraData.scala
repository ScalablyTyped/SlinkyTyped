package typingsSlinky.rmcCalendar.dataTypesMod.Models

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraData extends js.Object {
  /** (web only) 附加cell样式 className */
  var cellCls: js.UndefOr[js.Any] = js.native
  var cellRender: js.UndefOr[js.Function1[/* date */ js.Date, TagMod[Any]]] = js.native
  /** 是否禁止选择 */
  var disable: js.UndefOr[Boolean] = js.native
  /** 扩展信息 */
  var info: js.UndefOr[String] = js.native
}

object ExtraData {
  @scala.inline
  def apply(): ExtraData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraData]
  }
  @scala.inline
  implicit class ExtraDataOps[Self <: ExtraData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellCls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellCls")(js.undefined)
        ret
    }
    @scala.inline
    def withCellRender(value: /* date */ js.Date => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
  }
  
}

