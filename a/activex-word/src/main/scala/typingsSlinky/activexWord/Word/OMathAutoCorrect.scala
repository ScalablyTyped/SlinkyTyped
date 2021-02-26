package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathAutoCorrect extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Entries: OMathAutoCorrectEntries = js.native
  
  val Functions: OMathRecognizedFunctions = js.native
  
  val Parent: js.Any = js.native
  
  var ReplaceText: Boolean = js.native
  
  var UseOutsideOMath: Boolean = js.native
  
  @JSName("Word.OMathAutoCorrect_typekey")
  var WordDotOMathAutoCorrect_typekey: OMathAutoCorrect = js.native
}
object OMathAutoCorrect {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Entries: OMathAutoCorrectEntries,
    Functions: OMathRecognizedFunctions,
    Parent: js.Any,
    ReplaceText: Boolean,
    UseOutsideOMath: Boolean,
    WordDotOMathAutoCorrect_typekey: OMathAutoCorrect
  ): OMathAutoCorrect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplaceText = ReplaceText.asInstanceOf[js.Any], UseOutsideOMath = UseOutsideOMath.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathAutoCorrect_typekey")(WordDotOMathAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathAutoCorrect]
  }
  
  @scala.inline
  implicit class OMathAutoCorrectMutableBuilder[Self <: OMathAutoCorrect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntries(value: OMathAutoCorrectEntries): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctions(value: OMathRecognizedFunctions): Self = StObject.set(x, "Functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceText(value: Boolean): Self = StObject.set(x, "ReplaceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseOutsideOMath(value: Boolean): Self = StObject.set(x, "UseOutsideOMath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathAutoCorrect_typekey(value: OMathAutoCorrect): Self = StObject.set(x, "Word.OMathAutoCorrect_typekey", value.asInstanceOf[js.Any])
  }
}
