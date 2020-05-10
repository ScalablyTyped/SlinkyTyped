package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAssociation extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * Version information for the association on the instance.
    */
  var AssociationVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * The content of the association document for the instance(s).
    */
  var Content: js.UndefOr[DocumentContent] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceId] = js.native
}

object InstanceAssociation {
  @scala.inline
  def apply(): InstanceAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociation]
  }
  @scala.inline
  implicit class InstanceAssociationOps[Self <: InstanceAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationId(value: AssociationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociationVersion(value: AssociationVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: DocumentContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
  }
  
}

