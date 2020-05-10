package typingsSlinky.knockstrap

import typingsSlinky.knockout.KnockoutAllBindingsAccessor
import typingsSlinky.knockout.KnockoutBindingContext
import typingsSlinky.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertKnockoutBindingHandler
  extends KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  @JSName("init")
  var init_AlertKnockoutBindingHandler: js.UndefOr[
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

object AlertKnockoutBindingHandler {
  @scala.inline
  def apply(): AlertKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertKnockoutBindingHandler]
  }
  @scala.inline
  implicit class AlertKnockoutBindingHandlerOps[Self <: AlertKnockoutBindingHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

