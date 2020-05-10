package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExplanation extends js.Object {
  /** A text explaining why this volume is recommended. */
  var explanation: js.UndefOr[String] = js.native
}

object AnonExplanation {
  @scala.inline
  def apply(): AnonExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExplanation]
  }
  @scala.inline
  implicit class AnonExplanationOps[Self <: AnonExplanation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplanation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explanation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplanation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explanation")(js.undefined)
        ret
    }
  }
  
}

