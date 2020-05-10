package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagersSetTargetPoolsRequest extends js.Object {
  /**
    * The fingerprint of the target pools information. Use this optional
    * property to prevent conflicts when multiple users change the target pools
    * settings concurrently. Obtain the fingerprint with the
    * instanceGroupManagers.get method. Then, include the fingerprint in your
    * request to ensure that you do not overwrite changes that were applied
    * from another concurrent request.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The list of target pool URLs that instances in this managed instance
    * group belong to. The managed instance group applies these target pools to
    * all of the instances in the group. Existing instances and new instances
    * in the group all receive these target pool settings.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.native
}

object SchemaInstanceGroupManagersSetTargetPoolsRequest {
  @scala.inline
  def apply(): SchemaInstanceGroupManagersSetTargetPoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersSetTargetPoolsRequest]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagersSetTargetPoolsRequestOps[Self <: SchemaInstanceGroupManagersSetTargetPoolsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPools(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPools")(js.undefined)
        ret
    }
  }
  
}

