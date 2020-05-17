package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStop2 extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.TabStop2_typekey")
  var OfficeDotTabStop2_typekey: TabStop2 = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  var Type: MsoTabStopType = js.native
  def Clear(): Unit = js.native
}

object TabStop2 {
  @scala.inline
  def apply(
    Application: js.Any,
    Clear: () => Unit,
    Creator: Double,
    OfficeDotTabStop2_typekey: TabStop2,
    Parent: js.Any,
    Position: Double,
    Type: MsoTabStopType
  ): TabStop2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TabStop2_typekey")(OfficeDotTabStop2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop2]
  }
  @scala.inline
  implicit class TabStop2Ops[Self <: TabStop2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotTabStop2_typekey(value: TabStop2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.TabStop2_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoTabStopType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

