package typingsSlinky.reactElemental.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bold extends js.Object {
  val bold: js.UndefOr[String] = js.native
  val regular: js.UndefOr[String] = js.native
}

object Bold {
  @scala.inline
  def apply(): Bold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bold]
  }
  @scala.inline
  implicit class BoldOps[Self <: Bold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(js.undefined)
        ret
    }
    @scala.inline
    def withRegular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regular")(js.undefined)
        ret
    }
  }
  
}

