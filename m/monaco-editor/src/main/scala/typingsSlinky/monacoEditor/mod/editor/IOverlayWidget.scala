package typingsSlinky.monacoEditor.mod.editor

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlayWidget extends StObject {
  
  /**
    * Get the dom node of the overlay widget.
    */
  def getDomNode(): HTMLElement = js.native
  
  /**
    * Get a unique identifier of the overlay widget.
    */
  def getId(): String = js.native
  
  /**
    * Get the placement of the overlay widget.
    * If null is returned, the overlay widget is responsible to place itself.
    */
  def getPosition(): IOverlayWidgetPosition | Null = js.native
}
object IOverlayWidget {
  
  @scala.inline
  def apply(
    getDomNode: () => HTMLElement,
    getId: () => String,
    getPosition: () => IOverlayWidgetPosition | Null
  ): IOverlayWidget = {
    val __obj = js.Dynamic.literal(getDomNode = js.Any.fromFunction0(getDomNode), getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition))
    __obj.asInstanceOf[IOverlayWidget]
  }
  
  @scala.inline
  implicit class IOverlayWidgetMutableBuilder[Self <: IOverlayWidget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDomNode(value: () => HTMLElement): Self = StObject.set(x, "getDomNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => IOverlayWidgetPosition | Null): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
  }
}
