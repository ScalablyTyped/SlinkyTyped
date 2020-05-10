package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShouldFadeIn extends js.Object {
  var shouldFadeIn: Boolean = js.native
}

object AnonShouldFadeIn {
  @scala.inline
  def apply(shouldFadeIn: Boolean): AnonShouldFadeIn = {
    val __obj = js.Dynamic.literal(shouldFadeIn = shouldFadeIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShouldFadeIn]
  }
  @scala.inline
  implicit class AnonShouldFadeInOps[Self <: AnonShouldFadeIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShouldFadeIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFadeIn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

