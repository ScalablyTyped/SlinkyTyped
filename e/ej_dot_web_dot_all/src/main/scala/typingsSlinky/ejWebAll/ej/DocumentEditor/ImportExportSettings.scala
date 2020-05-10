package typingsSlinky.ejWebAll.ej.DocumentEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportExportSettings extends js.Object {
  /** Gets or sets URL of Web API that should be used to parse the document while loading.
    */
  var importUrl: js.UndefOr[String] = js.native
}

object ImportExportSettings {
  @scala.inline
  def apply(): ImportExportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportExportSettings]
  }
  @scala.inline
  implicit class ImportExportSettingsOps[Self <: ImportExportSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importUrl")(js.undefined)
        ret
    }
  }
  
}

