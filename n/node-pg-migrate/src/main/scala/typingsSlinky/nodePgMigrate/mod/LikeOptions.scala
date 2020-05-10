package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LikeOptions extends js.Object {
  var excluding: js.UndefOr[Like | js.Array[Like]] = js.native
  var including: js.UndefOr[Like | js.Array[Like]] = js.native
}

object LikeOptions {
  @scala.inline
  def apply(): LikeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LikeOptions]
  }
  @scala.inline
  implicit class LikeOptionsOps[Self <: LikeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcluding(value: Like | js.Array[Like]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcluding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluding")(js.undefined)
        ret
    }
    @scala.inline
    def withIncluding(value: Like | js.Array[Like]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("including")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncluding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("including")(js.undefined)
        ret
    }
  }
  
}

