package typingsSlinky.jsClipper.ClipperLib

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExPolygon extends js.Object {
  var holes: ArrayLike[ArrayLike[IntPoint]] = js.native
  var outer: ArrayLike[IntPoint] = js.native
}

object ExPolygon {
  @scala.inline
  def apply(holes: ArrayLike[ArrayLike[IntPoint]], outer: ArrayLike[IntPoint]): ExPolygon = {
    val __obj = js.Dynamic.literal(holes = holes.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExPolygon]
  }
  @scala.inline
  implicit class ExPolygonOps[Self <: ExPolygon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHoles(value: ArrayLike[ArrayLike[IntPoint]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuter(value: ArrayLike[IntPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

