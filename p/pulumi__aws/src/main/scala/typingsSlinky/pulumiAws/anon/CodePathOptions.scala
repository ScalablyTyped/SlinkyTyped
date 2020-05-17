package typingsSlinky.pulumiAws.anon

import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.iamMod.Role
import typingsSlinky.pulumiAws.runtimesMod.Runtime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodePathOptions extends js.Object {
  /**
    * Options to control which paths/packages should be included or excluded in the zip file containing
    * the code for the AWS lambda.
    */
  var codePathOptions: js.UndefOr[typingsSlinky.pulumiPulumi.codePathsMod.CodePathOptions] = js.native
  /**
    * A list of IAM policy ARNs to attach to the Function.  Will be used if [role] is not provide.
    * If neither [role] nor [policies] is provided, a default policy of [iam.AWSLambdaFullAccess]
    * will be used instead.
    */
  var policies: js.UndefOr[js.Array[ARN]] = js.native
  /**
    * A pre-created role to use for the Function. If not provided, [policies] will be used.
    */
  var role: js.UndefOr[Role] = js.native
  /**
    * The Lambda runtime to use.  If not provided, will default to [NodeJS8d10Runtime]
    */
  var runtime: js.UndefOr[Runtime] = js.native
}

object CodePathOptions {
  @scala.inline
  def apply(): CodePathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodePathOptions]
  }
  @scala.inline
  implicit class CodePathOptionsOps[Self <: CodePathOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodePathOptions(value: typingsSlinky.pulumiPulumi.codePathsMod.CodePathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codePathOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodePathOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codePathOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicies(value: js.Array[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntime(value: Runtime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(js.undefined)
        ret
    }
  }
  
}

