package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.breakWord
import typingsSlinky.devextreme.devextremeStrings.columns
import typingsSlinky.devextreme.devextremeStrings.ellipsis
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.inside
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.devextremeStrings.outside
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connector extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  var connector: js.UndefOr[ColorOpacity] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ Percent, String]] = js.undefined
  var font: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.viz.Font] = js.undefined
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.undefined
  var horizontalAlignment: js.UndefOr[left | right] = js.undefined
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[columns | inside | outside] = js.undefined
  var showForZeroValues: js.UndefOr[Boolean] = js.undefined
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}

object Connector {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: ColorDashStyle = null,
    connector: ColorOpacity = null,
    customizeText: /* itemInfo */ Percent => String = null,
    font: typingsSlinky.devextreme.mod.DevExpress.viz.Font = null,
    format: format = null,
    horizontalAlignment: left | right = null,
    horizontalOffset: js.UndefOr[Double] = js.undefined,
    position: columns | inside | outside = null,
    showForZeroValues: js.UndefOr[Boolean] = js.undefined,
    textOverflow: ellipsis | hide | none = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wordWrap: normal | breakWord | none = null
  ): Connector = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOffset)) __obj.updateDynamic("horizontalOffset")(horizontalOffset.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showForZeroValues)) __obj.updateDynamic("showForZeroValues")(showForZeroValues.get.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connector]
  }
}

