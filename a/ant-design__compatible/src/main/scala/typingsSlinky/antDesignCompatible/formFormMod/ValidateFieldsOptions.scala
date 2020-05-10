package typingsSlinky.antDesignCompatible.formFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateFieldsOptions extends js.Object {
  /** 所有表单域是否在第一个校验规则失败后停止继续校验 */
  var first: js.UndefOr[Boolean] = js.native
  /** 指定哪些表单域在第一个校验规则失败后停止继续校验 */
  var firstFields: js.UndefOr[js.Array[String]] = js.native
  /** 已经校验过的表单域，在 validateTrigger 再次被触发时是否再次校验 */
  var force: js.UndefOr[Boolean] = js.native
  /** 定义 validateFieldsAndScroll 的滚动行为 */
  var scroll: js.UndefOr[DomScrollIntoViewConfig] = js.native
}

object ValidateFieldsOptions {
  @scala.inline
  def apply(): ValidateFieldsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateFieldsOptions]
  }
  @scala.inline
  implicit class ValidateFieldsOptionsOps[Self <: ValidateFieldsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFields")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: DomScrollIntoViewConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
  }
  
}

