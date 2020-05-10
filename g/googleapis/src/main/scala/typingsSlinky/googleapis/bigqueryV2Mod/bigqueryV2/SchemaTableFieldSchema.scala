package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import typingsSlinky.googleapis.AnonNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableFieldSchema extends js.Object {
  /**
    * [Optional] The categories attached to this field, used for field-level
    * access control.
    */
  var categories: js.UndefOr[AnonNames] = js.native
  /**
    * [Optional] The field description. The maximum length is 1,024 characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Optional] Describes the nested schema fields if the type property is set
    * to RECORD.
    */
  var fields: js.UndefOr[js.Array[SchemaTableFieldSchema]] = js.native
  /**
    * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and
    * REPEATED. The default value is NULLABLE.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * [Required] The field name. The name must contain only letters (a-z, A-Z),
    * numbers (0-9), or underscores (_), and must start with a letter or
    * underscore. The maximum length is 128 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Required] The field data type. Possible values include STRING, BYTES,
    * INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT),
    * BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, RECORD
    * (where RECORD indicates that the field contains a nested schema) or
    * STRUCT (same as RECORD).
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaTableFieldSchema {
  @scala.inline
  def apply(): SchemaTableFieldSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableFieldSchema]
  }
  @scala.inline
  implicit class SchemaTableFieldSchemaOps[Self <: SchemaTableFieldSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: AnonNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[SchemaTableFieldSchema]): Self = {
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
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

