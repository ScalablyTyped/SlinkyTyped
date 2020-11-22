package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.babylonjs.babylonjsStrings.abort
import typingsSlinky.babylonjs.babylonjsStrings.error
import typingsSlinky.babylonjs.babylonjsStrings.load
import typingsSlinky.babylonjs.babylonjsStrings.loadend
import typingsSlinky.babylonjs.babylonjsStrings.loadstart
import typingsSlinky.babylonjs.babylonjsStrings.progress
import typingsSlinky.babylonjs.babylonjsStrings.readystatechange
import typingsSlinky.babylonjs.babylonjsStrings.timeout
import typingsSlinky.babylonjs.iWebRequestMod.IWebRequest
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.BodyInit
import typingsSlinky.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/webRequest", JSImport.Namespace)
@js.native
object webRequestMod extends js.Object {
  
  @js.native
  class WebRequest () extends IWebRequest {
    
    var _injectCustomRequestHeaders: js.Any = js.native
    
    val _xhr: js.Any = js.native
    
    /**
      * Cancels any network activity
      */
    def abort(): Unit = js.native
    
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadend(`type`: loadend, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadend(
      `type`: loadend,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadend(
      `type`: loadend,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    /** @hidden */
    @JSName("addEventListener")
    def addEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeout(`type`: timeout, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeout(
      `type`: timeout,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeout(
      `type`: timeout,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /**
      * Get the string containing the text of a particular header's value.
      * @param name The name of the header
      * @returns The string containing the text of the given header name
      */
    def getResponseHeader(name: String): Nullable[String] = js.native
    
    /**
      * Gets or sets a function to be called when loading progress changes
      */
    def onprogress: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null = js.native
    def onprogress_=(value: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]) | Null): Unit = js.native
    
    /**
      * Sets the request method, request URL
      * @param method defines the method to use (GET, POST, etc..)
      * @param url defines the url to connect with
      */
    def open(method: String, url: String): Unit = js.native
    
    /**
      * Returns client's state
      */
    def readyState: Double = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadend(`type`: loadend, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadend(
      `type`: loadend,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadend(
      `type`: loadend,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    /** @hidden */
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeout(`type`: timeout, listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeout(
      `type`: timeout,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeout(
      `type`: timeout,
      listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    
    /**
      * Returns client's response
      */
    def response: js.Any = js.native
    
    /**
      * Returns client's response as text
      */
    def responseText: String = js.native
    
    /**
      * Gets or sets the expected response type
      */
    def responseType: XMLHttpRequestResponseType = js.native
    def responseType_=(value: XMLHttpRequestResponseType): Unit = js.native
    
    /**
      * Returns client's response url
      */
    @JSName("responseURL")
    def responseURL_MWebRequest: String = js.native
    
    /**
      * Initiates the request. The optional argument provides the request body. The argument is ignored if request method is GET or HEAD
      * @param body defines an optional request body
      */
    def send(): Unit = js.native
    def send(body: BodyInit): Unit = js.native
    def send(body: Document): Unit = js.native
    
    /**
      * Sets the value of a request header.
      * @param name The name of the header whose value is to be set
      * @param value The value to set as the body of the header
      */
    def setRequestHeader(name: String, value: String): Unit = js.native
    
    /**
      * Returns client's status as a text
      */
    @JSName("statusText")
    def statusText_MWebRequest: String = js.native
    
    /**
      * Returns client's status
      */
    @JSName("status")
    def status_MWebRequest: Double = js.native
  }
  /* static members */
  @js.native
  object WebRequest extends js.Object {
    
    /**
      * Custom HTTP Request Headers to be sent with XMLHttpRequests
      * i.e. when loading files, where the server/service expects an Authorization header
      */
    var CustomRequestHeaders: StringDictionary[String] = js.native
    
    /**
      * Add callback functions in this array to update all the requests before they get sent to the network
      */
    var CustomRequestModifiers: js.Array[js.Function2[/* request */ XMLHttpRequest, /* url */ String, Unit]] = js.native
  }
}
