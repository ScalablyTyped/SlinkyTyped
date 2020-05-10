package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the properties of a Table column.
  */
@js.native
trait SchemaUpdateTableColumnPropertiesRequest extends js.Object {
  /**
    * The list of zero-based indices specifying which columns to update. If no
    * indices are provided, all columns in the table will be updated.
    */
  var columnIndices: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `tableColumnProperties` is implied and should not be specified.
    * A single `&quot;*&quot;` can be used as short-hand for listing every
    * field.  For example to update the column width, set `fields` to
    * `&quot;column_width&quot;`.  If &#39;&quot;column_width&quot;&#39; is
    * included in the field mask but the property is left unset, the column
    * width will default to 406,400 EMU (32 points).
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The table column properties to update.  If the value of
    * `table_column_properties#column_width` in the request is less than
    * 406,400 EMU (32 points), a 400 bad request error is returned.
    */
  var tableColumnProperties: js.UndefOr[SchemaTableColumnProperties] = js.native
}

object SchemaUpdateTableColumnPropertiesRequest {
  @scala.inline
  def apply(): SchemaUpdateTableColumnPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTableColumnPropertiesRequest]
  }
  @scala.inline
  implicit class SchemaUpdateTableColumnPropertiesRequestOps[Self <: SchemaUpdateTableColumnPropertiesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withTableColumnProperties(value: SchemaTableColumnProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableColumnProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableColumnProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableColumnProperties")(js.undefined)
        ret
    }
  }
  
}

