package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddSheetRequest extends js.Object {
  /**
    * The properties the new sheet should have.
    * All properties are optional.
    * The sheetId field is optional; if one is not
    * set, an id will be randomly generated. (It is an error to specify the ID
    * of a sheet that already exists.)
    */
  var properties: js.UndefOr[SheetProperties] = js.native
}

object AddSheetRequest {
  @scala.inline
  def apply(): AddSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSheetRequest]
  }
  @scala.inline
  implicit class AddSheetRequestOps[Self <: AddSheetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: SheetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

