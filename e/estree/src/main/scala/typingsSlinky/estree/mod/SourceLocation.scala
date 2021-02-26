package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceLocation extends StObject {
  
  var end: Position = js.native
  
  var source: js.UndefOr[String | Null] = js.native
  
  var start: Position = js.native
}
object SourceLocation {
  
  @scala.inline
  def apply(end: Position, start: Position): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
  
  @scala.inline
  implicit class SourceLocationMutableBuilder[Self <: SourceLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
