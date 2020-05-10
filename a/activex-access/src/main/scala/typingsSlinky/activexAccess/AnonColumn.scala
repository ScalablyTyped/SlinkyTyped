package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumn extends js.Object {
  val Column: Double = js.native
}

object AnonColumn {
  @scala.inline
  def apply(Column: Double): AnonColumn = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn]
  }
  @scala.inline
  implicit class AnonColumnOps[Self <: AnonColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Column")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

