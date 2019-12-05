package typingsSlinky.scDashBrokerDashCluster

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.scDashBrokerDashCluster.scDashBrokerDashClusterMod.mapperFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster/clientcluster", JSImport.Namespace)
@js.native
object clientclusterMod extends js.Object {
  @js.native
  class ClientCluster protected () extends EventEmitter {
    def this(clients: js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCBrokerClient */ _
          ]) = this()
    def getMapper(): mapperFunction = js.native
    def setMapper(mapper: mapperFunction): Unit = js.native
  }
  
}

