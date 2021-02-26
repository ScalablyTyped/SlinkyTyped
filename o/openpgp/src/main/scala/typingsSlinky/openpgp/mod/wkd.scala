package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.anon.Email
import typingsSlinky.openpgp.anon.Err
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wkd {
  
  @JSImport("openpgp", "wkd.WKD")
  @js.native
  /**
    * Initialize the WKD client
    */
  class WKD () extends StObject {
    
    /**
      * Search for a public key using Web Key Directory protocol.
      * @param options.email User's email.
      * @param options.rawBytes Returns Uint8Array instead of parsed key.
      * @returns The public key.
      */
    def lookup(options: Email): js.Promise[js.typedarray.Uint8Array | Err] = js.native
  }
}
