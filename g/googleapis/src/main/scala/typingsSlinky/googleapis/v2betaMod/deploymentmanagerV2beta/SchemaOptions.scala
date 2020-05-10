package typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options allows customized resource handling by Deployment Manager.
  */
@js.native
trait SchemaOptions extends js.Object {
  /**
    * Options regarding how to thread async requests.
    */
  var asyncOptions: js.UndefOr[js.Array[SchemaAsyncOptions]] = js.native
  /**
    * The mappings that apply for requests.
    */
  var inputMappings: js.UndefOr[js.Array[SchemaInputMapping]] = js.native
  /**
    * Options for how to validate and process properties on a resource.
    */
  var validationOptions: js.UndefOr[SchemaValidationOptions] = js.native
  /**
    * Additional properties block described as a jsonSchema, these properties
    * will never be part of the json payload, but they can be consumed by
    * InputMappings, this must be a valid json schema draft-04. The properties
    * specified here will be decouple in a different section. This schema will
    * be merged to the schema validation, and properties here will be extracted
    * From the payload and consumed explicitly by InputMappings. ex: field1:
    * type: string field2: type: number
    */
  var virtualProperties: js.UndefOr[String] = js.native
}

object SchemaOptions {
  @scala.inline
  def apply(): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptions]
  }
  @scala.inline
  implicit class SchemaOptionsOps[Self <: SchemaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncOptions(value: js.Array[SchemaAsyncOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMappings(value: js.Array[SchemaInputMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationOptions(value: SchemaValidationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualProperties(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualProperties")(js.undefined)
        ret
    }
  }
  
}

