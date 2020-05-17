package typingsSlinky.rxjs.webSocketSubjectMod

import org.scalajs.dom.raw.CloseEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MessageEvent
import typingsSlinky.rxjs.anon.Instantiable
import typingsSlinky.rxjs.rxjsStrings.arraybuffer
import typingsSlinky.rxjs.rxjsStrings.blob
import typingsSlinky.rxjs.typesMod.NextObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocketSubjectConfig[T] extends js.Object {
  /**
    * A WebSocket constructor to use. This is useful for situations like using a
    * WebSocket impl in Node (WebSocket is a DOM API), or for mocking a WebSocket
    * for testing purposes
    */
  var WebSocketCtor: js.UndefOr[Instantiable] = js.native
  /** Sets the `binaryType` property of the underlying WebSocket. */
  var binaryType: js.UndefOr[blob | arraybuffer] = js.native
  /**
    * An Observer than watches when close events occur on the underlying webSocket
    */
  var closeObserver: js.UndefOr[NextObserver[CloseEvent]] = js.native
  /**
    * An Observer that watches when a close is about to occur due to
    * unsubscription.
    */
  var closingObserver: js.UndefOr[NextObserver[Unit]] = js.native
  /**
    * A deserializer used for messages arriving on the socket from the
    * server. Defaults to JSON.parse.
    */
  var deserializer: js.UndefOr[js.Function1[/* e */ MessageEvent, T]] = js.native
  /**
    * An Observer that watches when open events occur on the underlying web socket.
    */
  var openObserver: js.UndefOr[NextObserver[Event]] = js.native
  /** The protocol to use to connect */
  var protocol: js.UndefOr[String | js.Array[String]] = js.native
  /** @deprecated use {@link deserializer} */
  var resultSelector: js.UndefOr[js.Function1[/* e */ MessageEvent, T]] = js.native
  /**
    * A serializer used to create messages from passed values before the
    * messages are sent to the server. Defaults to JSON.stringify.
    */
  var serializer: js.UndefOr[js.Function1[/* value */ T, WebSocketMessage]] = js.native
  /** The url of the socket server to connect to */
  var url: String = js.native
}

object WebSocketSubjectConfig {
  @scala.inline
  def apply[T](url: String): WebSocketSubjectConfig[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketSubjectConfig[T]]
  }
  @scala.inline
  implicit class WebSocketSubjectConfigOps[Self[t] <: WebSocketSubjectConfig[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withUrl(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebSocketCtor(value: Instantiable): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebSocketCtor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSocketCtor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebSocketCtor")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryType(value: blob | arraybuffer): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryType")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseObserver(value: NextObserver[CloseEvent]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseObserver: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeObserver")(js.undefined)
        ret
    }
    @scala.inline
    def withClosingObserver(value: NextObserver[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosingObserver: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingObserver")(js.undefined)
        ret
    }
    @scala.inline
    def withDeserializer(value: /* e */ MessageEvent => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserializer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeserializer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserializer")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenObserver(value: NextObserver[Event]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenObserver: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openObserver")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withResultSelector(value: /* e */ MessageEvent => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResultSelector: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializer(value: /* value */ T => WebSocketMessage): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerializer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.undefined)
        ret
    }
  }
  
}

