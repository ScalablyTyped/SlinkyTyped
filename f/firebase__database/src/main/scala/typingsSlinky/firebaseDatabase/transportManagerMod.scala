package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.repoInfoMod.RepoInfo
import typingsSlinky.firebaseDatabase.transportMod.TransportConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportManagerMod {
  
  @JSImport("@firebase/database/dist/src/realtime/TransportManager", "TransportManager")
  @js.native
  class TransportManager protected () extends StObject {
    /**
      * @param {!RepoInfo} repoInfo Metadata around the namespace we're connecting to
      */
    def this(repoInfo: RepoInfo) = this()
    
    /**
      * @param {!RepoInfo} repoInfo
      * @private
      */
    var initTransports_ : js.Any = js.native
    
    /**
      * @return {function(new:Transport, !string, !RepoInfo, string=, string=)} The constructor for the
      * initial transport to use
      */
    def initialTransport(): TransportConstructor = js.native
    
    var transports_ : js.Any = js.native
    
    /**
      * @return {?function(new:Transport, function(),function(), string=)} The constructor for the next
      * transport, or null
      */
    def upgradeTransport(): TransportConstructor | Null = js.native
  }
}
