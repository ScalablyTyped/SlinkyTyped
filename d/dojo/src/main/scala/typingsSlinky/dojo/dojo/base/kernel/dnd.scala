package typingsSlinky.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.dnd.html
  *
  *
  */
@js.native
trait dnd extends js.Object {
  /**
    * Used by dojo/dnd/Manager to scroll document or internal node when the user
    * drags near the edge of the viewport or a scrollable node
    *
    */
  var autoscroll: js.Object = js.native
  /**
    *
    */
  var move: js.Object = js.native
  /**
    *
    */
  def AutoSource(): Unit = js.native
  /**
    *
    */
  def Avatar(): Unit = js.native
  /**
    *
    */
  def Container(): Unit = js.native
  /**
    *
    */
  def Manager(): Unit = js.native
  /**
    *
    */
  def Moveable(): Unit = js.native
  /**
    *
    */
  def Mover(): Unit = js.native
  /**
    *
    */
  def Selector(): Unit = js.native
  /**
    *
    */
  def Source(): Unit = js.native
  /**
    *
    */
  def Target(): Unit = js.native
  /**
    *
    */
  def TimedMoveable(): Unit = js.native
}

object dnd {
  @scala.inline
  def apply(
    AutoSource: () => Unit,
    Avatar: () => Unit,
    Container: () => Unit,
    Manager: () => Unit,
    Moveable: () => Unit,
    Mover: () => Unit,
    Selector: () => Unit,
    Source: () => Unit,
    Target: () => Unit,
    TimedMoveable: () => Unit,
    autoscroll: js.Object,
    move: js.Object
  ): dnd = {
    val __obj = js.Dynamic.literal(AutoSource = js.Any.fromFunction0(AutoSource), Avatar = js.Any.fromFunction0(Avatar), Container = js.Any.fromFunction0(Container), Manager = js.Any.fromFunction0(Manager), Moveable = js.Any.fromFunction0(Moveable), Mover = js.Any.fromFunction0(Mover), Selector = js.Any.fromFunction0(Selector), Source = js.Any.fromFunction0(Source), Target = js.Any.fromFunction0(Target), TimedMoveable = js.Any.fromFunction0(TimedMoveable), autoscroll = autoscroll.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[dnd]
  }
  @scala.inline
  implicit class dndOps[Self <: dnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSource(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAvatar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Avatar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContainer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withManager(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manager")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Moveable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMover(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mover")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelector(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSource(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTimedMoveable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMoveable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAutoscroll(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMove(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

