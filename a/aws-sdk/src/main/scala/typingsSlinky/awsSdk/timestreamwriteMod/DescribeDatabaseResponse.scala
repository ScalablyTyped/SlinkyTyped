package typingsSlinky.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatabaseResponse extends StObject {
  
  /**
    * The name of the Timestream table.
    */
  var Database: js.UndefOr[typingsSlinky.awsSdk.timestreamwriteMod.Database] = js.native
}
object DescribeDatabaseResponse {
  
  @scala.inline
  def apply(): DescribeDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatabaseResponse]
  }
  
  @scala.inline
  implicit class DescribeDatabaseResponseMutableBuilder[Self <: DescribeDatabaseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
