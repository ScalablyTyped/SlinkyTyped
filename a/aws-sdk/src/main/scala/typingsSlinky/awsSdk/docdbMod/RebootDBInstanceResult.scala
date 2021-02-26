package typingsSlinky.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebootDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typingsSlinky.awsSdk.docdbMod.DBInstance] = js.native
}
object RebootDBInstanceResult {
  
  @scala.inline
  def apply(): RebootDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootDBInstanceResult]
  }
  
  @scala.inline
  implicit class RebootDBInstanceResultMutableBuilder[Self <: RebootDBInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
