package typingsSlinky.monacoEditor.mod.editor

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorConstructionOptions extends IEditorOptions {
  
  /**
    * The initial editor dimension (to avoid measuring the container).
    */
  var dimension: js.UndefOr[IDimension] = js.native
  
  /**
    * Place overflow widgets inside an external DOM node.
    * Defaults to an internal DOM node.
    */
  var overflowWidgetsDomNode: js.UndefOr[HTMLElement] = js.native
}
object IEditorConstructionOptions {
  
  @scala.inline
  def apply(): IEditorConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorConstructionOptions]
  }
  
  @scala.inline
  implicit class IEditorConstructionOptionsMutableBuilder[Self <: IEditorConstructionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimension(value: IDimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setOverflowWidgetsDomNode(value: HTMLElement): Self = StObject.set(x, "overflowWidgetsDomNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowWidgetsDomNodeUndefined: Self = StObject.set(x, "overflowWidgetsDomNode", js.undefined)
  }
}
