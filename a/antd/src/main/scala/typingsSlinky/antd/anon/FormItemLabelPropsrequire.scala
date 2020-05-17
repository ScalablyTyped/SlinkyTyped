package typingsSlinky.antd.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.gridColMod.ColProps
import typingsSlinky.antd.interfaceMod.FormLabelAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/form/FormItemLabel.FormItemLabelProps & {  required ? :boolean,   prefixCls  :string} */
@js.native
trait FormItemLabelPropsrequire extends js.Object {
  var colon: js.UndefOr[Boolean] = js.native
  var htmlFor: js.UndefOr[String] = js.native
  var label: js.UndefOr[TagMod[Any]] = js.native
  var labelAlign: js.UndefOr[FormLabelAlign] = js.native
  var labelCol: js.UndefOr[ColProps] = js.native
  var prefixCls: String = js.native
  var required: js.UndefOr[Boolean] = js.native
}

object FormItemLabelPropsrequire {
  @scala.inline
  def apply(prefixCls: String): FormItemLabelPropsrequire = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemLabelPropsrequire]
  }
  @scala.inline
  implicit class FormItemLabelPropsrequireOps[Self <: FormItemLabelPropsrequire] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colon")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAlign(value: FormLabelAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCol(value: ColProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCol")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

