package typingsSlinky.ipAddress

import typingsSlinky.ipAddress.ipv6Mod.Address6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Address extends StObject {
    
    var address: Null = js.native
    
    var error: String = js.native
    
    var port: Null = js.native
  }
  object Address {
    
    @scala.inline
    def apply(address: Null, error: String, port: Null): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Null): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Null): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var v4: js.UndefOr[Boolean] = js.native
  }
  object ClassName {
    
    @scala.inline
    def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setV4(value: Boolean): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV4Undefined: Self = StObject.set(x, "v4", js.undefined)
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    var address: Address6 = js.native
    
    var error: js.UndefOr[scala.Nothing] = js.native
    
    var port: Double | Null = js.native
  }
  object Error {
    
    @scala.inline
    def apply(address: Address6): Error = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Address6): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
    }
  }
  
  @js.native
  trait GroupIndividual extends StObject {
    
    var groupIndividual: Boolean = js.native
    
    var nonce: String = js.native
    
    var reserved: Boolean = js.native
    
    var universalLocal: Boolean = js.native
  }
  object GroupIndividual {
    
    @scala.inline
    def apply(groupIndividual: Boolean, nonce: String, reserved: Boolean, universalLocal: Boolean): GroupIndividual = {
      val __obj = js.Dynamic.literal(groupIndividual = groupIndividual.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], reserved = reserved.asInstanceOf[js.Any], universalLocal = universalLocal.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupIndividual]
    }
    
    @scala.inline
    implicit class GroupIndividualMutableBuilder[Self <: GroupIndividual] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupIndividual(value: Boolean): Self = StObject.set(x, "groupIndividual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReserved(value: Boolean): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniversalLocal(value: Boolean): Self = StObject.set(x, "universalLocal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofhelpers extends StObject {
    
    def simpleGroup(addressString: String): js.Array[String] = js.native
    def simpleGroup(addressString: String, offset: Double): js.Array[String] = js.native
    
    def spanAll(s: String): String = js.native
    def spanAll(s: String, offset: Double): String = js.native
    
    def spanAllZeroes(s: String): String = js.native
    
    def spanLeadingZeroes(address: String): String = js.native
  }
}
