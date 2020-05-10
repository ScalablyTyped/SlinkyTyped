package typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTypeInfoSchemaInfo extends js.Object {
  /**
    * The properties that this composite type or base type collection accept as
    * input, represented as a json blob, format is: JSON Schema Draft V4
    */
  var input: js.UndefOr[String] = js.native
  /**
    * The properties that this composite type or base type collection exposes
    * as output, these properties can be used for references, represented as
    * json blob, format is: JSON Schema Draft V4
    */
  var output: js.UndefOr[String] = js.native
}

object SchemaTypeInfoSchemaInfo {
  @scala.inline
  def apply(): SchemaTypeInfoSchemaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeInfoSchemaInfo]
  }
  @scala.inline
  implicit class SchemaTypeInfoSchemaInfoOps[Self <: SchemaTypeInfoSchemaInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
  }
  
}

