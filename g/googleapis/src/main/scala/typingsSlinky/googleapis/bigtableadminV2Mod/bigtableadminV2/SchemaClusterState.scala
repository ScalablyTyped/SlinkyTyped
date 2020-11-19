package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The state of a table&#39;s data in a particular cluster.
  */
@js.native
trait SchemaClusterState extends js.Object {
  
  /**
    * Output only. The state of replication for the table in this cluster.
    */
  var replicationState: js.UndefOr[String] = js.native
}
object SchemaClusterState {
  
  @scala.inline
  def apply(): SchemaClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterState]
  }
  
  @scala.inline
  implicit class SchemaClusterStateOps[Self <: SchemaClusterState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplicationState(value: String): Self = this.set("replicationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationState: Self = this.set("replicationState", js.undefined)
  }
}
