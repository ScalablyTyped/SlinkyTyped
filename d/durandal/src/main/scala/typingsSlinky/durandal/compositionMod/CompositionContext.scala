package typingsSlinky.durandal.compositionMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.durandal.DurandalPromise
import typingsSlinky.knockout.KnockoutBindingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositionContext extends js.Object {
  var activate: js.UndefOr[Boolean] = js.native
  var activeView: HTMLElement = js.native
  var area: js.UndefOr[String] = js.native
  var attached: js.UndefOr[
    js.Function3[
      /* child */ HTMLElement, 
      /* parent */ HTMLElement, 
      /* context */ CompositionContext, 
      Unit
    ]
  ] = js.native
  var binding: js.UndefOr[
    js.Function3[
      /* child */ HTMLElement, 
      /* parent */ HTMLElement, 
      /* context */ CompositionContext, 
      Unit
    ]
  ] = js.native
  var bindingContext: js.UndefOr[KnockoutBindingContext] = js.native
  var cacheViews: js.UndefOr[Boolean] = js.native
  var child: HTMLElement = js.native
  var composingNewView: Boolean = js.native
  var compositionComplete: js.UndefOr[
    js.Function3[
      /* child */ HTMLElement, 
      /* parent */ HTMLElement, 
      /* context */ CompositionContext, 
      Unit
    ]
  ] = js.native
  var mode: String = js.native
  var model: js.UndefOr[js.Any] = js.native
  var parent: HTMLElement = js.native
  var preserveContext: js.UndefOr[Boolean] = js.native
  var strategy: js.UndefOr[js.Function1[/* context */ CompositionContext, DurandalPromise[HTMLElement]]] = js.native
  var transition: js.UndefOr[String] = js.native
  var view: js.UndefOr[js.Any] = js.native
  var viewElements: js.UndefOr[js.Array[HTMLElement]] = js.native
  def triggerAttach(): Unit = js.native
}

object CompositionContext {
  @scala.inline
  def apply(
    activeView: HTMLElement,
    child: HTMLElement,
    composingNewView: Boolean,
    mode: String,
    parent: HTMLElement,
    triggerAttach: () => Unit
  ): CompositionContext = {
    val __obj = js.Dynamic.literal(activeView = activeView.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], composingNewView = composingNewView.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], triggerAttach = js.Any.fromFunction0(triggerAttach))
    __obj.asInstanceOf[CompositionContext]
  }
  @scala.inline
  implicit class CompositionContextOps[Self <: CompositionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveView(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChild(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComposingNewView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composingNewView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerAttach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerAttach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withAttached(
      value: (/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ CompositionContext) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAttached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.undefined)
        ret
    }
    @scala.inline
    def withBinding(
      value: (/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ CompositionContext) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(js.undefined)
        ret
    }
    @scala.inline
    def withBindingContext(value: KnockoutBindingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingContext")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheViews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheViews")(js.undefined)
        ret
    }
    @scala.inline
    def withCompositionComplete(
      value: (/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ CompositionContext) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositionComplete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCompositionComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositionComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveContext")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: /* context */ CompositionContext => DurandalPromise[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViewElements(value: js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewElements")(js.undefined)
        ret
    }
  }
  
}

