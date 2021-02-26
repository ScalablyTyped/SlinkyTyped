package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetachObject extends StObject {
  
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.BatchReferenceName] = js.native
  
  /**
    * The name of the link.
    */
  var LinkName: typingsSlinky.awsSdk.clouddirectoryMod.LinkName = js.native
  
  /**
    * Parent reference from which the object with the specified link name is detached.
    */
  var ParentReference: ObjectReference = js.native
}
object BatchDetachObject {
  
  @scala.inline
  def apply(LinkName: LinkName, ParentReference: ObjectReference): BatchDetachObject = {
    val __obj = js.Dynamic.literal(LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachObject]
  }
  
  @scala.inline
  implicit class BatchDetachObjectMutableBuilder[Self <: BatchDetachObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchReferenceName(value: BatchReferenceName): Self = StObject.set(x, "BatchReferenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchReferenceNameUndefined: Self = StObject.set(x, "BatchReferenceName", js.undefined)
    
    @scala.inline
    def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentReference(value: ObjectReference): Self = StObject.set(x, "ParentReference", value.asInstanceOf[js.Any])
  }
}
