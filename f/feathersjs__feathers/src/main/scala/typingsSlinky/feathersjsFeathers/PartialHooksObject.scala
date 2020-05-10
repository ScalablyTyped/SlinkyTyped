package typingsSlinky.feathersjsFeathers

import typingsSlinky.feathersjsFeathers.mod.Hook
import typingsSlinky.feathersjsFeathers.mod.HookContext
import typingsSlinky.feathersjsFeathers.mod.SkipSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.HooksObject> */
@js.native
trait PartialHooksObject extends js.Object {
  var after: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
  var before: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
  var error: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
  var `finally`: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
}

object PartialHooksObject {
  @scala.inline
  def apply(): PartialHooksObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHooksObject]
  }
  @scala.inline
  implicit class PartialHooksObjectOps[Self <: PartialHooksObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfter(value: PartialHookMap | Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBefore(value: PartialHookMap | Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: PartialHookMap | Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withFinallyFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finally")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFinally(value: PartialHookMap | Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinally: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finally")(js.undefined)
        ret
    }
  }
  
}

