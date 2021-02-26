package typingsSlinky.saxes.mod

import typingsSlinky.saxes.saxesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoForcedXMLVersion extends XMLVersionOptions {
  
  @JSName("forceXMLVersion")
  var forceXMLVersion_NoForcedXMLVersion: js.UndefOr[`false`] = js.native
}
object NoForcedXMLVersion {
  
  @scala.inline
  def apply(): NoForcedXMLVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoForcedXMLVersion]
  }
  
  @scala.inline
  implicit class NoForcedXMLVersionMutableBuilder[Self <: NoForcedXMLVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceXMLVersion(value: `false`): Self = StObject.set(x, "forceXMLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceXMLVersionUndefined: Self = StObject.set(x, "forceXMLVersion", js.undefined)
  }
}
