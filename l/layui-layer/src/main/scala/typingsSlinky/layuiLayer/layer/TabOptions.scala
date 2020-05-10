package typingsSlinky.layuiLayer.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabOptions extends Options {
  /**
    * 监听选项卡的切换事件
    * @param this 传入的选项
    * @param tabIndex 选项卡索引
    */
  var change: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* tabIndex */ Double, Unit]] = js.native
  var tab: js.Array[TabItem] = js.native
}

object TabOptions {
  @scala.inline
  def apply(tab: js.Array[TabItem]): TabOptions = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabOptions]
  }
  @scala.inline
  implicit class TabOptionsOps[Self <: TabOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTab(value: js.Array[TabItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChange(value: js.ThisFunction1[TabOptions, /* tabIndex */ Double, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
  }
  
}

