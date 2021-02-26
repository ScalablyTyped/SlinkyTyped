package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingDef extends StObject {
  
  var flags: ɵBindingFlags = js.native
  
  var name: String | Null = js.native
  
  var nonMinifiedName: String | Null = js.native
  
  var ns: String | Null = js.native
  
  var securityContext: SecurityContext | Null = js.native
  
  var suffix: String | Null = js.native
}
object BindingDef {
  
  @scala.inline
  def apply(flags: ɵBindingFlags): BindingDef = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingDef]
  }
  
  @scala.inline
  implicit class BindingDefMutableBuilder[Self <: BindingDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: ɵBindingFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNonMinifiedName(value: String): Self = StObject.set(x, "nonMinifiedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonMinifiedNameNull: Self = StObject.set(x, "nonMinifiedName", null)
    
    @scala.inline
    def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsNull: Self = StObject.set(x, "ns", null)
    
    @scala.inline
    def setSecurityContext(value: SecurityContext): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityContextNull: Self = StObject.set(x, "securityContext", null)
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixNull: Self = StObject.set(x, "suffix", null)
  }
}
