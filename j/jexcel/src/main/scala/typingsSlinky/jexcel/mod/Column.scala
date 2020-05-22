package typingsSlinky.jexcel.mod

import typingsSlinky.jexcel.jexcelStrings.autocomplete
import typingsSlinky.jexcel.jexcelStrings.calendar
import typingsSlinky.jexcel.jexcelStrings.center
import typingsSlinky.jexcel.jexcelStrings.checkbox
import typingsSlinky.jexcel.jexcelStrings.color
import typingsSlinky.jexcel.jexcelStrings.dropdown
import typingsSlinky.jexcel.jexcelStrings.hidden
import typingsSlinky.jexcel.jexcelStrings.html
import typingsSlinky.jexcel.jexcelStrings.image
import typingsSlinky.jexcel.jexcelStrings.left
import typingsSlinky.jexcel.jexcelStrings.numeric
import typingsSlinky.jexcel.jexcelStrings.radio
import typingsSlinky.jexcel.jexcelStrings.right
import typingsSlinky.jexcel.jexcelStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /**
    * Default: "center"
    */
  var align: js.UndefOr[center | left | right] = js.undefined
  var autocomplete: js.UndefOr[Boolean] = js.undefined
  var decimal: js.UndefOr[String] = js.undefined
  var editor: js.UndefOr[ColumnEditor] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[CellValue] = js.undefined
  var options: js.UndefOr[CalendarOptions] = js.undefined
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var render: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[js.Array[SourceValue]] = js.undefined
  var title: js.UndefOr[CellValue] = js.undefined
  /**
    * @see https://bossanova.uk/jexcel/v4/examples/column-types
    */
  var `type`: js.UndefOr[
    autocomplete | calendar | checkbox | color | dropdown | hidden | html | image | numeric | radio | text
  ] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    align: center | left | right = null,
    autocomplete: js.UndefOr[Boolean] = js.undefined,
    decimal: String = null,
    editor: ColumnEditor = null,
    mask: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: CellValue = null,
    options: CalendarOptions = null,
    primaryKey: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    render: String = null,
    source: js.Array[SourceValue] = null,
    title: CellValue = null,
    `type`: autocomplete | calendar | checkbox | color | dropdown | hidden | html | image | numeric | radio | text = null,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined,
    wordWrap: js.UndefOr[Boolean] = js.undefined
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(autocomplete)) __obj.updateDynamic("autocomplete")(autocomplete.get.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrap)) __obj.updateDynamic("wordWrap")(wordWrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

