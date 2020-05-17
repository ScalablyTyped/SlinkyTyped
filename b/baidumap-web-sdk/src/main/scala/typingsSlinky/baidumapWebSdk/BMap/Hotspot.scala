package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hotspot extends Overlay {
  def getPosition(): Point = js.native
  def getText(): String = js.native
  def getUserData(): js.Any = js.native
  def setPosition(position: Point): Unit = js.native
  def setText(text: String): Unit = js.native
  def setUserData(data: js.Any): Unit = js.native
}

object Hotspot {
  @scala.inline
  def apply(
    getPosition: () => Point,
    getText: () => String,
    getUserData: () => js.Any,
    setPosition: Point => Unit,
    setText: String => Unit,
    setUserData: js.Any => Unit
  ): Hotspot = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), getText = js.Any.fromFunction0(getText), getUserData = js.Any.fromFunction0(getUserData), setPosition = js.Any.fromFunction1(setPosition), setText = js.Any.fromFunction1(setText), setUserData = js.Any.fromFunction1(setUserData))
    __obj.asInstanceOf[Hotspot]
  }
  @scala.inline
  implicit class HotspotOps[Self <: Hotspot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPosition(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserData(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: Point => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUserData(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUserData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

