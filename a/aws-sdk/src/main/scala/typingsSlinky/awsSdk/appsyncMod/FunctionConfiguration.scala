package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionConfiguration extends js.Object {
  /**
    * The name of the DataSource.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The Function description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The ARN of the Function object.
    */
  var functionArn: js.UndefOr[String] = js.native
  /**
    * A unique ID representing the Function object.
    */
  var functionId: js.UndefOr[String] = js.native
  /**
    * The version of the request mapping template. Currently only the 2018-05-29 version of the template is supported.
    */
  var functionVersion: js.UndefOr[String] = js.native
  /**
    * The name of the Function object.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.native
  /**
    * The Function response mapping template.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.native
}

object FunctionConfiguration {
  @scala.inline
  def apply(): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfiguration]
  }
  @scala.inline
  implicit class FunctionConfigurationOps[Self <: FunctionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceName")(js.undefined)
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
    def withFunctionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionId")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
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
    def withRequestMappingTemplate(value: MappingTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMappingTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMappingTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMappingTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseMappingTemplate(value: MappingTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMappingTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseMappingTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMappingTemplate")(js.undefined)
        ret
    }
  }
  
}

