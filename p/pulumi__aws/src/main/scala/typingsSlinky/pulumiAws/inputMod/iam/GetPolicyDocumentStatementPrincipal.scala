package typingsSlinky.pulumiAws.inputMod.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyDocumentStatementPrincipal extends js.Object {
  /**
    * List of identifiers for principals. When `type`
    * is "AWS", these are IAM user or role ARNs.  When `type` is "Service", these are AWS Service roles e.g. `lambda.amazonaws.com`.
    */
  var identifiers: js.Array[String] = js.native
  /**
    * The type of principal. For AWS ARNs this is "AWS".  For AWS services (e.g. Lambda), this is "Service".
    */
  var `type`: String = js.native
}

object GetPolicyDocumentStatementPrincipal {
  @scala.inline
  def apply(identifiers: js.Array[String], `type`: String): GetPolicyDocumentStatementPrincipal = {
    val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyDocumentStatementPrincipal]
  }
  @scala.inline
  implicit class GetPolicyDocumentStatementPrincipalOps[Self <: GetPolicyDocumentStatementPrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifiers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

