package typingsSlinky.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to lint a Cloud IAM policy object. LintPolicy is currently
  * functional only for `lint_object` of type `condition`.
  */
@js.native
trait SchemaLintPolicyRequest extends js.Object {
  /**
    * Binding object to be linted. The functionality of linting a binding is
    * not yet implemented and if this field is set, it returns NOT_IMPLEMENTED
    * error.
    */
  var binding: js.UndefOr[SchemaBinding] = js.native
  /**
    * google.iam.v1.Binding.condition object to be linted.
    */
  var condition: js.UndefOr[SchemaExpr] = js.native
  /**
    * `context` contains additional *permission-controlled* data that any lint
    * unit may depend on, in form of `{key: value}` pairs. Currently, this
    * field is non-operational and it will not be used during the lint
    * operation.
    */
  var context: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The full resource name of the policy this lint request is about.  The
    * name follows the Google Cloud Platform (GCP) resource format. For
    * example, a GCP project with ID `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.  The
    * resource name is not used to read the policy instance from the Cloud IAM
    * database. The candidate policy for lint has to be provided in the same
    * request object.
    */
  var fullResourceName: js.UndefOr[String] = js.native
  /**
    * Policy object to be linted. The functionality of linting a policy is not
    * yet implemented and if this field is set, it returns NOT_IMPLEMENTED
    * error.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.native
}

object SchemaLintPolicyRequest {
  @scala.inline
  def apply(): SchemaLintPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLintPolicyRequest]
  }
  @scala.inline
  implicit class SchemaLintPolicyRequestOps[Self <: SchemaLintPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinding(value: SchemaBinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: SchemaExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withFullResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: SchemaPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
  }
  
}

