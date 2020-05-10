package typingsSlinky.leafletPm.mod.PM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draw extends js.Object {
  def getShapes(): js.Array[String] = js.native
}

object Draw {
  @scala.inline
  def apply(getShapes: () => js.Array[String]): Draw = {
    val __obj = js.Dynamic.literal(getShapes = js.Any.fromFunction0(getShapes))
    __obj.asInstanceOf[Draw]
  }
  @scala.inline
  implicit class DrawOps[Self <: Draw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetShapes(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShapes")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

