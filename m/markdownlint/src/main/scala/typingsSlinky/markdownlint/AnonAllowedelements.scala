package typingsSlinky.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowedelements extends js.Object {
  var allowed_elements: js.UndefOr[js.Array[String]] = js.native
}

object AnonAllowedelements {
  @scala.inline
  def apply(): AnonAllowedelements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowedelements]
  }
  @scala.inline
  implicit class AnonAllowedelementsOps[Self <: AnonAllowedelements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed_elements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_elements")(js.undefined)
        ret
    }
  }
  
}

