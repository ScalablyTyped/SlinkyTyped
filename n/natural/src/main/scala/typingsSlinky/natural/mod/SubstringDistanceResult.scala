package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubstringDistanceResult extends js.Object {
  var distance: Double = js.native
  var substring: String = js.native
}

object SubstringDistanceResult {
  @scala.inline
  def apply(distance: Double, substring: String): SubstringDistanceResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], substring = substring.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstringDistanceResult]
  }
  @scala.inline
  implicit class SubstringDistanceResultOps[Self <: SubstringDistanceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubstring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substring")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

