package typingsSlinky.naja.redirectHandlerMod

import org.scalajs.dom.experimental.URL
import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.naja.najaStrings.redirect
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("naja/src/core/RedirectHandler", "RedirectHandler")
@js.native
class RedirectHandler () extends EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_redirect(`type`: redirect, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_redirect(
    `type`: redirect,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_redirect(
    `type`: redirect,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  var locationAdapter: LocationAdapter = js.native
  
  def makeRedirect(url: String, force: Boolean): Unit = js.native
  def makeRedirect(url: URL, force: Boolean): Unit = js.native
  
  def removeEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_redirect(`type`: redirect, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_redirect(
    `type`: redirect,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_redirect(
    `type`: redirect,
    listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}
