package typingsSlinky.enzyme.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowRendererProps extends js.Object {
  var PROVIDER_VALUES: js.UndefOr[js.Any] = js.native
  var adapter: js.UndefOr[EnzymeAdapter] = js.native
  /* TODO what are these doing??? */
  var attachTo: js.UndefOr[js.Any] = js.native
  /**
    * Context to be passed into the component
    */
  var context: js.UndefOr[js.Any] = js.native
  // See https://github.com/airbnb/enzyme/blob/enzyme@3.10.0/docs/api/shallow.md#arguments
  /**
    * If set to true, componentDidMount is not called on the component, and componentDidUpdate is not called after
    * setProps and setContext. Default to false.
    */
  var disableLifecycleMethods: js.UndefOr[Boolean] = js.native
  /**
    * The legacy enableComponentDidUpdateOnSetState option should be matched by
    * `lifecycles: { componentDidUpdate: { onSetState: true } }`, for compatibility
    */
  var enableComponentDidUpdateOnSetState: js.UndefOr[Boolean] = js.native
  var hydrateIn: js.UndefOr[js.Any] = js.native
  /**
    * Enable experimental support for full react lifecycle methods
    */
  var lifecycleExperimental: js.UndefOr[Boolean] = js.native
  var lifecycles: js.UndefOr[Lifecycles] = js.native
  /**
    * the legacy supportPrevContextArgumentOfComponentDidUpdate option should be matched by
    * `lifecycles: { componentDidUpdate: { prevContext: true } }`, for compatibility
    */
  var supportPrevContextArgumentOfComponentDidUpdate: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, when rendering Suspense enzyme will replace all the lazy components in children
    * with fallback element prop. Otherwise it won't handle fallback of lazy component.
    * Default to true. Note: not supported in React < 16.6.
    */
  var suspenseFallback: js.UndefOr[Boolean] = js.native
  /**
    * A component that will render as a parent of the node.
    * It can be used to provide context to the `node`, among other things.
    * See the [getWrappingComponent() docs](https://airbnb.io/enzyme/docs/api/ShallowWrapper/getWrappingComponent.html) for an example.
    * **Note**: `wrappingComponent` must render its children.
    */
  var wrappingComponent: js.UndefOr[ComponentType[_]] = js.native
  /**
    * Initial props to pass to the `wrappingComponent` if it is specified.
    */
  var wrappingComponentProps: js.UndefOr[js.Object] = js.native
}

object ShallowRendererProps {
  @scala.inline
  def apply(): ShallowRendererProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShallowRendererProps]
  }
  @scala.inline
  implicit class ShallowRendererPropsOps[Self <: ShallowRendererProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPROVIDER_VALUES(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_VALUES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPROVIDER_VALUES: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_VALUES")(js.undefined)
        ret
    }
    @scala.inline
    def withAdapter(value: EnzymeAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableLifecycleMethods(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLifecycleMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableLifecycleMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLifecycleMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableComponentDidUpdateOnSetState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableComponentDidUpdateOnSetState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableComponentDidUpdateOnSetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableComponentDidUpdateOnSetState")(js.undefined)
        ret
    }
    @scala.inline
    def withHydrateIn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hydrateIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHydrateIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hydrateIn")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleExperimental(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleExperimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleExperimental: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleExperimental")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycles(value: Lifecycles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycles")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportPrevContextArgumentOfComponentDidUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportPrevContextArgumentOfComponentDidUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportPrevContextArgumentOfComponentDidUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportPrevContextArgumentOfComponentDidUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspenseFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspenseFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspenseFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspenseFallback")(js.undefined)
        ret
    }
    @scala.inline
    def withWrappingComponentFunction2(value: (_, /* context */ js.UndefOr[js.Any]) => ReactElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappingComponent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWrappingComponent(value: ComponentType[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappingComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrappingComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappingComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withWrappingComponentProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappingComponentProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrappingComponentProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappingComponentProps")(js.undefined)
        ret
    }
  }
  
}

