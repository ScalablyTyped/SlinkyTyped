package typingsSlinky.googleapis.computeV1Mod.computeV1

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaForwardingRulesScopedList extends js.Object {
  /**
    * A list of forwarding rules contained in this scope.
    */
  var forwardingRules: js.UndefOr[js.Array[SchemaForwardingRule]] = js.native
  /**
    * Informational warning which replaces the list of forwarding rules when
    * the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaForwardingRulesScopedList {
  @scala.inline
  def apply(): SchemaForwardingRulesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingRulesScopedList]
  }
  @scala.inline
  implicit class SchemaForwardingRulesScopedListOps[Self <: SchemaForwardingRulesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardingRules(value: js.Array[SchemaForwardingRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingRules")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

