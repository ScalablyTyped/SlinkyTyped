package typingsSlinky.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'updatedItem' | 'existingItem' | 'originalInput' | 'context' | 'list'> */
@js.native
trait PickResolveInputHooksOpti extends js.Object {
  var context: js.Any = js.native
  var existingItem: js.Any = js.native
  var list: AnonQueryManyMeta = js.native
  var originalInput: js.Any = js.native
  var updatedItem: js.Any = js.native
}

object PickResolveInputHooksOpti {
  @scala.inline
  def apply(
    context: js.Any,
    existingItem: js.Any,
    list: AnonQueryManyMeta,
    originalInput: js.Any,
    updatedItem: js.Any
  ): PickResolveInputHooksOpti = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], existingItem = existingItem.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], originalInput = originalInput.asInstanceOf[js.Any], updatedItem = updatedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickResolveInputHooksOpti]
  }
  @scala.inline
  implicit class PickResolveInputHooksOptiOps[Self <: PickResolveInputHooksOpti] (val x: Self) extends AnyVal {
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
    def withUpdatedItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

