package typingsSlinky.blessed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bg extends js.Object {
  var bg: js.UndefOr[String] = js.native
  var fg: js.UndefOr[String] = js.native
}

object Bg {
  @scala.inline
  def apply(): Bg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bg]
  }
  @scala.inline
  implicit class BgOps[Self <: Bg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(js.undefined)
        ret
    }
    @scala.inline
    def withFg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fg")(js.undefined)
        ret
    }
  }
  
}

