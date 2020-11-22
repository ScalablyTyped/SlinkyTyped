package typingsSlinky.jupyterlabDocmanager.savingstatusMod.SavingStatus

import typingsSlinky.jupyterlabApputils.vdomMod.VDomModel
import typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.SaveState
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A VDomModel for the SavingStatus item.
  */
@JSImport("@jupyterlab/docmanager/lib/savingstatus", "SavingStatus.Model")
@js.native
class Model protected () extends VDomModel {
  /**
    * Create a new SavingStatus model.
    */
  def this(docManager: IDocumentManager) = this()
  
  var _docManager: js.Any = js.native
  
  /**
    * React to a saving status change from the current document widget.
    */
  var _onStatusChange: js.Any = js.native
  
  var _status: js.Any = js.native
  
  var _widget: js.Any = js.native
  
  /**
    * The current status of the model.
    */
  def status: SaveState | Null = js.native
  
  /**
    * The current widget for the model. Any widget can be assigned,
    * but it only has any effect if the widget is an IDocument widget
    * known to the application document manager.
    */
  def widget: Widget | Null = js.native
  def widget_=(widget: Widget | Null): Unit = js.native
}
