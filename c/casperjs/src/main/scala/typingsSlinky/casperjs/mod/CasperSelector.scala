package typingsSlinky.casperjs.mod

import typingsSlinky.casperjs.casperjsStrings.css
import typingsSlinky.casperjs.casperjsStrings.xpath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CasperSelector extends StObject {
  
  var path: String = js.native
  
  var `type`: js.UndefOr[xpath | css] = js.native
}
object CasperSelector {
  
  @scala.inline
  def apply(path: String): CasperSelector = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CasperSelector]
  }
  
  @scala.inline
  implicit class CasperSelectorMutableBuilder[Self <: CasperSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: xpath | css): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
