package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lower extends js.Object {
  var lower: js.UndefOr[String] = js.native
  var upper: js.UndefOr[String] = js.native
}

object Lower {
  @scala.inline
  def apply(): Lower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lower]
  }
  @scala.inline
  implicit class LowerOps[Self <: Lower] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLower(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(js.undefined)
        ret
    }
    @scala.inline
    def withUpper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper")(js.undefined)
        ret
    }
  }
  
}

