package typingsSlinky.minappEnv.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabItemTapOption extends js.Object {
  /** 被点击tabItem的序号，从0开始，最低基础库： `1.9.0` */
  var index: String = js.native
  /** 被点击tabItem的页面路径，最低基础库： `1.9.0` */
  var pagePath: String = js.native
  /** 被点击tabItem的按钮文字，最低基础库： `1.9.0` */
  var text: String = js.native
}

object ITabItemTapOption {
  @scala.inline
  def apply(index: String, pagePath: String, text: String): ITabItemTapOption = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], pagePath = pagePath.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabItemTapOption]
  }
  @scala.inline
  implicit class ITabItemTapOptionOps[Self <: ITabItemTapOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

