package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replacement extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  def ClearFormatting(): Unit = js.native
  
  val Creator: Double = js.native
  
  var Font: typingsSlinky.activexWord.Word.Font = js.native
  
  val Frame: typingsSlinky.activexWord.Word.Frame = js.native
  
  var Highlight: Double = js.native
  
  var LanguageID: WdLanguageID = js.native
  
  var LanguageIDFarEast: WdLanguageID = js.native
  
  var NoProofing: Double = js.native
  
  var ParagraphFormat: typingsSlinky.activexWord.Word.ParagraphFormat = js.native
  
  val Parent: js.Any = js.native
  
  var Style: js.Any = js.native
  
  var Text: String = js.native
  
  @JSName("Word.Replacement_typekey")
  var WordDotReplacement_typekey: Replacement = js.native
}
object Replacement {
  
  @scala.inline
  def apply(
    Application: Application,
    ClearFormatting: () => Unit,
    Creator: Double,
    Font: Font,
    Frame: Frame,
    Highlight: Double,
    LanguageID: WdLanguageID,
    LanguageIDFarEast: WdLanguageID,
    NoProofing: Double,
    ParagraphFormat: ParagraphFormat,
    Parent: js.Any,
    Style: js.Any,
    Text: String,
    WordDotReplacement_typekey: Replacement
  ): Replacement = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearFormatting = js.Any.fromFunction0(ClearFormatting), Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Highlight = Highlight.asInstanceOf[js.Any], LanguageID = LanguageID.asInstanceOf[js.Any], LanguageIDFarEast = LanguageIDFarEast.asInstanceOf[js.Any], NoProofing = NoProofing.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Replacement_typekey")(WordDotReplacement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacement]
  }
  
  @scala.inline
  implicit class ReplacementMutableBuilder[Self <: Replacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFormatting(value: () => Unit): Self = StObject.set(x, "ClearFormatting", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: Frame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight(value: Double): Self = StObject.set(x, "Highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageID(value: WdLanguageID): Self = StObject.set(x, "LanguageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageIDFarEast(value: WdLanguageID): Self = StObject.set(x, "LanguageIDFarEast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoProofing(value: Double): Self = StObject.set(x, "NoProofing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphFormat(value: ParagraphFormat): Self = StObject.set(x, "ParagraphFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotReplacement_typekey(value: Replacement): Self = StObject.set(x, "Word.Replacement_typekey", value.asInstanceOf[js.Any])
  }
}
