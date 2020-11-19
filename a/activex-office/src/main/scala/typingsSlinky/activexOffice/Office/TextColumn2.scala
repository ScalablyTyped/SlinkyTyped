package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("Number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotTextColumn2_typekey(value: TextColumn2): Self = this.set("Office.TextColumn2_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("Spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDirection(value: MsoTextDirection): Self = this.set("TextDirection", value.asInstanceOf[js.Any])
  }
}
