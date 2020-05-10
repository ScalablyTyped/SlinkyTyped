package typingsSlinky.blueprintjsCore.collapseMod

import slinky.core.ReactComponentClass
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollapseProps extends IProps {
  /**
    * Component to render as the root element.
    * Useful when rendering a `Collapse` inside a `<table>`, for instance.
    * @default "div"
    */
  var component: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Whether the component is open or closed.
    * @default false
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Whether the child components will remain mounted when the `Collapse` is closed.
    * Setting to true may improve performance by avoiding re-mounting children.
    * @default false
    */
  var keepChildrenMounted: js.UndefOr[Boolean] = js.native
  /**
    * The length of time the transition takes, in milliseconds. This must match
    * the duration of the animation in CSS. Only set this prop if you override
    * Blueprint's default transitions with new transitions of a different
    * length.
    * @default 200
    */
  var transitionDuration: js.UndefOr[Double] = js.native
}

object ICollapseProps {
  @scala.inline
  def apply(): ICollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICollapseProps]
  }
  @scala.inline
  implicit class ICollapsePropsOps[Self <: ICollapseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepChildrenMounted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepChildrenMounted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepChildrenMounted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepChildrenMounted")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
  }
  
}

