package typingsSlinky.postmark.suppressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suppression extends js.Object {
  var CreatedAt: String = js.native
  var EmailAddress: String = js.native
  var Origin: String = js.native
  var SuppressionReason: String = js.native
}

object Suppression {
  @scala.inline
  def apply(CreatedAt: String, EmailAddress: String, Origin: String, SuppressionReason: String): Suppression = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], SuppressionReason = SuppressionReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suppression]
  }
  @scala.inline
  implicit class SuppressionOps[Self <: Suppression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressionReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuppressionReason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

