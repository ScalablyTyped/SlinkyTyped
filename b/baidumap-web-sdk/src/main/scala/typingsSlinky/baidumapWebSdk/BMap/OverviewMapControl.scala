package typingsSlinky.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.baidumapWebSdk.anon.IsOpen
import typingsSlinky.baidumapWebSdk.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverviewMapControl extends Control {
  def changeView(): Unit = js.native
  def getSize(): Size = js.native
  def onviewchanged(event: IsOpen): Unit = js.native
  def onviewchanging(event: Target): Unit = js.native
  def setSize(size: Size): Unit = js.native
}

object OverviewMapControl {
  @scala.inline
  def apply(
    changeView: () => Unit,
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: () => ControlAnchor,
    getContainer: () => js.UndefOr[HTMLElement],
    getOffset: () => Size,
    getSize: () => Size,
    hide: () => Unit,
    initialize: Map => HTMLElement,
    isVisible: () => Boolean,
    onviewchanged: IsOpen => Unit,
    onviewchanging: Target => Unit,
    setAnchor: ControlAnchor => Unit,
    setOffset: Size => Unit,
    setSize: Size => Unit,
    show: () => Unit
  ): OverviewMapControl = {
    val __obj = js.Dynamic.literal(changeView = js.Any.fromFunction0(changeView), defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getContainer = js.Any.fromFunction0(getContainer), getOffset = js.Any.fromFunction0(getOffset), getSize = js.Any.fromFunction0(getSize), hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction1(initialize), isVisible = js.Any.fromFunction0(isVisible), onviewchanged = js.Any.fromFunction1(onviewchanged), onviewchanging = js.Any.fromFunction1(onviewchanging), setAnchor = js.Any.fromFunction1(setAnchor), setOffset = js.Any.fromFunction1(setOffset), setSize = js.Any.fromFunction1(setSize), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[OverviewMapControl]
  }
  @scala.inline
  implicit class OverviewMapControlOps[Self <: OverviewMapControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeView(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnviewchanged(value: IsOpen => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onviewchanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnviewchanging(value: Target => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onviewchanging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSize(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

