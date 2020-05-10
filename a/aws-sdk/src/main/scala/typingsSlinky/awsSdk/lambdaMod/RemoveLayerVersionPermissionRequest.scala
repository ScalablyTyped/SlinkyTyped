package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveLayerVersionPermissionRequest extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typingsSlinky.awsSdk.lambdaMod.LayerName = js.native
  /**
    * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * The identifier that was specified when the statement was added.
    */
  var StatementId: typingsSlinky.awsSdk.lambdaMod.StatementId = js.native
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber = js.native
}

object RemoveLayerVersionPermissionRequest {
  @scala.inline
  def apply(LayerName: LayerName, StatementId: StatementId, VersionNumber: LayerVersionNumber): RemoveLayerVersionPermissionRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveLayerVersionPermissionRequest]
  }
  @scala.inline
  implicit class RemoveLayerVersionPermissionRequestOps[Self <: RemoveLayerVersionPermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerName(value: LayerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatementId(value: StatementId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionNumber(value: LayerVersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(js.undefined)
        ret
    }
  }
  
}

