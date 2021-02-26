package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDatabaseResponse extends StObject {
  
  /**
    * The definition of the specified database in the Data Catalog.
    */
  var Database: js.UndefOr[typingsSlinky.awsSdk.glueMod.Database] = js.native
}
object GetDatabaseResponse {
  
  @scala.inline
  def apply(): GetDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabaseResponse]
  }
  
  @scala.inline
  implicit class GetDatabaseResponseMutableBuilder[Self <: GetDatabaseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
