package typingsSlinky.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDatabaseOutput extends StObject {
  
  /**
    * The database returned.
    */
  var Database: js.UndefOr[typingsSlinky.awsSdk.athenaMod.Database] = js.native
}
object GetDatabaseOutput {
  
  @scala.inline
  def apply(): GetDatabaseOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabaseOutput]
  }
  
  @scala.inline
  implicit class GetDatabaseOutputMutableBuilder[Self <: GetDatabaseOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
