package typingsSlinky.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumerateRangesSpecifier extends StObject {
  
  /**
    * Whether neighboring ranges with the same protection should be coalesced. The default is false.
    */
  var coalesce: Boolean = js.native
  
  /**
    * Minimum protection required to be included in the result.
    */
  var protection: PageProtection = js.native
}
object EnumerateRangesSpecifier {
  
  @scala.inline
  def apply(coalesce: Boolean, protection: PageProtection): EnumerateRangesSpecifier = {
    val __obj = js.Dynamic.literal(coalesce = coalesce.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerateRangesSpecifier]
  }
  
  @scala.inline
  implicit class EnumerateRangesSpecifierMutableBuilder[Self <: EnumerateRangesSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoalesce(value: Boolean): Self = StObject.set(x, "coalesce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection(value: PageProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
  }
}
