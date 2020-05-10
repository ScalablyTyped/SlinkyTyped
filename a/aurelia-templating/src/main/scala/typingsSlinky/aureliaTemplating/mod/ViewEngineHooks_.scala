package typingsSlinky.aureliaTemplating.mod

import org.scalajs.dom.raw.DocumentFragment
import typingsSlinky.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewEngineHooks_ extends js.Object {
  /**
    * Invoked after a template is compiled.
    * @param viewFactory The view factory that was produced from the compilation process.
    */
  var afterCompile: js.UndefOr[js.Function1[/* viewFactory */ ViewFactory, Unit]] = js.native
  /**
    * Invoked after a view is created.
    * @param view The view that was created by the factory.
    */
  var afterCreate: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.native
  /**
    * Invoked after the bindingContext and overrideContext are configured on the view but before the view is bound.
    * @param view The view that was created by the factory.
    */
  var beforeBind: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.native
  /**
    * Invoked before a template is compiled.
    * @param content The DocumentFragment to compile.
    * @param resources The resources to compile the view against.
    * @param instruction The compilation instruction associated with the compilation process.
    */
  var beforeCompile: js.UndefOr[
    js.Function3[
      /* content */ DocumentFragment, 
      /* resources */ ViewResources_, 
      /* instruction */ ViewCompileInstruction, 
      Unit
    ]
  ] = js.native
  /**
    * Invoked before a view is created.
    * @param viewFactory The view factory that will be used to create the view.
    * @param container The DI container used during view creation.
    * @param content The cloned document fragment representing the view.
    * @param instruction The view creation instruction associated with this creation process.
    */
  var beforeCreate: js.UndefOr[
    js.Function4[
      /* viewFactory */ ViewFactory, 
      /* container */ Container, 
      /* content */ DocumentFragment, 
      /* instruction */ ViewCreateInstruction, 
      Unit
    ]
  ] = js.native
  /**
    * Invoked before the view is unbind. The bindingContext and overrideContext are still available on the view.
    * @param view The view that was created by the factory.
    */
  var beforeUnbind: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.native
}

object ViewEngineHooks_ {
  @scala.inline
  def apply(): ViewEngineHooks_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewEngineHooks_]
  }
  @scala.inline
  implicit class ViewEngineHooks_Ops[Self <: ViewEngineHooks_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCompile(value: /* viewFactory */ ViewFactory => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCompile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterCompile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCompile")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCreate(value: /* view */ View_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBind(value: /* view */ View_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBind")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCompile(
      value: (/* content */ DocumentFragment, /* resources */ ViewResources_, /* instruction */ ViewCompileInstruction) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCompile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeCompile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCompile")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCreate(
      value: (/* viewFactory */ ViewFactory, /* container */ Container, /* content */ DocumentFragment, /* instruction */ ViewCreateInstruction) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUnbind(value: /* view */ View_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnbind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeUnbind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnbind")(js.undefined)
        ret
    }
  }
  
}

