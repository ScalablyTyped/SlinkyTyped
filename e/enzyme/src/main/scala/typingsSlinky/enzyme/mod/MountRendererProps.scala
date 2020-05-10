package typingsSlinky.enzyme.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountRendererProps extends js.Object {
  /**
    * DOM Element to attach the component to
    */
  var attachTo: js.UndefOr[HTMLElement | Null] = js.native
  /**
    * Merged contextTypes for all children of the wrapper
    */
  var childContextTypes: js.UndefOr[js.Object] = js.native
  /**
    * Context to be passed into the component
    */
  var context: js.UndefOr[js.Object] = js.native
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

object MountRendererProps {
  @scala.inline
  def apply(): MountRendererProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountRendererProps]
  }
  @scala.inline
  implicit class MountRendererPropsOps[Self <: MountRendererProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachTo(value: HTMLElement): Self = {
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
    def withAttachToNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(null)
        ret
    }
    @scala.inline
    def withChildContextTypes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildContextTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Object): Self = {
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

