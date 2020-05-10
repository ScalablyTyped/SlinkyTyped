package typingsSlinky.knockstrap

import typingsSlinky.knockout.KnockoutAllBindingsAccessor
import typingsSlinky.knockout.KnockoutBindingContext
import typingsSlinky.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalKnockoutBindingHandler
  extends KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  var defaults: KnockstrapModalDefaults = js.native
  @JSName("init")
  var init_ModalKnockoutBindingHandler: js.UndefOr[
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

object ModalKnockoutBindingHandler {
  @scala.inline
  def apply(defaults: KnockstrapModalDefaults): ModalKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalKnockoutBindingHandler]
  }
  @scala.inline
  implicit class ModalKnockoutBindingHandlerOps[Self <: ModalKnockoutBindingHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: KnockstrapModalDefaults): Self = {
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

