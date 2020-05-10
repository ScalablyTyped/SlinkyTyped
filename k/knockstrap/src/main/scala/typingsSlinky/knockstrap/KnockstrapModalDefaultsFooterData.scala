package typingsSlinky.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapModalDefaultsFooterData extends js.Object {
  var closeLabel: String = js.native
  var primaryLabel: String = js.native
}

object KnockstrapModalDefaultsFooterData {
  @scala.inline
  def apply(closeLabel: String, primaryLabel: String): KnockstrapModalDefaultsFooterData = {
    val __obj = js.Dynamic.literal(closeLabel = closeLabel.asInstanceOf[js.Any], primaryLabel = primaryLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapModalDefaultsFooterData]
  }
  @scala.inline
  implicit class KnockstrapModalDefaultsFooterDataOps[Self <: KnockstrapModalDefaultsFooterData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

