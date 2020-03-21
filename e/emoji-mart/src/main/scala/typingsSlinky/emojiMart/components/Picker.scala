package typingsSlinky.emojiMart.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.CustomEmoji
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typingsSlinky.emojiMart.pickerMod.default
import typingsSlinky.emojiMart.sharedPropsMod.CategoryName
import typingsSlinky.emojiMart.sharedPropsMod.CustomIcons
import typingsSlinky.emojiMart.sharedPropsMod.EmojiSet
import typingsSlinky.emojiMart.sharedPropsMod.EmojiSheetSize
import typingsSlinky.emojiMart.sharedPropsMod.PartialI18n
import typingsSlinky.emojiMart.sharedPropsMod.PickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Picker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("emoji-mart/dist-es/components/picker/picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, style, title */
  def apply(
    backgroundImageFn: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String = null,
    color: String = null,
    custom: js.Array[CustomEmoji] = null,
    darkMode: js.UndefOr[Boolean] = js.undefined,
    defaultSkin: EmojiSkin = null,
    emoji: String = null,
    emojiSize: Int | Double = null,
    emojiTooltip: js.UndefOr[Boolean] = js.undefined,
    emojisToShowFilter: /* emoji */ EmojiData => Boolean = null,
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
    perLine: Int | Double = null,
    recent: js.Array[String] = null,
    set: EmojiSet = null,
    sheetSize: EmojiSheetSize = null,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    showSkinTones: js.UndefOr[Boolean] = js.undefined,
    skin: EmojiSkin = null,
    skinEmoji: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageFn != null) __obj.updateDynamic("backgroundImageFn")(js.Any.fromFunction2(backgroundImageFn))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(darkMode)) __obj.updateDynamic("darkMode")(darkMode.asInstanceOf[js.Any])
    if (defaultSkin != null) __obj.updateDynamic("defaultSkin")(defaultSkin.asInstanceOf[js.Any])
    if (emoji != null) __obj.updateDynamic("emoji")(emoji.asInstanceOf[js.Any])
    if (emojiSize != null) __obj.updateDynamic("emojiSize")(emojiSize.asInstanceOf[js.Any])
    if (!js.isUndefined(emojiTooltip)) __obj.updateDynamic("emojiTooltip")(emojiTooltip.asInstanceOf[js.Any])
    if (emojisToShowFilter != null) __obj.updateDynamic("emojisToShowFilter")(js.Any.fromFunction1(emojisToShowFilter))
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (notFound != null) __obj.updateDynamic("notFound")(js.Any.fromFunction0(notFound))
    if (notFoundEmoji != null) __obj.updateDynamic("notFoundEmoji")(notFoundEmoji.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSkinChange != null) __obj.updateDynamic("onSkinChange")(js.Any.fromFunction1(onSkinChange))
    if (perLine != null) __obj.updateDynamic("perLine")(perLine.asInstanceOf[js.Any])
    if (recent != null) __obj.updateDynamic("recent")(recent.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (sheetSize != null) __obj.updateDynamic("sheetSize")(sheetSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview.asInstanceOf[js.Any])
    if (!js.isUndefined(showSkinTones)) __obj.updateDynamic("showSkinTones")(showSkinTones.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (skinEmoji != null) __obj.updateDynamic("skinEmoji")(skinEmoji.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.emojiMart.pickerMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PickerProps
}

