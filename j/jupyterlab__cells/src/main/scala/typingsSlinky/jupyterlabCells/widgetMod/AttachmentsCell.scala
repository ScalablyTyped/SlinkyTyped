package typingsSlinky.jupyterlabCells.widgetMod

import org.scalajs.dom.raw.Event
import typingsSlinky.jupyterlabCells.modelMod.IAttachmentsCellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells/lib/widget", "AttachmentsCell")
@js.native
abstract class AttachmentsCell () extends Cell {
  
  /**
    * Takes in a file object and adds it to
    * the cell attachments
    */
  var _attachFile: js.Any = js.native
  
  /**
    * Attaches all DataTransferItems (obtained from
    * clipboard or native drop events) to the cell
    */
  var _attachFiles: js.Any = js.native
  
  var _evtDragOver: js.Any = js.native
  
  /**
    * Handle the `'lm-drop'` event for the widget.
    */
  var _evtDrop: js.Any = js.native
  
  /**
    * Handle the `drop` event for the widget
    */
  var _evtNativeDrop: js.Any = js.native
  
  /**
    * Handle the `paste` event for the widget
    */
  var _evtPaste: js.Any = js.native
  
  /**
    * Generates a unique URI for a file
    * while preserving the file extension.
    */
  var _generateURI: js.Any = js.native
  
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the notebook panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  
  /**
    * The model used by the widget.
    */
  @JSName("model")
  val model_FAttachmentsCell: IAttachmentsCellModel = js.native
  
  /**
    * Modify the cell source to include a reference to the attachment.
    */
  /* protected */ def updateCellSourceWithAttachment(attachmentName: String): Unit = js.native
  /* protected */ def updateCellSourceWithAttachment(attachmentName: String, URI: String): Unit = js.native
}
