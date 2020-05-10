package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBeaconsAttachmentsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Beacon whose attachments should be fetched. A beacon name has the format
    * "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the
    * beacon and N is a code for the beacon's type. Possible values are `3` for
    * Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for
    * AltBeacon. For Eddystone-EID beacons, you may use either the current EID
    * or the beacon's "stable" UID. Required.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * Specifies the namespace and type of attachment to include in response in
    * <var>namespace/type</var> format. Accepts `x/x` to specify "all types in
    * all namespaces".
    */
  var namespacedType: js.UndefOr[String] = js.native
  /**
    * The project id to list beacon attachments under. This field can be used
    * when "*" is specified to mean all attachment namespaces. Projects may
    * have multiple attachments with multiple namespaces. If "*" is specified
    * and the projectId string is empty, then the project making the request is
    * used. Optional.
    */
  var projectId: js.UndefOr[String] = js.native
}

object ParamsResourceBeaconsAttachmentsList {
  @scala.inline
  def apply(): ParamsResourceBeaconsAttachmentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBeaconsAttachmentsList]
  }
  @scala.inline
  implicit class ParamsResourceBeaconsAttachmentsListOps[Self <: ParamsResourceBeaconsAttachmentsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconName")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespacedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespacedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacedType")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
  }
  
}

