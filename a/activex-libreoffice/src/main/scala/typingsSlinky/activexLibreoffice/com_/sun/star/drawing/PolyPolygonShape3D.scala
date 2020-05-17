package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the coordinates of a 3-dimensional poly polygon. */
@js.native
trait PolyPolygonShape3D extends js.Object {
  var SequenceX: DoubleSequenceSequence = js.native
  var SequenceY: DoubleSequenceSequence = js.native
  var SequenceZ: DoubleSequenceSequence = js.native
}

object PolyPolygonShape3D {
  @scala.inline
  def apply(
    SequenceX: DoubleSequenceSequence,
    SequenceY: DoubleSequenceSequence,
    SequenceZ: DoubleSequenceSequence
  ): PolyPolygonShape3D = {
    val __obj = js.Dynamic.literal(SequenceX = SequenceX.asInstanceOf[js.Any], SequenceY = SequenceY.asInstanceOf[js.Any], SequenceZ = SequenceZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonShape3D]
  }
  @scala.inline
  implicit class PolyPolygonShape3DOps[Self <: PolyPolygonShape3D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSequenceX(value: DoubleSequenceSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceY(value: DoubleSequenceSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceZ(value: DoubleSequenceSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceZ")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

