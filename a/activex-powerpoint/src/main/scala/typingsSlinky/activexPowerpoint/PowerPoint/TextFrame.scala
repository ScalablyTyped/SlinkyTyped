package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoHorizontalAnchor
import typingsSlinky.activexOffice.Office.MsoTextOrientation
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.MsoVerticalAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFrame extends StObject {
  
  val Application: js.Any = js.native
  
  var AutoSize: PpAutoSize = js.native
  
  val Creator: Double = js.native
  
  def DeleteText(): Unit = js.native
  
  val HasText: MsoTriState = js.native
  
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  
  var MarginBottom: Double = js.native
  
  var MarginLeft: Double = js.native
  
  var MarginRight: Double = js.native
  
  var MarginTop: Double = js.native
  
  var Orientation: MsoTextOrientation = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.TextFrame_typekey")
  var PowerPointDotTextFrame_typekey: TextFrame = js.native
  
  val Ruler: typingsSlinky.activexPowerpoint.PowerPoint.Ruler = js.native
  
  val TextRange: typingsSlinky.activexPowerpoint.PowerPoint.TextRange = js.native
  
  var VerticalAnchor: MsoVerticalAnchor = js.native
  
  var WordWrap: MsoTriState = js.native
}
object TextFrame {
  
  @scala.inline
  def apply(
    Application: js.Any,
    AutoSize: PpAutoSize,
    Creator: Double,
    DeleteText: () => Unit,
    HasText: MsoTriState,
    HorizontalAnchor: MsoHorizontalAnchor,
    MarginBottom: Double,
    MarginLeft: Double,
    MarginRight: Double,
    MarginTop: Double,
    Orientation: MsoTextOrientation,
    Parent: js.Any,
    PowerPointDotTextFrame_typekey: TextFrame,
    Ruler: Ruler,
    TextRange: TextRange,
    VerticalAnchor: MsoVerticalAnchor,
    WordWrap: MsoTriState
  ): TextFrame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DeleteText = js.Any.fromFunction0(DeleteText), HasText = HasText.asInstanceOf[js.Any], HorizontalAnchor = HorizontalAnchor.asInstanceOf[js.Any], MarginBottom = MarginBottom.asInstanceOf[js.Any], MarginLeft = MarginLeft.asInstanceOf[js.Any], MarginRight = MarginRight.asInstanceOf[js.Any], MarginTop = MarginTop.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Ruler = Ruler.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], VerticalAnchor = VerticalAnchor.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextFrame_typekey")(PowerPointDotTextFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrame]
  }
  
  @scala.inline
  implicit class TextFrameMutableBuilder[Self <: TextFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSize(value: PpAutoSize): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteText(value: () => Unit): Self = StObject.set(x, "DeleteText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasText(value: MsoTriState): Self = StObject.set(x, "HasText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAnchor(value: MsoHorizontalAnchor): Self = StObject.set(x, "HorizontalAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottom(value: Double): Self = StObject.set(x, "MarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "MarginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRight(value: Double): Self = StObject.set(x, "MarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "MarginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: MsoTextOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTextFrame_typekey(value: TextFrame): Self = StObject.set(x, "PowerPoint.TextFrame_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuler(value: Ruler): Self = StObject.set(x, "Ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRange(value: TextRange): Self = StObject.set(x, "TextRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAnchor(value: MsoVerticalAnchor): Self = StObject.set(x, "VerticalAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: MsoTriState): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
