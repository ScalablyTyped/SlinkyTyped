package typingsSlinky.chance.anon

import typingsSlinky.chance.chanceStrings.Colon
import typingsSlinky.chance.chanceStrings.Dot
import typingsSlinky.chance.chanceStrings.Exclamationmark
import typingsSlinky.chance.chanceStrings.Questionmark
import typingsSlinky.chance.chanceStrings.Semicolon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.SentenceOptions> */
@js.native
trait PartialSentenceOptions extends js.Object {
  
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
  implicit class PartialSentenceOptionsOps[Self <: PartialSentenceOptions] (val x: Self) extends AnyVal {
    
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
    def setPunctuation(value: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean): Self = this.set("punctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePunctuation: Self = this.set("punctuation", js.undefined)
    
    @scala.inline
    def setWords(value: Double): Self = this.set("words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
}
