package typingsSlinky.maximMazurokGapiClientSts

import typingsSlinky.maximMazurokGapiClientSts.gapi.client.sts.V1Resource
import typingsSlinky.maximMazurokGapiClientSts.maximMazurokGapiClientStsStrings.sts
import typingsSlinky.maximMazurokGapiClientSts.maximMazurokGapiClientStsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Security Token Service API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: sts, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: sts, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object sts {
        
        @JSGlobal("gapi.client.sts.v1")
        @js.native
        val v1: V1Resource = js.native
      }
    }
  }
}
