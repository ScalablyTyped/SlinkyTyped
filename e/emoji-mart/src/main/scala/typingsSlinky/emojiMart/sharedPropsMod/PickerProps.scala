package typingsSlinky.emojiMart.sharedPropsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.CustomEmoji
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.native
  var color: js.UndefOr[String] = js.native
  /** NOTE: custom emoji are copied into a singleton object on every new mount */
  var custom: js.UndefOr[js.Array[CustomEmoji]] = js.native
  var darkMode: js.UndefOr[Boolean] = js.native
  var defaultSkin: js.UndefOr[EmojiSkin] = js.native
  var emoji: js.UndefOr[String] = js.native
  var emojiSize: js.UndefOr[Double] = js.native
  var emojiTooltip: js.UndefOr[Boolean] = js.native
  var emojisToShowFilter: js.UndefOr[js.Function1[/* emoji */ EmojiData, Boolean]] = js.native
  var exclude: js.UndefOr[js.Array[CategoryName]] = js.native
  var i18n: js.UndefOr[PartialI18n] = js.native
  var icons: js.UndefOr[CustomIcons] = js.native
  var include: js.UndefOr[js.Array[CategoryName]] = js.native
  var native: js.UndefOr[Boolean] = js.native
  var notFound: js.UndefOr[js.Function0[ReactComponentClass[js.Object]]] = js.native
  var notFoundEmoji: js.UndefOr[String] = js.native
  /** NOTE: default is not preventable */
  var onClick: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.native
  var onSelect: js.UndefOr[js.Function1[/* emoji */ EmojiData, Unit]] = js.native
  var onSkinChange: js.UndefOr[js.Function1[/* skin */ EmojiSkin, Unit]] = js.native
  var perLine: js.UndefOr[Double] = js.native
  var recent: js.UndefOr[js.Array[String]] = js.native
  var set: js.UndefOr[EmojiSet] = js.native
  var sheetSize: js.UndefOr[EmojiSheetSize] = js.native
  var showPreview: js.UndefOr[Boolean] = js.native
  var showSkinTones: js.UndefOr[Boolean] = js.native
  var skin: js.UndefOr[EmojiSkin] = js.native
  var skinEmoji: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[String] = js.native
}

object PickerProps {
  @scala.inline
  def apply(): PickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerProps]
  }
  @scala.inline
  implicit class PickerPropsOps[Self <: PickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBackgroundImageFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageFn")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: js.Array[CustomEmoji]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withDarkMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDarkMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSkin(value: EmojiSkin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSkin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSkin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSkin")(js.undefined)
        ret
    }
    @scala.inline
    def withEmoji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmoji: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(js.undefined)
        ret
    }
    @scala.inline
    def withEmojiSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojiSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmojiSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojiSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEmojiTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojiTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmojiTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojiTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withEmojisToShowFilter(value: /* emoji */ EmojiData => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojisToShowFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEmojisToShowFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojisToShowFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[CategoryName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: PartialI18n): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: CustomIcons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[CategoryName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFound(value: () => ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFoundEmoji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundEmoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundEmoji: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundEmoji")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* emoji */ EmojiData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSkinChange(value: /* skin */ EmojiSkin => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSkinChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSkinChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSkinChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPerLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perLine")(js.undefined)
        ret
    }
    @scala.inline
    def withRecent(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recent")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: EmojiSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetSize(value: EmojiSheetSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSkinTones(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkinTones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSkinTones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkinTones")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin(value: EmojiSkin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(js.undefined)
        ret
    }
    @scala.inline
    def withSkinEmoji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinEmoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkinEmoji: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinEmoji")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

