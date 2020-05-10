package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSettings extends js.Object {
  /** Sets import mapper to perform import feature in Spreadsheet.
    */
  var importMapper: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to enable or disable import while initial loading.
    * @Default {false}
    */
  var importOnLoad: js.UndefOr[Boolean] = js.native
  /** Sets import URL to access the online files in the Spreadsheet.
    */
  var importUrl: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define password while importing in the Spreadsheet.
    */
  var password: js.UndefOr[String] = js.native
}

object ImportSettings {
  @scala.inline
  def apply(): ImportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSettings]
  }
  @scala.inline
  implicit class ImportSettingsOps[Self <: ImportSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportMapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importMapper")(js.undefined)
        ret
    }
    @scala.inline
    def withImportOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importOnLoad")(js.undefined)
        ret
    }
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
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
  }
  
}

