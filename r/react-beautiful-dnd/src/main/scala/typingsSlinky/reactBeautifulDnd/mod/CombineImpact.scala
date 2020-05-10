package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.COMBINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombineImpact extends ImpactLocation {
  var combine: Combine = js.native
  var `type`: COMBINE = js.native
  var whenEntered: UserDirection = js.native
}

object CombineImpact {
  @scala.inline
  def apply(combine: Combine, `type`: COMBINE, whenEntered: UserDirection): CombineImpact = {
    val __obj = js.Dynamic.literal(combine = combine.asInstanceOf[js.Any], whenEntered = whenEntered.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombineImpact]
  }
  @scala.inline
  implicit class CombineImpactOps[Self <: CombineImpact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCombine(value: Combine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: COMBINE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhenEntered(value: UserDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenEntered")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

