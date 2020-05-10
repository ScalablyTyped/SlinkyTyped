package typingsSlinky.pulumiAws.functionMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionState extends js.Object {
  /**
    * The ID of the associated AppSync API.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the Function object.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The Function DataSource name.
    */
  val dataSource: js.UndefOr[Input[String]] = js.native
  /**
    * The Function description.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A unique ID representing the Function object.
    */
  val functionId: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the request mapping template. Currently the supported value is `2018-05-29`.
    */
  val functionVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The Function name. The function name does not have to be unique.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  val requestMappingTemplate: js.UndefOr[Input[String]] = js.native
  /**
    * The Function response mapping template.
    */
  val responseMappingTemplate: js.UndefOr[Input[String]] = js.native
}

object FunctionState {
  @scala.inline
  def apply(): FunctionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionState]
  }
  @scala.inline
  implicit class FunctionStateOps[Self <: FunctionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
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
    def withFunctionId(value: Input[String]): Self = {
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
    def withFunctionVersion(value: Input[String]): Self = {
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
    def withName(value: Input[String]): Self = {
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
    def withRequestMappingTemplate(value: Input[String]): Self = {
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
    def withResponseMappingTemplate(value: Input[String]): Self = {
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

