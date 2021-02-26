package typingsSlinky.chance.Chance

import typingsSlinky.chance.chanceStrings.Colon
import typingsSlinky.chance.chanceStrings.Dot
import typingsSlinky.chance.chanceStrings.Exclamationmark
import typingsSlinky.chance.chanceStrings.Questionmark
import typingsSlinky.chance.chanceStrings.Semicolon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SentenceOptions extends StObject {
  
  var punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean = js.native
  
  var words: Double = js.native
}
object SentenceOptions {
  
  @scala.inline
  def apply(punctuation: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean, words: Double): SentenceOptions = {
    val __obj = js.Dynamic.literal(punctuation = punctuation.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentenceOptions]
  }
  
  @scala.inline
  implicit class SentenceOptionsMutableBuilder[Self <: SentenceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPunctuation(value: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
  }
}
