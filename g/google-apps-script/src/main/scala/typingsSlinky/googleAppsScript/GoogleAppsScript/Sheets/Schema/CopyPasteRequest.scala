package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyPasteRequest extends js.Object {
  var destination: js.UndefOr[GridRange] = js.native
  var pasteOrientation: js.UndefOr[String] = js.native
  var pasteType: js.UndefOr[String] = js.native
  var source: js.UndefOr[GridRange] = js.native
}

object CopyPasteRequest {
  @scala.inline
  def apply(): CopyPasteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyPasteRequest]
  }
  @scala.inline
  implicit class CopyPasteRequestOps[Self <: CopyPasteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteType")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

