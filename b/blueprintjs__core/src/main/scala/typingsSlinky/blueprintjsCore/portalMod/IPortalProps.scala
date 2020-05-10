package typingsSlinky.blueprintjsCore.portalMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPortalProps extends IProps {
  /**
    * The HTML element that children will be mounted to.
    * @default document.body
    */
  var container: js.UndefOr[HTMLElement] = js.native
  /**
    * Callback invoked when the children of this `Portal` have been added to the DOM.
    */
  var onChildrenMount: js.UndefOr[js.Function0[Unit]] = js.native
}

object IPortalProps {
  @scala.inline
  def apply(): IPortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPortalProps]
  }
  @scala.inline
  implicit class IPortalPropsOps[Self <: IPortalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
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
    def withOnChildrenMount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildrenMount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnChildrenMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChildrenMount")(js.undefined)
        ret
    }
  }
  
}

