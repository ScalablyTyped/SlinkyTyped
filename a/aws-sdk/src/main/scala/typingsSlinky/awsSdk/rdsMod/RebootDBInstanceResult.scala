package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebootDBInstanceResult extends js.Object {
  
  var DBInstance: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBInstance] = js.native
}
object RebootDBInstanceResult {
  
  @scala.inline
  def apply(): RebootDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootDBInstanceResult]
  }
  
  @scala.inline
  implicit class RebootDBInstanceResultOps[Self <: RebootDBInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDBInstance(value: DBInstance): Self = this.set("DBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBInstance: Self = this.set("DBInstance", js.undefined)
  }
}
