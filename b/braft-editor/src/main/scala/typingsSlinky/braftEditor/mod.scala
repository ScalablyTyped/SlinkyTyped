package typingsSlinky.braftEditor

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.File
import slinky.core.facade.ReactElement
import typingsSlinky.braftEditor.anon.Audio
import typingsSlinky.braftEditor.anon.Embed
import typingsSlinky.braftEditor.anon.Error
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
import typingsSlinky.draftJs.mod.Draft.Model.Decorators.DraftDecoratorType
import typingsSlinky.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentState
import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.DraftInlineStyle
import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorChangeType
import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.SelectionState
import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Map
import typingsSlinky.immutable.Immutable.OrderedMap
import typingsSlinky.immutable.Immutable.Stack
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("braft-editor", JSImport.Default)
  @js.native
  class default () extends BraftEditor
  /* static members */
  object default {
    
    @JSImport("braft-editor", "default.createEditorState")
    @js.native
    def createEditorState(content: String): EditorState = js.native
    @JSImport("braft-editor", "default.createEditorState")
    @js.native
    def createEditorState(content: String, options: js.Object): EditorState = js.native
    @JSImport("braft-editor", "default.createEditorState")
    @js.native
    def createEditorState(content: js.Any): EditorState = js.native
    @JSImport("braft-editor", "default.createEditorState")
    @js.native
    def createEditorState(content: js.Any, options: js.Object): EditorState = js.native
    
    @JSImport("braft-editor", "default.use")
    @js.native
    def use(extension: js.Array[js.Object]): Unit = js.native
    @JSImport("braft-editor", "default.use")
    @js.native
    def use(extension: js.Object): Unit = js.native
  }
  
  @js.native
  trait BraftEditor
    extends Component[BraftEditorProps, js.Object, js.Any] {
    
    def clearEditorContent(): Unit = js.native
    
    def forceRender(): Unit = js.native
    
    def getDraftInstance(): js.Any = js.native
    
    def getFinderInstance(): js.Any = js.native
    
    def getValue(): EditorState = js.native
    
    def redo(): Unit = js.native
    
    def setValue(editorState: EditorState): Unit = js.native
    
    def undo(): Unit = js.native
  }
  
  @js.native
  trait BraftEditorProps extends StObject {
    
    var allowInsertLinkText: js.UndefOr[Boolean] = js.native
    
    var blockRenderMap: js.UndefOr[(Map[_, _]) | js.Function] = js.native
    
    var blockRendererFn: js.UndefOr[js.Function] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colors: js.UndefOr[js.Array[String]] = js.native
    
    var componentBelowControlBar: js.UndefOr[ReactElement] = js.native
    
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
    
    var fontFamilies: js.UndefOr[js.Array[Family]] = js.native
    
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
    implicit class BraftEditorPropsMutableBuilder[Self <: BraftEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowInsertLinkText(value: Boolean): Self = StObject.set(x, "allowInsertLinkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowInsertLinkTextUndefined: Self = StObject.set(x, "allowInsertLinkText", js.undefined)
      
      @scala.inline
      def setBlockRenderMap(value: (Map[_, _]) | js.Function): Self = StObject.set(x, "blockRenderMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockRenderMapUndefined: Self = StObject.set(x, "blockRenderMap", js.undefined)
      
      @scala.inline
      def setBlockRendererFn(value: js.Function): Self = StObject.set(x, "blockRendererFn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockRendererFnUndefined: Self = StObject.set(x, "blockRendererFn", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setComponentBelowControlBar(value: ReactElement): Self = StObject.set(x, "componentBelowControlBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentBelowControlBarReactElement(value: ReactElement): Self = StObject.set(x, "componentBelowControlBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentBelowControlBarUndefined: Self = StObject.set(x, "componentBelowControlBar", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setControlBarClassName(value: String): Self = StObject.set(x, "controlBarClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlBarClassNameUndefined: Self = StObject.set(x, "controlBarClassName", js.undefined)
      
      @scala.inline
      def setControlBarStyle(value: CSSProperties): Self = StObject.set(x, "controlBarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlBarStyleUndefined: Self = StObject.set(x, "controlBarStyle", js.undefined)
      
      @scala.inline
      def setControls(value: js.Array[ControlType]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setControlsVarargs(value: ControlType*): Self = StObject.set(x, "controls", js.Array(value :_*))
      
      @scala.inline
      def setConverts(value: js.Object): Self = StObject.set(x, "converts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertsUndefined: Self = StObject.set(x, "converts", js.undefined)
      
      @scala.inline
      def setDefaultLinkTarget(value: String): Self = StObject.set(x, "defaultLinkTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLinkTargetUndefined: Self = StObject.set(x, "defaultLinkTarget", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: EditorState): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDraftProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ js.Any
      ): Self = StObject.set(x, "draftProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraftPropsUndefined: Self = StObject.set(x, "draftProps", js.undefined)
      
      @scala.inline
      def setEditorId(value: String): Self = StObject.set(x, "editorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorIdUndefined: Self = StObject.set(x, "editorId", js.undefined)
      
      @scala.inline
      def setEmojis(value: js.Array[String]): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmojisUndefined: Self = StObject.set(x, "emojis", js.undefined)
      
      @scala.inline
      def setEmojisVarargs(value: String*): Self = StObject.set(x, "emojis", js.Array(value :_*))
      
      @scala.inline
      def setExcludeControls(value: js.Array[BuiltInControlType]): Self = StObject.set(x, "excludeControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeControlsUndefined: Self = StObject.set(x, "excludeControls", js.undefined)
      
      @scala.inline
      def setExcludeControlsVarargs(value: BuiltInControlType*): Self = StObject.set(x, "excludeControls", js.Array(value :_*))
      
      @scala.inline
      def setExtendControls(value: js.Array[ExtendControlType]): Self = StObject.set(x, "extendControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendControlsUndefined: Self = StObject.set(x, "extendControls", js.undefined)
      
      @scala.inline
      def setExtendControlsVarargs(value: ExtendControlType*): Self = StObject.set(x, "extendControls", js.Array(value :_*))
      
      @scala.inline
      def setFixPlaceholder(value: Boolean): Self = StObject.set(x, "fixPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixPlaceholderUndefined: Self = StObject.set(x, "fixPlaceholder", js.undefined)
      
      @scala.inline
      def setFontFamilies(value: js.Array[Family]): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamiliesUndefined: Self = StObject.set(x, "fontFamilies", js.undefined)
      
      @scala.inline
      def setFontFamiliesVarargs(value: Family*): Self = StObject.set(x, "fontFamilies", js.Array(value :_*))
      
      @scala.inline
      def setFontSizes(value: js.Array[Double]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
      
      @scala.inline
      def setFontSizesVarargs(value: Double*): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
      
      @scala.inline
      def setHandleBeforeInput(value: js.Function): Self = StObject.set(x, "handleBeforeInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleBeforeInputUndefined: Self = StObject.set(x, "handleBeforeInput", js.undefined)
      
      @scala.inline
      def setHandleDroppedFiles(value: js.Function): Self = StObject.set(x, "handleDroppedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleDroppedFilesUndefined: Self = StObject.set(x, "handleDroppedFiles", js.undefined)
      
      @scala.inline
      def setHandleKeyCommand(value: js.Function): Self = StObject.set(x, "handleKeyCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleKeyCommandUndefined: Self = StObject.set(x, "handleKeyCommand", js.undefined)
      
      @scala.inline
      def setHandlePastedFiles(value: js.Function): Self = StObject.set(x, "handlePastedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlePastedFilesUndefined: Self = StObject.set(x, "handlePastedFiles", js.undefined)
      
      @scala.inline
      def setHandlePastedText(value: js.Function): Self = StObject.set(x, "handlePastedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlePastedTextUndefined: Self = StObject.set(x, "handlePastedText", js.undefined)
      
      @scala.inline
      def setHandleReturn(value: js.Function): Self = StObject.set(x, "handleReturn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleReturnUndefined: Self = StObject.set(x, "handleReturn", js.undefined)
      
      @scala.inline
      def setHeadings(value: js.Array[String]): Self = StObject.set(x, "headings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingsUndefined: Self = StObject.set(x, "headings", js.undefined)
      
      @scala.inline
      def setHeadingsVarargs(value: String*): Self = StObject.set(x, "headings", js.Array(value :_*))
      
      @scala.inline
      def setHooks(value: HooksType): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImageControls(value: js.Array[ImageControlType]): Self = StObject.set(x, "imageControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageControlsUndefined: Self = StObject.set(x, "imageControls", js.undefined)
      
      @scala.inline
      def setImageControlsVarargs(value: ImageControlType*): Self = StObject.set(x, "imageControls", js.Array(value :_*))
      
      @scala.inline
      def setImageEqualRatio(value: Boolean): Self = StObject.set(x, "imageEqualRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageEqualRatioUndefined: Self = StObject.set(x, "imageEqualRatio", js.undefined)
      
      @scala.inline
      def setImageResizable(value: Boolean): Self = StObject.set(x, "imageResizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageResizableUndefined: Self = StObject.set(x, "imageResizable", js.undefined)
      
      @scala.inline
      def setLanguage(
        value: zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | `vi-vn` | (js.Function2[/* languages */ js.Any, /* context */ js.Any, _])
      ): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageFunction2(value: (/* languages */ js.Any, /* context */ js.Any) => _): Self = StObject.set(x, "language", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLetterSpacings(value: js.Array[Double]): Self = StObject.set(x, "letterSpacings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingsUndefined: Self = StObject.set(x, "letterSpacings", js.undefined)
      
      @scala.inline
      def setLetterSpacingsVarargs(value: Double*): Self = StObject.set(x, "letterSpacings", js.Array(value :_*))
      
      @scala.inline
      def setLineHeights(value: js.Array[Double]): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightsUndefined: Self = StObject.set(x, "lineHeights", js.undefined)
      
      @scala.inline
      def setLineHeightsVarargs(value: Double*): Self = StObject.set(x, "lineHeights", js.Array(value :_*))
      
      @scala.inline
      def setMedia(value: MediaType): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* editorState */ EditorState => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnDelete(value: js.Function): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      @scala.inline
      def setOnFocus(value: js.Function): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnFullscreen(value: js.Function): Self = StObject.set(x, "onFullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFullscreenUndefined: Self = StObject.set(x, "onFullscreen", js.undefined)
      
      @scala.inline
      def setOnSave(value: js.Function): Self = StObject.set(x, "onSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      @scala.inline
      def setOnTab(value: js.Function): Self = StObject.set(x, "onTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setStripPastedStyles(value: Boolean): Self = StObject.set(x, "stripPastedStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripPastedStylesUndefined: Self = StObject.set(x, "stripPastedStyles", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextAligns(value: js.Array[left | center | right | justify]): Self = StObject.set(x, "textAligns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignsUndefined: Self = StObject.set(x, "textAligns", js.undefined)
      
      @scala.inline
      def setTextAlignsVarargs(value: (left | center | right | justify)*): Self = StObject.set(x, "textAligns", js.Array(value :_*))
      
      @scala.inline
      def setTextBackgroundColor(value: Boolean): Self = StObject.set(x, "textBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBackgroundColorUndefined: Self = StObject.set(x, "textBackgroundColor", js.undefined)
      
      @scala.inline
      def setValue(value: EditorState): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.braftEditor.braftEditorStrings.blockquote
    - typingsSlinky.braftEditor.braftEditorStrings.bold
    - typingsSlinky.braftEditor.braftEditorStrings.code
    - typingsSlinky.braftEditor.braftEditorStrings.clear
    - typingsSlinky.braftEditor.braftEditorStrings.emoji
    - typingsSlinky.braftEditor.braftEditorStrings.`font-family`
    - typingsSlinky.braftEditor.braftEditorStrings.`font-size`
    - typingsSlinky.braftEditor.braftEditorStrings.fullscreen
    - typingsSlinky.braftEditor.braftEditorStrings.headings
    - typingsSlinky.braftEditor.braftEditorStrings.hr
    - typingsSlinky.braftEditor.braftEditorStrings.italic
    - typingsSlinky.braftEditor.braftEditorStrings.`letter-spacing`
    - typingsSlinky.braftEditor.braftEditorStrings.`line-height`
    - typingsSlinky.braftEditor.braftEditorStrings.link
    - typingsSlinky.braftEditor.braftEditorStrings.`list-ol`
    - typingsSlinky.braftEditor.braftEditorStrings.`list-ul`
    - typingsSlinky.braftEditor.braftEditorStrings.media
    - typingsSlinky.braftEditor.braftEditorStrings.redo
    - typingsSlinky.braftEditor.braftEditorStrings.`remove-styles`
    - typingsSlinky.braftEditor.braftEditorStrings.separator
    - typingsSlinky.braftEditor.braftEditorStrings.`strike-through`
    - typingsSlinky.braftEditor.braftEditorStrings.superscript
    - typingsSlinky.braftEditor.braftEditorStrings.subscript
    - typingsSlinky.braftEditor.braftEditorStrings.`text-align`
    - typingsSlinky.braftEditor.braftEditorStrings.`text-color`
    - typingsSlinky.braftEditor.braftEditorStrings.`text-indent`
    - typingsSlinky.braftEditor.braftEditorStrings.underline
    - typingsSlinky.braftEditor.braftEditorStrings.undo
    - typingsSlinky.braftEditor.braftEditorStrings.table
  */
  trait BuiltInControlType extends ControlType
  object BuiltInControlType {
    
    @scala.inline
    def blockquote: typingsSlinky.braftEditor.braftEditorStrings.blockquote = "blockquote".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.blockquote]
    
    @scala.inline
    def bold: typingsSlinky.braftEditor.braftEditorStrings.bold = "bold".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.bold]
    
    @scala.inline
    def clear: typingsSlinky.braftEditor.braftEditorStrings.clear = "clear".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.clear]
    
    @scala.inline
    def code: typingsSlinky.braftEditor.braftEditorStrings.code = "code".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.code]
    
    @scala.inline
    def emoji: typingsSlinky.braftEditor.braftEditorStrings.emoji = "emoji".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.emoji]
    
    @scala.inline
    def `font-family`: typingsSlinky.braftEditor.braftEditorStrings.`font-family` = "font-family".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`font-family`]
    
    @scala.inline
    def `font-size`: typingsSlinky.braftEditor.braftEditorStrings.`font-size` = "font-size".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`font-size`]
    
    @scala.inline
    def fullscreen: typingsSlinky.braftEditor.braftEditorStrings.fullscreen = "fullscreen".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.fullscreen]
    
    @scala.inline
    def headings: typingsSlinky.braftEditor.braftEditorStrings.headings = "headings".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.headings]
    
    @scala.inline
    def hr: typingsSlinky.braftEditor.braftEditorStrings.hr = "hr".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.hr]
    
    @scala.inline
    def italic: typingsSlinky.braftEditor.braftEditorStrings.italic = "italic".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.italic]
    
    @scala.inline
    def `letter-spacing`: typingsSlinky.braftEditor.braftEditorStrings.`letter-spacing` = "letter-spacing".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`letter-spacing`]
    
    @scala.inline
    def `line-height`: typingsSlinky.braftEditor.braftEditorStrings.`line-height` = "line-height".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`line-height`]
    
    @scala.inline
    def link: typingsSlinky.braftEditor.braftEditorStrings.link = "link".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.link]
    
    @scala.inline
    def `list-ol`: typingsSlinky.braftEditor.braftEditorStrings.`list-ol` = "list-ol".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`list-ol`]
    
    @scala.inline
    def `list-ul`: typingsSlinky.braftEditor.braftEditorStrings.`list-ul` = "list-ul".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`list-ul`]
    
    @scala.inline
    def media: typingsSlinky.braftEditor.braftEditorStrings.media = "media".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.media]
    
    @scala.inline
    def redo: typingsSlinky.braftEditor.braftEditorStrings.redo = "redo".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.redo]
    
    @scala.inline
    def `remove-styles`: typingsSlinky.braftEditor.braftEditorStrings.`remove-styles` = "remove-styles".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`remove-styles`]
    
    @scala.inline
    def separator: typingsSlinky.braftEditor.braftEditorStrings.separator = "separator".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.separator]
    
    @scala.inline
    def `strike-through`: typingsSlinky.braftEditor.braftEditorStrings.`strike-through` = "strike-through".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`strike-through`]
    
    @scala.inline
    def subscript: typingsSlinky.braftEditor.braftEditorStrings.subscript = "subscript".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.subscript]
    
    @scala.inline
    def superscript: typingsSlinky.braftEditor.braftEditorStrings.superscript = "superscript".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.superscript]
    
    @scala.inline
    def table: typingsSlinky.braftEditor.braftEditorStrings.table = "table".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.table]
    
    @scala.inline
    def `text-align`: typingsSlinky.braftEditor.braftEditorStrings.`text-align` = "text-align".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`text-align`]
    
    @scala.inline
    def `text-color`: typingsSlinky.braftEditor.braftEditorStrings.`text-color` = "text-color".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`text-color`]
    
    @scala.inline
    def `text-indent`: typingsSlinky.braftEditor.braftEditorStrings.`text-indent` = "text-indent".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`text-indent`]
    
    @scala.inline
    def underline: typingsSlinky.braftEditor.braftEditorStrings.underline = "underline".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.underline]
    
    @scala.inline
    def undo: typingsSlinky.braftEditor.braftEditorStrings.undo = "undo".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.undo]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.braftEditor.mod.BuiltInControlType
    - typingsSlinky.braftEditor.anon.Key
    - typingsSlinky.braftEditor.mod.ExtendControlType
  */
  trait ControlType extends StObject
  
  /* Inlined draft-js.draft-js.EditorState & {[key: string] : any, setConvertOptions (option : std.Object | undefined): void, toHTML (option : std.Object | undefined): string, toRAW (noStringify : boolean | undefined): draft-js.draft-js.RawDraftContentState | string, toText (): string, isEmpty (): boolean} */
  @js.native
  trait EditorState
    extends /* key */ StringDictionary[js.Any] {
    
    def getAllowUndo(): Boolean = js.native
    
    def getBlockTree(blockKey: String): List[_] = js.native
    
    def getCurrentContent(): ContentState = js.native
    
    /**
      * Get the appropriate inline style for the editor state. If an
      * override is in place, use it. Otherwise, the current style is
      * based on the location of the selection state.
      */
    def getCurrentInlineStyle(): DraftInlineStyle = js.native
    
    def getDecorator(): DraftDecoratorType = js.native
    
    def getDirectionMap(): OrderedMap[_, _] = js.native
    
    /**
      * While editing, the user may apply inline style commands with a collapsed
      * cursor, intending to type text that adopts the specified style. In this
      * case, we track the specified style as an "override" that takes precedence
      * over the inline style of the text adjacent to the cursor.
      *
      * If null, there is no override in place.
      */
    def getInlineStyleOverride(): DraftInlineStyle = js.native
    
    def getLastChangeType(): EditorChangeType = js.native
    
    def getNativelyRenderedContent(): ContentState = js.native
    
    def getRedoStack(): Stack[ContentState] = js.native
    
    def getSelection(): SelectionState = js.native
    
    def getUndoStack(): Stack[ContentState] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isInCompositionMode(): Boolean = js.native
    
    def isSelectionAtEndOfContent(): Boolean = js.native
    
    def isSelectionAtStartOfContent(): Boolean = js.native
    
    def mustForceSelection(): Boolean = js.native
    
    def setConvertOptions(): Unit = js.native
    def setConvertOptions(option: js.Object): Unit = js.native
    
    def toHTML(): String = js.native
    def toHTML(option: js.Object): String = js.native
    
    def toJS(): js.Object = js.native
    
    def toRAW(): RawDraftContentState | String = js.native
    def toRAW(noStringify: Boolean): RawDraftContentState | String = js.native
    
    def toText(): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.braftEditor.braftEditorStrings.separator
    - typingsSlinky.braftEditor.anon.ClassName
    - typingsSlinky.braftEditor.anon.ArrowActive
    - typingsSlinky.braftEditor.anon.Disabled
    - typingsSlinky.braftEditor.anon.Component
  */
  trait ExtendControlType extends ControlType
  
  type HookFunc = js.Function1[/* any */ js.Any, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.braftEditor.braftEditorStrings.`toggle-link`
    - typingsSlinky.braftEditor.braftEditorStrings.`open-braft-finder`
    - typingsSlinky.braftEditor.braftEditorStrings.`toggle-inline-style`
    - typingsSlinky.braftEditor.braftEditorStrings.`change-block-type`
    - typingsSlinky.braftEditor.braftEditorStrings.`exec-editor-command`
    - typingsSlinky.braftEditor.braftEditorStrings.`insert-emoji`
    - typingsSlinky.braftEditor.braftEditorStrings.`toggle-font-family`
    - typingsSlinky.braftEditor.braftEditorStrings.`toggle-font-size`
    - typingsSlinky.braftEditor.braftEditorStrings.`toggle-letter-spacing`
    - typingsSlinky.braftEditor.braftEditorStrings.`toggle-line-height`
    - typingsSlinky.braftEditor.braftEditorStrings.`toggle-text-alignment`
    - typingsSlinky.braftEditor.braftEditorStrings.`toggle-text-color`
    - typingsSlinky.braftEditor.braftEditorStrings.`toggle-text-background-color`
    - typingsSlinky.braftEditor.braftEditorStrings.`select-medias`
    - typingsSlinky.braftEditor.braftEditorStrings.`deselect-medias`
    - typingsSlinky.braftEditor.braftEditorStrings.`remove-medias`
    - typingsSlinky.braftEditor.braftEditorStrings.`insert-medias`
    - typingsSlinky.braftEditor.braftEditorStrings.`select-files`
  */
  trait HookType extends StObject
  object HookType {
    
    @scala.inline
    def `change-block-type`: typingsSlinky.braftEditor.braftEditorStrings.`change-block-type` = "change-block-type".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`change-block-type`]
    
    @scala.inline
    def `deselect-medias`: typingsSlinky.braftEditor.braftEditorStrings.`deselect-medias` = "deselect-medias".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`deselect-medias`]
    
    @scala.inline
    def `exec-editor-command`: typingsSlinky.braftEditor.braftEditorStrings.`exec-editor-command` = "exec-editor-command".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`exec-editor-command`]
    
    @scala.inline
    def `insert-emoji`: typingsSlinky.braftEditor.braftEditorStrings.`insert-emoji` = "insert-emoji".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`insert-emoji`]
    
    @scala.inline
    def `insert-medias`: typingsSlinky.braftEditor.braftEditorStrings.`insert-medias` = "insert-medias".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`insert-medias`]
    
    @scala.inline
    def `open-braft-finder`: typingsSlinky.braftEditor.braftEditorStrings.`open-braft-finder` = "open-braft-finder".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`open-braft-finder`]
    
    @scala.inline
    def `remove-medias`: typingsSlinky.braftEditor.braftEditorStrings.`remove-medias` = "remove-medias".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`remove-medias`]
    
    @scala.inline
    def `select-files`: typingsSlinky.braftEditor.braftEditorStrings.`select-files` = "select-files".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`select-files`]
    
    @scala.inline
    def `select-medias`: typingsSlinky.braftEditor.braftEditorStrings.`select-medias` = "select-medias".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`select-medias`]
    
    @scala.inline
    def `toggle-font-family`: typingsSlinky.braftEditor.braftEditorStrings.`toggle-font-family` = "toggle-font-family".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`toggle-font-family`]
    
    @scala.inline
    def `toggle-font-size`: typingsSlinky.braftEditor.braftEditorStrings.`toggle-font-size` = "toggle-font-size".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`toggle-font-size`]
    
    @scala.inline
    def `toggle-inline-style`: typingsSlinky.braftEditor.braftEditorStrings.`toggle-inline-style` = "toggle-inline-style".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`toggle-inline-style`]
    
    @scala.inline
    def `toggle-letter-spacing`: typingsSlinky.braftEditor.braftEditorStrings.`toggle-letter-spacing` = "toggle-letter-spacing".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`toggle-letter-spacing`]
    
    @scala.inline
    def `toggle-line-height`: typingsSlinky.braftEditor.braftEditorStrings.`toggle-line-height` = "toggle-line-height".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`toggle-line-height`]
    
    @scala.inline
    def `toggle-link`: typingsSlinky.braftEditor.braftEditorStrings.`toggle-link` = "toggle-link".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`toggle-link`]
    
    @scala.inline
    def `toggle-text-alignment`: typingsSlinky.braftEditor.braftEditorStrings.`toggle-text-alignment` = "toggle-text-alignment".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`toggle-text-alignment`]
    
    @scala.inline
    def `toggle-text-background-color`: typingsSlinky.braftEditor.braftEditorStrings.`toggle-text-background-color` = "toggle-text-background-color".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`toggle-text-background-color`]
    
    @scala.inline
    def `toggle-text-color`: typingsSlinky.braftEditor.braftEditorStrings.`toggle-text-color` = "toggle-text-color".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.`toggle-text-color`]
  }
  
  @js.native
  trait HooksType extends StObject {
    
    var `change-block-type`: js.UndefOr[HookFunc] = js.native
    
    var `deselect-medias`: js.UndefOr[HookFunc] = js.native
    
    var `exec-editor-command`: js.UndefOr[HookFunc] = js.native
    
    var `insert-emoji`: js.UndefOr[HookFunc] = js.native
    
    var `insert-medias`: js.UndefOr[HookFunc] = js.native
    
    var `open-braft-finder`: js.UndefOr[HookFunc] = js.native
    
    var `remove-medias`: js.UndefOr[HookFunc] = js.native
    
    var `select-files`: js.UndefOr[HookFunc] = js.native
    
    var `select-medias`: js.UndefOr[HookFunc] = js.native
    
    var `set-image-alignment`: js.UndefOr[HookFunc] = js.native
    
    var `set-image-float`: js.UndefOr[HookFunc] = js.native
    
    var `set-image-link`: js.UndefOr[HookFunc] = js.native
    
    var `set-image-link-target`: js.UndefOr[HookFunc] = js.native
    
    var `set-image-size`: js.UndefOr[HookFunc] = js.native
    
    var `toggle-font-family`: js.UndefOr[HookFunc] = js.native
    
    var `toggle-font-size`: js.UndefOr[HookFunc] = js.native
    
    var `toggle-inline-style`: js.UndefOr[HookFunc] = js.native
    
    var `toggle-letter-spacing`: js.UndefOr[HookFunc] = js.native
    
    var `toggle-line-height`: js.UndefOr[HookFunc] = js.native
    
    var `toggle-link`: js.UndefOr[HookFunc] = js.native
    
    var `toggle-text-alignment`: js.UndefOr[HookFunc] = js.native
    
    var `toggle-text-background-color`: js.UndefOr[HookFunc] = js.native
    
    var `toggle-text-color`: js.UndefOr[HookFunc] = js.native
  }
  object HooksType {
    
    @scala.inline
    def apply(): HooksType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HooksType]
    }
    
    @scala.inline
    implicit class HooksTypeMutableBuilder[Self <: HooksType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setChange-block-type`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "change-block-type", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setChange-block-typeUndefined`: Self = StObject.set(x, "change-block-type", js.undefined)
      
      @scala.inline
      def `setDeselect-medias`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "deselect-medias", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setDeselect-mediasUndefined`: Self = StObject.set(x, "deselect-medias", js.undefined)
      
      @scala.inline
      def `setExec-editor-command`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "exec-editor-command", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setExec-editor-commandUndefined`: Self = StObject.set(x, "exec-editor-command", js.undefined)
      
      @scala.inline
      def `setInsert-emoji`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "insert-emoji", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setInsert-emojiUndefined`: Self = StObject.set(x, "insert-emoji", js.undefined)
      
      @scala.inline
      def `setInsert-medias`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "insert-medias", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setInsert-mediasUndefined`: Self = StObject.set(x, "insert-medias", js.undefined)
      
      @scala.inline
      def `setOpen-braft-finder`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "open-braft-finder", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setOpen-braft-finderUndefined`: Self = StObject.set(x, "open-braft-finder", js.undefined)
      
      @scala.inline
      def `setRemove-medias`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "remove-medias", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setRemove-mediasUndefined`: Self = StObject.set(x, "remove-medias", js.undefined)
      
      @scala.inline
      def `setSelect-files`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "select-files", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setSelect-filesUndefined`: Self = StObject.set(x, "select-files", js.undefined)
      
      @scala.inline
      def `setSelect-medias`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "select-medias", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setSelect-mediasUndefined`: Self = StObject.set(x, "select-medias", js.undefined)
      
      @scala.inline
      def `setSet-image-alignment`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "set-image-alignment", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setSet-image-alignmentUndefined`: Self = StObject.set(x, "set-image-alignment", js.undefined)
      
      @scala.inline
      def `setSet-image-float`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "set-image-float", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setSet-image-floatUndefined`: Self = StObject.set(x, "set-image-float", js.undefined)
      
      @scala.inline
      def `setSet-image-link`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "set-image-link", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setSet-image-link-target`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "set-image-link-target", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setSet-image-link-targetUndefined`: Self = StObject.set(x, "set-image-link-target", js.undefined)
      
      @scala.inline
      def `setSet-image-linkUndefined`: Self = StObject.set(x, "set-image-link", js.undefined)
      
      @scala.inline
      def `setSet-image-size`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "set-image-size", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setSet-image-sizeUndefined`: Self = StObject.set(x, "set-image-size", js.undefined)
      
      @scala.inline
      def `setToggle-font-family`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "toggle-font-family", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setToggle-font-familyUndefined`: Self = StObject.set(x, "toggle-font-family", js.undefined)
      
      @scala.inline
      def `setToggle-font-size`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "toggle-font-size", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setToggle-font-sizeUndefined`: Self = StObject.set(x, "toggle-font-size", js.undefined)
      
      @scala.inline
      def `setToggle-inline-style`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "toggle-inline-style", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setToggle-inline-styleUndefined`: Self = StObject.set(x, "toggle-inline-style", js.undefined)
      
      @scala.inline
      def `setToggle-letter-spacing`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "toggle-letter-spacing", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setToggle-letter-spacingUndefined`: Self = StObject.set(x, "toggle-letter-spacing", js.undefined)
      
      @scala.inline
      def `setToggle-line-height`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "toggle-line-height", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setToggle-line-heightUndefined`: Self = StObject.set(x, "toggle-line-height", js.undefined)
      
      @scala.inline
      def `setToggle-link`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "toggle-link", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setToggle-linkUndefined`: Self = StObject.set(x, "toggle-link", js.undefined)
      
      @scala.inline
      def `setToggle-text-alignment`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "toggle-text-alignment", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setToggle-text-alignmentUndefined`: Self = StObject.set(x, "toggle-text-alignment", js.undefined)
      
      @scala.inline
      def `setToggle-text-background-color`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "toggle-text-background-color", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setToggle-text-background-colorUndefined`: Self = StObject.set(x, "toggle-text-background-color", js.undefined)
      
      @scala.inline
      def `setToggle-text-color`(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "toggle-text-color", js.Any.fromFunction1(value))
      
      @scala.inline
      def `setToggle-text-colorUndefined`: Self = StObject.set(x, "toggle-text-color", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.braftEditor.braftEditorStrings.`float-left`
    - typingsSlinky.braftEditor.braftEditorStrings.`float-right`
    - typingsSlinky.braftEditor.braftEditorStrings.`align-left`
    - typingsSlinky.braftEditor.braftEditorStrings.`align-center`
    - typingsSlinky.braftEditor.braftEditorStrings.`align-right`
    - typingsSlinky.braftEditor.braftEditorStrings.link
    - typingsSlinky.braftEditor.braftEditorStrings.size
    - typingsSlinky.braftEditor.braftEditorStrings.remove
    - typingsSlinky.braftEditor.anon.OnClick
  */
  trait ImageControlType extends StObject
  
  @js.native
  trait MediaType extends StObject {
    
    var accepts: js.UndefOr[Audio] = js.native
    
    var externals: js.UndefOr[Embed] = js.native
    
    var items: js.UndefOr[js.Array[_]] = js.native
    
    var onChange: js.UndefOr[js.Function] = js.native
    
    var onInsert: js.UndefOr[js.Function] = js.native
    
    var pasteImage: js.UndefOr[Boolean] = js.native
    
    var uploadFn: js.UndefOr[js.Function1[/* params */ Error, Unit]] = js.native
    
    var validateFn: js.UndefOr[js.Function1[/* file */ File, Boolean | js.Thenable[_]]] = js.native
  }
  object MediaType {
    
    @scala.inline
    def apply(): MediaType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaType]
    }
    
    @scala.inline
    implicit class MediaTypeMutableBuilder[Self <: MediaType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepts(value: Audio): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      @scala.inline
      def setExternals(value: Embed): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalsUndefined: Self = StObject.set(x, "externals", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnInsert(value: js.Function): Self = StObject.set(x, "onInsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInsertUndefined: Self = StObject.set(x, "onInsert", js.undefined)
      
      @scala.inline
      def setPasteImage(value: Boolean): Self = StObject.set(x, "pasteImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasteImageUndefined: Self = StObject.set(x, "pasteImage", js.undefined)
      
      @scala.inline
      def setUploadFn(value: /* params */ Error => Unit): Self = StObject.set(x, "uploadFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUploadFnUndefined: Self = StObject.set(x, "uploadFn", js.undefined)
      
      @scala.inline
      def setValidateFn(value: /* file */ File => Boolean | js.Thenable[_]): Self = StObject.set(x, "validateFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateFnUndefined: Self = StObject.set(x, "validateFn", js.undefined)
    }
  }
}
