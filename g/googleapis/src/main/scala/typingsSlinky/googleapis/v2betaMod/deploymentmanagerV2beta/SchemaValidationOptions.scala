package typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for how to validate and process properties on a resource.
  */
@js.native
trait SchemaValidationOptions extends js.Object {
  /**
    * Customize how deployment manager will validate the resource against
    * schema errors.
    */
  var schemaValidation: js.UndefOr[String] = js.native
  /**
    * Specify what to do with extra properties when executing a request.
    */
  var undeclaredProperties: js.UndefOr[String] = js.native
}

object SchemaValidationOptions {
  @scala.inline
  def apply(): SchemaValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidationOptions]
  }
  @scala.inline
  implicit class SchemaValidationOptionsOps[Self <: SchemaValidationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchemaValidation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withUndeclaredProperties(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undeclaredProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndeclaredProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undeclaredProperties")(js.undefined)
        ret
    }
  }
  
}

