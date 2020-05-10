package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response of a lint operation. An empty response indicates the operation
  * was able to fully execute and no lint issue was found.
  */
@js.native
trait SchemaLintPolicyResponse extends js.Object {
  /**
    * List of lint results sorted by a composite &lt;severity,
    * binding_ordinal&gt; key, descending order of severity and ascending order
    * of binding_ordinal. There is no certain order among the same keys.  For
    * cross-binding results (only if the input object to lint is instance of
    * google.iam.v1.Policy), there will be a google.iam.admin.v1.LintResult for
    * each of the involved bindings, and the associated debug_message may
    * enumerate the other involved binding ordinal number(s).
    */
  var lintResults: js.UndefOr[js.Array[SchemaLintResult]] = js.native
}

object SchemaLintPolicyResponse {
  @scala.inline
  def apply(): SchemaLintPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLintPolicyResponse]
  }
  @scala.inline
  implicit class SchemaLintPolicyResponseOps[Self <: SchemaLintPolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLintResults(value: js.Array[SchemaLintResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lintResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLintResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lintResults")(js.undefined)
        ret
    }
  }
  
}

