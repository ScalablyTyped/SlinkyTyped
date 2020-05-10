package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlScore extends js.Object {
  // Control action category (Identity, Data, Device, Apps, Infrastructure).
  var controlCategory: js.UndefOr[String] = js.native
  // Control unique name.
  var controlName: js.UndefOr[String] = js.native
  // Description of the control.
  var description: js.UndefOr[String] = js.native
  // Tenant achieved score for the control (it varies day by day depending on tenant operations on the control).
  var score: js.UndefOr[Double] = js.native
}

object ControlScore {
  @scala.inline
  def apply(): ControlScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlScore]
  }
  @scala.inline
  implicit class ControlScoreOps[Self <: ControlScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withControlName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlName")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
        ret
    }
  }
  
}

