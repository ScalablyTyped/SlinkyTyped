package typingsSlinky.leaflet.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Draggable")
@js.native
class Draggable protected () extends Evented {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, dragStartTarget: HTMLElement) = this()
  def this(element: HTMLElement, dragStartTarget: js.UndefOr[scala.Nothing], preventOutline: Boolean) = this()
  def this(element: HTMLElement, dragStartTarget: HTMLElement, preventOutline: Boolean) = this()
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def finishDrag(): Unit = js.native
}
