package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.XHyphenatedWord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Results of method {@link XBreakIterator.getLineBreak()} . */
@js.native
trait LineBreakResults extends StObject {
  
  var breakIndex: Double = js.native
  
  var breakType: Double = js.native
  
  var rHyphenatedWord: XHyphenatedWord = js.native
}
object LineBreakResults {
  
  @scala.inline
  def apply(breakIndex: Double, breakType: Double, rHyphenatedWord: XHyphenatedWord): LineBreakResults = {
    val __obj = js.Dynamic.literal(breakIndex = breakIndex.asInstanceOf[js.Any], breakType = breakType.asInstanceOf[js.Any], rHyphenatedWord = rHyphenatedWord.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineBreakResults]
  }
  
  @scala.inline
  implicit class LineBreakResultsMutableBuilder[Self <: LineBreakResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakIndex(value: Double): Self = StObject.set(x, "breakIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakType(value: Double): Self = StObject.set(x, "breakType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRHyphenatedWord(value: XHyphenatedWord): Self = StObject.set(x, "rHyphenatedWord", value.asInstanceOf[js.Any])
  }
}
