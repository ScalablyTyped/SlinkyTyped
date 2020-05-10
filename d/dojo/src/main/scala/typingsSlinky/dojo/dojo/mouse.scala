package typingsSlinky.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/mouse.html
  *
  * This module provide mouse event handling utility functions and exports
  * mouseenter and mouseleave event emulation.
  *
  */
@js.native
trait mouse extends js.Object {
  /**
    * This is an extension event for the mouseenter that IE provides, emulating the
    * behavior on other browsers.
    *
    */
  var enter: js.Object = js.native
  /**
    * This is an extension event for the mouseleave that IE provides, emulating the
    * behavior on other browsers.
    *
    */
  var leave: js.Object = js.native
  /**
    * Test an event object (from a mousedown event) to see if the left button was pressed.
    *
    */
  def isLeft(): Unit = js.native
  /**
    * Test an event object (from a mousedown event) to see if the middle button was pressed.
    *
    */
  def isMiddle(): Unit = js.native
  /**
    * Test an event object (from a mousedown event) to see if the right button was pressed.
    *
    */
  def isRight(): Unit = js.native
  /**
    * This is an extension event for the mousewheel that non-Mozilla browsers provide,
    * emulating the behavior on Mozilla based browsers.
    *
    * @param node
    * @param listener
    */
  def wheel(node: js.Any, listener: js.Any): js.Any = js.native
}

object mouse {
  @scala.inline
  def apply(
    enter: js.Object,
    isLeft: () => Unit,
    isMiddle: () => Unit,
    isRight: () => Unit,
    leave: js.Object,
    wheel: (js.Any, js.Any) => js.Any
  ): mouse = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], isLeft = js.Any.fromFunction0(isLeft), isMiddle = js.Any.fromFunction0(isMiddle), isRight = js.Any.fromFunction0(isRight), leave = leave.asInstanceOf[js.Any], wheel = js.Any.fromFunction2(wheel))
    __obj.asInstanceOf[mouse]
  }
  @scala.inline
  implicit class mouseOps[Self <: mouse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnter(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLeft(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMiddle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMiddle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRight(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLeave(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWheel(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

