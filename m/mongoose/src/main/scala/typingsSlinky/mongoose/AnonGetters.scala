package typingsSlinky.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetters extends js.Object {
  var getters: js.UndefOr[Boolean] = js.native
  var virtuals: js.UndefOr[Boolean] = js.native
}

object AnonGetters {
  @scala.inline
  def apply(): AnonGetters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGetters]
  }
  @scala.inline
  implicit class AnonGettersOps[Self <: AnonGetters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtuals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtuals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtuals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtuals")(js.undefined)
        ret
    }
  }
  
}

