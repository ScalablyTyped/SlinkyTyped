package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableStyle extends js.Object {
  val Id: String = js.native
  val Name: String = js.native
  @JSName("PowerPoint.TableStyle_typekey")
  var PowerPointDotTableStyle_typekey: TableStyle = js.native
}

object TableStyle {
  @scala.inline
  def apply(Id: String, Name: String, PowerPointDotTableStyle_typekey: TableStyle): TableStyle = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TableStyle_typekey")(PowerPointDotTableStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyle]
  }
  @scala.inline
  implicit class TableStyleOps[Self <: TableStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotTableStyle_typekey(value: TableStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.TableStyle_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

