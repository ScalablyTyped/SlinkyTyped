package typingsSlinky.pad.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Char extends js.Object {
  var char: js.UndefOr[String] = js.native
  var colors: js.UndefOr[Boolean] = js.native
  var strip: js.UndefOr[Boolean] = js.native
}

object Char {
  @scala.inline
  def apply(): Char = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Char]
  }
  @scala.inline
  implicit class CharOps[Self <: Char] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("char")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withStrip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(js.undefined)
        ret
    }
  }
  
}

