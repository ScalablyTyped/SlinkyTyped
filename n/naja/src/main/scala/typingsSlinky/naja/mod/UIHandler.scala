package typingsSlinky.naja.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIHandler extends js.Object {
  
  val allowedOrigins: js.Array[String] = js.native
  
  def bindUI(element: HTMLElement): Unit = js.native
  
  def clickElement(element: HTMLElement): Unit = js.native
  def clickElement(element: HTMLElement, options: js.UndefOr[scala.Nothing], event: Event): Unit = js.native
  def clickElement(element: HTMLElement, options: js.Object): Unit = js.native
  def clickElement(element: HTMLElement, options: js.Object, event: Event): Unit = js.native
  
  def handleUI(event: Event): Unit = js.native
  
  def isUrlAllowed(url: String): Boolean = js.native
  
  var selector: String = js.native
  
  def submitForm(element: HTMLFormElement): Unit = js.native
  def submitForm(element: HTMLFormElement, options: js.UndefOr[scala.Nothing], event: Event): Unit = js.native
  def submitForm(element: HTMLFormElement, options: js.Object): Unit = js.native
  def submitForm(element: HTMLFormElement, options: js.Object, event: Event): Unit = js.native
}
