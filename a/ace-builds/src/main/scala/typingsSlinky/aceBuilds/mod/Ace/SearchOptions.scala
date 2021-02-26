package typingsSlinky.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchOptions extends StObject {
  
  var backwards: Boolean = js.native
  
  var caseSensitive: Boolean = js.native
  
  var needle: String | js.RegExp = js.native
  
  var preserveCase: Boolean = js.native
  
  var preventScroll: Boolean = js.native
  
  var range: Range = js.native
  
  var regExp: js.RegExp = js.native
  
  var skipCurrent: Boolean = js.native
  
  var start: Range = js.native
  
  var wholeWord: String = js.native
  
  var wrap: Boolean = js.native
}
object SearchOptions {
  
  @scala.inline
  def apply(
    backwards: Boolean,
    caseSensitive: Boolean,
    needle: String | js.RegExp,
    preserveCase: Boolean,
    preventScroll: Boolean,
    range: Range,
    regExp: js.RegExp,
    skipCurrent: Boolean,
    start: Range,
    wholeWord: String,
    wrap: Boolean
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(backwards = backwards.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], needle = needle.asInstanceOf[js.Any], preserveCase = preserveCase.asInstanceOf[js.Any], preventScroll = preventScroll.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], skipCurrent = skipCurrent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], wholeWord = wholeWord.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  
  @scala.inline
  implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackwards(value: Boolean): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedle(value: String | js.RegExp): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleRegExp(value: js.RegExp): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveCase(value: Boolean): Self = StObject.set(x, "preserveCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExp(value: js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipCurrent(value: Boolean): Self = StObject.set(x, "skipCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Range): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWholeWord(value: String): Self = StObject.set(x, "wholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
  }
}
