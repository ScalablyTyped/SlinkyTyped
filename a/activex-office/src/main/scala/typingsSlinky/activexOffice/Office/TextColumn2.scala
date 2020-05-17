package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextColumn2 extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var Number: Double = js.native
  @JSName("Office.TextColumn2_typekey")
  var OfficeDotTextColumn2_typekey: TextColumn2 = js.native
  var Spacing: Double = js.native
  var TextDirection: MsoTextDirection = js.native
}

object TextColumn2 {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Number: Double,
    OfficeDotTextColumn2_typekey: TextColumn2,
    Spacing: Double,
    TextDirection: MsoTextDirection
  ): TextColumn2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Spacing = Spacing.asInstanceOf[js.Any], TextDirection = TextDirection.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TextColumn2_typekey")(OfficeDotTextColumn2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColumn2]
  }
  @scala.inline
  implicit class TextColumn2Ops[Self <: TextColumn2] (val x: Self) extends AnyVal {
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
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotTextColumn2_typekey(value: TextColumn2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.TextColumn2_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDirection(value: MsoTextDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

