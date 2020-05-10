package typingsSlinky.braftEditor.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.braftEditor.AnonFamily
import typingsSlinky.braftEditor.braftEditorStrings.`vi-vn`
import typingsSlinky.braftEditor.braftEditorStrings.`zh-hant`
import typingsSlinky.braftEditor.braftEditorStrings.center
import typingsSlinky.braftEditor.braftEditorStrings.en
import typingsSlinky.braftEditor.braftEditorStrings.fr
import typingsSlinky.braftEditor.braftEditorStrings.jpn
import typingsSlinky.braftEditor.braftEditorStrings.justify
import typingsSlinky.braftEditor.braftEditorStrings.kr
import typingsSlinky.braftEditor.braftEditorStrings.left
import typingsSlinky.braftEditor.braftEditorStrings.pl
import typingsSlinky.braftEditor.braftEditorStrings.right
import typingsSlinky.braftEditor.braftEditorStrings.ru
import typingsSlinky.braftEditor.braftEditorStrings.tr
import typingsSlinky.braftEditor.braftEditorStrings.zh
import typingsSlinky.immutable.Immutable.Map
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BraftEditorProps extends js.Object {
  var allowInsertLinkText: js.UndefOr[Boolean] = js.native
  var blockRenderMap: js.UndefOr[(Map[_, _]) | js.Function] = js.native
  var blockRendererFn: js.UndefOr[js.Function] = js.native
  var className: js.UndefOr[String] = js.native
  var colors: js.UndefOr[js.Array[String]] = js.native
  var componentBelowControlBar: js.UndefOr[TagMod[Any]] = js.native
  var contentClassName: js.UndefOr[String] = js.native
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  var controlBarClassName: js.UndefOr[String] = js.native
  var controlBarStyle: js.UndefOr[CSSProperties] = js.native
  var controls: js.UndefOr[js.Array[ControlType]] = js.native
  var converts: js.UndefOr[js.Object] = js.native
  var defaultLinkTarget: js.UndefOr[String] = js.native
  var defaultValue: js.UndefOr[EditorState] = js.native
  var draftProps: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ js.Any
  ] = js.native
  var editorId: js.UndefOr[String] = js.native
  var emojis: js.UndefOr[js.Array[String]] = js.native
  var excludeControls: js.UndefOr[js.Array[BuiltInControlType]] = js.native
  var extendControls: js.UndefOr[js.Array[ExtendControlType]] = js.native
  var fixPlaceholder: js.UndefOr[Boolean] = js.native
  var fontFamilies: js.UndefOr[js.Array[AnonFamily]] = js.native
  var fontSizes: js.UndefOr[js.Array[Double]] = js.native
  var handleBeforeInput: js.UndefOr[js.Function] = js.native
  var handleDroppedFiles: js.UndefOr[js.Function] = js.native
  var handleKeyCommand: js.UndefOr[js.Function] = js.native
  var handlePastedFiles: js.UndefOr[js.Function] = js.native
  var handlePastedText: js.UndefOr[js.Function] = js.native
  var handleReturn: js.UndefOr[js.Function] = js.native
  var headings: js.UndefOr[js.Array[String]] = js.native
  var hooks: js.UndefOr[HooksType] = js.native
  var id: js.UndefOr[String] = js.native
  var imageControls: js.UndefOr[js.Array[ImageControlType]] = js.native
  var imageEqualRatio: js.UndefOr[Boolean] = js.native
  var imageResizable: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[
    zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | `vi-vn` | (js.Function2[/* languages */ js.Any, /* context */ js.Any, _])
  ] = js.native
  var letterSpacings: js.UndefOr[js.Array[Double]] = js.native
  var lineHeights: js.UndefOr[js.Array[Double]] = js.native
  var media: js.UndefOr[MediaType] = js.native
  var onBlur: js.UndefOr[js.Function] = js.native
  var onChange: js.UndefOr[js.Function1[/* editorState */ EditorState, Unit]] = js.native
  var onDelete: js.UndefOr[js.Function] = js.native
  var onFocus: js.UndefOr[js.Function] = js.native
  var onFullscreen: js.UndefOr[js.Function] = js.native
  var onSave: js.UndefOr[js.Function] = js.native
  var onTab: js.UndefOr[js.Function] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var stripPastedStyles: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var textAligns: js.UndefOr[js.Array[left | center | right | justify]] = js.native
  var textBackgroundColor: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[EditorState] = js.native
}

object BraftEditorProps {
  @scala.inline
  def apply(): BraftEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BraftEditorProps]
  }
  @scala.inline
  implicit class BraftEditorPropsOps[Self <: BraftEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInsertLinkText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertLinkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsertLinkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsertLinkText")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockRenderMap(value: (Map[_, _]) | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRenderMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockRenderMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRenderMap")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockRendererFn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRendererFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockRendererFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRendererFn")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentBelowControlBarReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentBelowControlBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentBelowControlBar(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentBelowControlBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentBelowControlBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentBelowControlBar")(js.undefined)
        ret
    }
    @scala.inline
    def withContentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withControlBarClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlBarClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlBarClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlBarClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withControlBarStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlBarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: js.Array[ControlType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withConverts(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converts")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLinkTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLinkTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLinkTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLinkTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: EditorState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDraftProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draftProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraftProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draftProps")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorId")(js.undefined)
        ret
    }
    @scala.inline
    def withEmojis(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmojis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojis")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeControls(value: js.Array[BuiltInControlType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeControls")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendControls(value: js.Array[ExtendControlType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendControls")(js.undefined)
        ret
    }
    @scala.inline
    def withFixPlaceholder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamilies(value: js.Array[AnonFamily]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamilies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamilies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamilies")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleBeforeInput(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleBeforeInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleBeforeInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleBeforeInput")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleDroppedFiles(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDroppedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleDroppedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDroppedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleKeyCommand(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleKeyCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlePastedFiles(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePastedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlePastedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePastedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlePastedText(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePastedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlePastedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePastedText")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleReturn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headings")(js.undefined)
        ret
    }
    @scala.inline
    def withHooks(value: HooksType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImageControls(value: js.Array[ImageControlType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageControls")(js.undefined)
        ret
    }
    @scala.inline
    def withImageEqualRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageEqualRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageEqualRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageEqualRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withImageResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageResizable")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageFunction2(value: (/* languages */ js.Any, /* context */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLanguage(
      value: zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | `vi-vn` | (js.Function2[/* languages */ js.Any, /* context */ js.Any, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacings(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacings")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeights(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeights")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: MediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* editorState */ EditorState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDelete(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFullscreen(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSave(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTab(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTab")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withStripPastedStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripPastedStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripPastedStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripPastedStyles")(js.undefined)
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
    def withTextAligns(value: js.Array[left | center | right | justify]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAligns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAligns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAligns")(js.undefined)
        ret
    }
    @scala.inline
    def withTextBackgroundColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: EditorState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

