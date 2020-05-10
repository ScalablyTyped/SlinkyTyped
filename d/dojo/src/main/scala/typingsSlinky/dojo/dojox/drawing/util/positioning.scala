package typingsSlinky.dojo.dojox.drawing.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/util/positioning.html
  *
  *
  */
@js.native
trait positioning extends js.Object {
  /**
    * Returns the optimal position for annotations.Angle.
    *
    * @param start
    * @param end
    */
  def angle(start: js.Object, end: js.Object): js.Object = js.native
  /**
    * Returns the optimal text positions for annotations.Label.
    *
    * @param start
    * @param end
    */
  def label(start: js.Object, end: js.Object): js.Object = js.native
}

object positioning {
  @scala.inline
  def apply(angle: (js.Object, js.Object) => js.Object, label: (js.Object, js.Object) => js.Object): positioning = {
    val __obj = js.Dynamic.literal(angle = js.Any.fromFunction2(angle), label = js.Any.fromFunction2(label))
    __obj.asInstanceOf[positioning]
  }
  @scala.inline
  implicit class positioningOps[Self <: positioning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: (js.Object, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLabel(value: (js.Object, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

