package typingsSlinky.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of changes for a user.
  */
@js.native
trait SchemaChangeList extends StObject {
  
  /**
    * The list of changes. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var changes: js.UndefOr[js.Array[SchemaChange]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#changeList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The starting page token for future changes. This will be present only if
    * the end of the current changes list has been reached.
    */
  var newStartPageToken: js.UndefOr[String] = js.native
  
  /**
    * The page token for the next page of changes. This will be absent if the
    * end of the changes list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaChangeList {
  
  @scala.inline
  def apply(): SchemaChangeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeList]
  }
  
  @scala.inline
  implicit class SchemaChangeListMutableBuilder[Self <: SchemaChangeList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[SchemaChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    @scala.inline
    def setChangesVarargs(value: SchemaChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNewStartPageToken(value: String): Self = StObject.set(x, "newStartPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewStartPageTokenUndefined: Self = StObject.set(x, "newStartPageToken", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
