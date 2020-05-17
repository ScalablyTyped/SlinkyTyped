package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client rectangle object.
  */
@js.native
trait ASPxClientRect extends js.Object {
  /**
    * Gets the Y-coordinate of the rectangle's bottom edge.
    */
  def GetBottom(): Double = js.native
  /**
    * Gets the rectangle's height.
    */
  def GetHeight(): Double = js.native
  /**
    * Gets the X-coordinate of the rectangle's left edge.
    */
  def GetLeft(): Double = js.native
  /**
    * Gets the X-coordinate of the rectangle's right edge.
    */
  def GetRight(): Double = js.native
  /**
    * Gets the Y-coordinate of the rectangle's top edge.
    */
  def GetTop(): Double = js.native
  /**
    * Gets the rectangle's width.
    */
  def GetWidth(): Double = js.native
}

object ASPxClientRect {
  @scala.inline
  def apply(
    GetBottom: () => Double,
    GetHeight: () => Double,
    GetLeft: () => Double,
    GetRight: () => Double,
    GetTop: () => Double,
    GetWidth: () => Double
  ): ASPxClientRect = {
    val __obj = js.Dynamic.literal(GetBottom = js.Any.fromFunction0(GetBottom), GetHeight = js.Any.fromFunction0(GetHeight), GetLeft = js.Any.fromFunction0(GetLeft), GetRight = js.Any.fromFunction0(GetRight), GetTop = js.Any.fromFunction0(GetTop), GetWidth = js.Any.fromFunction0(GetWidth))
    __obj.asInstanceOf[ASPxClientRect]
  }
  @scala.inline
  implicit class ASPxClientRectOps[Self <: ASPxClientRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBottom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLeft(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetRight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWidth")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

