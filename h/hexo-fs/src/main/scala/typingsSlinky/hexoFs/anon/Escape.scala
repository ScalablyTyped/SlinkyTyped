package typingsSlinky.hexoFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Escape extends js.Object {
  var encoding: js.UndefOr[String] = js.native
  var escape: js.UndefOr[Boolean] = js.native
  var flag: js.UndefOr[String] = js.native
}

object Escape {
  @scala.inline
  def apply(): Escape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Escape]
  }
  @scala.inline
  implicit class EscapeOps[Self <: Escape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(js.undefined)
        ret
    }
  }
  
}

