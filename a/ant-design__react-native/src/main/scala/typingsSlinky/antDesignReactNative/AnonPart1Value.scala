package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPart1Value extends js.Object {
  var part1Value: Double = js.native
  var part2Value: Double = js.native
}

object AnonPart1Value {
  @scala.inline
  def apply(part1Value: Double, part2Value: Double): AnonPart1Value = {
    val __obj = js.Dynamic.literal(part1Value = part1Value.asInstanceOf[js.Any], part2Value = part2Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPart1Value]
  }
  @scala.inline
  implicit class AnonPart1ValueOps[Self <: AnonPart1Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPart1Value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part1Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPart2Value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part2Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

