package typingsSlinky.devextreme.mod.DevExpress.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTemplateOptions extends js.Object {
  /** Specifies the name of the template. */
  var name: js.UndefOr[String] = js.native
}

object dxTemplateOptions {
  @scala.inline
  def apply(): dxTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTemplateOptions]
  }
  @scala.inline
  implicit class dxTemplateOptionsOps[Self <: dxTemplateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

