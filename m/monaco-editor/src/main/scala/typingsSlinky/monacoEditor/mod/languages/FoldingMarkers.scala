package typingsSlinky.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldingMarkers extends StObject {
  
  var end: js.RegExp = js.native
  
  var start: js.RegExp = js.native
}
object FoldingMarkers {
  
  @scala.inline
  def apply(end: js.RegExp, start: js.RegExp): FoldingMarkers = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingMarkers]
  }
  
  @scala.inline
  implicit class FoldingMarkersMutableBuilder[Self <: FoldingMarkers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: js.RegExp): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.RegExp): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
