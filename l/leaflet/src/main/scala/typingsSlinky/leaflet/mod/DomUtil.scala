package typingsSlinky.leaflet.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.leaflet.leafletBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "DomUtil")
@js.native
object DomUtil extends js.Object {
  
  var TRANSFORM: String = js.native
  
  var TRANSITION: String = js.native
  
  var TRANSITION_END: String = js.native
  
  def addClass(el: HTMLElement, name: String): Unit = js.native
  
  def create(tagName: String): HTMLElement = js.native
  def create(tagName: String, className: js.UndefOr[scala.Nothing], container: HTMLElement): HTMLElement = js.native
  def create(tagName: String, className: String): HTMLElement = js.native
  def create(tagName: String, className: String, container: HTMLElement): HTMLElement = js.native
  
  def disableImageDrag(): Unit = js.native
  
  def disableTextSelection(): Unit = js.native
  
  def empty(el: HTMLElement): Unit = js.native
  
  def enableImageDrag(): Unit = js.native
  
  def enableTextSelection(): Unit = js.native
  
  /**
    * Get Element by its ID or with the given HTML-Element
    */
  def get(element: String): HTMLElement | Null = js.native
  def get(element: HTMLElement): HTMLElement | Null = js.native
  
  def getClass(el: HTMLElement): String = js.native
  
  def getPosition(el: HTMLElement): Point_ = js.native
  
  def getStyle(el: HTMLElement, styleAttrib: String): String | Null = js.native
  
  def hasClass(el: HTMLElement, name: String): Boolean = js.native
  
  def preventOutline(el: HTMLElement): Unit = js.native
  
  def remove(el: HTMLElement): Unit = js.native
  
  def removeClass(el: HTMLElement, name: String): Unit = js.native
  
  def restoreOutline(): Unit = js.native
  
  def setClass(el: HTMLElement, name: String): Unit = js.native
  
  def setOpacity(el: HTMLElement, opacity: Double): Unit = js.native
  
  def setPosition(el: HTMLElement, position: Point_): Unit = js.native
  
  def setTransform(el: HTMLElement, offset: Point_): Unit = js.native
  def setTransform(el: HTMLElement, offset: Point_, scale: Double): Unit = js.native
  
  def testProp(props: js.Array[String]): String | `false` = js.native
  
  def toBack(el: HTMLElement): Unit = js.native
  
  def toFront(el: HTMLElement): Unit = js.native
}
