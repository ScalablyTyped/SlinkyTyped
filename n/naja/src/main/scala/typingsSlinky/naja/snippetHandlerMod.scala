package typingsSlinky.naja

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsSlinky.naja.anon.Append
import typingsSlinky.naja.najaStrings.afterUpdate
import typingsSlinky.naja.najaStrings.beforeUpdate
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("naja/src/core/SnippetHandler", JSImport.Namespace)
@js.native
object snippetHandlerMod extends js.Object {
  
  @js.native
  class SnippetHandler () extends EventTarget {
    
    @JSName("addEventListener")
    def addEventListener_afterUpdate(`type`: afterUpdate, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterUpdate(
      `type`: afterUpdate,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterUpdate(
      `type`: afterUpdate,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeUpdate(`type`: beforeUpdate, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeUpdate(
      `type`: beforeUpdate,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeUpdate(
      `type`: beforeUpdate,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var op: Append = js.native
    
    def removeEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterUpdate(`type`: afterUpdate, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterUpdate(
      `type`: afterUpdate,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterUpdate(
      `type`: afterUpdate,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeUpdate(`type`: beforeUpdate, listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeUpdate(
      `type`: beforeUpdate,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeUpdate(
      `type`: beforeUpdate,
      listener: js.ThisFunction1[/* this */ this.type, CustomEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
  }
  
  type AfterUpdateEvent = CustomEvent
  
  type BeforeUpdateEvent = CustomEvent
  
  type SnippetUpdateOperation = js.Function2[/* snippet */ Element, /* content */ String, Unit]
}
