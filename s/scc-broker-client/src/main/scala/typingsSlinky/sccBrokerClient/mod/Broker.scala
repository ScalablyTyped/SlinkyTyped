package typingsSlinky.sccBrokerClient.mod

import typingsSlinky.agSimpleBroker.mod.PublishData
import typingsSlinky.agSimpleBroker.mod.SubscribeData
import typingsSlinky.agSimpleBroker.mod.UnsubscribeData
import typingsSlinky.consumableStream.mod.^
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.publish
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.subscribe
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Broker extends js.Object {
  def invokePublish(channelName: String, data: js.Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
  @JSName("listener")
  def listener_publish(eventName: publish): ^[PublishData] = js.native
  @JSName("listener")
  def listener_subscribe(eventName: subscribe): ^[SubscribeData] = js.native
  @JSName("listener")
  def listener_unsubscribe(eventName: unsubscribe): ^[UnsubscribeData] = js.native
  def subscriptions(): js.Array[String] = js.native
}

