package typingsSlinky.bson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRelaxed extends js.Object {
  var relaxed: js.UndefOr[Boolean] = js.native
}

object AnonRelaxed {
  @scala.inline
  def apply(): AnonRelaxed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRelaxed]
  }
  @scala.inline
  implicit class AnonRelaxedOps[Self <: AnonRelaxed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelaxed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaxed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelaxed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relaxed")(js.undefined)
        ret
    }
  }
  
}

