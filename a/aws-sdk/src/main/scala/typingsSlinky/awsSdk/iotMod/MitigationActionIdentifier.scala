package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MitigationActionIdentifier extends js.Object {
  /**
    * The IAM role ARN used to apply this mitigation action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.native
  /**
    * The friendly name of the mitigation action.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.native
  /**
    * The date when this mitigation action was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
}

object MitigationActionIdentifier {
  @scala.inline
  def apply(): MitigationActionIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MitigationActionIdentifier]
  }
  @scala.inline
  implicit class MitigationActionIdentifierOps[Self <: MitigationActionIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionArn(value: MitigationActionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withActionName(value: MitigationActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
  }
  
}

