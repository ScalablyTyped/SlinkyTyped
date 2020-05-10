package typingsSlinky.dojo.dijit.OnDijitClickMixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_OnDijitClickMixin.a11yclick.html
  *
  * Custom press, release, and click synthetic events
  * which trigger on a left mouse click, touch, or space/enter keyup.
  * 
  */
@js.native
trait a11yclick extends js.Object {
  /**
    * Logical click operation for mouse, touch, or keyboard (space/enter key)
    * 
    * @param node             
    * @param listener             
    */
  def click(node: js.Any, listener: js.Any): Unit = js.native
  /**
    * Mouse cursor or a finger is dragged over the given node.
    * 
    * @param node             
    * @param listener             
    */
  def move(node: js.Any, listener: js.Any): Unit = js.native
  /**
    * Mousedown (left button), touchstart, or keydown (space or enter) corresponding to logical click operation.
    * 
    * @param node             
    * @param listener             
    */
  def press(node: js.Any, listener: js.Any): Unit = js.native
  /**
    * Mouseup (left button), touchend, or keyup (space or enter) corresponding to logical click operation.
    * 
    * @param node             
    * @param listener             
    */
  def release(node: js.Any, listener: js.Any): Unit = js.native
}

object a11yclick {
  @scala.inline
  def apply(
    click: (js.Any, js.Any) => Unit,
    move: (js.Any, js.Any) => Unit,
    press: (js.Any, js.Any) => Unit,
    release: (js.Any, js.Any) => Unit
  ): a11yclick = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction2(click), move = js.Any.fromFunction2(move), press = js.Any.fromFunction2(press), release = js.Any.fromFunction2(release))
    __obj.asInstanceOf[a11yclick]
  }
  @scala.inline
  implicit class a11yclickOps[Self <: a11yclick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMove(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPress(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("press")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRelease(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

