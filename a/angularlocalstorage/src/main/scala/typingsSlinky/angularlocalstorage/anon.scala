package typingsSlinky.angularlocalstorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DefaultValue extends StObject {
    
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    var storeName: js.UndefOr[String] = js.native
  }
  object DefaultValue {
    
    @scala.inline
    def apply(): DefaultValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultValue]
    }
    
    @scala.inline
    implicit class DefaultValueMutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    }
  }
}
