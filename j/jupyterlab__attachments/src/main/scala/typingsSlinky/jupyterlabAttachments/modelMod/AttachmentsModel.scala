package typingsSlinky.jupyterlabAttachments.modelMod

import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.ChangedArgs
import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.IContentFactory
import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/attachments/lib/model", "AttachmentsModel")
@js.native
/**
  * Construct a new observable outputs instance.
  */
class AttachmentsModel () extends IAttachmentsModel {
  def this(options: IOptions) = this()
  var _changeGuard: js.Any = js.native
  var _changed: js.Any = js.native
  /**
    * Create an attachment item and hook up its signals.
    */
  var _createItem: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _map: js.Any = js.native
  var _modelDB: js.Any = js.native
  /**
    * Handle a change to an item.
    */
  var _onGenericChange: js.Any = js.native
  /**
    * Handle a change to the list.
    */
  var _onMapChanged: js.Any = js.native
  /**
    * If the serialized version of the outputs have changed due to a remote
    * action, then update the model accordingly.
    */
  var _onSerializedChanged: js.Any = js.native
  var _serialized: js.Any = js.native
  var _stateChanged: js.Any = js.native
  /**
    * A signal emitted when the model changes.
    */
  @JSName("changed")
  val changed_AttachmentsModel: ISignal[this.type, ChangedArgs] = js.native
  /**
    * Remove the attachment whose name is the specified key
    */
  @JSName("remove")
  def remove_MAttachmentsModel(key: String): Unit = js.native
}

@JSImport("@jupyterlab/attachments/lib/model", "AttachmentsModel")
@js.native
object AttachmentsModel extends js.Object {
  /**
    * The default implementation of a `IAttachemntsModel.IContentFactory`.
    */
  @js.native
  class ContentFactory () extends IContentFactory
  
  /**
    * The default attachment model factory.
    */
  val defaultContentFactory: ContentFactory = js.native
}

