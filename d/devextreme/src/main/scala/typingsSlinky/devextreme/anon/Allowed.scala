package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.addShape
import typingsSlinky.devextreme.devextremeStrings.addShapeFromToolbox
import typingsSlinky.devextreme.devextremeStrings.beforeChangeConnectorText
import typingsSlinky.devextreme.devextremeStrings.beforeChangeShapeText
import typingsSlinky.devextreme.devextremeStrings.changeConnection
import typingsSlinky.devextreme.devextremeStrings.changeConnectorPoints
import typingsSlinky.devextreme.devextremeStrings.changeConnectorText
import typingsSlinky.devextreme.devextremeStrings.changeShapeText
import typingsSlinky.devextreme.devextremeStrings.deleteConnector
import typingsSlinky.devextreme.devextremeStrings.deleteShape
import typingsSlinky.devextreme.devextremeStrings.moveShape
import typingsSlinky.devextreme.devextremeStrings.resizeShape
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagram
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramAddShapeArgs
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramAddShapeFromToolboxArgs
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramBeforeChangeConnectorTextArgs
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramBeforeChangeShapeTextArgs
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramChangeConnectionArgs
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramChangeConnectorPointsArgs
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramChangeConnectorTextArgs
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramChangeShapeTextArgs
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramDeleteConnectorArgs
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramDeleteShapeArgs
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramMoveShapeArgs
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDiagramResizeShapeArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allowed extends StObject {
  
  var allowed: js.UndefOr[Boolean] = js.native
  
  var args: js.UndefOr[
    dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs
  ] = js.native
  
  var component: js.UndefOr[dxDiagram] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var operation: js.UndefOr[
    addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints | beforeChangeShapeText | changeShapeText | beforeChangeConnectorText | changeConnectorText | resizeShape | moveShape
  ] = js.native
  
  var updateUI: js.UndefOr[Boolean] = js.native
}
object Allowed {
  
  @scala.inline
  def apply(): Allowed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowed]
  }
  
  @scala.inline
  implicit class AllowedMutableBuilder[Self <: Allowed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    @scala.inline
    def setArgs(
      value: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setComponent(value: dxDiagram): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setOperation(
      value: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints | beforeChangeShapeText | changeShapeText | beforeChangeConnectorText | changeConnectorText | resizeShape | moveShape
    ): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setUpdateUI(value: Boolean): Self = StObject.set(x, "updateUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUIUndefined: Self = StObject.set(x, "updateUI", js.undefined)
  }
}
