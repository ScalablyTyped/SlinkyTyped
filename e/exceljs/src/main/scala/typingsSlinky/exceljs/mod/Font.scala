package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.PartialColor
import typingsSlinky.exceljs.exceljsStrings.double
import typingsSlinky.exceljs.exceljsStrings.doubleAccounting
import typingsSlinky.exceljs.exceljsStrings.major
import typingsSlinky.exceljs.exceljsStrings.minor
import typingsSlinky.exceljs.exceljsStrings.none_
import typingsSlinky.exceljs.exceljsStrings.single
import typingsSlinky.exceljs.exceljsStrings.singleAccounting
import typingsSlinky.exceljs.exceljsStrings.subscript
import typingsSlinky.exceljs.exceljsStrings.superscript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var bold: Boolean
  var charset: Double
  var color: PartialColor
  var family: Double
  var italic: Boolean
  var name: String
  var outline: Boolean
  var scheme: minor | major | none_
  var size: Double
  var strike: Boolean
  var underline: Boolean | none_ | single | double | singleAccounting | doubleAccounting
  var vertAlign: superscript | subscript
}

object Font {
  @scala.inline
  def apply(
    bold: Boolean,
    charset: Double,
    color: PartialColor,
    family: Double,
    italic: Boolean,
    name: String,
    outline: Boolean,
    scheme: minor | major | none_,
    size: Double,
    strike: Boolean,
    underline: Boolean | none_ | single | double | singleAccounting | doubleAccounting,
    vertAlign: superscript | subscript
  ): Font = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strike = strike.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], vertAlign = vertAlign.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Font]
  }
}

