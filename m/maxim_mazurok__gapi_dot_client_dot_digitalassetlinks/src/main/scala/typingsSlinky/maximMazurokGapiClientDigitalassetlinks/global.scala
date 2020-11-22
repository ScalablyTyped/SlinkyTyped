package typingsSlinky.maximMazurokGapiClientDigitalassetlinks

import typingsSlinky.maximMazurokGapiClientDigitalassetlinks.gapi.client.digitalassetlinks.AssetlinksResource
import typingsSlinky.maximMazurokGapiClientDigitalassetlinks.gapi.client.digitalassetlinks.StatementsResource
import typingsSlinky.maximMazurokGapiClientDigitalassetlinks.maximMazurokGapiClientDigitalassetlinksStrings.digitalassetlinks
import typingsSlinky.maximMazurokGapiClientDigitalassetlinks.maximMazurokGapiClientDigitalassetlinksStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Digital Asset Links API v1 */
      def load(name: digitalassetlinks, version: v1): js.Thenable[Unit] = js.native
      def load(name: digitalassetlinks, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object digitalassetlinks extends js.Object {
        
        val assetlinks: AssetlinksResource = js.native
        
        val statements: StatementsResource = js.native
      }
    }
  }
}
