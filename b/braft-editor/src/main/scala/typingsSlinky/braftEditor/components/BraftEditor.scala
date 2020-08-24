package typingsSlinky.braftEditor.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.braftEditor.anon.Family
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
import typingsSlinky.braftEditor.mod.BraftEditorProps
import typingsSlinky.braftEditor.mod.BuiltInControlType
import typingsSlinky.braftEditor.mod.ControlType
import typingsSlinky.braftEditor.mod.EditorState
import typingsSlinky.braftEditor.mod.ExtendControlType
import typingsSlinky.braftEditor.mod.HooksType
import typingsSlinky.braftEditor.mod.ImageControlType
import typingsSlinky.braftEditor.mod.MediaType
import typingsSlinky.braftEditor.mod.default
import typingsSlinky.immutable.Immutable.Map
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BraftEditor {
  @JSImport("braft-editor", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def allowInsertLinkText(value: Boolean): this.type = set("allowInsertLinkText", value.asInstanceOf[js.Any])
    @scala.inline
    def blockRenderMap(value: (Map[_, _]) | js.Function): this.type = set("blockRenderMap", value.asInstanceOf[js.Any])
    @scala.inline
    def blockRendererFn(value: js.Function): this.type = set("blockRendererFn", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    @scala.inline
    def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def componentBelowControlBarReactElement(value: ReactElement): this.type = set("componentBelowControlBar", value.asInstanceOf[js.Any])
    @scala.inline
    def componentBelowControlBar(value: ReactElement): this.type = set("componentBelowControlBar", value.asInstanceOf[js.Any])
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def controlBarClassName(value: String): this.type = set("controlBarClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def controlBarStyle(value: CSSProperties): this.type = set("controlBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def controlsVarargs(value: ControlType*): this.type = set("controls", js.Array(value :_*))
    @scala.inline
    def controls(value: js.Array[ControlType]): this.type = set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def converts(value: js.Object): this.type = set("converts", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultLinkTarget(value: String): this.type = set("defaultLinkTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: EditorState): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def draftProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ js.Any
    ): this.type = set("draftProps", value.asInstanceOf[js.Any])
    @scala.inline
    def editorId(value: String): this.type = set("editorId", value.asInstanceOf[js.Any])
    @scala.inline
    def emojisVarargs(value: String*): this.type = set("emojis", js.Array(value :_*))
    @scala.inline
    def emojis(value: js.Array[String]): this.type = set("emojis", value.asInstanceOf[js.Any])
    @scala.inline
    def excludeControlsVarargs(value: BuiltInControlType*): this.type = set("excludeControls", js.Array(value :_*))
    @scala.inline
    def excludeControls(value: js.Array[BuiltInControlType]): this.type = set("excludeControls", value.asInstanceOf[js.Any])
    @scala.inline
    def extendControlsVarargs(value: ExtendControlType*): this.type = set("extendControls", js.Array(value :_*))
    @scala.inline
    def extendControls(value: js.Array[ExtendControlType]): this.type = set("extendControls", value.asInstanceOf[js.Any])
    @scala.inline
    def fixPlaceholder(value: Boolean): this.type = set("fixPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def fontFamiliesVarargs(value: Family*): this.type = set("fontFamilies", js.Array(value :_*))
    @scala.inline
    def fontFamilies(value: js.Array[Family]): this.type = set("fontFamilies", value.asInstanceOf[js.Any])
    @scala.inline
    def fontSizesVarargs(value: Double*): this.type = set("fontSizes", js.Array(value :_*))
    @scala.inline
    def fontSizes(value: js.Array[Double]): this.type = set("fontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def handleBeforeInput(value: js.Function): this.type = set("handleBeforeInput", value.asInstanceOf[js.Any])
    @scala.inline
    def handleDroppedFiles(value: js.Function): this.type = set("handleDroppedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def handleKeyCommand(value: js.Function): this.type = set("handleKeyCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def handlePastedFiles(value: js.Function): this.type = set("handlePastedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def handlePastedText(value: js.Function): this.type = set("handlePastedText", value.asInstanceOf[js.Any])
    @scala.inline
    def handleReturn(value: js.Function): this.type = set("handleReturn", value.asInstanceOf[js.Any])
    @scala.inline
    def headingsVarargs(value: String*): this.type = set("headings", js.Array(value :_*))
    @scala.inline
    def headings(value: js.Array[String]): this.type = set("headings", value.asInstanceOf[js.Any])
    @scala.inline
    def hooks(value: HooksType): this.type = set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def imageControlsVarargs(value: ImageControlType*): this.type = set("imageControls", js.Array(value :_*))
    @scala.inline
    def imageControls(value: js.Array[ImageControlType]): this.type = set("imageControls", value.asInstanceOf[js.Any])
    @scala.inline
    def imageEqualRatio(value: Boolean): this.type = set("imageEqualRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def imageResizable(value: Boolean): this.type = set("imageResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def languageFunction2(value: (/* languages */ js.Any, /* context */ js.Any) => _): this.type = set("language", js.Any.fromFunction2(value))
    @scala.inline
    def language(
      value: zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | `vi-vn` | (js.Function2[/* languages */ js.Any, /* context */ js.Any, _])
    ): this.type = set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def letterSpacingsVarargs(value: Double*): this.type = set("letterSpacings", js.Array(value :_*))
    @scala.inline
    def letterSpacings(value: js.Array[Double]): this.type = set("letterSpacings", value.asInstanceOf[js.Any])
    @scala.inline
    def lineHeightsVarargs(value: Double*): this.type = set("lineHeights", js.Array(value :_*))
    @scala.inline
    def lineHeights(value: js.Array[Double]): this.type = set("lineHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def media(value: MediaType): this.type = set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: js.Function): this.type = set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* editorState */ EditorState => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onDelete(value: js.Function): this.type = set("onDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def onFocus(value: js.Function): this.type = set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def onFullscreen(value: js.Function): this.type = set("onFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def onSave(value: js.Function): this.type = set("onSave", value.asInstanceOf[js.Any])
    @scala.inline
    def onTab(value: js.Function): this.type = set("onTab", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def stripPastedStyles(value: Boolean): this.type = set("stripPastedStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def textAlignsVarargs(value: (left | center | right | justify)*): this.type = set("textAligns", js.Array(value :_*))
    @scala.inline
    def textAligns(value: js.Array[left | center | right | justify]): this.type = set("textAligns", value.asInstanceOf[js.Any])
    @scala.inline
    def textBackgroundColor(value: Boolean): this.type = set("textBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: EditorState): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BraftEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BraftEditor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

