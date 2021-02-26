package typingsSlinky.atom.mod

import typingsSlinky.atom.anon.LeadingContextLines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScandalResult extends StObject {
  
  var filePath: String = js.native
  
  var matches: js.Array[LeadingContextLines] = js.native
}
object ScandalResult {
  
  @scala.inline
  def apply(filePath: String, matches: js.Array[LeadingContextLines]): ScandalResult = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScandalResult]
  }
  
  @scala.inline
  implicit class ScandalResultMutableBuilder[Self <: ScandalResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatches(value: js.Array[LeadingContextLines]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: LeadingContextLines*): Self = StObject.set(x, "matches", js.Array(value :_*))
  }
}
