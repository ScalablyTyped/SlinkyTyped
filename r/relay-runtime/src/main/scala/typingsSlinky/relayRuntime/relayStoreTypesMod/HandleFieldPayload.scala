package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleFieldPayload extends StObject {
  
  // The arguments that were fetched.
  val args: Variables = js.native
  
  // The __id of the record containing the source/handle field.
  val dataID: DataID = js.native
  
  // The (storage) key at which the original server data was written.
  val fieldKey: String = js.native
  
  // The name of the handle.
  val handle: String = js.native
  
  // The (storage) key at which the handle's data should be written by the
  // handler.
  val handleKey: String = js.native
}
object HandleFieldPayload {
  
  @scala.inline
  def apply(args: Variables, dataID: DataID, fieldKey: String, handle: String, handleKey: String): HandleFieldPayload = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], dataID = dataID.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], handleKey = handleKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleFieldPayload]
  }
  
  @scala.inline
  implicit class HandleFieldPayloadMutableBuilder[Self <: HandleFieldPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: Variables): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataID(value: DataID): Self = StObject.set(x, "dataID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleKey(value: String): Self = StObject.set(x, "handleKey", value.asInstanceOf[js.Any])
  }
}
