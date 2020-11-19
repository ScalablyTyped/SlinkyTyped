package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBClusterResult extends js.Object {
  
  var DBCluster: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.DBCluster] = js.native
}
object ModifyDBClusterResult {
  
  @scala.inline
  def apply(): ModifyDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBClusterResult]
  }
  
  @scala.inline
  implicit class ModifyDBClusterResultOps[Self <: ModifyDBClusterResult] (val x: Self) extends AnyVal {
    
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
    def setDBCluster(value: DBCluster): Self = this.set("DBCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBCluster: Self = this.set("DBCluster", js.undefined)
  }
}
