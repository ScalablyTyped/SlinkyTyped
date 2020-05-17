package typingsSlinky.materialUiCore.popperPopperMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.materialUiCore.anon.Placement
import typingsSlinky.popperJs.mod.ReferenceObject
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopperProps extends HTMLAttributes[HTMLDivElement] {
  var anchorEl: js.UndefOr[
    Null | HTMLElement | ReferenceObject | (js.Function1[/* element */ HTMLElement, HTMLElement])
  ] = js.native
  @JSName("children")
  var children_PopperProps: TagMod[Any] | (js.Function1[/* props */ Placement, TagMod[Any]]) = js.native
  var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance] | Null] = js.native
  var disablePortal: js.UndefOr[Boolean] = js.native
  var keepMounted: js.UndefOr[Boolean] = js.native
  var modifiers: js.UndefOr[js.Object] = js.native
  var open: Boolean = js.native
  var placement: js.UndefOr[PopperPlacementType] = js.native
  var popperOptions: js.UndefOr[js.Object] = js.native
  var transition: js.UndefOr[Boolean] = js.native
}

object PopperProps {
  @scala.inline
  def apply(open: Boolean): PopperProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperProps]
  }
  @scala.inline
  implicit class PopperPropsOps[Self <: PopperProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchorElFunction1(value: /* element */ HTMLElement => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorEl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnchorElHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchorEl(value: HTMLElement | ReferenceObject | (js.Function1[/* element */ HTMLElement, HTMLElement])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorEl")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorElNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorEl")(null)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* props */ Placement => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any] | (js.Function1[/* props */ Placement, TagMod[Any]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerFunction0(value: () => ReactInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContainerComponent(value: ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: ReactInstance | js.Function0[ReactInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
    @scala.inline
    def withDisablePortal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePortal")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepMounted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepMounted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepMounted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepMounted")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: PopperPlacementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPopperOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopperOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: Boolean): Self = {
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
  }
  
}

