package typingsSlinky.naja

import org.scalajs.dom.experimental.URL
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.naja.najaMod.Options
import typingsSlinky.naja.najaStrings.interaction
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uihandlerMod {
  
  @JSImport("naja/src/core/UIHandler", "UIHandler")
  @js.native
  class UIHandler () extends EventTarget {
    
    @JSName("addEventListener")
    def addEventListener_interaction(`type`: interaction, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: interaction,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_interaction(
      `type`: interaction,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var allowedOrigins: js.Array[String] = js.native
    
    def bindUI(element: Element): Unit = js.native
    
    def clickElement(element: Element, options: Options): Unit = js.native
    def clickElement(element: Element, options: Options, event: Event): Unit = js.native
    
    def isUrlAllowed(url: String): Boolean = js.native
    def isUrlAllowed(url: URL): Boolean = js.native
    
    def removeEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(`type`: interaction, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: interaction,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_interaction(
      `type`: interaction,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var selector: String = js.native
    
    def submitForm(form: HTMLFormElement, options: Options): Unit = js.native
    def submitForm(form: HTMLFormElement, options: Options, event: Event): Unit = js.native
  }
  
  type InteractionEvent = CustomEvent
}
