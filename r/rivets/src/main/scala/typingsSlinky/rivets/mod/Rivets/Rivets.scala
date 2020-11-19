package typingsSlinky.rivets.mod.Rivets

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import typingsSlinky.rivets.anon.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rivets extends js.Object {
  
  // Global sightglass adapters.
  var adapters: js.Object = js.native
  
  def bind(element: js.Array[HTMLElement], models: js.Object): View = js.native
  def bind(element: js.Array[HTMLElement], models: js.Object, options: js.Object): View = js.native
  def bind(element: JQuery[HTMLElement], models: js.Object): View = js.native
  def bind(element: JQuery[HTMLElement], models: js.Object, options: js.Object): View = js.native
  def bind(element: HTMLElement, models: js.Object): View = js.native
  def bind(element: HTMLElement, models: js.Object, options: js.Object): View = js.native
  
  // Global binders.
  var binders: js.Object = js.native
  
  // Global components.
  var components: js.Object = js.native
  
  def configure(): Unit = js.native
  def configure(options: Handler): Unit = js.native
  
  // Global formatters.
  var formatters: js.Object = js.native
  
  def handler(context: js.Any, ev: Event, biding: js.Any): Unit = js.native
  
  // Default attribute prefix.
  var prefix: String = js.native
  
  // Preload data by default.
  var preloadData: Boolean = js.native
  
  // Default sightglass root interface.
  var rootInterface: String = js.native
  
  // Default template delimiters.
  var templateDelimiters: js.Array[String] = js.native
}
