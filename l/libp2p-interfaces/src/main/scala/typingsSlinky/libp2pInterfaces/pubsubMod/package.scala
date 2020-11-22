package typingsSlinky.libp2pInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pubsubMod {
  
  type PeerId = typingsSlinky.peerId.mod.^
  
  /**
    * Topic validator function
    */
  type validator = js.Function2[
    /* arg0 */ java.lang.String, 
    /* arg1 */ typingsSlinky.libp2pInterfaces.pubsubMod.InMessage, 
    js.Promise[scala.Unit]
  ]
}
