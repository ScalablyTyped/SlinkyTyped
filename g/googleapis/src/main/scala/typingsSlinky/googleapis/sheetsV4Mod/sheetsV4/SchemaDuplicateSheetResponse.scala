package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of duplicating a sheet.
  */
@js.native
trait SchemaDuplicateSheetResponse extends js.Object {
  /**
    * The properties of the duplicate sheet.
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
}

object SchemaDuplicateSheetResponse {
  @scala.inline
  def apply(): SchemaDuplicateSheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuplicateSheetResponse]
  }
  @scala.inline
  implicit class SchemaDuplicateSheetResponseOps[Self <: SchemaDuplicateSheetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: SchemaSheetProperties): Self = {
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

