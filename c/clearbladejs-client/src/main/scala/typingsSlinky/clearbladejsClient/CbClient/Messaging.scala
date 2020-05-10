package typingsSlinky.clearbladejsClient.CbClient

import typingsSlinky.pahoMqtt.mod._Global_.Paho.MQTT.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messaging extends js.Object {
  var URI: String = js.native
  var callTimeout: Double = js.native
  var client: Client = js.native
  var endpoint: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def currentTopics(callback: CbCallback): Unit = js.native
  def disconnect(): Unit = js.native
  def getAndDeleteMessageHistory(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit = js.native
  def getMessageHistory(topic: String, last: Double, count: Double, callback: CbCallback): Unit = js.native
  def getMessageHistoryWithTimeFrame(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit = js.native
  def publish(topic: String, payload: js.Object): Unit = js.native
  def publishREST(topic: String, payload: js.Object, callback: CbCallback): Unit = js.native
  def subscribe(topic: String, options: MessagingSubscribeOptions, messageCallback: MessageCallback): Unit = js.native
  def unsubscribe(topic: String, options: MessagingSubscribeOptions): Unit = js.native
}

object Messaging {
  @scala.inline
  def apply(
    URI: String,
    callTimeout: Double,
    client: Client,
    currentTopics: CbCallback => Unit,
    disconnect: () => Unit,
    endpoint: String,
    getAndDeleteMessageHistory: (String, Double, Double, Double, Double, CbCallback) => Unit,
    getMessageHistory: (String, Double, Double, CbCallback) => Unit,
    getMessageHistoryWithTimeFrame: (String, Double, Double, Double, Double, CbCallback) => Unit,
    publish: (String, js.Object) => Unit,
    publishREST: (String, js.Object, CbCallback) => Unit,
    subscribe: (String, MessagingSubscribeOptions, MessageCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    unsubscribe: (String, MessagingSubscribeOptions) => Unit,
    user: APIUser
  ): Messaging = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], currentTopics = js.Any.fromFunction1(currentTopics), disconnect = js.Any.fromFunction0(disconnect), endpoint = endpoint.asInstanceOf[js.Any], getAndDeleteMessageHistory = js.Any.fromFunction6(getAndDeleteMessageHistory), getMessageHistory = js.Any.fromFunction4(getMessageHistory), getMessageHistoryWithTimeFrame = js.Any.fromFunction6(getMessageHistoryWithTimeFrame), publish = js.Any.fromFunction2(publish), publishREST = js.Any.fromFunction3(publishREST), subscribe = js.Any.fromFunction3(subscribe), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction2(unsubscribe), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messaging]
  }
  @scala.inline
  implicit class MessagingOps[Self <: Messaging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: Client): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTopics(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTopics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAndDeleteMessageHistory(value: (String, Double, Double, Double, Double, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAndDeleteMessageHistory")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withGetMessageHistory(value: (String, Double, Double, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageHistory")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetMessageHistoryWithTimeFrame(value: (String, Double, Double, Double, Double, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageHistoryWithTimeFrame")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withPublish(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPublishREST(value: (String, js.Object, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishREST")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: (String, MessagingSubscribeOptions, MessageCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSystemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsubscribe(value: (String, MessagingSubscribeOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUser(value: APIUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

