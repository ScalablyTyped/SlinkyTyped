package typingsSlinky.maximMazurokGapiClientPlaycustomapp

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientPlaycustomapp.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientPlaycustomapp.anon.Account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object playcustomapp {
      
      @js.native
      trait AccountsResource extends StObject {
        
        var customApps: CustomAppsResource = js.native
      }
      object AccountsResource {
        
        @scala.inline
        def apply(customApps: CustomAppsResource): AccountsResource = {
          val __obj = js.Dynamic.literal(customApps = customApps.asInstanceOf[js.Any])
          __obj.asInstanceOf[AccountsResource]
        }
        
        @scala.inline
        implicit class AccountsResourceMutableBuilder[Self <: AccountsResource] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCustomApps(value: CustomAppsResource): Self = StObject.set(x, "customApps", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait CustomApp extends StObject {
        
        /** Default listing language in BCP 47 format. */
        var languageCode: js.UndefOr[String] = js.native
        
        /** Output only. Package name of the created Android app. Only present in the API response. */
        var packageName: js.UndefOr[String] = js.native
        
        /** Title for the Android app. */
        var title: js.UndefOr[String] = js.native
      }
      object CustomApp {
        
        @scala.inline
        def apply(): CustomApp = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[CustomApp]
        }
        
        @scala.inline
        implicit class CustomAppMutableBuilder[Self <: CustomApp] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
          
          @scala.inline
          def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
      
      @js.native
      trait CustomAppsResource extends StObject {
        
        /** Creates a new custom app. */
        def create(request: Accesstoken): Request[CustomApp] = js.native
        def create(request: Account, body: CustomApp): Request[CustomApp] = js.native
      }
    }
  }
}
