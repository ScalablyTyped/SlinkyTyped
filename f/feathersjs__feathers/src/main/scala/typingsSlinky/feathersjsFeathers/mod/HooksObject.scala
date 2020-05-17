package typingsSlinky.feathersjsFeathers.mod

import typingsSlinky.feathersjsFeathers.anon.PartialHookMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HooksObject extends js.Object {
  var after: PartialHookMap | Hook | js.Array[Hook] = js.native
  var before: PartialHookMap | Hook | js.Array[Hook] = js.native
  var error: PartialHookMap | Hook | js.Array[Hook] = js.native
  var `finally`: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
}

object HooksObject {
  @scala.inline
  def apply(
    after: PartialHookMap | Hook | js.Array[Hook],
    before: PartialHookMap | Hook | js.Array[Hook],
    error: PartialHookMap | Hook | js.Array[Hook]
  ): HooksObject = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[HooksObject]
  }
  @scala.inline
  implicit class HooksObjectOps[Self <: HooksObject] (val x: Self) extends AnyVal {
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

