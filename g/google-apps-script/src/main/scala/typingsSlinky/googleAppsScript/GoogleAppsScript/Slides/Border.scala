package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the border around an element.
  */
@js.native
trait Border extends js.Object {
  def getDashStyle(): DashStyle = js.native
  def getLineFill(): LineFill = js.native
  def getWeight(): Double = js.native
  def isVisible(): Boolean = js.native
  def setDashStyle(style: DashStyle): Border = js.native
  def setTransparent(): Border = js.native
  def setWeight(points: Double): Border = js.native
}

object Border {
  @scala.inline
  def apply(
    getDashStyle: () => DashStyle,
    getLineFill: () => LineFill,
    getWeight: () => Double,
    isVisible: () => Boolean,
    setDashStyle: DashStyle => Border,
    setTransparent: () => Border,
    setWeight: Double => Border
  ): Border = {
    val __obj = js.Dynamic.literal(getDashStyle = js.Any.fromFunction0(getDashStyle), getLineFill = js.Any.fromFunction0(getLineFill), getWeight = js.Any.fromFunction0(getWeight), isVisible = js.Any.fromFunction0(isVisible), setDashStyle = js.Any.fromFunction1(setDashStyle), setTransparent = js.Any.fromFunction0(setTransparent), setWeight = js.Any.fromFunction1(setWeight))
    __obj.asInstanceOf[Border]
  }
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDashStyle(value: () => DashStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDashStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLineFill(value: () => LineFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDashStyle(value: DashStyle => Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDashStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTransparent(value: () => Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransparent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetWeight(value: Double => Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWeight")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

