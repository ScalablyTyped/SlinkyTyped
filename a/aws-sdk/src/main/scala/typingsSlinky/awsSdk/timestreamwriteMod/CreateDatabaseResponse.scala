package typingsSlinky.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatabaseResponse extends StObject {
  
  /**
    * The newly created Timestream database.
    */
  var Database: js.UndefOr[typingsSlinky.awsSdk.timestreamwriteMod.Database] = js.native
}
object CreateDatabaseResponse {
  
  @scala.inline
  def apply(): CreateDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatabaseResponse]
  }
  
  @scala.inline
  implicit class CreateDatabaseResponseMutableBuilder[Self <: CreateDatabaseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
