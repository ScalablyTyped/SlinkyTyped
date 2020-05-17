package typingsSlinky.knockout

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsSlinky.knockout.anon.ControlsDescendantBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingHandler[E /* <: Node */, V, VM]
  extends /* s */ StringDictionary[js.Any] {
  var after: js.UndefOr[js.Array[String]] = js.native
  var init: js.UndefOr[
    js.Function5[
      /* element */ E, 
      /* valueAccessor */ js.Function0[V], 
      /* allBindingsAccessor */ KnockoutAllBindingsAccessor, 
      /* viewModel */ VM, 
      /* bindingContext */ KnockoutBindingContext, 
      Unit | ControlsDescendantBindings
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
      /* element */ E, 
      /* valueAccessor */ js.Function0[V], 
      /* allBindingsAccessor */ KnockoutAllBindingsAccessor, 
      /* viewModel */ VM, 
      /* bindingContext */ KnockoutBindingContext, 
      Unit
    ]
  ] = js.native
}

object KnockoutBindingHandler {
  @scala.inline
  def apply[E, V, VM](): KnockoutBindingHandler[E, V, VM] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutBindingHandler[E, V, VM]]
  }
  @scala.inline
  implicit class KnockoutBindingHandlerOps[Self[e, v, vm] <: KnockoutBindingHandler[e, v, vm], E, V, VM] (val x: Self[E, V, VM]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E, V, VM] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E, V, VM]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[E, V, VM]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[E, V, VM]) with Other]
    @scala.inline
    def withAfter(value: js.Array[String]): Self[E, V, VM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self[E, V, VM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(
      value: (/* element */ E, /* valueAccessor */ js.Function0[V], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, /* viewModel */ VM, /* bindingContext */ KnockoutBindingContext) => Unit | ControlsDescendantBindings
    ): Self[E, V, VM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutInit: Self[E, V, VM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self[E, V, VM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[E, V, VM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocess(
      value: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => String
    ): Self[E, V, VM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPreprocess: Self[E, V, VM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* element */ E, /* valueAccessor */ js.Function0[V], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, /* viewModel */ VM, /* bindingContext */ KnockoutBindingContext) => Unit
    ): Self[E, V, VM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self[E, V, VM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

