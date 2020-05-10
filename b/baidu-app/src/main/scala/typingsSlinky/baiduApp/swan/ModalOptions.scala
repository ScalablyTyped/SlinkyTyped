package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.AnonCancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 取消按钮的文字颜色，默认为"#000000"
  		 */
  var cancelColor: js.UndefOr[String] = js.native
  /**
  		 * 取消按钮的文字，默认为"取消"，最多 4 个字符
  		 */
  var cancelText: js.UndefOr[String] = js.native
  /**
  		 * 确定按钮的文字颜色，默认为"#3CC51F"
  		 */
  var confirmColor: js.UndefOr[String] = js.native
  /**
  		 * 确定按钮的文字，默认为"确定"，最多 4 个字符
  		 */
  var confirmText: js.UndefOr[String] = js.native
  /**
  		 * 提示的内容
  		 */
  var content: String = js.native
  /**
  		 * 是否显示取消按钮，默认为 true
  		 */
  var showCancel: js.UndefOr[Boolean] = js.native
  @JSName("success")
  var success_ModalOptions: js.UndefOr[js.Function1[/* res */ AnonCancel, Unit]] = js.native
  /**
  		 * 提示的标题
  		 */
  var title: String = js.native
}

object ModalOptions {
  @scala.inline
  def apply(content: String, title: String): ModalOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
  @scala.inline
  implicit class ModalOptionsOps[Self <: ModalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmColor")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ AnonCancel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

