package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The schema definition for a data source.
  */
@js.native
trait SchemaSchema extends js.Object {
  /**
    * The list of top-level objects for the data source. The maximum number of
    * elements is 10.
    */
  var objectDefinitions: js.UndefOr[js.Array[SchemaObjectDefinition]] = js.native
  /**
    * IDs of the Long Running Operations (LROs) currently running for this
    * schema. After modifying the schema, wait for operations to complete
    * before indexing additional content.
    */
  var operationIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaSchema {
  @scala.inline
  def apply(): SchemaSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchema]
  }
  @scala.inline
  implicit class SchemaSchemaOps[Self <: SchemaSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectDefinitions(value: js.Array[SchemaObjectDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationIds")(js.undefined)
        ret
    }
  }
  
}

