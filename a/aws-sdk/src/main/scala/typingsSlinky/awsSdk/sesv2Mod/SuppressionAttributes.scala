package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuppressionAttributes extends js.Object {
  /**
    * A list that contains the reasons that email addresses will be automatically added to the suppression list for your account. This list can contain any or all of the following:    COMPLAINT – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a complaint.    BOUNCE – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a hard bounce.  
    */
  var SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.native
}

object SuppressionAttributes {
  @scala.inline
  def apply(): SuppressionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressionAttributes]
  }
  @scala.inline
  implicit class SuppressionAttributesOps[Self <: SuppressionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuppressedReasons(value: SuppressionListReasons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuppressedReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressedReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuppressedReasons")(js.undefined)
        ret
    }
  }
  
}

