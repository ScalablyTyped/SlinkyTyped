package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDatabaseRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which the metadata database resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * A DatabaseInput object specifying the new definition of the metadata database in the catalog.
    */
  var DatabaseInput: typingsSlinky.awsSdk.glueMod.DatabaseInput = js.native
  
  /**
    * The name of the database to update in the catalog. For Hive compatibility, this is folded to lowercase.
    */
  var Name: NameString = js.native
}
object UpdateDatabaseRequest {
  
  @scala.inline
  def apply(DatabaseInput: DatabaseInput, Name: NameString): UpdateDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseInput = DatabaseInput.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatabaseRequest]
  }
  
  @scala.inline
  implicit class UpdateDatabaseRequestMutableBuilder[Self <: UpdateDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseInput(value: DatabaseInput): Self = StObject.set(x, "DatabaseInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
