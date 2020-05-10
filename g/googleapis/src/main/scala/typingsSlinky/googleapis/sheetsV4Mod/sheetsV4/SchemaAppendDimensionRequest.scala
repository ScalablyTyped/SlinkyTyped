package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Appends rows or columns to the end of a sheet.
  */
@js.native
trait SchemaAppendDimensionRequest extends js.Object {
  /**
    * Whether rows or columns should be appended.
    */
  var dimension: js.UndefOr[String] = js.native
  /**
    * The number of rows or columns to append.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The sheet to append rows or columns to.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object SchemaAppendDimensionRequest {
  @scala.inline
  def apply(): SchemaAppendDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppendDimensionRequest]
  }
  @scala.inline
  implicit class SchemaAppendDimensionRequestOps[Self <: SchemaAppendDimensionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
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

