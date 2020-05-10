package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An individual Replica within a Pool. Replicas are automatically created by
  * the replica pool, using the template provided by the user. You cannot
  * directly create replicas.
  */
@js.native
trait SchemaReplica extends js.Object {
  /**
    * [Output Only] The name of the Replica object.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] The self-link of the Replica.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Last known status of the Replica.
    */
  var status: js.UndefOr[SchemaReplicaStatus] = js.native
}

object SchemaReplica {
  @scala.inline
  def apply(): SchemaReplica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplica]
  }
  @scala.inline
  implicit class SchemaReplicaOps[Self <: SchemaReplica] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaReplicaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

