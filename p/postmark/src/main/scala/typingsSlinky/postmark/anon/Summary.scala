package typingsSlinky.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Summary extends StObject {
  
  var Summary: String = js.native
}
object Summary {
  
  @scala.inline
  def apply(Summary: String): Summary = {
    val __obj = js.Dynamic.literal(Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
  
  @scala.inline
  implicit class SummaryMutableBuilder[Self <: Summary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
