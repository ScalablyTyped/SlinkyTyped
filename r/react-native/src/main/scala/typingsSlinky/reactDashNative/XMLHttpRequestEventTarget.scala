package typingsSlinky.reactDashNative

import typingsSlinky.reactDashNative.reactDashNativeStrings.abort
import typingsSlinky.reactDashNative.reactDashNativeStrings.error
import typingsSlinky.reactDashNative.reactDashNativeStrings.load
import typingsSlinky.reactDashNative.reactDashNativeStrings.loadend
import typingsSlinky.reactDashNative.reactDashNativeStrings.loadstart
import typingsSlinky.reactDashNative.reactDashNativeStrings.progress
import typingsSlinky.reactDashNative.reactDashNativeStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequestEventTarget extends js.Object {
  var onabort: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  var onerror: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  var onload: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  var onloadend: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  var onloadstart: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  var onprogress: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  var ontimeout: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(`type`: loadend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(`type`: timeout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  //  addEventListener(type: string, listener: EventListenerOrEventListenerObject): void;
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(`type`: loadend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeout(`type`: timeout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
}

