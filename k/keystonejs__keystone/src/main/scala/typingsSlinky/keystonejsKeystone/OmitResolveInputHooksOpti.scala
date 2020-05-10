package typingsSlinky.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'addFieldValidationError'> */
@js.native
trait OmitResolveInputHooksOpti extends js.Object {
  var context: js.Any = js.native
  var existingItem: js.Any = js.native
  var list: AnonQueryManyMeta = js.native
  var originalInput: js.Any = js.native
  var resolvedData: js.Any = js.native
  var updatedItem: js.Any = js.native
}

object OmitResolveInputHooksOpti {
  @scala.inline
  def apply(
    context: js.Any,
    existingItem: js.Any,
    list: AnonQueryManyMeta,
    originalInput: js.Any,
    resolvedData: js.Any,
    updatedItem: js.Any
  ): OmitResolveInputHooksOpti = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], existingItem = existingItem.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], originalInput = originalInput.asInstanceOf[js.Any], resolvedData = resolvedData.asInstanceOf[js.Any], updatedItem = updatedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitResolveInputHooksOpti]
  }
  @scala.inline
  implicit class OmitResolveInputHooksOptiOps[Self <: OmitResolveInputHooksOpti] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExistingItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonQueryManyMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalInput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

