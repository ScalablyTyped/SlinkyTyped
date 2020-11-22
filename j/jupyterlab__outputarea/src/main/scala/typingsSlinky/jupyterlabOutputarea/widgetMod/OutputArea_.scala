package typingsSlinky.jupyterlabOutputarea.widgetMod

import typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel
import typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.ChangedArgs
import typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea.IContentFactory
import typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea.IOptions
import typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsSlinky.jupyterlabServices.kernelKernelMod.IShellFuture
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IInputRequestMsg
import typingsSlinky.jupyterlabServices.messagesMod.IShellMessage
import typingsSlinky.jupyterlabServices.messagesMod.ShellMessageType
import typingsSlinky.luminoSignaling.mod.Signal
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea")
@js.native
class OutputArea_ protected () extends Widget {
  /**
    * Construct an output area widget.
    */
  def this(options: IOptions) = this()
  
  /**
    * Clear the widget inputs and outputs.
    */
  var _clear: js.Any = js.native
  
  var _displayIdMap: js.Any = js.native
  
  var _future: js.Any = js.native
  
  /**
    * Render and insert a single output into the layout.
    */
  var _insertOutput: js.Any = js.native
  
  var _minHeightTimeout: js.Any = js.native
  
  /**
    * Update indices in _displayIdMap in response to element remove from model items
    * *
    * @param startIndex - The index of first element removed
    *
    * @param count - The number of elements removed from model items
    *
    */
  var _moveDisplayIdIndices: js.Any = js.native
  
  /**
    * Handle an execute reply message.
    */
  var _onExecuteReply: js.Any = js.native
  
  /**
    * Handle an iopub message.
    */
  var _onIOPub: js.Any = js.native
  
  var _preventHeightChangeJitter: js.Any = js.native
  
  /**
    * Update an output in the layout in place.
    */
  var _setOutput: js.Any = js.native
  
  /**
    * The content factory used by the widget.
    */
  val contentFactory: IContentFactory = js.native
  
  /**
    * Create an output item with a prompt and actual output
    *
    * @returns a rendered widget, or null if we cannot render
    * #### Notes
    */
  /* protected */ def createOutputItem(model: IOutputModel): Widget | Null = js.native
  
  /**
    * Render a mimetype
    */
  /* protected */ def createRenderedMimetype(model: IOutputModel): Widget | Null = js.native
  
  /**
    * The kernel future associated with the output area.
    */
  def future: IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg] = js.native
  def future_=(value: IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg]): Unit = js.native
  
  /**
    * The model used by the widget.
    */
  val model: IOutputAreaModel = js.native
  
  /**
    * Handle an input request from a kernel.
    */
  /* protected */ def onInputRequest(
    msg: IInputRequestMsg,
    future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]]
  ): Unit = js.native
  
  /**
    * Follow changes on the model state.
    */
  /* protected */ def onModelChanged(sender: IOutputAreaModel, args: ChangedArgs): Unit = js.native
  
  /**
    * Follow changes on the output model state.
    */
  /* protected */ def onStateChanged(sender: IOutputAreaModel): Unit = js.native
  
  /**
    * A public signal used to indicate the number of outputs has changed.
    *
    * #### Notes
    * This is useful for parents who want to apply styling based on the number
    * of outputs. Emits the current number of outputs.
    */
  val outputLengthChanged: Signal[this.type, Double] = js.native
  
  /**
    * The rendermime instance used by the widget.
    */
  val rendermime: IRenderMimeRegistry = js.native
  
  /**
    * A read-only sequence of the chidren widgets in the output area.
    */
  def widgets: js.Array[Widget] = js.native
}
