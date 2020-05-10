package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "colunm-settings"
//#region "other-settings"
@js.native
trait RendererSettings extends js.Object {
  var header: js.UndefOr[String] = js.native
  var pageButton: js.UndefOr[String] = js.native
}

object RendererSettings {
  @scala.inline
  def apply(): RendererSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererSettings]
  }
  @scala.inline
  implicit class RendererSettingsOps[Self <: RendererSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withPageButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButton")(js.undefined)
        ret
    }
  }
  
}

