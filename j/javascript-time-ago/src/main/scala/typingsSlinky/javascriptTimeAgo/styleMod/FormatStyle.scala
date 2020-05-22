package typingsSlinky.javascriptTimeAgo.styleMod

import typingsSlinky.javascriptTimeAgo.gradationMod.Gradation
import typingsSlinky.javascriptTimeAgo.gradationMod.Unit
import typingsSlinky.javascriptTimeAgo.localeMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatStyle extends js.Object {
  var custom: js.UndefOr[CustomFormatter] = js.undefined
  var flavour: js.UndefOr[js.Array[Flavour]] = js.undefined
  var format: js.UndefOr[js.Function2[/* date */ js.Date | Double, /* locale */ Locale, String]] = js.undefined
  var gradation: js.UndefOr[js.Array[Gradation]] = js.undefined
  var units: js.UndefOr[Unit] = js.undefined
}

object FormatStyle {
  @scala.inline
  def apply(
    custom: /* options */ CustomFormatterOptions => js.UndefOr[String] = null,
    flavour: js.Array[Flavour] = null,
    format: (/* date */ js.Date | Double, /* locale */ Locale) => String = null,
    gradation: js.Array[Gradation] = null,
    units: Unit = null
  ): FormatStyle = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(js.Any.fromFunction1(custom))
    if (flavour != null) __obj.updateDynamic("flavour")(flavour.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (gradation != null) __obj.updateDynamic("gradation")(gradation.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatStyle]
  }
}

