package typingsSlinky.blueprintjsCore.panelPropsMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanel[P] extends js.Object {
  /**
    * The component type to render for this panel. This must be a reference to
    * the component class or SFC, _not_ a JSX element, so it can be re-created
    * dynamically when needed.
    */
  var component: ReactComponentClass[P with IPanelProps] = js.native
  /**
    * The props passed to the component type when it is rendered. The methods
    * in `IPanelProps` will be injected by `PanelStack`.
    */
  var props: js.UndefOr[P] = js.native
  /**
    * The title to be displayed above this panel. It is also used as the text
    * of the back button for any panel opened by this panel.
    */
  var title: js.UndefOr[TagMod[Any]] = js.native
}

object IPanel {
  @scala.inline
  def apply[P](component: ReactComponentClass[P with IPanelProps]): IPanel[P] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanel[P]]
  }
  @scala.inline
  implicit class IPanelOps[Self[p] <: IPanel[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withComponent(value: ReactComponentClass[P with IPanelProps]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: TagMod[Any]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

