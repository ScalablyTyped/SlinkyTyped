package typingsSlinky.pulumiAws.lifecyclePolicyDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyDocument extends js.Object {
  var rules: js.Array[PolicyRule] = js.native
}

object LifecyclePolicyDocument {
  @scala.inline
  def apply(rules: js.Array[PolicyRule]): LifecyclePolicyDocument = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyDocument]
  }
  @scala.inline
  implicit class LifecyclePolicyDocumentOps[Self <: LifecyclePolicyDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: js.Array[PolicyRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

