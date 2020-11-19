package typingsSlinky.reactNative

import typingsSlinky.reactNative.reactNativeStrings.abort
import typingsSlinky.reactNative.reactNativeStrings.error
import typingsSlinky.reactNative.reactNativeStrings.load
import typingsSlinky.reactNative.reactNativeStrings.loadend
import typingsSlinky.reactNative.reactNativeStrings.loadstart
import typingsSlinky.reactNative.reactNativeStrings.progress
import typingsSlinky.reactNative.reactNativeStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequestEventTarget extends js.Object {
  
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
  
  var onabort: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  
  var onerror: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  
  var onload: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  
  var onloadend: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  
  var onloadstart: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  
  var onprogress: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  
  var ontimeout: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
  
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
