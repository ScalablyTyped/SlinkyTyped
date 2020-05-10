package typingsSlinky.feathersjsFeathers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookMap extends js.Object {
  var all: Hook | js.Array[Hook] = js.native
  var create: Hook | js.Array[Hook] = js.native
  var find: Hook | js.Array[Hook] = js.native
  var get: Hook | js.Array[Hook] = js.native
  var patch: Hook | js.Array[Hook] = js.native
  var remove: Hook | js.Array[Hook] = js.native
  var update: Hook | js.Array[Hook] = js.native
}

object HookMap {
  @scala.inline
  def apply(
    all: Hook | js.Array[Hook],
    create: Hook | js.Array[Hook],
    find: Hook | js.Array[Hook],
    get: Hook | js.Array[Hook],
    patch: Hook | js.Array[Hook],
    remove: Hook | js.Array[Hook],
    update: Hook | js.Array[Hook]
  ): HookMap = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookMap]
  }
  @scala.inline
  implicit class HookMapOps[Self <: HookMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAll(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFind(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatchFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

