package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddedObjectPosition extends js.Object {
  var newSheet: js.UndefOr[Boolean] = js.native
  var overlayPosition: js.UndefOr[OverlayPosition] = js.native
  var sheetId: js.UndefOr[Double] = js.native
}

object EmbeddedObjectPosition {
  @scala.inline
  def apply(): EmbeddedObjectPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectPosition]
  }
  @scala.inline
  implicit class EmbeddedObjectPositionOps[Self <: EmbeddedObjectPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewSheet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayPosition(value: OverlayPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(js.undefined)
        ret
    }
  }
  
}

