package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Duplicates the contents of a sheet.
  */
@js.native
trait SchemaDuplicateSheetRequest extends js.Object {
  /**
    * The zero-based index where the new sheet should be inserted. The index of
    * all sheets after this are incremented.
    */
  var insertSheetIndex: js.UndefOr[Double] = js.native
  /**
    * If set, the ID of the new sheet. If not set, an ID is chosen. If set, the
    * ID must not conflict with any existing sheet ID. If set, it must be
    * non-negative.
    */
  var newSheetId: js.UndefOr[Double] = js.native
  /**
    * The name of the new sheet.  If empty, a new name is chosen for you.
    */
  var newSheetName: js.UndefOr[String] = js.native
  /**
    * The sheet to duplicate.
    */
  var sourceSheetId: js.UndefOr[Double] = js.native
}

object SchemaDuplicateSheetRequest {
  @scala.inline
  def apply(): SchemaDuplicateSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuplicateSheetRequest]
  }
  @scala.inline
  implicit class SchemaDuplicateSheetRequestOps[Self <: SchemaDuplicateSheetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertSheetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSheetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSheetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSheetIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withNewSheetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheetId")(js.undefined)
        ret
    }
    @scala.inline
    def withNewSheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSheetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheetName")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSheetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSheetId")(js.undefined)
        ret
    }
  }
  
}

