package typingsSlinky.maximMazurokGapiClientAdmob

import typingsSlinky.maximMazurokGapiClientAdmob.gapi.client.admob.AccountsResource
import typingsSlinky.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.admob
import typingsSlinky.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object admob {
        
        @JSGlobal("gapi.client.admob.accounts")
        @js.native
        val accounts: AccountsResource = js.native
      }
      
      /** Load AdMob API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: admob, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: admob, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
