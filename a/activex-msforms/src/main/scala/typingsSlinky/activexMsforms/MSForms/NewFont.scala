package typingsSlinky.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewFont extends js.Object {
  
  val Bold: Boolean = js.native
  
  val Charset: Double = js.native
  
  val Italic: Boolean = js.native
  
  @JSName("MSForms.NewFont_typekey")
  var MSFormsDotNewFont_typekey: NewFont = js.native
  
  val Name: String = js.native
  
  val Size: Double = js.native
  
  val Strikethrough: Boolean = js.native
  
  val Underline: Boolean = js.native
  
  val Weight: Double = js.native
}
object NewFont {
  
  @scala.inline
  def apply(
    Bold: Boolean,
    Charset: Double,
    Italic: Boolean,
    MSFormsDotNewFont_typekey: NewFont,
    Name: String,
    Size: Double,
    Strikethrough: Boolean,
    Underline: Boolean,
    Weight: Double
  ): NewFont = {
    val __obj = js.Dynamic.literal(Bold = Bold.asInstanceOf[js.Any], Charset = Charset.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.NewFont_typekey")(MSFormsDotNewFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewFont]
  }
  
  @scala.inline
  implicit class NewFontOps[Self <: NewFont] (val x: Self) extends AnyVal {
    
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
    def setBold(value: Boolean): Self = this.set("Bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharset(value: Double): Self = this.set("Charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("Italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotNewFont_typekey(value: NewFont): Self = this.set("MSForms.NewFont_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethrough(value: Boolean): Self = this.set("Strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("Underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("Weight", value.asInstanceOf[js.Any])
  }
}
