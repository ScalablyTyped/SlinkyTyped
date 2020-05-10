package typingsSlinky.esquery.mod

import typingsSlinky.esquery.esqueryStrings.adjacent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adjacent
  extends BinarySelectorAtom
     with BinarySelector
     with Selector {
  @JSName("type")
  var type_Adjacent: adjacent = js.native
}

object Adjacent {
  @scala.inline
  def apply(left: SubjectSelector, right: SubjectSelector, `type`: adjacent): Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adjacent]
  }
  @scala.inline
  implicit class AdjacentOps[Self <: Adjacent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: adjacent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

