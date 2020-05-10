package typingsSlinky.dojo.dojox.gfx3d

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/scheduler.html
  *
  *
  */
@js.native
trait scheduler_ extends js.Object {
  /**
    *
    */
  var drawer: js.Object = js.native
  /**
    *
    */
  var scheduler: js.Object = js.native
  /**
    *
    */
  def BinarySearchTree(): Unit = js.native
}

object scheduler_ {
  @scala.inline
  def apply(BinarySearchTree: () => Unit, drawer: js.Object, scheduler: js.Object): scheduler_ = {
    val __obj = js.Dynamic.literal(BinarySearchTree = js.Any.fromFunction0(BinarySearchTree), drawer = drawer.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any])
    __obj.asInstanceOf[scheduler_]
  }
  @scala.inline
  implicit class scheduler_Ops[Self <: scheduler_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinarySearchTree(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinarySearchTree")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrawer(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduler(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

