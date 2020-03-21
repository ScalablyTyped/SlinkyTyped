package typingsSlinky.emojiMart.sharedPropsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmojiProps extends js.Object {
  /** defaults to returning a png from unpkg.com-hosted emoji-datasource-${set} */
  var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.undefined
  var emoji: String | EmojiData
  var fallback: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* props */ this.type, ReactComponentClass[js.Object]]
  ] = js.undefined
  var forceSize: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var native: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.undefined
  var onLeave: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.undefined
  var onOver: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.undefined
  /** defaults to 'apple' */
  var set: js.UndefOr[EmojiSet] = js.undefined
  /** defaults to 52 */
  var sheetColumns: js.UndefOr[Double] = js.undefined
  /** defaults to 52 */
  var sheetRows: js.UndefOr[Double] = js.undefined
  /** defaults to 64 */
  var sheetSize: js.UndefOr[EmojiSheetSize] = js.undefined
  var size: Double
  /** defaults to 1 */
  var skin: js.UndefOr[EmojiSkin] = js.undefined
  var tooltip: js.UndefOr[Boolean] = js.undefined
}

object EmojiProps {
  @scala.inline
  def apply(
    emoji: String | EmojiData,
    size: Double,
    backgroundImageFn: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String = null,
    fallback: (/* emoji */ EmojiData, EmojiProps) => ReactComponentClass[js.Object] = null,
    forceSize: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined,
    native: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onLeave: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onOver: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    set: EmojiSet = null,
    sheetColumns: Int | Double = null,
    sheetRows: Int | Double = null,
    sheetSize: EmojiSheetSize = null,
    skin: EmojiSkin = null,
    tooltip: js.UndefOr[Boolean] = js.undefined
  ): EmojiProps = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (backgroundImageFn != null) __obj.updateDynamic("backgroundImageFn")(js.Any.fromFunction2(backgroundImageFn))
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction2(fallback))
    if (!js.isUndefined(forceSize)) __obj.updateDynamic("forceSize")(forceSize.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction2(onLeave))
    if (onOver != null) __obj.updateDynamic("onOver")(js.Any.fromFunction2(onOver))
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (sheetColumns != null) __obj.updateDynamic("sheetColumns")(sheetColumns.asInstanceOf[js.Any])
    if (sheetRows != null) __obj.updateDynamic("sheetRows")(sheetRows.asInstanceOf[js.Any])
    if (sheetSize != null) __obj.updateDynamic("sheetSize")(sheetSize.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiProps]
  }
}

