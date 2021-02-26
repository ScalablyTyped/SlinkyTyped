package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBInstance] = js.native
}
object StopDBInstanceResult {
  
  @scala.inline
  def apply(): StopDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDBInstanceResult]
  }
  
  @scala.inline
  implicit class StopDBInstanceResultMutableBuilder[Self <: StopDBInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
