package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data about each cell in a row.
  */
@js.native
trait SchemaRowData extends js.Object {
  /**
    * The values in the row, one per column.
    */
  var values: js.UndefOr[js.Array[SchemaCellData]] = js.native
}

object SchemaRowData {
  @scala.inline
  def apply(): SchemaRowData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowData]
  }
  @scala.inline
  implicit class SchemaRowDataOps[Self <: SchemaRowData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[SchemaCellData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

