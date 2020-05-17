package typingsSlinky.riot.anon

import typingsSlinky.riotjsDomBindings.mod.AttributeExpressionData
import typingsSlinky.riotjsDomBindings.mod.SlotBindingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentScope extends js.Object {
  var attributes: js.Array[AttributeExpressionData] = js.native
  var parentScope: js.Any = js.native
  var slots: js.Array[SlotBindingData] = js.native
}

object ParentScope {
  @scala.inline
  def apply(
    attributes: js.Array[AttributeExpressionData],
    parentScope: js.Any,
    slots: js.Array[SlotBindingData]
  ): ParentScope = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], parentScope = parentScope.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentScope]
  }
  @scala.inline
  implicit class ParentScopeOps[Self <: ParentScope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[AttributeExpressionData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlots(value: js.Array[SlotBindingData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

