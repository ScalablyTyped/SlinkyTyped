package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyGlobalClusterMessage extends js.Object {
  /**
    *  Indicates if the global database cluster has deletion protection enabled. The global database cluster can't be deleted when deletion protection is enabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The DB cluster identifier for the global cluster being modified. This parameter isn't case-sensitive.  Constraints:   Must match the identifier of an existing global database cluster.  
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
  /**
    *  The new cluster identifier for the global database cluster when modifying a global database cluster. This value is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   The first character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2 
    */
  var NewGlobalClusterIdentifier: js.UndefOr[String] = js.native
}

object ModifyGlobalClusterMessage {
  @scala.inline
  def apply(): ModifyGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyGlobalClusterMessage]
  }
  @scala.inline
  implicit class ModifyGlobalClusterMessageOps[Self <: ModifyGlobalClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletionProtection(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withNewGlobalClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewGlobalClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewGlobalClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewGlobalClusterIdentifier")(js.undefined)
        ret
    }
  }
  
}

