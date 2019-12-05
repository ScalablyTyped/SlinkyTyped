package typingsSlinky.sccDashBrokerDashClient.clientDashPoolMod

import typingsSlinky.jsonwebtoken.jsonwebtokenMod.Secret
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.sccDashBrokerDashClient.sccDashBrokerDashClientStrings.error
import typingsSlinky.sccDashBrokerDashClient.sccDashBrokerDashClientStrings.publish
import typingsSlinky.sccDashBrokerDashClient.sccDashBrokerDashClientStrings.publishFail
import typingsSlinky.sccDashBrokerDashClient.sccDashBrokerDashClientStrings.subscribe
import typingsSlinky.sccDashBrokerDashClient.sccDashBrokerDashClientStrings.subscribeFail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPool extends EventEmitter {
  var areClientListenersBound: Boolean = js.native
  var authKey: js.UndefOr[Secret] = js.native
  var clientCount: Double = js.native
  var clients: js.Array[typingsSlinky.socketclusterDashClient.libScclientsocketMod.^] = js.native
  var hasher: typingsSlinky.sccDashBrokerDashClient.hasherMod.^ = js.native
  var targetURI: String = js.native
  def bindClientListeners(): Unit = js.native
  def breakDownURI(uri: String): BrokenDownURI = js.native
  def destroy(): Unit = js.native
  def destroyChannel(channelName: String): Unit = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_publish(event: publish, listener: js.Function1[/* data */ PublishData, Unit]): this.type = js.native
  @JSName("on")
  def on_publishFail(event: publishFail, listener: js.Function1[/* data */ PublishData, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribe(event: subscribe, listener: js.Function1[/* data */ SubscribeData, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribeFail(event: subscribeFail, listener: js.Function1[/* data */ SubscribeFailData, Unit]): this.type = js.native
  def publish(channelName: String, data: js.Any): Unit = js.native
  def selectClient(key: String): typingsSlinky.socketclusterDashClient.libScclientsocketMod.^ = js.native
  def subscribeAndWatch(channelName: String, handler: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  def unbindClientListeners(): Unit = js.native
}

