package typingsSlinky.pulumiAws.getPolicyDocumentMod

import typingsSlinky.pulumiAws.outputMod.iam.GetPolicyDocumentStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyDocumentResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The above arguments serialized as a standard JSON policy document.
    */
  val json: String = js.native
  val overrideJson: js.UndefOr[String] = js.native
  val policyId: js.UndefOr[String] = js.native
  val sourceJson: js.UndefOr[String] = js.native
  val statements: js.UndefOr[js.Array[GetPolicyDocumentStatement]] = js.native
  val version: js.UndefOr[String] = js.native
}

object GetPolicyDocumentResult {
  @scala.inline
  def apply(id: String, json: String): GetPolicyDocumentResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyDocumentResult]
  }
  @scala.inline
  implicit class GetPolicyDocumentResultOps[Self <: GetPolicyDocumentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
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

