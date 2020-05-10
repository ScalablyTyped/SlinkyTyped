package typingsSlinky.awsSdkClientS3Node.typesLoggingEnabledMod

import typingsSlinky.awsSdkClientS3Node.typesTargetGrantMod.UnmarshalledTargetGrant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledLoggingEnabled extends LoggingEnabled {
  /**
    * _TargetGrants shape
    */
  @JSName("TargetGrants")
  var TargetGrants_UnmarshalledLoggingEnabled: js.UndefOr[js.Array[UnmarshalledTargetGrant]] = js.native
}

object UnmarshalledLoggingEnabled {
  @scala.inline
  def apply(TargetBucket: String, TargetPrefix: String): UnmarshalledLoggingEnabled = {
    val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLoggingEnabled]
  }
  @scala.inline
  implicit class UnmarshalledLoggingEnabledOps[Self <: UnmarshalledLoggingEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetGrants(value: js.Array[UnmarshalledTargetGrant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGrants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGrants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGrants")(js.undefined)
        ret
    }
  }
  
}

