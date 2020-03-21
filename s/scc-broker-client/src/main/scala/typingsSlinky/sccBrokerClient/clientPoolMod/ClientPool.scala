package typingsSlinky.sccBrokerClient.clientPoolMod

import typingsSlinky.asyncStreamEmitter.mod.AsyncStreamEmitter
import typingsSlinky.jsonwebtoken.mod.Secret
import typingsSlinky.sccBrokerClient.AnonError
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.error
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.publish
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.publishFail
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.subscribe
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.subscribeFail
import typingsSlinky.socketclusterClient.clientsocketMod.SubscribeOptions
import typingsSlinky.socketclusterClient.mod.AGClientSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPool
  extends AsyncStreamEmitter[js.Any] {
  var authKey: js.UndefOr[Secret] = js.native
  var clientCount: Double = js.native
  var clients: js.Array[AGClientSocket] = js.native
  var hasher: typingsSlinky.sccBrokerClient.hasherMod.^ = js.native
  var targetURI: String = js.native
  def breakDownURI(uri: String): BrokenDownURI = js.native
  def closeChannel(channelName: String): Unit = js.native
  def destroy(): Unit = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: AnonError): Unit = js.native
  @JSName("emit")
  def emit_publish(eventName: publish, data: PublishData): Unit = js.native
  @JSName("emit")
  def emit_publishFail(eventName: publishFail, data: PublishFailData): Unit = js.native
  @JSName("emit")
  def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_subscribeFail(eventName: subscribeFail, data: SubscribeFailData): Unit = js.native
  def invokePublish(channelName: String, data: js.Any): js.Promise[Unit] = js.native
  def isSubscribed(channelName: String): Boolean = js.native
  def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
  @JSName("listener")
  def listener_error(eventName: error): typingsSlinky.consumableStream.mod.^[AnonError] = js.native
  @JSName("listener")
  def listener_publish(eventName: publish): typingsSlinky.consumableStream.mod.^[PublishData] = js.native
  @JSName("listener")
  def listener_publishFail(eventName: publishFail): typingsSlinky.consumableStream.mod.^[PublishFailData] = js.native
  @JSName("listener")
  def listener_subscribe(eventName: subscribe): typingsSlinky.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_subscribeFail(eventName: subscribeFail): typingsSlinky.consumableStream.mod.^[SubscribeFailData] = js.native
  def selectClient(key: String): AGClientSocket = js.native
  def subscribe(channelName: String): typingsSlinky.agChannel.mod.^[_] = js.native
  def subscribe(channelName: String, options: SubscribeOptions): typingsSlinky.agChannel.mod.^[_] = js.native
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  def unsubscribe(channelName: String): js.Promise[Unit] = js.native
}

