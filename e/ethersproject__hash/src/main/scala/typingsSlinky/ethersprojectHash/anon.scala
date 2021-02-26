package typingsSlinky.ethersprojectHash

import typingsSlinky.ethersprojectAbstractSigner.mod.TypedDataDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Domain extends StObject {
    
    var domain: TypedDataDomain = js.native
    
    var value: js.Any = js.native
  }
  object Domain {
    
    @scala.inline
    def apply(domain: TypedDataDomain, value: js.Any): Domain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: TypedDataDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
