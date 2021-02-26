package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link Implementation} name details returned in a sequence by {@link XLocaleData.getCollatorImplementations()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait Implementation extends StObject {
  
  var isDefault: Boolean = js.native
  
  var unoID: String = js.native
}
object Implementation {
  
  @scala.inline
  def apply(isDefault: Boolean, unoID: String): Implementation = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], unoID = unoID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Implementation]
  }
  
  @scala.inline
  implicit class ImplementationMutableBuilder[Self <: Implementation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnoID(value: String): Self = StObject.set(x, "unoID", value.asInstanceOf[js.Any])
  }
}
