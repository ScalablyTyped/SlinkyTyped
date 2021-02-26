package typingsSlinky.maximMazurokGapiClientPlaycustomapp

import typingsSlinky.maximMazurokGapiClientPlaycustomapp.gapi.client.playcustomapp.AccountsResource
import typingsSlinky.maximMazurokGapiClientPlaycustomapp.maximMazurokGapiClientPlaycustomappStrings.playcustomapp
import typingsSlinky.maximMazurokGapiClientPlaycustomapp.maximMazurokGapiClientPlaycustomappStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Google Play Custom App Publishing API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: playcustomapp, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: playcustomapp, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object playcustomapp {
        
        @JSGlobal("gapi.client.playcustomapp.accounts")
        @js.native
        val accounts: AccountsResource = js.native
      }
    }
  }
}
