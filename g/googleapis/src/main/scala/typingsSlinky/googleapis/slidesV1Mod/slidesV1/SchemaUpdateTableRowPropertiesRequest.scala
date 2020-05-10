package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the properties of a Table row.
  */
@js.native
trait SchemaUpdateTableRowPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `tableRowProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the minimum row height, set `fields` to
    * `&quot;min_row_height&quot;`.  If &#39;&quot;min_row_height&quot;&#39; is
    * included in the field mask but the property is left unset, the minimum
    * row height will default to 0.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The list of zero-based indices specifying which rows to update. If no
    * indices are provided, all rows in the table will be updated.
    */
  var rowIndices: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The table row properties to update.
    */
  var tableRowProperties: js.UndefOr[SchemaTableRowProperties] = js.native
}

object SchemaUpdateTableRowPropertiesRequest {
  @scala.inline
  def apply(): SchemaUpdateTableRowPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTableRowPropertiesRequest]
  }
  @scala.inline
  implicit class SchemaUpdateTableRowPropertiesRequestOps[Self <: SchemaUpdateTableRowPropertiesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRowIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRowProperties(value: SchemaTableRowProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRowProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowProperties")(js.undefined)
        ret
    }
  }
  
}

