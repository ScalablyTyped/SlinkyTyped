package typingsSlinky.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceCtlName extends js.Object {
  val SourceCtlName: String = js.native
  val SourceFieldList: Double = js.native
  val SourceRow: Double = js.native
  val X: Double = js.native
  val Y: Double = js.native
}

object SourceCtlName {
  @scala.inline
  def apply(SourceCtlName: String, SourceFieldList: Double, SourceRow: Double, X: Double, Y: Double): SourceCtlName = {
    val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCtlName]
  }
  @scala.inline
  implicit class SourceCtlNameOps[Self <: SourceCtlName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceCtlName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCtlName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFieldList(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFieldList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

