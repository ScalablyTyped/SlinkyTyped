package typingsSlinky.coverup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var char: js.UndefOr[String] = js.native
  var compactTo: js.UndefOr[Double] = js.native
  var keepLeft: js.UndefOr[Double] = js.native
  var keepRight: js.UndefOr[Double] = js.native
  var keepSymbols: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withCompactTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactTo")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepRight")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepSymbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSymbols")(js.undefined)
        ret
    }
  }
  
}

