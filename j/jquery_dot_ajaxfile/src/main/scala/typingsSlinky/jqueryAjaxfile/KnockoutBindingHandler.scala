package typingsSlinky.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingHandler extends js.Object {
  var init: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit | AnonControlsDescendantBindings
    ]
  ] = js.native
  var options: js.UndefOr[js.Any] = js.native
  var preprocess: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* name */ String, 
      /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]], 
      String
    ]
  ] = js.native
  var update: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit
    ]
  ] = js.native
}

object KnockoutBindingHandler {
  @scala.inline
  def apply(): KnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutBindingHandler]
  }
  @scala.inline
  implicit class KnockoutBindingHandlerOps[Self <: KnockoutBindingHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Unit | AnonControlsDescendantBindings
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
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocess(
      value: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPreprocess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

