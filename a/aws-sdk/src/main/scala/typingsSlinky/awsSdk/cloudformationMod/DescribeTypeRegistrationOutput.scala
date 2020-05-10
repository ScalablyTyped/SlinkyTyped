package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTypeRegistrationOutput extends js.Object {
  /**
    * The description of the type registration request.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  /**
    * The current status of the type registration request.
    */
  var ProgressStatus: js.UndefOr[RegistrationStatus] = js.native
  /**
    * The Amazon Resource Name (ARN) of the type being registered. For registration requests with a ProgressStatus of other than COMPLETE, this will be null.
    */
  var TypeArn: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TypeArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of this specific version of the type being registered. For registration requests with a ProgressStatus of other than COMPLETE, this will be null.
    */
  var TypeVersionArn: js.UndefOr[TypeArn] = js.native
}

object DescribeTypeRegistrationOutput {
  @scala.inline
  def apply(): DescribeTypeRegistrationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTypeRegistrationOutput]
  }
  @scala.inline
  implicit class DescribeTypeRegistrationOutputOps[Self <: DescribeTypeRegistrationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressStatus(value: RegistrationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeArn(value: TypeArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeVersionArn(value: TypeArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeVersionArn")(js.undefined)
        ret
    }
  }
  
}

