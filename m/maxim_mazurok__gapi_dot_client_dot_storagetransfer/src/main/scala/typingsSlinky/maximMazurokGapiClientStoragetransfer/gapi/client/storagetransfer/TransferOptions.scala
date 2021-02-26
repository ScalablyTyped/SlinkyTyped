package typingsSlinky.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferOptions extends StObject {
  
  /** Whether objects should be deleted from the source after they are transferred to the sink. **Note:** This option and delete_objects_unique_in_sink are mutually exclusive. */
  var deleteObjectsFromSourceAfterTransfer: js.UndefOr[Boolean] = js.native
  
  /** Whether objects that exist only in the sink should be deleted. **Note:** This option and delete_objects_from_source_after_transfer are mutually exclusive. */
  var deleteObjectsUniqueInSink: js.UndefOr[Boolean] = js.native
  
  /**
    * When to overwrite objects that already exist in the sink. The default is that only objects that are different from the source are ovewritten. If true, all objects in the sink whose
    * name matches an object in the source will be overwritten with the source object.
    */
  var overwriteObjectsAlreadyExistingInSink: js.UndefOr[Boolean] = js.native
}
object TransferOptions {
  
  @scala.inline
  def apply(): TransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOptions]
  }
  
  @scala.inline
  implicit class TransferOptionsMutableBuilder[Self <: TransferOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteObjectsFromSourceAfterTransfer(value: Boolean): Self = StObject.set(x, "deleteObjectsFromSourceAfterTransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteObjectsFromSourceAfterTransferUndefined: Self = StObject.set(x, "deleteObjectsFromSourceAfterTransfer", js.undefined)
    
    @scala.inline
    def setDeleteObjectsUniqueInSink(value: Boolean): Self = StObject.set(x, "deleteObjectsUniqueInSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteObjectsUniqueInSinkUndefined: Self = StObject.set(x, "deleteObjectsUniqueInSink", js.undefined)
    
    @scala.inline
    def setOverwriteObjectsAlreadyExistingInSink(value: Boolean): Self = StObject.set(x, "overwriteObjectsAlreadyExistingInSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteObjectsAlreadyExistingInSinkUndefined: Self = StObject.set(x, "overwriteObjectsAlreadyExistingInSink", js.undefined)
  }
}
