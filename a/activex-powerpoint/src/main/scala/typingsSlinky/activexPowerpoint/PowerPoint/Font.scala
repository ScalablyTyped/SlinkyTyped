package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends js.Object {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  var AutoRotateNumbers: MsoTriState = js.native
  
  var BaselineOffset: Double = js.native
  
  var Bold: MsoTriState = js.native
  
  val Color: ColorFormat = js.native
  
  val Embeddable: MsoTriState = js.native
  
  val Embedded: MsoTriState = js.native
  
  var Emboss: MsoTriState = js.native
  
  var Italic: MsoTriState = js.native
  
  var Name: String = js.native
  
  var NameAscii: String = js.native
  
  var NameComplexScript: String = js.native
  
  var NameFarEast: String = js.native
  
  var NameOther: String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Font_typekey")
  var PowerPointDotFont_typekey: Font = js.native
  
  var Shadow: MsoTriState = js.native
  
  var Size: Double = js.native
  
  var Subscript: MsoTriState = js.native
  
  var Superscript: MsoTriState = js.native
  
  var Underline: MsoTriState = js.native
}
object Font {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoRotateNumbers: MsoTriState,
    BaselineOffset: Double,
    Bold: MsoTriState,
    Color: ColorFormat,
    Embeddable: MsoTriState,
    Embedded: MsoTriState,
    Emboss: MsoTriState,
    Italic: MsoTriState,
    Name: String,
    NameAscii: String,
    NameComplexScript: String,
    NameFarEast: String,
    NameOther: String,
    Parent: js.Any,
    PowerPointDotFont_typekey: Font,
    Shadow: MsoTriState,
    Size: Double,
    Subscript: MsoTriState,
    Superscript: MsoTriState,
    Underline: MsoTriState
  ): Font = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoRotateNumbers = AutoRotateNumbers.asInstanceOf[js.Any], BaselineOffset = BaselineOffset.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Embeddable = Embeddable.asInstanceOf[js.Any], Embedded = Embedded.asInstanceOf[js.Any], Emboss = Emboss.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameAscii = NameAscii.asInstanceOf[js.Any], NameComplexScript = NameComplexScript.asInstanceOf[js.Any], NameFarEast = NameFarEast.asInstanceOf[js.Any], NameOther = NameOther.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Font_typekey")(PowerPointDotFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotateNumbers(value: MsoTriState): Self = this.set("AutoRotateNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineOffset(value: Double): Self = this.set("BaselineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: MsoTriState): Self = this.set("Bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: ColorFormat): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddable(value: MsoTriState): Self = this.set("Embeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedded(value: MsoTriState): Self = this.set("Embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmboss(value: MsoTriState): Self = this.set("Emboss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: MsoTriState): Self = this.set("Italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameAscii(value: String): Self = this.set("NameAscii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameComplexScript(value: String): Self = this.set("NameComplexScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFarEast(value: String): Self = this.set("NameFarEast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOther(value: String): Self = this.set("NameOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotFont_typekey(value: Font): Self = this.set("PowerPoint.Font_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: MsoTriState): Self = this.set("Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscript(value: MsoTriState): Self = this.set("Subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperscript(value: MsoTriState): Self = this.set("Superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: MsoTriState): Self = this.set("Underline", value.asInstanceOf[js.Any])
  }
}
