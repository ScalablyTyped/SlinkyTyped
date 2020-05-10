package typingsSlinky.pulumiKubernetes.inputMod.meta.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatusDetails is a set of additional properties that MAY be set by the server to provide
  * additional information about a response. The Reason field of a Status object defines what
  * attributes will be set. Clients must ignore fields that do not match the defined type of each
  * attribute, and should assume that any attribute may be empty, invalid, or under defined.
  */
@js.native
trait StatusDetails extends js.Object {
  /**
    * The Causes array includes more details associated with the StatusReason failure. Not all
    * StatusReasons may provide detailed causes.
    */
  var causes: js.UndefOr[Input[js.Array[Input[StatusCause]]]] = js.native
  /**
    * The group attribute of the resource associated with the status StatusReason.
    */
  var group: js.UndefOr[Input[String]] = js.native
  /**
    * The kind attribute of the resource associated with the status StatusReason. On some
    * operations may differ from the requested resource Kind. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.native
  /**
    * The name attribute of the resource associated with the status StatusReason (when there is a
    * single name which can be described).
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * If specified, the time in seconds before the operation should be retried. Some errors may
    * indicate the client must take an alternate action - for those errors this field may
    * indicate how long to wait before taking the alternate action.
    */
  var retryAfterSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * UID of the resource. (when there is a single resource which can be described). More info:
    * http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: js.UndefOr[Input[String]] = js.native
}

object StatusDetails {
  @scala.inline
  def apply(): StatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusDetails]
  }
  @scala.inline
  implicit class StatusDetailsOps[Self <: StatusDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCauses(value: Input[js.Array[Input[StatusCause]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCauses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causes")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: Input[String]): Self = {
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
    def withName(value: Input[String]): Self = {
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
    def withRetryAfterSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryAfterSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryAfterSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryAfterSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
  }
  
}

