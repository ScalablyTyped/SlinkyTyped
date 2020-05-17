package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulerLevel2 extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var FirstMargin: Double = js.native
  var LeftMargin: Double = js.native
  @JSName("Office.RulerLevel2_typekey")
  var OfficeDotRulerLevel2_typekey: RulerLevel2 = js.native
  val Parent: js.Any = js.native
}

object RulerLevel2 {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    FirstMargin: Double,
    LeftMargin: Double,
    OfficeDotRulerLevel2_typekey: RulerLevel2,
    Parent: js.Any
  ): RulerLevel2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FirstMargin = FirstMargin.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.RulerLevel2_typekey")(OfficeDotRulerLevel2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerLevel2]
  }
  @scala.inline
  implicit class RulerLevel2Ops[Self <: RulerLevel2] (val x: Self) extends AnyVal {
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
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotRulerLevel2_typekey(value: RulerLevel2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.RulerLevel2_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

