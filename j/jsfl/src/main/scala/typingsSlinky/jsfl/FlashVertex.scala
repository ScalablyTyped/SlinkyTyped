package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashVertex extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  def getHalfEdge(): FlashHalfEdge = js.native
  def setLocation(x: Double, y: Double): js.Any = js.native
}

object FlashVertex {
  @scala.inline
  def apply(getHalfEdge: () => FlashHalfEdge, setLocation: (Double, Double) => js.Any, x: Double, y: Double): FlashVertex = {
    val __obj = js.Dynamic.literal(getHalfEdge = js.Any.fromFunction0(getHalfEdge), setLocation = js.Any.fromFunction2(setLocation), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashVertex]
  }
  @scala.inline
  implicit class FlashVertexOps[Self <: FlashVertex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetHalfEdge(value: () => FlashHalfEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHalfEdge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLocation(value: (Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

