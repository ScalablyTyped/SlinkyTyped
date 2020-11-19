package typingsSlinky.reactNative

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Event
import typingsSlinky.reactNative.reactNativeStrings.readystatechange
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequest
  extends EventTarget
     with XMLHttpRequestEventTarget {
  
  val DONE: Double = js.native
  
  val HEADERS_RECEIVED: Double = js.native
  
  val LOADING: Double = js.native
  
  val OPENED: Double = js.native
  
  val UNSENT: Double = js.native
  
  def abort(): Unit = js.native
  
  @JSName("addEventListener")
  def addEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  
  def getAllResponseHeaders(): String = js.native
  
  def getResponseHeader(header: String): String | Null = js.native
  
  //  msCaching: string;
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  
  //  msCachingEnabled(): boolean;
  def open(method: String, url: String): Unit = js.native
  def open(
    method: String,
    url: String,
    async: js.UndefOr[scala.Nothing],
    user: js.UndefOr[scala.Nothing],
    password: String
  ): Unit = js.native
  def open(method: String, url: String, async: js.UndefOr[scala.Nothing], user: String): Unit = js.native
  def open(method: String, url: String, async: js.UndefOr[scala.Nothing], user: String, password: String): Unit = js.native
  def open(method: String, url: String, async: js.UndefOr[scala.Nothing], user: Null, password: String): Unit = js.native
  def open(method: String, url: String, async: Boolean): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: js.UndefOr[scala.Nothing], password: String): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: String): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: String, password: String): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: Null, password: String): Unit = js.native
  
  def overrideMimeType(mime: String): Unit = js.native
  
  val readyState: Double = js.native
  
  //  addEventListener(type: string, listener: EventListenerOrEventListenerObject): void;
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  
  val response: js.Any = js.native
  
  val responseText: String = js.native
  
  var responseType: XMLHttpRequestResponseType = js.native
  
  val responseURL: String = js.native
  
  val responseXML: Document | Null = js.native
  
  def send(): Unit = js.native
  def send(data: js.Any): Unit = js.native
  
  def setRequestHeader(header: String, value: String): Unit = js.native
  
  val status: Double = js.native
  
  val statusText: String = js.native
  
  var timeout: Double = js.native
  
  val upload: XMLHttpRequestUpload = js.native
  
  var withCredentials: Boolean = js.native
}
