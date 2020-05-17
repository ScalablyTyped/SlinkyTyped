package typingsSlinky.googleGax.pathTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Segment extends js.Object {
  var kind: Double = js.native
  var literal: String = js.native
}

object Segment {
  @scala.inline
  def apply(kind: Double, literal: String): Segment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], literal = literal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  implicit class SegmentOps[Self <: Segment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiteral(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

