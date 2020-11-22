package typingsSlinky.naja.najaMod

import org.scalajs.dom.experimental.URL
import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.naja.formsHandlerMod.FormsHandler
import typingsSlinky.naja.historyHandlerMod.HistoryHandler
import typingsSlinky.naja.najaStrings.abort
import typingsSlinky.naja.najaStrings.before
import typingsSlinky.naja.najaStrings.complete
import typingsSlinky.naja.najaStrings.error
import typingsSlinky.naja.najaStrings.init
import typingsSlinky.naja.najaStrings.start
import typingsSlinky.naja.najaStrings.success
import typingsSlinky.naja.redirectHandlerMod.RedirectHandler
import typingsSlinky.naja.scriptLoaderMod.ScriptLoader
import typingsSlinky.naja.snippetHandlerMod.SnippetHandler
import typingsSlinky.naja.uihandlerMod.UIHandler
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("naja/src/Naja", "Naja")
@js.native
class Naja () extends EventTarget {
  
  val VERSION: Double = js.native
  
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_before(`type`: before, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_before(`type`: before, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_before(
    `type`: before,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_init(`type`: init, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_init(`type`: init, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_init(
    `type`: init,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(`type`: success, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  var defaultOptions: Options = js.native
  
  val formsHandler: FormsHandler = js.native
  
  val historyHandler: HistoryHandler = js.native
  
  def initialize(): Unit = js.native
  def initialize(defaultOptions: Options): Unit = js.native
  
  def makeRequest(method: String, url: String): js.Promise[Payload] = js.native
  def makeRequest(method: String, url: String, data: js.UndefOr[scala.Nothing], options: Options): js.Promise[Payload] = js.native
  def makeRequest(method: String, url: String, data: js.Any): js.Promise[Payload] = js.native
  def makeRequest(method: String, url: String, data: js.Any, options: Options): js.Promise[Payload] = js.native
  def makeRequest(method: String, url: String, data: Null, options: Options): js.Promise[Payload] = js.native
  def makeRequest(method: String, url: URL): js.Promise[Payload] = js.native
  def makeRequest(method: String, url: URL, data: js.UndefOr[scala.Nothing], options: Options): js.Promise[Payload] = js.native
  def makeRequest(method: String, url: URL, data: js.Any): js.Promise[Payload] = js.native
  def makeRequest(method: String, url: URL, data: js.Any, options: Options): js.Promise[Payload] = js.native
  def makeRequest(method: String, url: URL, data: Null, options: Options): js.Promise[Payload] = js.native
  
  val redirectHandler: RedirectHandler = js.native
  
  def registerExtension(extension: Extension): Unit = js.native
  
  def removeEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_before(`type`: before, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_before(`type`: before, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_before(
    `type`: before,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(`type`: complete, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_init(`type`: init, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_init(`type`: init, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_init(
    `type`: init,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(`type`: success, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  val scriptLoader: ScriptLoader = js.native
  
  val snippetHandler: SnippetHandler = js.native
  
  val uiHandler: UIHandler = js.native
}
