package typingsSlinky.pulumiAws.getPolicyDocumentMod

import typingsSlinky.pulumiAws.inputMod.iam.GetPolicyDocumentStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyDocumentArgs extends js.Object {
  /**
    * An IAM policy document to import and override the
    * current policy document.  Statements with non-blank `sid`s in the override
    * document will overwrite statements with the same `sid` in the current document.
    * Statements without an `sid` cannot be overwritten.
    */
  val overrideJson: js.UndefOr[String] = js.native
  /**
    * An ID for the policy document.
    */
  val policyId: js.UndefOr[String] = js.native
  /**
    * An IAM policy document to import as a base for the
    * current policy document.  Statements with non-blank `sid`s in the current
    * policy document will overwrite statements with the same `sid` in the source
    * json.  Statements without an `sid` cannot be overwritten.
    */
  val sourceJson: js.UndefOr[String] = js.native
  /**
    * A nested configuration block (described below)
    * configuring one *statement* to be included in the policy document.
    */
  val statements: js.UndefOr[js.Array[GetPolicyDocumentStatement]] = js.native
  /**
    * IAM policy document version. Valid values: `2008-10-17`, `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
    */
  val version: js.UndefOr[String] = js.native
}

object GetPolicyDocumentArgs {
  @scala.inline
  def apply(): GetPolicyDocumentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyDocumentArgs]
  }
  @scala.inline
  implicit class GetPolicyDocumentArgsOps[Self <: GetPolicyDocumentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverrideJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideJson")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceJson")(js.undefined)
        ret
    }
    @scala.inline
    def withStatements(value: js.Array[GetPolicyDocumentStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

