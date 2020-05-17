package typingsSlinky.postmark.suppressionMod

import typingsSlinky.postmark.anon.EmailAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuppressionEntries extends js.Object {
  var Suppressions: js.Array[EmailAddress] = js.native
}

object SuppressionEntries {
  @scala.inline
  def apply(Suppressions: js.Array[EmailAddress]): SuppressionEntries = {
    val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressionEntries]
  }
  @scala.inline
  implicit class SuppressionEntriesOps[Self <: SuppressionEntries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuppressions(value: js.Array[EmailAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Suppressions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

