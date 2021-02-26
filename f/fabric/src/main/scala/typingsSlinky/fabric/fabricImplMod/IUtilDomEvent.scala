package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtilDomEvent extends StObject {
  
  /**
    * Adds an event listener to an element
    */
  def addListener(element: HTMLElement, eventName: String, handler: js.Function): Unit = js.native
  
  /**
    * Cross-browser wrapper for getting event's coordinates
    * @param event Event object
    * @param upperCanvasEl &lt;canvas> element on which object selection is drawn
    */
  def getPointer(event: Event, upperCanvasEl: HTMLCanvasElement): Point = js.native
  
  /**
    * Removes an event listener from an element
    */
  def removeListener(element: HTMLElement, eventName: String, handler: js.Function): Unit = js.native
}
object IUtilDomEvent {
  
  @scala.inline
  def apply(
    addListener: (HTMLElement, String, js.Function) => Unit,
    getPointer: (Event, HTMLCanvasElement) => Point,
    removeListener: (HTMLElement, String, js.Function) => Unit
  ): IUtilDomEvent = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction3(addListener), getPointer = js.Any.fromFunction2(getPointer), removeListener = js.Any.fromFunction3(removeListener))
    __obj.asInstanceOf[IUtilDomEvent]
  }
  
  @scala.inline
  implicit class IUtilDomEventMutableBuilder[Self <: IUtilDomEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddListener(value: (HTMLElement, String, js.Function) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetPointer(value: (Event, HTMLCanvasElement) => Point): Self = StObject.set(x, "getPointer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveListener(value: (HTMLElement, String, js.Function) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
  }
}
