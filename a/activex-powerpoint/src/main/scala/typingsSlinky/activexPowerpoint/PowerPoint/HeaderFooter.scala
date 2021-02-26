package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderFooter extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  var Format: PpDateTimeFormat = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.HeaderFooter_typekey")
  var PowerPointDotHeaderFooter_typekey: HeaderFooter = js.native
  
  var Text: String = js.native
  
  var UseFormat: MsoTriState = js.native
  
  var Visible: MsoTriState = js.native
}
object HeaderFooter {
  
  @scala.inline
  def apply(
    Application: Application,
    Format: PpDateTimeFormat,
    Parent: js.Any,
    PowerPointDotHeaderFooter_typekey: HeaderFooter,
    Text: String,
    UseFormat: MsoTriState,
    Visible: MsoTriState
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], UseFormat = UseFormat.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.HeaderFooter_typekey")(PowerPointDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  
  @scala.inline
  implicit class HeaderFooterMutableBuilder[Self <: HeaderFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: PpDateTimeFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotHeaderFooter_typekey(value: HeaderFooter): Self = StObject.set(x, "PowerPoint.HeaderFooter_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFormat(value: MsoTriState): Self = StObject.set(x, "UseFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
