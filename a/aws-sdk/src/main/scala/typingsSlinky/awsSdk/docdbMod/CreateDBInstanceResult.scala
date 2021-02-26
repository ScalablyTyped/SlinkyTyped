package typingsSlinky.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typingsSlinky.awsSdk.docdbMod.DBInstance] = js.native
}
object CreateDBInstanceResult {
  
  @scala.inline
  def apply(): CreateDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBInstanceResult]
  }
  
  @scala.inline
  implicit class CreateDBInstanceResultMutableBuilder[Self <: CreateDBInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
