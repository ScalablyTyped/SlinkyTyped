package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Document has been removed from the view of the targets.  Sent if the
  * document is no longer relevant to a target and is out of view. Can be sent
  * instead of a DocumentDelete or a DocumentChange if the server can not send
  * the new value of the document.  Multiple DocumentRemove messages may be
  * returned for the same logical write or delete, if multiple targets are
  * affected.
  */
@js.native
trait SchemaDocumentRemove extends StObject {
  
  /**
    * The resource name of the Document that has gone out of view.
    */
  var document: js.UndefOr[String] = js.native
  
  /**
    * The read timestamp at which the remove was observed.  Greater or equal to
    * the `commit_time` of the change/delete/remove.
    */
  var readTime: js.UndefOr[String] = js.native
  
  /**
    * A set of target IDs for targets that previously matched this document.
    */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.native
}
object SchemaDocumentRemove {
  
  @scala.inline
  def apply(): SchemaDocumentRemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentRemove]
  }
  
  @scala.inline
  implicit class SchemaDocumentRemoveMutableBuilder[Self <: SchemaDocumentRemove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setRemovedTargetIds(value: js.Array[Double]): Self = StObject.set(x, "removedTargetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    @scala.inline
    def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value :_*))
  }
}
