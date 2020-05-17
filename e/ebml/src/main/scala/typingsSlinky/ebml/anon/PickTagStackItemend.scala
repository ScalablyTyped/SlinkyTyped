package typingsSlinky.ebml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<ebml.ebml.Encoder.TagStackItem, 'end'> */
@js.native
trait PickTagStackItemend extends js.Object {
  var end: Double = js.native
}

object PickTagStackItemend {
  @scala.inline
  def apply(end: Double): PickTagStackItemend = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTagStackItemend]
  }
  @scala.inline
  implicit class PickTagStackItemendOps[Self <: PickTagStackItemend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

