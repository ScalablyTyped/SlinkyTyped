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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allowed extends js.Object {
  
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
  implicit class AllowedOps[Self <: Allowed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowed(value: Boolean): Self = this.set("allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed: Self = this.set("allowed", js.undefined)
    
    @scala.inline
    def setArgs(
      value: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs
    ): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setComponent(value: dxDiagram): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setOperation(
      value: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints | beforeChangeShapeText | changeShapeText | beforeChangeConnectorText | changeConnectorText | resizeShape | moveShape
    ): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setUpdateUI(value: Boolean): Self = this.set("updateUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateUI: Self = this.set("updateUI", js.undefined)
  }
}
