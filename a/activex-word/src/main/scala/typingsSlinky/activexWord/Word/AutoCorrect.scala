package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCorrect extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  var CorrectCapsLock: Boolean = js.native
  
  var CorrectDays: Boolean = js.native
  
  var CorrectHangulAndAlphabet: Boolean = js.native
  
  var CorrectInitialCaps: Boolean = js.native
  
  var CorrectKeyboardSetting: Boolean = js.native
  
  var CorrectSentenceCaps: Boolean = js.native
  
  var CorrectTableCells: Boolean = js.native
  
  val Creator: Double = js.native
  
  var DisplayAutoCorrectOptions: Boolean = js.native
  
  val Entries: AutoCorrectEntries = js.native
  
  var FirstLetterAutoAdd: Boolean = js.native
  
  val FirstLetterExceptions: typingsSlinky.activexWord.Word.FirstLetterExceptions = js.native
  
  var HangulAndAlphabetAutoAdd: Boolean = js.native
  
  val HangulAndAlphabetExceptions: typingsSlinky.activexWord.Word.HangulAndAlphabetExceptions = js.native
  
  var OtherCorrectionsAutoAdd: Boolean = js.native
  
  val OtherCorrectionsExceptions: typingsSlinky.activexWord.Word.OtherCorrectionsExceptions = js.native
  
  val Parent: js.Any = js.native
  
  var ReplaceText: Boolean = js.native
  
  var ReplaceTextFromSpellingChecker: Boolean = js.native
  
  var TwoInitialCapsAutoAdd: Boolean = js.native
  
  val TwoInitialCapsExceptions: typingsSlinky.activexWord.Word.TwoInitialCapsExceptions = js.native
  
  @JSName("Word.AutoCorrect_typekey")
  var WordDotAutoCorrect_typekey: AutoCorrect = js.native
}
object AutoCorrect {
  
  @scala.inline
  def apply(
    Application: Application,
    CorrectCapsLock: Boolean,
    CorrectDays: Boolean,
    CorrectHangulAndAlphabet: Boolean,
    CorrectInitialCaps: Boolean,
    CorrectKeyboardSetting: Boolean,
    CorrectSentenceCaps: Boolean,
    CorrectTableCells: Boolean,
    Creator: Double,
    DisplayAutoCorrectOptions: Boolean,
    Entries: AutoCorrectEntries,
    FirstLetterAutoAdd: Boolean,
    FirstLetterExceptions: FirstLetterExceptions,
    HangulAndAlphabetAutoAdd: Boolean,
    HangulAndAlphabetExceptions: HangulAndAlphabetExceptions,
    OtherCorrectionsAutoAdd: Boolean,
    OtherCorrectionsExceptions: OtherCorrectionsExceptions,
    Parent: js.Any,
    ReplaceText: Boolean,
    ReplaceTextFromSpellingChecker: Boolean,
    TwoInitialCapsAutoAdd: Boolean,
    TwoInitialCapsExceptions: TwoInitialCapsExceptions,
    WordDotAutoCorrect_typekey: AutoCorrect
  ): AutoCorrect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CorrectCapsLock = CorrectCapsLock.asInstanceOf[js.Any], CorrectDays = CorrectDays.asInstanceOf[js.Any], CorrectHangulAndAlphabet = CorrectHangulAndAlphabet.asInstanceOf[js.Any], CorrectInitialCaps = CorrectInitialCaps.asInstanceOf[js.Any], CorrectKeyboardSetting = CorrectKeyboardSetting.asInstanceOf[js.Any], CorrectSentenceCaps = CorrectSentenceCaps.asInstanceOf[js.Any], CorrectTableCells = CorrectTableCells.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplayAutoCorrectOptions = DisplayAutoCorrectOptions.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], FirstLetterAutoAdd = FirstLetterAutoAdd.asInstanceOf[js.Any], FirstLetterExceptions = FirstLetterExceptions.asInstanceOf[js.Any], HangulAndAlphabetAutoAdd = HangulAndAlphabetAutoAdd.asInstanceOf[js.Any], HangulAndAlphabetExceptions = HangulAndAlphabetExceptions.asInstanceOf[js.Any], OtherCorrectionsAutoAdd = OtherCorrectionsAutoAdd.asInstanceOf[js.Any], OtherCorrectionsExceptions = OtherCorrectionsExceptions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplaceText = ReplaceText.asInstanceOf[js.Any], ReplaceTextFromSpellingChecker = ReplaceTextFromSpellingChecker.asInstanceOf[js.Any], TwoInitialCapsAutoAdd = TwoInitialCapsAutoAdd.asInstanceOf[js.Any], TwoInitialCapsExceptions = TwoInitialCapsExceptions.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCorrect_typekey")(WordDotAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrect]
  }
  
  @scala.inline
  implicit class AutoCorrectMutableBuilder[Self <: AutoCorrect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectCapsLock(value: Boolean): Self = StObject.set(x, "CorrectCapsLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectDays(value: Boolean): Self = StObject.set(x, "CorrectDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectHangulAndAlphabet(value: Boolean): Self = StObject.set(x, "CorrectHangulAndAlphabet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectInitialCaps(value: Boolean): Self = StObject.set(x, "CorrectInitialCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectKeyboardSetting(value: Boolean): Self = StObject.set(x, "CorrectKeyboardSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectSentenceCaps(value: Boolean): Self = StObject.set(x, "CorrectSentenceCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectTableCells(value: Boolean): Self = StObject.set(x, "CorrectTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAutoCorrectOptions(value: Boolean): Self = StObject.set(x, "DisplayAutoCorrectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntries(value: AutoCorrectEntries): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLetterAutoAdd(value: Boolean): Self = StObject.set(x, "FirstLetterAutoAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLetterExceptions(value: FirstLetterExceptions): Self = StObject.set(x, "FirstLetterExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangulAndAlphabetAutoAdd(value: Boolean): Self = StObject.set(x, "HangulAndAlphabetAutoAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangulAndAlphabetExceptions(value: HangulAndAlphabetExceptions): Self = StObject.set(x, "HangulAndAlphabetExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherCorrectionsAutoAdd(value: Boolean): Self = StObject.set(x, "OtherCorrectionsAutoAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherCorrectionsExceptions(value: OtherCorrectionsExceptions): Self = StObject.set(x, "OtherCorrectionsExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceText(value: Boolean): Self = StObject.set(x, "ReplaceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceTextFromSpellingChecker(value: Boolean): Self = StObject.set(x, "ReplaceTextFromSpellingChecker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoInitialCapsAutoAdd(value: Boolean): Self = StObject.set(x, "TwoInitialCapsAutoAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoInitialCapsExceptions(value: TwoInitialCapsExceptions): Self = StObject.set(x, "TwoInitialCapsExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotAutoCorrect_typekey(value: AutoCorrect): Self = StObject.set(x, "Word.AutoCorrect_typekey", value.asInstanceOf[js.Any])
  }
}
