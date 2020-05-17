package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains start and end position of a word.
  *
  * It is used in word break iterator and text conversion.
  * @see XBreakIterator
  * @see XTextConversion
  */
@js.native
trait Boundary extends js.Object {
  var endPos: Double = js.native
  var startPos: Double = js.native
}

object Boundary {
  @scala.inline
  def apply(endPos: Double, startPos: Double): Boundary = {
    val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundary]
  }
  @scala.inline
  implicit class BoundaryOps[Self <: Boundary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

