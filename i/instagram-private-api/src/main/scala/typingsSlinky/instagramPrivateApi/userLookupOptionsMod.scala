package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.Countrycode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userLookupOptionsMod {
  
  @js.native
  trait UserLookupOptions extends StObject {
    
    var countryCodes: js.UndefOr[js.Array[Countrycode]] = js.native
    
    var directlySignIn: js.UndefOr[Boolean] = js.native
    
    var query: String = js.native
    
    var waterfallId: js.UndefOr[String] = js.native
  }
  object UserLookupOptions {
    
    @scala.inline
    def apply(query: String): UserLookupOptions = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserLookupOptions]
    }
    
    @scala.inline
    implicit class UserLookupOptionsMutableBuilder[Self <: UserLookupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountryCodes(value: js.Array[Countrycode]): Self = StObject.set(x, "countryCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCodesUndefined: Self = StObject.set(x, "countryCodes", js.undefined)
      
      @scala.inline
      def setCountryCodesVarargs(value: Countrycode*): Self = StObject.set(x, "countryCodes", js.Array(value :_*))
      
      @scala.inline
      def setDirectlySignIn(value: Boolean): Self = StObject.set(x, "directlySignIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectlySignInUndefined: Self = StObject.set(x, "directlySignIn", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaterfallId(value: String): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaterfallIdUndefined: Self = StObject.set(x, "waterfallId", js.undefined)
    }
  }
}
