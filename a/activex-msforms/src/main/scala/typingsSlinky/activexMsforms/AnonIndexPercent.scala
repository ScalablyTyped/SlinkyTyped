package typingsSlinky.activexMsforms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndexPercent extends js.Object {
  val Index: Double = js.native
  var Percent: Double = js.native
}

object AnonIndexPercent {
  @scala.inline
  def apply(Index: Double, Percent: Double): AnonIndexPercent = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any], Percent = Percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndexPercent]
  }
  @scala.inline
  implicit class AnonIndexPercentOps[Self <: AnonIndexPercent] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Percent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

