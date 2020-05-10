package typingsSlinky.agGrid.overlayWrapperComponentMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverlayWrapperComp extends IComponent[IOverlayWrapperParams] {
  def hideOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
  def showLoadingOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
  def showNoRowsOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
}

object IOverlayWrapperComp {
  @scala.inline
  def apply(
    getGui: () => HTMLElement,
    hideOverlay: HTMLElement => Unit,
    showLoadingOverlay: HTMLElement => Unit,
    showNoRowsOverlay: HTMLElement => Unit
  ): IOverlayWrapperComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), hideOverlay = js.Any.fromFunction1(hideOverlay), showLoadingOverlay = js.Any.fromFunction1(showLoadingOverlay), showNoRowsOverlay = js.Any.fromFunction1(showNoRowsOverlay))
    __obj.asInstanceOf[IOverlayWrapperComp]
  }
  @scala.inline
  implicit class IOverlayWrapperCompOps[Self <: IOverlayWrapperComp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideOverlay(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOverlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowLoadingOverlay(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoadingOverlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowNoRowsOverlay(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNoRowsOverlay")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

