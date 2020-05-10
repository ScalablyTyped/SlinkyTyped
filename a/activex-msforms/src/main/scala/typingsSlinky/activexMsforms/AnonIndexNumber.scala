package typingsSlinky.activexMsforms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndexNumber extends js.Object {
  val Index: Double = js.native
}

object AnonIndexNumber {
  @scala.inline
  def apply(Index: Double): AnonIndexNumber = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndexNumber]
  }
  @scala.inline
  implicit class AnonIndexNumberOps[Self <: AnonIndexNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

