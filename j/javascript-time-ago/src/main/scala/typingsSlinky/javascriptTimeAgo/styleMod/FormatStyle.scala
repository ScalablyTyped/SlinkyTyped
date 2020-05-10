package typingsSlinky.javascriptTimeAgo.styleMod

import typingsSlinky.javascriptTimeAgo.gradationMod.Gradation
import typingsSlinky.javascriptTimeAgo.gradationMod.Unit
import typingsSlinky.javascriptTimeAgo.localeMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatStyle extends js.Object {
  var custom: js.UndefOr[CustomFormatter] = js.native
  var flavour: js.UndefOr[js.Array[Flavour]] = js.native
  var format: js.UndefOr[js.Function2[/* date */ js.Date | Double, /* locale */ Locale, String]] = js.native
  var gradation: js.UndefOr[js.Array[Gradation]] = js.native
  var units: js.UndefOr[Unit] = js.native
}

object FormatStyle {
  @scala.inline
  def apply(): FormatStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatStyle]
  }
  @scala.inline
  implicit class FormatStyleOps[Self <: FormatStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom(value: /* options */ CustomFormatterOptions => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withFlavour(value: js.Array[Flavour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flavour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlavour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flavour")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: (/* date */ js.Date | Double, /* locale */ Locale) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGradation(value: js.Array[Gradation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradation")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

