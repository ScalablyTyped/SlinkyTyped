package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.NamedItemScope
import typingsSlinky.officeJs.Excel.NamedItemType
import typingsSlinky.officeJs.officeJsStrings.Array
import typingsSlinky.officeJs.officeJsStrings.Boolean
import typingsSlinky.officeJs.officeJsStrings.Double
import typingsSlinky.officeJs.officeJsStrings.Error
import typingsSlinky.officeJs.officeJsStrings.Integer
import typingsSlinky.officeJs.officeJsStrings.Range
import typingsSlinky.officeJs.officeJsStrings.Workbook
import typingsSlinky.officeJs.officeJsStrings.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `namedItem.toJSON()`. */
trait NamedItemData extends js.Object {
  /**
    *
    * Returns an object containing values and types of the named item.
    *
    * [Api set: ExcelApi 1.7]
    */
  var arrayValues: js.UndefOr[NamedItemArrayValuesData] = js.undefined
  /**
    *
    * Specifies the comment associated with this name.
    *
    * [Api set: ExcelApi 1.4]
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    *
    * The formula of the named item. Formula always starts with a '=' sign.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formula: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * The name of the object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies if the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook.
    *
    * [Api set: ExcelApi 1.4]
    */
  var scope: js.UndefOr[NamedItemScope | Worksheet | Workbook] = js.undefined
  /**
    *
    * Specifies the type of the value returned by the name's formula. See Excel.NamedItemType for details.
    *
    * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
    */
  var `type`: js.UndefOr[
    NamedItemType | typingsSlinky.officeJs.officeJsStrings.String | Integer | Double | Boolean | Range | Error | Array
  ] = js.undefined
  /**
    *
    * Represents the value computed by the name's formula. For a named range, will return the range address.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * Specifies if the object is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object NamedItemData {
  @scala.inline
  def apply(
    arrayValues: NamedItemArrayValuesData = null,
    comment: String = null,
    formula: js.Any = null,
    name: String = null,
    scope: NamedItemScope | Worksheet | Workbook = null,
    `type`: NamedItemType | typingsSlinky.officeJs.officeJsStrings.String | Integer | Double | Boolean | Range | Error | Array = null,
    value: js.Any = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): NamedItemData = {
    val __obj = js.Dynamic.literal()
    if (arrayValues != null) __obj.updateDynamic("arrayValues")(arrayValues.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedItemData]
  }
}

