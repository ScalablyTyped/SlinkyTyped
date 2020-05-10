package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsKeystone.OmitResolveInputHooksOpti
import typingsSlinky.keystonejsKeystone.OmitResolveInputHooksOptiAddFieldValidationError
import typingsSlinky.keystonejsKeystone.OmitResolveInputHooksOptiContext
import typingsSlinky.keystonejsKeystone.PickResolveInputHooksOpti
import typingsSlinky.keystonejsKeystone.PickResolveInputHooksOptiAddFieldValidationError
import typingsSlinky.keystonejsKeystone.PickResolveInputHooksOptiContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{resolveInput (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'addFieldValidationError' | 'updatedItem'>): any, validateInput (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'updatedItem'>): void, beforeChange (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'addFieldValidationError'>): void, afterChange (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'updatedItem' | 'existingItem' | 'originalInput' | 'context' | 'list'>): void, beforeDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list'>): void, validateDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list' | 'addFieldValidationError'>): void, afterDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list'>): void}> */
@js.native
trait Hooks extends js.Object {
  var afterChange: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOpti, Unit]] = js.native
  var afterDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOptiContext, Unit]] = js.native
  var beforeChange: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOpti, Unit]] = js.native
  var beforeDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOptiContext, Unit]] = js.native
  var resolveInput: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOptiContext, _]] = js.native
  var validateDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOptiAddFieldValidationError, Unit]] = js.native
  var validateInput: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOptiAddFieldValidationError, Unit]] = js.native
}

object Hooks {
  @scala.inline
  def apply(): Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hooks]
  }
  @scala.inline
  implicit class HooksOps[Self <: Hooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterChange(value: /* opts */ PickResolveInputHooksOpti => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDelete(value: /* opts */ PickResolveInputHooksOptiContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeChange(value: /* opts */ OmitResolveInputHooksOpti => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDelete(value: /* opts */ PickResolveInputHooksOptiContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveInput(value: /* opts */ OmitResolveInputHooksOptiContext => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolveInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveInput")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateDelete(value: /* opts */ PickResolveInputHooksOptiAddFieldValidationError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidateDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateInput(value: /* opts */ OmitResolveInputHooksOptiAddFieldValidationError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidateInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateInput")(js.undefined)
        ret
    }
  }
  
}

