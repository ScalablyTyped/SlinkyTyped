package typingsSlinky.aureliaTemplating.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositionContext extends js.Object {
  /**
    * The context in which the view model is executed in.
    */
  var bindingContext: js.Any = js.native
  /**
    * The child Container for the component creation. One will be created from the parent if not provided.
    */
  var childContainer: js.UndefOr[Container] = js.native
  /**
    * The parent Container for the component creation.
    */
  var container: Container = js.native
  /**
    * The element that will parent the dynamic component.
    * It will be registered in the child container of this composition.
    */
  var host: js.UndefOr[Element] = js.native
  /**
    * Data to be passed to the "activate" hook on the view model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /**
    * A secondary binding context that can override the standard context.
    */
  var overrideContext: js.UndefOr[js.Any] = js.native
  /**
    * The view inside which this composition is happening.
    */
  var owningView: js.UndefOr[View_] = js.native
  /**
    * Should the composition system skip calling the "activate" hook on the view model.
    */
  var skipActivation: js.UndefOr[Boolean] = js.native
  /**
    * The view url or view strategy to override the default view location convention.
    */
  var view: js.UndefOr[String | ViewStrategy_] = js.native
  /**
    * The view model url or instance for the component.
    */
  var viewModel: js.UndefOr[js.Any] = js.native
  /**
    * The HtmlBehaviorResource for the component.
    */
  var viewModelResource: js.UndefOr[HtmlBehaviorResource] = js.native
  /**
    * The view resources for the view in which the component should be created.
    */
  var viewResources: ViewResources_ = js.native
  /**
    * The slot to push the dynamically composed component into.
    */
  var viewSlot: ViewSlot = js.native
}

object CompositionContext {
  @scala.inline
  def apply(bindingContext: js.Any, container: Container, viewResources: ViewResources_, viewSlot: ViewSlot): CompositionContext = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], viewResources = viewResources.asInstanceOf[js.Any], viewSlot = viewSlot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionContext]
  }
  @scala.inline
  implicit class CompositionContextOps[Self <: CompositionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: Container): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewResources(value: ViewResources_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewSlot(value: ViewSlot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildContainer(value: Container): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
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
    def withOverrideContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideContext")(js.undefined)
        ret
    }
    @scala.inline
    def withOwningView(value: View_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owningView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwningView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owningView")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipActivation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipActivation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipActivation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipActivation")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: String | ViewStrategy_): Self = {
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
    def withViewModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModelResource(value: HtmlBehaviorResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModelResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModelResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModelResource")(js.undefined)
        ret
    }
  }
  
}

