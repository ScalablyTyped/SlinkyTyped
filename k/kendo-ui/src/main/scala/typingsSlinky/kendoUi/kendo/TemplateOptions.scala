package typingsSlinky.kendoUi.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateOptions extends js.Object {
  var paramName: js.UndefOr[String] = js.native
  var useWithBlock: js.UndefOr[Boolean] = js.native
}

object TemplateOptions {
  @scala.inline
  def apply(): TemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptions]
  }
  @scala.inline
  implicit class TemplateOptionsOps[Self <: TemplateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramName")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWithBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWithBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWithBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWithBlock")(js.undefined)
        ret
    }
  }
  
}

