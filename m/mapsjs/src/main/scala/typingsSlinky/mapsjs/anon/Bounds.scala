package typingsSlinky.mapsjs.anon

import typingsSlinky.mapsjs.mod.envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounds extends js.Object {
  var Bounds: js.Array[envelope] = js.native
  var Shapes: js.Array[_] = js.native
  var Values: js.Array[_] = js.native
}

object Bounds {
  @scala.inline
  def apply(Bounds: js.Array[envelope], Shapes: js.Array[_], Values: js.Array[_]): Bounds = {
    val __obj = js.Dynamic.literal(Bounds = Bounds.asInstanceOf[js.Any], Shapes = Shapes.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: js.Array[envelope]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

