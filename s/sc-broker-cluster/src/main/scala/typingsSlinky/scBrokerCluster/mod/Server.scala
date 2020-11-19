package typingsSlinky.scBrokerCluster.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.scBrokerCluster.scBrokerClusterStrings.brokerExit
import typingsSlinky.scBrokerCluster.scBrokerClusterStrings.brokerMessage
import typingsSlinky.scBrokerCluster.scBrokerClusterStrings.brokerStart
import typingsSlinky.scBrokerCluster.scBrokerClusterStrings.error
import typingsSlinky.scBrokerCluster.scBrokerClusterStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sc-broker-cluster", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(options: SCBrokerClusterServerOptions) = this()
  
  def destroy(): Unit = js.native
  
  def killBrokers(): Unit = js.native
  
  @JSName("on")
  def on_brokerExit(event: brokerExit, listener: js.Function1[/* brokerInfo */ BrokerExitInfo, Unit]): this.type = js.native
  @JSName("on")
  def on_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
  @JSName("on")
  def on_brokerStart(event: brokerStart, listener: js.Function1[/* brokerInfo */ BrokerStartInfo, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  def sendToBroker(brokerId: String, data: js.Any): Unit = js.native
  def sendToBroker(
    brokerId: String,
    data: js.Any,
    callback: js.Function2[/* err */ js.Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
}
