package typingsSlinky.scBrokerCluster

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.scBroker.mod.SCBrokerClient
import typingsSlinky.scBrokerCluster.mod.mapperFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sc-broker-cluster/clientcluster", JSImport.Namespace)
@js.native
object clientclusterMod extends js.Object {
  
  @js.native
  class ClientCluster protected () extends EventEmitter {
    def this(clients: js.Array[SCBrokerClient]) = this()
    
    def getMapper(): mapperFunction = js.native
    
    def setMapper(mapper: mapperFunction): Unit = js.native
  }
}
