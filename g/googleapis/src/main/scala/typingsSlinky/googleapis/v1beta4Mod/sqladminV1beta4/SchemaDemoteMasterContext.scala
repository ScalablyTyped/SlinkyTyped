package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance demote master context.
  */
@js.native
trait SchemaDemoteMasterContext extends js.Object {
  /**
    * This is always sql#demoteMasterContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the instance which will act as on-premises master in the
    * replication setup.
    */
  var masterInstanceName: js.UndefOr[String] = js.native
  /**
    * Configuration specific to read-replicas replicating from the on-premises
    * master.
    */
  var replicaConfiguration: js.UndefOr[SchemaDemoteMasterConfiguration] = js.native
  /**
    * Verify GTID consistency for demote operation. Default value: True. Second
    * Generation instances only. Setting this flag to false enables you to
    * bypass GTID consistency check between on-premises master and Cloud SQL
    * instance during the demotion operation but also exposes you to the risk
    * of future replication failures. Change the value only if you know the
    * reason for the GTID divergence and are confident that doing so will not
    * cause any replication issues.
    */
  var verifyGtidConsistency: js.UndefOr[Boolean] = js.native
}

object SchemaDemoteMasterContext {
  @scala.inline
  def apply(): SchemaDemoteMasterContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDemoteMasterContext]
  }
  @scala.inline
  implicit class SchemaDemoteMasterContextOps[Self <: SchemaDemoteMasterContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaConfiguration(value: SchemaDemoteMasterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyGtidConsistency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyGtidConsistency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyGtidConsistency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyGtidConsistency")(js.undefined)
        ret
    }
  }
  
}

