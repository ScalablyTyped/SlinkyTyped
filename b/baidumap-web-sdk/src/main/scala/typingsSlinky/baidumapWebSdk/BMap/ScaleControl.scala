package typingsSlinky.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleControl extends Control {
  def getUnit(): LengthUnit = js.native
  def setUnit(unit: LengthUnit): Unit = js.native
}

object ScaleControl {
  @scala.inline
  def apply(
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: () => ControlAnchor,
    getContainer: () => js.UndefOr[HTMLElement],
    getOffset: () => Size,
    getUnit: () => LengthUnit,
    hide: () => Unit,
    initialize: Map => HTMLElement,
    isVisible: () => Boolean,
    setAnchor: ControlAnchor => Unit,
    setOffset: Size => Unit,
    setUnit: LengthUnit => Unit,
    show: () => Unit
  ): ScaleControl = {
    val __obj = js.Dynamic.literal(defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getContainer = js.Any.fromFunction0(getContainer), getOffset = js.Any.fromFunction0(getOffset), getUnit = js.Any.fromFunction0(getUnit), hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction1(initialize), isVisible = js.Any.fromFunction0(isVisible), setAnchor = js.Any.fromFunction1(setAnchor), setOffset = js.Any.fromFunction1(setOffset), setUnit = js.Any.fromFunction1(setUnit), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ScaleControl]
  }
  @scala.inline
  implicit class ScaleControlOps[Self <: ScaleControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUnit(value: () => LengthUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUnit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetUnit(value: LengthUnit => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUnit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

