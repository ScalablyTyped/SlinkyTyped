package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRelationalDatabaseRequest extends StObject {
  
  /**
    * The name of the database snapshot created if skip final snapshot is false, which is the default value for that parameter.  Specifying this parameter and also specifying the skip final snapshot parameter to true results in an error.  Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
    */
  var finalRelationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The name of the database that you are deleting.
    */
  var relationalDatabaseName: ResourceName = js.native
  
  /**
    * Determines whether a final database snapshot is created before your database is deleted. If true is specified, no database snapshot is created. If false is specified, a database snapshot is created before your database is deleted. You must specify the final relational database snapshot name parameter if the skip final snapshot parameter is false. Default: false 
    */
  var skipFinalSnapshot: js.UndefOr[Boolean] = js.native
}
object DeleteRelationalDatabaseRequest {
  
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): DeleteRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRelationalDatabaseRequest]
  }
  
  @scala.inline
  implicit class DeleteRelationalDatabaseRequestMutableBuilder[Self <: DeleteRelationalDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinalRelationalDatabaseSnapshotName(value: ResourceName): Self = StObject.set(x, "finalRelationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalRelationalDatabaseSnapshotNameUndefined: Self = StObject.set(x, "finalRelationalDatabaseSnapshotName", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipFinalSnapshot(value: Boolean): Self = StObject.set(x, "skipFinalSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipFinalSnapshotUndefined: Self = StObject.set(x, "skipFinalSnapshot", js.undefined)
  }
}
