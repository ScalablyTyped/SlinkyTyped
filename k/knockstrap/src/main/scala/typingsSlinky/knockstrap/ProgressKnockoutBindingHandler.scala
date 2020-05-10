package typingsSlinky.knockstrap

import typingsSlinky.knockout.KnockoutAllBindingsAccessor
import typingsSlinky.knockout.KnockoutBindingContext
import typingsSlinky.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressKnockoutBindingHandler
  extends KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  var defaults: KnockstrapProgressDefaults = js.native
  @JSName("init")
  var init_ProgressKnockoutBindingHandler: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ KnockoutAllBindingsAccessor, 
      /* viewModel */ js.Any, 
      /* bindingContext */ KnockoutBindingContext, 
      KnockoutControlsDescendantBindings
    ]
  ] = js.native
}

object ProgressKnockoutBindingHandler {
  @scala.inline
  def apply(defaults: KnockstrapProgressDefaults): ProgressKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressKnockoutBindingHandler]
  }
  @scala.inline
  implicit class ProgressKnockoutBindingHandlerOps[Self <: ProgressKnockoutBindingHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: KnockstrapProgressDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, /* viewModel */ js.Any, /* bindingContext */ KnockoutBindingContext) => KnockoutControlsDescendantBindings
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
  }
  
}

