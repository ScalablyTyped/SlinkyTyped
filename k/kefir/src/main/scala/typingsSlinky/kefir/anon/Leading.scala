package typingsSlinky.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Leading extends StObject {
  
  var leading: js.UndefOr[Boolean] = js.native
  
  var trailing: js.UndefOr[Boolean] = js.native
}
object Leading {
  
  @scala.inline
  def apply(): Leading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Leading]
  }
  
  @scala.inline
  implicit class LeadingMutableBuilder[Self <: Leading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    
    @scala.inline
    def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
  }
}
