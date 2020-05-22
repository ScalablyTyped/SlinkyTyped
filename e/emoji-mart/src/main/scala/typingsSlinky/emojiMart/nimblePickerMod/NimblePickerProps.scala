package typingsSlinky.emojiMart.nimblePickerMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.emojiMart.dataMod.Data
import typingsSlinky.emojiMart.emojiMartStrings.auto
import typingsSlinky.emojiMart.emojiMartStrings.dark
import typingsSlinky.emojiMart.emojiMartStrings.light
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.CustomEmoji
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typingsSlinky.emojiMart.sharedPropsMod.CategoryName
import typingsSlinky.emojiMart.sharedPropsMod.CustomIcons
import typingsSlinky.emojiMart.sharedPropsMod.EmojiSet
import typingsSlinky.emojiMart.sharedPropsMod.EmojiSheetSize
import typingsSlinky.emojiMart.sharedPropsMod.PartialI18n
import typingsSlinky.emojiMart.sharedPropsMod.PickerProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NimblePickerProps extends PickerProps {
  var data: Data
}

object NimblePickerProps {
  @scala.inline
  def apply(
    data: Data,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backgroundImageFn: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String = null,
    color: String = null,
    custom: js.Array[CustomEmoji] = null,
    defaultSkin: EmojiSkin = null,
    emoji: String = null,
    emojiSize: js.UndefOr[Double] = js.undefined,
    emojiTooltip: js.UndefOr[Boolean] = js.undefined,
    emojisToShowFilter: /* emoji */ EmojiData => Boolean = null,
    enableFrequentEmojiSort: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[CategoryName] = null,
    i18n: PartialI18n = null,
    icons: CustomIcons = null,
    include: js.Array[CategoryName] = null,
    native: js.UndefOr[Boolean] = js.undefined,
    notFound: () => ReactComponentClass[js.Object] = null,
    notFoundEmoji: String = null,
    onClick: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onSelect: /* emoji */ EmojiData => Unit = null,
    onSkinChange: /* skin */ EmojiSkin => Unit = null,
    perLine: js.UndefOr[Double] = js.undefined,
    recent: js.Array[String] = null,
    set: EmojiSet = null,
    sheetSize: EmojiSheetSize = null,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    showSkinTones: js.UndefOr[Boolean] = js.undefined,
    skin: EmojiSkin = null,
    skinEmoji: String = null,
    style: CSSProperties = null,
    theme: auto | light | dark = null,
    title: String = null,
    useButton: js.UndefOr[Boolean] = js.undefined
  ): NimblePickerProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (backgroundImageFn != null) __obj.updateDynamic("backgroundImageFn")(js.Any.fromFunction2(backgroundImageFn))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (defaultSkin != null) __obj.updateDynamic("defaultSkin")(defaultSkin.asInstanceOf[js.Any])
    if (emoji != null) __obj.updateDynamic("emoji")(emoji.asInstanceOf[js.Any])
    if (!js.isUndefined(emojiSize)) __obj.updateDynamic("emojiSize")(emojiSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emojiTooltip)) __obj.updateDynamic("emojiTooltip")(emojiTooltip.get.asInstanceOf[js.Any])
    if (emojisToShowFilter != null) __obj.updateDynamic("emojisToShowFilter")(js.Any.fromFunction1(emojisToShowFilter))
    if (!js.isUndefined(enableFrequentEmojiSort)) __obj.updateDynamic("enableFrequentEmojiSort")(enableFrequentEmojiSort.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.get.asInstanceOf[js.Any])
    if (notFound != null) __obj.updateDynamic("notFound")(js.Any.fromFunction0(notFound))
    if (notFoundEmoji != null) __obj.updateDynamic("notFoundEmoji")(notFoundEmoji.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSkinChange != null) __obj.updateDynamic("onSkinChange")(js.Any.fromFunction1(onSkinChange))
    if (!js.isUndefined(perLine)) __obj.updateDynamic("perLine")(perLine.get.asInstanceOf[js.Any])
    if (recent != null) __obj.updateDynamic("recent")(recent.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (sheetSize != null) __obj.updateDynamic("sheetSize")(sheetSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSkinTones)) __obj.updateDynamic("showSkinTones")(showSkinTones.get.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (skinEmoji != null) __obj.updateDynamic("skinEmoji")(skinEmoji.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(useButton)) __obj.updateDynamic("useButton")(useButton.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NimblePickerProps]
  }
}

