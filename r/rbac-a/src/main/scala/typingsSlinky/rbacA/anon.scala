package typingsSlinky.rbacA

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.rbacA.mod.AttributesManager
import typingsSlinky.rbacA.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attributes[P /* <: Provider */, AM /* <: AttributesManager */] extends StObject {
    
    var attributes: js.UndefOr[AM] = js.native
    
    var provider: P = js.native
  }
  object Attributes {
    
    @scala.inline
    def apply[P /* <: Provider */, AM /* <: AttributesManager */](provider: P): Attributes[P, AM] = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes[P, AM]]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes[_, _], P /* <: Provider */, AM /* <: AttributesManager */] (val x: Self with (Attributes[P, AM])) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AM): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setProvider(value: P): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* roles */ js.Object, Provider]
}
