package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCountBy extends js.Object {
  var countBy: String = js.native
}

object AnonCountBy {
  @scala.inline
  def apply(countBy: String): AnonCountBy = {
    val __obj = js.Dynamic.literal(countBy = countBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountBy]
  }
  @scala.inline
  implicit class AnonCountByOps[Self <: AnonCountBy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

