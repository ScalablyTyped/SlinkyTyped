package typingsSlinky.monacoEditor.mod.editor

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContentWidget extends StObject {
  
  /**
    * Render this content widget in a location where it could overflow the editor's view dom node.
    */
  var allowEditorOverflow: js.UndefOr[Boolean] = js.native
  
  /**
    * Get the dom node of the content widget.
    */
  def getDomNode(): HTMLElement = js.native
  
  /**
    * Get a unique identifier of the content widget.
    */
  def getId(): String = js.native
  
  /**
    * Get the placement of the content widget.
    * If null is returned, the content widget will be placed off screen.
    */
  def getPosition(): IContentWidgetPosition | Null = js.native
  
  var suppressMouseDown: js.UndefOr[Boolean] = js.native
}
object IContentWidget {
  
  @scala.inline
  def apply(
    getDomNode: () => HTMLElement,
    getId: () => String,
    getPosition: () => IContentWidgetPosition | Null
  ): IContentWidget = {
    val __obj = js.Dynamic.literal(getDomNode = js.Any.fromFunction0(getDomNode), getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition))
    __obj.asInstanceOf[IContentWidget]
  }
  
  @scala.inline
  implicit class IContentWidgetMutableBuilder[Self <: IContentWidget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEditorOverflow(value: Boolean): Self = StObject.set(x, "allowEditorOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditorOverflowUndefined: Self = StObject.set(x, "allowEditorOverflow", js.undefined)
    
    @scala.inline
    def setGetDomNode(value: () => HTMLElement): Self = StObject.set(x, "getDomNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => IContentWidgetPosition | Null): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuppressMouseDown(value: Boolean): Self = StObject.set(x, "suppressMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressMouseDownUndefined: Self = StObject.set(x, "suppressMouseDown", js.undefined)
  }
}
