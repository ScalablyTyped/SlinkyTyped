package typingsSlinky.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var font: js.UndefOr[Fonts_] = js.native
  var horizontalLayout: js.UndefOr[KerningMethods] = js.native
  var printDirection: js.UndefOr[PrintDirection] = js.native
  var showHardBlanks: js.UndefOr[Boolean] = js.native
  var verticalLayout: js.UndefOr[KerningMethods] = js.native
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
    def withFont(value: Fonts_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalLayout(value: KerningMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintDirection(value: PrintDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHardBlanks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHardBlanks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHardBlanks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHardBlanks")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLayout(value: KerningMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLayout")(js.undefined)
        ret
    }
  }
  
}

