package typingsSlinky.phosphorDatagrid.jsonmodelMod.JSONModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object when specifies the schema for a data model.
  *
  * #### Notes
  * This is based on the JSON Table Schema specification:
  * https://specs.frictionlessdata.io/table-schema/
  */
@js.native
trait ISchema extends js.Object {
  /**
    * The fields which describe the data model columns.
    *
    * Primary key fields are rendered as row header columns.
    */
  val fields: js.Array[IField] = js.native
  /**
    * The values to treat as "missing" data.
    *
    * Missing values are automatically converted to `null`.
    */
  val missingValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * The field names which act as primary keys.
    *
    * Primary key fields are rendered as row header columns.
    */
  val primaryKey: js.UndefOr[String | js.Array[String]] = js.native
}

object ISchema {
  @scala.inline
  def apply(fields: js.Array[IField]): ISchema = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchema]
  }
  @scala.inline
  implicit class ISchemaOps[Self <: ISchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[IField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissingValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingValues")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
        ret
    }
  }
  
}

