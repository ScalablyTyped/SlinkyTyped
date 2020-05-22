package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.Bottom
import typingsSlinky.devextreme.anon.FontOffset
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.breakWord
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.ellipsis
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseWidget.Options.title */
trait BaseWidgetTitle extends js.Object {
  /** @name BaseWidget.Options.title.font */
  var font: js.UndefOr[Font] = js.undefined
  /** @name BaseWidget.Options.title.horizontalAlignment */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  /** @name BaseWidget.Options.title.margin */
  var margin: js.UndefOr[Double | Bottom] = js.undefined
  /** @name BaseWidget.Options.title.placeholderSize */
  var placeholderSize: js.UndefOr[Double] = js.undefined
  /** @name BaseWidget.Options.title.subtitle */
  var subtitle: js.UndefOr[FontOffset | String] = js.undefined
  /** @name BaseWidget.Options.title.text */
  var text: js.UndefOr[String] = js.undefined
  /** @name BaseWidget.Options.title.textOverflow */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  /** @name BaseWidget.Options.title.verticalAlignment */
  var verticalAlignment: js.UndefOr[bottom | top] = js.undefined
  /** @name BaseWidget.Options.title.wordWrap */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}

object BaseWidgetTitle {
  @scala.inline
  def apply(
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    margin: Double | Bottom = null,
    placeholderSize: js.UndefOr[Double] = js.undefined,
    subtitle: FontOffset | String = null,
    text: String = null,
    textOverflow: ellipsis | hide | none = null,
    verticalAlignment: bottom | top = null,
    wordWrap: normal | breakWord | none = null
  ): BaseWidgetTitle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(placeholderSize)) __obj.updateDynamic("placeholderSize")(placeholderSize.get.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetTitle]
  }
}

