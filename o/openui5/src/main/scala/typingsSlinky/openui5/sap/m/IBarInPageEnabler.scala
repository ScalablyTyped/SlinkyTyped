package typingsSlinky.openui5.sap.m

import typingsSlinky.openui5.sap.ui.core.Control
import typingsSlinky.openui5.sap.ui.core.RenderManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBarInPageEnabler extends js.Object {
  /**
    * Adds the sapMBarChildClass to a control.
    * @param oControl undefined
    */
  def addChildClassTo(oControl: Control): Unit = js.native
  /**
    * Renders the tooltip for the given control
    * @param oRM the RenderManager that can be used for writing to the render output buffer.
    * @param oControl an object representation of the control that should be rendered.
    */
  def renderTooltip(oRM: RenderManager, oControl: Control): Unit = js.native
}

object IBarInPageEnabler {
  @scala.inline
  def apply(addChildClassTo: Control => Unit, renderTooltip: (RenderManager, Control) => Unit): IBarInPageEnabler = {
    val __obj = js.Dynamic.literal(addChildClassTo = js.Any.fromFunction1(addChildClassTo), renderTooltip = js.Any.fromFunction2(renderTooltip))
    __obj.asInstanceOf[IBarInPageEnabler]
  }
  @scala.inline
  implicit class IBarInPageEnablerOps[Self <: IBarInPageEnabler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddChildClassTo(value: Control => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildClassTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderTooltip(value: (RenderManager, Control) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTooltip")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

