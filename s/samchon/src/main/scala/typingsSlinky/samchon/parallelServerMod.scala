package typingsSlinky.samchon

import typingsSlinky.samchon.iparallelserverMod.IParallelServer
import typingsSlinky.samchon.iserverconnectorMod.IServerConnector
import typingsSlinky.samchon.parallelSystemArrayMod.ParallelSystemArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/parallel/derived/ParallelServer", JSImport.Namespace)
@js.native
object parallelServerMod extends js.Object {
  
  @js.native
  abstract class ParallelServer protected () extends IParallelServer {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: ParallelSystemArray[IParallelServer]) = this()
    
    /**
      * Factory method creating {@link IServerConnector} object.
      *
      * The {@link createServerConnector createServerConnector()} is an abstract method creating
      * {@link IServerConnector} object. Overrides and returns one of them, considering which protocol the slave server
      * follows:
      *
      * - {@link ServerConnector}
      * - {@link WebServerConnector}
      * - {@link DedicatedWorkerServerConnector}
      * - {@link SharedWorkerServerConnector}
      *
      * @return A newly created {@link IServerConnector} object.
      */
    /* protected */ def createServerConnector(): IServerConnector = js.native
    
    /**
      * IP address of target external system to connect.
      */
    var ip: String = js.native
    
    /**
      * Port number of target external system to connect.
      */
    var port: Double = js.native
  }
}
