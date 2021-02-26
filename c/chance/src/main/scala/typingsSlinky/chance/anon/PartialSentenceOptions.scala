package typingsSlinky.chance.anon

import typingsSlinky.chance.chanceStrings.Colon
import typingsSlinky.chance.chanceStrings.Dot
import typingsSlinky.chance.chanceStrings.Exclamationmark
import typingsSlinky.chance.chanceStrings.Questionmark
import typingsSlinky.chance.chanceStrings.Semicolon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.SentenceOptions> */
@js.native
trait PartialSentenceOptions extends StObject {
  
  var punctuation: js.UndefOr[Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean] = js.native
  
  var words: js.UndefOr[Double] = js.native
}
object PartialSentenceOptions {
  
  @scala.inline
  def apply(): PartialSentenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSentenceOptions]
  }
  
  @scala.inline
  implicit class PartialSentenceOptionsMutableBuilder[Self <: PartialSentenceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPunctuation(value: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPunctuationUndefined: Self = StObject.set(x, "punctuation", js.undefined)
    
    @scala.inline
    def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
  }
}
