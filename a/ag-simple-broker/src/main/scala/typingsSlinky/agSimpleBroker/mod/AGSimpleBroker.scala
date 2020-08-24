package typingsSlinky.agSimpleBroker.mod

import typingsSlinky.agSimpleBroker.agSimpleBrokerStrings.error
import typingsSlinky.agSimpleBroker.agSimpleBrokerStrings.publish
import typingsSlinky.agSimpleBroker.agSimpleBrokerStrings.ready
import typingsSlinky.agSimpleBroker.agSimpleBrokerStrings.subscribe
import typingsSlinky.agSimpleBroker.agSimpleBrokerStrings.unsubscribe
import typingsSlinky.agSimpleBroker.anon.Error
import typingsSlinky.agSimpleBroker.anon.Id
import typingsSlinky.asyncStreamEmitter.mod.AsyncStreamEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AGSimpleBroker
  extends AsyncStreamEmitter[js.Any] {
  var isReady: Boolean = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: Error): Unit = js.native
  @JSName("emit")
  def emit_publish(eventName: publish, data: PublishData): Unit = js.native
  @JSName("emit")
  def emit_ready(eventName: ready, data: js.Object): Unit = js.native
  @JSName("emit")
  def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
  def exchange(): SimpleExchange = js.native
  def invokePublish(channelName: String, data: js.Any): js.Promise[Unit] = js.native
  def invokePublish(channelName: String, data: js.Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
  def isSubscribed(channelName: String): Boolean = js.native
  @JSName("listener")
  def listener_error(eventName: error): typingsSlinky.consumableStream.mod.^[Error] = js.native
  @JSName("listener")
  def listener_publish(eventName: publish): typingsSlinky.consumableStream.mod.^[PublishData] = js.native
  @JSName("listener")
  def listener_ready(eventName: ready): typingsSlinky.consumableStream.mod.^[js.Object] = js.native
  @JSName("listener")
  def listener_subscribe(eventName: subscribe): typingsSlinky.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_unsubscribe(eventName: unsubscribe): typingsSlinky.consumableStream.mod.^[UnsubscribeData] = js.native
  def setCodecEngine(
    codec: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGServer.CodecEngine */ js.Any
  ): Unit = js.native
  def subscribeClient(client: Id, channelName: String): js.Promise[Unit] = js.native
  def subscribeSocket(client: Id, channelName: String): js.Promise[Unit] = js.native
  def subscriptions(): js.Array[String] = js.native
  def transmitPublish(channelName: String, data: js.Any): js.Promise[Unit] = js.native
  def transmitPublish(channelName: String, data: js.Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
  def unsubscribeClient(client: Id, channelName: String): js.Promise[Unit] = js.native
  def unsubscribeSocket(client: Id, channelName: String): js.Promise[Unit] = js.native
}

