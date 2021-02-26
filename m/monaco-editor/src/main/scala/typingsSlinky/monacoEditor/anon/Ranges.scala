package typingsSlinky.monacoEditor.anon

import typingsSlinky.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ranges extends StObject {
  
  var ranges: js.Array[IRange] = js.native
  
  var wordPattern: js.UndefOr[js.RegExp] = js.native
}
object Ranges {
  
  @scala.inline
  def apply(ranges: js.Array[IRange]): Ranges = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ranges]
  }
  
  @scala.inline
  implicit class RangesMutableBuilder[Self <: Ranges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRanges(value: js.Array[IRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesVarargs(value: IRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setWordPattern(value: js.RegExp): Self = StObject.set(x, "wordPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordPatternUndefined: Self = StObject.set(x, "wordPattern", js.undefined)
  }
}
