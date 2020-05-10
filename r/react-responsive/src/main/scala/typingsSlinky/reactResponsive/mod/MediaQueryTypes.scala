package typingsSlinky.reactResponsive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQueryTypes extends js.Object {
  var all: js.UndefOr[Boolean] = js.native
  var aural: js.UndefOr[Boolean] = js.native
  var braille: js.UndefOr[Boolean] = js.native
  var embossed: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[Boolean] = js.native
  var handheld: js.UndefOr[Boolean] = js.native
  var print: js.UndefOr[Boolean] = js.native
  var projection: js.UndefOr[Boolean] = js.native
  var screen: js.UndefOr[Boolean] = js.native
  var tty: js.UndefOr[Boolean] = js.native
  var tv: js.UndefOr[Boolean] = js.native
}

object MediaQueryTypes {
  @scala.inline
  def apply(): MediaQueryTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryTypes]
  }
  @scala.inline
  implicit class MediaQueryTypesOps[Self <: MediaQueryTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withAural(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aural")(js.undefined)
        ret
    }
    @scala.inline
    def withBraille(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braille")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBraille: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braille")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbossed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embossed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbossed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embossed")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHandheld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handheld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandheld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handheld")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(js.undefined)
        ret
    }
    @scala.inline
    def withTty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tty")(js.undefined)
        ret
    }
    @scala.inline
    def withTv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tv")(js.undefined)
        ret
    }
  }
  
}

