package typingsSlinky.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageAriaLegacy extends StObject {
  
  var sSortAscending: js.UndefOr[String] = js.native
  
  var sSortDescending: js.UndefOr[String] = js.native
}
object LanguageAriaLegacy {
  
  @scala.inline
  def apply(): LanguageAriaLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageAriaLegacy]
  }
  
  @scala.inline
  implicit class LanguageAriaLegacyMutableBuilder[Self <: LanguageAriaLegacy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSSortAscending(value: String): Self = StObject.set(x, "sSortAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSortAscendingUndefined: Self = StObject.set(x, "sSortAscending", js.undefined)
    
    @scala.inline
    def setSSortDescending(value: String): Self = StObject.set(x, "sSortDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSortDescendingUndefined: Self = StObject.set(x, "sSortDescending", js.undefined)
  }
}
