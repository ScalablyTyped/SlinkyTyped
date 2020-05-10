package typingsSlinky.jshamcrest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttachAssertions extends js.Object {
  var attachAssertions: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[js.Object] = js.native
}

object AnonAttachAssertions {
  @scala.inline
  def apply(): AnonAttachAssertions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAttachAssertions]
  }
  @scala.inline
  implicit class AnonAttachAssertionsOps[Self <: AnonAttachAssertions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachAssertions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachAssertions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachAssertions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachAssertions")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

