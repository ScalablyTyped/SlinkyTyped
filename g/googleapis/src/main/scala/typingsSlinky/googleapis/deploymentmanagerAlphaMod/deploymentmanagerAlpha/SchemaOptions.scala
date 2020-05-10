package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

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
    * The json path to the field in the resource JSON body into which the
    * resource name should be mapped. Leaving this empty indicates that there
    * should be no mapping performed.
    */
  var nameProperty: js.UndefOr[String] = js.native
  /**
    * Options for how to validate and process properties on a resource.
    */
  var validationOptions: js.UndefOr[SchemaValidationOptions] = js.native
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
    def withNameProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameProperty")(js.undefined)
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
  }
  
}

