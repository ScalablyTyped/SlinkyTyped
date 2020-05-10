package typingsSlinky.openfin

import typingsSlinky.openfin.openfinStrings.clean
import typingsSlinky.openfin.openfinStrings.failed
import typingsSlinky.openfin.openfinStrings.terminated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResult extends js.Object {
  var result: clean | terminated | failed = js.native
}

object AnonResult {
  @scala.inline
  def apply(result: clean | terminated | failed): AnonResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResult]
  }
  @scala.inline
  implicit class AnonResultOps[Self <: AnonResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: clean | terminated | failed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

