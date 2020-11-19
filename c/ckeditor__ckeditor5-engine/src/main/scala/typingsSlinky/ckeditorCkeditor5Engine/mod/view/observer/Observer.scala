package typingsSlinky.ckeditorCkeditor5Engine.mod.view.observer

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Document
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/view/observer/observer
@JSImport("@ckeditor/ckeditor5-engine", "view.observer.Observer")
@js.native
class Observer protected () extends js.Object {
  def this(view: View) = this()
  
  def destroy(): Unit = js.native
  
  def disable(): Unit = js.native
  
  val document: Document = js.native
  
  def enable(): Unit = js.native
  
  val isEnabled: Boolean = js.native
  
  def observe(domElement: HTMLElement, name: String): Unit = js.native
  
  val view: View = js.native
}
