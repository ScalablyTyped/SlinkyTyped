package typingsSlinky.devextreme.mod.DevExpress.fileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxFileProviderOptions extends FileProviderOptions[AjaxFileProvider] {
  /** Specifies which data field provides information about nested files and directories. */
  var itemsExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies the URL used to load an array of JSON objects that represent files and directories. */
  var url: js.UndefOr[String] = js.native
}

object AjaxFileProviderOptions {
  @scala.inline
  def apply(): AjaxFileProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxFileProviderOptions]
  }
  @scala.inline
  implicit class AjaxFileProviderOptionsOps[Self <: AjaxFileProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemsExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

