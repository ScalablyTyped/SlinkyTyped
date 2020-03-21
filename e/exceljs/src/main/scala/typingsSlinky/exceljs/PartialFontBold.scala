package typingsSlinky.exceljs

import typingsSlinky.exceljs.exceljsStrings.double
import typingsSlinky.exceljs.exceljsStrings.doubleAccounting
import typingsSlinky.exceljs.exceljsStrings.major
import typingsSlinky.exceljs.exceljsStrings.minor
import typingsSlinky.exceljs.exceljsStrings.none_
import typingsSlinky.exceljs.exceljsStrings.single
import typingsSlinky.exceljs.exceljsStrings.singleAccounting
import typingsSlinky.exceljs.exceljsStrings.subscript
import typingsSlinky.exceljs.exceljsStrings.superscript
import typingsSlinky.exceljs.mod.Color
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Font> */
trait PartialFontBold extends js.Object {
  var bold: js.UndefOr[Boolean] = js.undefined
  var charset: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Partial[Color]] = js.undefined
  var family: js.UndefOr[Double] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var scheme: js.UndefOr[minor | major | none_] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var strike: js.UndefOr[Boolean] = js.undefined
  var underline: js.UndefOr[Boolean | none_ | single | double | singleAccounting | doubleAccounting] = js.undefined
  var vertAlign: js.UndefOr[superscript | subscript] = js.undefined
}

object PartialFontBold {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    charset: Int | Double = null,
    color: Partial[Color] = null,
    family: Int | Double = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    outline: js.UndefOr[Boolean] = js.undefined,
    scheme: minor | major | none_ = null,
    size: Int | Double = null,
    strike: js.UndefOr[Boolean] = js.undefined,
    underline: Boolean | none_ | single | double | singleAccounting | doubleAccounting = null,
    vertAlign: superscript | subscript = null
  ): PartialFontBold = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strike)) __obj.updateDynamic("strike")(strike.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (vertAlign != null) __obj.updateDynamic("vertAlign")(vertAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFontBold]
  }
}

