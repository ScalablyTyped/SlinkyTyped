package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.AnonInputValue
import typingsSlinky.aliApp.aliAppStrings.center
import typingsSlinky.aliApp.aliAppStrings.left
import typingsSlinky.aliApp.aliAppStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptOptions
  extends BaseOptions[js.Any, js.Any] {
  /** message对齐方式，可用枚举left/center/right，iOS ‘center’, android ‘left’ */
  var align: js.UndefOr[left | center | right | String] = js.native
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: String = js.native
  /** prompt框文本，默认‘请输入内容’ */
  var message: js.UndefOr[String] = js.native
  /** 确认按钮文字，默认‘确定’ */
  var okButtonText: String = js.native
  /** 输入框内的提示文案 */
  var placeholder: js.UndefOr[String] = js.native
  /** prompt框标题 */
  var title: js.UndefOr[String] = js.native
  @JSName("success")
  def success_MPromptOptions(result: AnonInputValue): Unit = js.native
}

object PromptOptions {
  @scala.inline
  def apply(cancelButtonText: String, okButtonText: String, success: AnonInputValue => Unit): PromptOptions = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText.asInstanceOf[js.Any], okButtonText = okButtonText.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[PromptOptions]
  }
  @scala.inline
  implicit class PromptOptionsOps[Self <: PromptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOkButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: AnonInputValue => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAlign(value: left | center | right | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

