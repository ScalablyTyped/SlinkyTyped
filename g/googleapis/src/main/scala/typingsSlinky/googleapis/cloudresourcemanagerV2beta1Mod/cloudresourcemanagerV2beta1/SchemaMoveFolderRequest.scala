package typingsSlinky.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The MoveFolder request message.
  */
@js.native
trait SchemaMoveFolderRequest extends StObject {
  
  /**
    * The resource name of the Folder or Organization to reparent the folder
    * under. Must be of the form `folders/{folder_id}` or
    * `organizations/{org_id}`.
    */
  var destinationParent: js.UndefOr[String] = js.native
}
object SchemaMoveFolderRequest {
  
  @scala.inline
  def apply(): SchemaMoveFolderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoveFolderRequest]
  }
  
  @scala.inline
  implicit class SchemaMoveFolderRequestMutableBuilder[Self <: SchemaMoveFolderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationParent(value: String): Self = StObject.set(x, "destinationParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationParentUndefined: Self = StObject.set(x, "destinationParent", js.undefined)
  }
}
