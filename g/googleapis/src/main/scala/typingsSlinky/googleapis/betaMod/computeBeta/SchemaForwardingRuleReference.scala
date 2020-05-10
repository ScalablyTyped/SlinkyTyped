package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaForwardingRuleReference extends js.Object {
  var forwardingRule: js.UndefOr[String] = js.native
}

object SchemaForwardingRuleReference {
  @scala.inline
  def apply(): SchemaForwardingRuleReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingRuleReference]
  }
  @scala.inline
  implicit class SchemaForwardingRuleReferenceOps[Self <: SchemaForwardingRuleReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardingRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingRule")(js.undefined)
        ret
    }
  }
  
}

