package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppStrings.all
import typingsSlinky.aliApp.aliAppStrings.known
import typingsSlinky.aliApp.aliAppStrings.multi
import typingsSlinky.aliApp.aliAppStrings.none
import typingsSlinky.aliApp.aliAppStrings.single
import typingsSlinky.aliApp.anon.ContactsDicArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseContactOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 选择类型，值为single（单选）或者 multi（多选） */
  var chooseType: single | multi | String = js.native
  /** 是否包含自己 */
  var includeMe: js.UndefOr[Boolean] = js.native
  /** 包含手机通讯录联系人的模式：默认为不包含（none）、或者仅仅包含双向通讯录联系人（known）、或者包含手机通讯录联系人（all） */
  var includeMobileContactMode: js.UndefOr[none | known | all | String] = js.native
  /** 最大选择人数，仅 chooseType 为 multi 时才有效 */
  var multiChooseMax: js.UndefOr[Double] = js.native
  /** 多选达到上限的文案，仅 chooseType 为 multi 时才有效 */
  var multiChooseMaxTips: js.UndefOr[String] = js.native
  @JSName("success")
  def success_MChooseContactOptions(result: ContactsDicArray): Unit = js.native
}

object ChooseContactOptions {
  @scala.inline
  def apply(chooseType: single | multi | String, success: ContactsDicArray => Unit): ChooseContactOptions = {
    val __obj = js.Dynamic.literal(chooseType = chooseType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseContactOptions]
  }
  @scala.inline
  implicit class ChooseContactOptionsOps[Self <: ChooseContactOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChooseType(value: single | multi | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: ContactsDicArray => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludeMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMe")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeMobileContactMode(value: none | known | all | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMobileContactMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeMobileContactMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMobileContactMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiChooseMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiChooseMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiChooseMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiChooseMax")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiChooseMaxTips(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiChooseMaxTips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiChooseMaxTips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiChooseMaxTips")(js.undefined)
        ret
    }
  }
  
}

