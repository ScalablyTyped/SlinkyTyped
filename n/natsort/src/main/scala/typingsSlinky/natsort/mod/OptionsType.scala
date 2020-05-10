package typingsSlinky.natsort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsType extends js.Object {
  var desc: js.UndefOr[Boolean] = js.native
  var insensitive: js.UndefOr[Boolean] = js.native
}

object OptionsType {
  @scala.inline
  def apply(): OptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsType]
  }
  @scala.inline
  implicit class OptionsTypeOps[Self <: OptionsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
    @scala.inline
    def withInsensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insensitive")(js.undefined)
        ret
    }
  }
  
}

