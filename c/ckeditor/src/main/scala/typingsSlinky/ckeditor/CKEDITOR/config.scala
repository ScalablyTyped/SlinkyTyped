package typingsSlinky.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.config.styleObject
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.editor.eventObject
import typingsSlinky.ckeditor.CKEDITOR.filter.allowedContentRule
import typingsSlinky.ckeditor.CKEDITOR.filter.allowedContentRules
import typingsSlinky.ckeditor.CKEDITOR.filter.disallowedContentRules
import typingsSlinky.ckeditor.anon.Groups
import typingsSlinky.ckeditor.ckeditorStrings.html
import typingsSlinky.ckeditor.ckeditorStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://docs.com/ckeditor4/latest/api/CKEDITOR_config.html
@js.native
trait config extends StObject {
  
  var allowedContent: js.UndefOr[Boolean | allowedContentRules] = js.native
  
  var autoEmbed_widget: js.UndefOr[String | (js.Function1[/* url */ String, String])] = js.native
  
  var autoGrow_bottomSpace: js.UndefOr[Double] = js.native
  
  var autoGrow_maxHeight: js.UndefOr[Double] = js.native
  
  var autoGrow_minHeight: js.UndefOr[Double] = js.native
  
  var autoGrow_onStartup: js.UndefOr[Boolean] = js.native
  
  var autoUpdateElement: js.UndefOr[Boolean] = js.native
  
  var baseFloatZIndex: js.UndefOr[Double] = js.native
  
  var baseHref: js.UndefOr[String] = js.native
  
  var basicEntities: js.UndefOr[Boolean] = js.native
  
  var blockedKeystrokes: js.UndefOr[js.Array[Double]] = js.native
  
  var bodyClass: js.UndefOr[String] = js.native
  
  var bodyId: js.UndefOr[String] = js.native
  
  var browserContextMenuOnCtrl: js.UndefOr[Boolean] = js.native
  
  var clipboard_defaultContentType: js.UndefOr[html | text] = js.native
  
  var clipboard_notificationDuration: js.UndefOr[Double] = js.native
  
  var cloudServices_tokenUrl: js.UndefOr[String] = js.native
  
  var cloudServices_uploadUrl: js.UndefOr[String] = js.native
  
  var coceSnippet_theme: js.UndefOr[String] = js.native
  
  var codeSnippetGeshi_url: js.UndefOr[String] = js.native
  
  var codeSnippet_codeClass: js.UndefOr[String] = js.native
  
  var codeSnippet_languages: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var colorButton_backStyle: js.UndefOr[styleObject] = js.native
  
  var colorButton_colors: js.UndefOr[String] = js.native
  
  var colorButton_colorsPerRow: js.UndefOr[Double] = js.native
  
  var colorButton_enableAutomatic: js.UndefOr[Boolean] = js.native
  
  var colorButton_enableMore: js.UndefOr[Boolean] = js.native
  
  var colorButton_foreStyle: js.UndefOr[styleObject] = js.native
  
  var colorButton_normalizeBackground: js.UndefOr[Boolean] = js.native
  
  var contentsCss: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentsLangDirection: js.UndefOr[String] = js.native
  
  var contentsLanguage: js.UndefOr[String] = js.native
  
  var copyFormatting_allowRules: js.UndefOr[String] = js.native
  
  var copyFormatting_allowedContexts: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var copyFormatting_keystrokeCopy: js.UndefOr[Double] = js.native
  
  var copyFormatting_keystrokePaste: js.UndefOr[Double] = js.native
  
  var copyFormatting_outerCursor: js.UndefOr[Boolean] = js.native
  
  var coreStyles_bold: js.UndefOr[styleObject] = js.native
  
  var coreStyles_italic: js.UndefOr[styleObject] = js.native
  
  var coreStyles_strike: js.UndefOr[styleObject] = js.native
  
  var coreStyles_subscript: js.UndefOr[styleObject] = js.native
  
  var coreStyles_superscript: js.UndefOr[styleObject] = js.native
  
  var coreStyles_underline: js.UndefOr[styleObject] = js.native
  
  var customConfig: js.UndefOr[String] = js.native
  
  var dataIndentationChars: js.UndefOr[String] = js.native
  
  var defaultLanguage: js.UndefOr[String] = js.native
  
  var devtools_styles: js.UndefOr[String] = js.native
  
  var devtools_textCallback: js.UndefOr[
    js.Function4[
      /* editor */ editor, 
      /* dialog */ dialog, 
      /* element */ element, 
      /* tabName */ String, 
      String
    ]
  ] = js.native
  
  var dialog_backgroundCoverColor: js.UndefOr[String] = js.native
  
  var dialog_backgroundCoverOpacity: js.UndefOr[Double] = js.native
  
  var dialog_buttonsOrder: js.UndefOr[String] = js.native
  
  var dialog_magnetDistance: js.UndefOr[Double] = js.native
  
  var dialog_noConfirmCancel: js.UndefOr[Boolean] = js.native
  
  var dialog_startupFocusTab: js.UndefOr[Boolean] = js.native
  
  var disableNativeObjectResizing: js.UndefOr[Boolean] = js.native
  
  var disableNativeReadonlyStyling: js.UndefOr[Boolean] = js.native
  
  var disableNativeSpellChecker: js.UndefOr[Boolean] = js.native
  
  var disableNativeTableHandles: js.UndefOr[Boolean] = js.native
  
  var disallowedContent: js.UndefOr[disallowedContentRules] = js.native
  
  var div_wrapTable: js.UndefOr[Boolean] = js.native
  
  var docType: js.UndefOr[String] = js.native
  
  var easyimage_class: js.UndefOr[String] = js.native
  
  var easyimage_defaultStyle: js.UndefOr[String] = js.native
  
  var easyimage_styles: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var easyimage_toolbar: js.UndefOr[js.Array[String] | String] = js.native
  
  var emailProtection: js.UndefOr[String] = js.native
  
  var embed_provider: js.UndefOr[String] = js.native
  
  var emoji_emojiListUrl: js.UndefOr[String] = js.native
  
  var emoji_minChars: js.UndefOr[Double] = js.native
  
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  
  var enableTabKeyTools: js.UndefOr[Boolean] = js.native
  
  var enterMode: js.UndefOr[Double] = js.native
  
  var entities: js.UndefOr[Boolean] = js.native
  
  var entities_additional: js.UndefOr[String] = js.native
  
  var entities_greek: js.UndefOr[Boolean] = js.native
  
  var entities_latin: js.UndefOr[Boolean] = js.native
  
  var entities_processNumerical: js.UndefOr[Boolean | String] = js.native
  
  var extraAllowedContent: js.UndefOr[allowedContentRules] = js.native
  
  var extraPlugins: js.UndefOr[String] = js.native
  
  var fileTools_defaultFileName: js.UndefOr[String] = js.native
  
  var fileTools_requestHeaders: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var filebrowserBrowseUrl: js.UndefOr[String] = js.native
  
  var filebrowserFlashBrowseUrl: js.UndefOr[String] = js.native
  
  var filebrowserFlashUploadUrl: js.UndefOr[String] = js.native
  
  var filebrowserImageBrowseLinkUrl: js.UndefOr[String] = js.native
  
  var filebrowserImageBrowseUrl: js.UndefOr[String] = js.native
  
  var filebrowserImageUploadUrl: js.UndefOr[String] = js.native
  
  var filebrowserUploadMethod: js.UndefOr[String] = js.native
  
  var filebrowserUploadUrl: js.UndefOr[String] = js.native
  
  var filebrowserWindowFeatures: js.UndefOr[String] = js.native
  
  var filebrowserWindowHeight: js.UndefOr[Double | String] = js.native
  
  var filebrowserWindowWidth: js.UndefOr[Double | String] = js.native
  
  var fillEmptyBlocks: js.UndefOr[
    Boolean | (js.Function1[/* element */ typingsSlinky.ckeditor.CKEDITOR.htmlParser.element, Boolean])
  ] = js.native
  
  var find_highlight: js.UndefOr[styleObject] = js.native
  
  var flashAddEmbedTag: js.UndefOr[Boolean] = js.native
  
  var flashConvertOnEdit: js.UndefOr[Boolean] = js.native
  
  var flashEmbedTagOnly: js.UndefOr[Boolean] = js.native
  
  var floatSpaceDockedOffsetX: js.UndefOr[Double] = js.native
  
  var floatSpaceDockedOffsetY: js.UndefOr[Double] = js.native
  
  var floatSpacePinnedOffsetX: js.UndefOr[Double] = js.native
  
  var floatSpacePinnedOffsetY: js.UndefOr[Double] = js.native
  
  var floatSpacePreferRight: js.UndefOr[Boolean] = js.native
  
  var fontSize_defaultLabel: js.UndefOr[String] = js.native
  
  var fontSize_sizes: js.UndefOr[String] = js.native
  
  var fontSize_style: js.UndefOr[styleObject] = js.native
  
  var font_defaultLabel: js.UndefOr[String] = js.native
  
  var font_names: js.UndefOr[String] = js.native
  
  var font_style: js.UndefOr[styleObject] = js.native
  
  var forceEnterMode: js.UndefOr[Boolean] = js.native
  
  var forcePasteAsPlainText: js.UndefOr[Boolean] = js.native
  
  var forceSimpleAmpersand: js.UndefOr[Boolean] = js.native
  
  var format_address: js.UndefOr[styleObject] = js.native
  
  var format_div: js.UndefOr[styleObject] = js.native
  
  var format_h1: js.UndefOr[styleObject] = js.native
  
  var format_h2: js.UndefOr[styleObject] = js.native
  
  var format_h3: js.UndefOr[styleObject] = js.native
  
  var format_h4: js.UndefOr[styleObject] = js.native
  
  var format_h5: js.UndefOr[styleObject] = js.native
  
  var format_h6: js.UndefOr[styleObject] = js.native
  
  var format_p: js.UndefOr[styleObject] = js.native
  
  var format_pre: js.UndefOr[styleObject] = js.native
  
  var format_tags: js.UndefOr[String] = js.native
  
  var fullPage: js.UndefOr[Boolean] = js.native
  
  var grayt_autoStartup: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[String | Double] = js.native
  
  var htmlEncodeOutput: js.UndefOr[Boolean] = js.native
  
  var ignoreEmptyParagraph: js.UndefOr[Boolean] = js.native
  
  var image2_alignClasses: js.UndefOr[js.Array[String]] = js.native
  
  var image2_altRequired: js.UndefOr[Boolean] = js.native
  
  var image2_captionedClass: js.UndefOr[String] = js.native
  
  var image2_disableResizer: js.UndefOr[Boolean] = js.native
  
  var image2_prefillDimensions: js.UndefOr[Boolean] = js.native
  
  var imageUploadUrl: js.UndefOr[String] = js.native
  
  var image_prefillDimensions: js.UndefOr[Boolean] = js.native
  
  var image_previewText: js.UndefOr[String] = js.native
  
  var image_removeLinkByEmptyUrl: js.UndefOr[Boolean] = js.native
  
  var indentClasses: js.UndefOr[js.Array[String]] = js.native
  
  var indentOffset: js.UndefOr[Double] = js.native
  
  var indentUnit: js.UndefOr[String] = js.native
  
  var jqueryOverrideVal: js.UndefOr[Boolean] = js.native
  
  var justifyClasses: js.UndefOr[js.Array[String]] = js.native
  
  var keystrokes: js.UndefOr[js.Array[js.Tuple2[Double, String]]] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var language_list: js.UndefOr[js.Array[String]] = js.native
  
  var linkJavaScriptLinksAllowed: js.UndefOr[Boolean] = js.native
  
  var linkShowAdvancedTab: js.UndefOr[Boolean] = js.native
  
  var linkShowTargetTab: js.UndefOr[Boolean] = js.native
  
  var magicline_color: js.UndefOr[String] = js.native
  
  var magicline_everywhere: js.UndefOr[Boolean] = js.native
  
  var magicline_holdDistance: js.UndefOr[Double] = js.native
  
  var magicline_keystrokeNext: js.UndefOr[Double] = js.native
  
  var magicline_keystrokePrevious: js.UndefOr[Double] = js.native
  
  var magicline_tabuList: js.UndefOr[js.Array[String]] = js.native
  
  var magicline_triggerOffset: js.UndefOr[Double] = js.native
  
  var mathJaxClass: js.UndefOr[String] = js.native
  
  var mathJaxLib: js.UndefOr[String] = js.native
  
  var menu_groups: js.UndefOr[String] = js.native
  
  var menu_subMenuDelay: js.UndefOr[Double] = js.native
  
  var newpage_html: js.UndefOr[String] = js.native
  
  var notification_duration: js.UndefOr[Double] = js.native
  
  var on: js.UndefOr[eventObject] = js.native
  
  var pasteFilter: js.UndefOr[String] = js.native
  
  var pasteFromWordCleanupFile: js.UndefOr[String] = js.native
  
  var pasteFromWordNumberedHeadingToList: js.UndefOr[Boolean] = js.native
  
  var pasteFromWordPromptCleanup: js.UndefOr[Boolean] = js.native
  
  var pasteFromWordRemoveFontStyles: js.UndefOr[Boolean] = js.native
  
  var pasteFromWordRemoveStyles: js.UndefOr[Boolean] = js.native
  
  var pasteFromWord_heuristicsEdgeList: js.UndefOr[Boolean] = js.native
  
  var pasteFromWord_inlineImages: js.UndefOr[Boolean] = js.native
  
  var plugins: js.UndefOr[String] = js.native
  
  var protectedSource: js.UndefOr[js.Array[js.RegExp]] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var removeButtons: js.UndefOr[String] = js.native
  
  var removeDialogTabs: js.UndefOr[String] = js.native
  
  var removeFormatAttributes: js.UndefOr[String] = js.native
  
  var removeFormatTags: js.UndefOr[String] = js.native
  
  var removePlugins: js.UndefOr[String] = js.native
  
  var resize_dir: js.UndefOr[String] = js.native
  
  var resize_enabled: js.UndefOr[Boolean] = js.native
  
  var resize_maxHeight: js.UndefOr[Double] = js.native
  
  var resize_maxWidth: js.UndefOr[Double] = js.native
  
  var resize_minHeight: js.UndefOr[Double] = js.native
  
  var resize_minWidth: js.UndefOr[Double] = js.native
  
  var scayt_autoStartup: js.UndefOr[Boolean] = js.native
  
  var scayt_contextCommands: js.UndefOr[String] = js.native
  
  var scayt_contextMenuItemsOrder: js.UndefOr[String] = js.native
  
  var scayt_customDictionaryIds: js.UndefOr[String] = js.native
  
  var scayt_customerId: js.UndefOr[String] = js.native
  
  var scayt_disableOptionsStorage: js.UndefOr[String | js.Array[String]] = js.native
  
  var scayt_elementsToIgnore: js.UndefOr[String] = js.native
  
  var scayt_handleCheckDirty: js.UndefOr[String] = js.native
  
  var scayt_handleUndoRedo: js.UndefOr[String] = js.native
  
  var scayt_ignoreAllCapsWords: js.UndefOr[Boolean] = js.native
  
  var scayt_ignoreDomainNames: js.UndefOr[Boolean] = js.native
  
  var scayt_ignoreWordsWithMixedCases: js.UndefOr[Boolean] = js.native
  
  var scayt_ignoreWordsWithNumbers: js.UndefOr[Boolean] = js.native
  
  var scayt_inlineModeImmediateMarkup: js.UndefOr[Boolean] = js.native
  
  var scayt_maxSuggestions: js.UndefOr[Double] = js.native
  
  var scayt_minWordLength: js.UndefOr[Double] = js.native
  
  var scayt_moreSuggestions: js.UndefOr[String] = js.native
  
  var scayt_multiLanguageMode: js.UndefOr[Boolean] = js.native
  
  var scayt_multiLanguageStyles: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var scayt_sLang: js.UndefOr[String] = js.native
  
  var scayt_serviceHost: js.UndefOr[String] = js.native
  
  var scayt_servicePath: js.UndefOr[String] = js.native
  
  var scayt_servicePort: js.UndefOr[String] = js.native
  
  var scayt_serviceProtocol: js.UndefOr[String] = js.native
  
  var scayt_srcUrl: js.UndefOr[String] = js.native
  
  var scayt_uiTabs: js.UndefOr[String] = js.native
  
  var scayt_userDictionaryName: js.UndefOr[String] = js.native
  
  var sharedSpaces: js.UndefOr[sharedSpace] = js.native
  
  var shiftEnterMode: js.UndefOr[Double] = js.native
  
  var skin: js.UndefOr[String] = js.native
  
  var smiley_columns: js.UndefOr[Double] = js.native
  
  var smiley_descriptions: js.UndefOr[js.Array[String]] = js.native
  
  var smiley_images: js.UndefOr[js.Array[String]] = js.native
  
  var smiley_path: js.UndefOr[String] = js.native
  
  var sourceAreaTabSize: js.UndefOr[Double] = js.native
  
  var specialChars: js.UndefOr[js.Array[String | (js.Tuple2[String, String])]] = js.native
  
  var startupFocus: js.UndefOr[String | Boolean] = js.native
  
  var startupMode: js.UndefOr[String] = js.native
  
  var startupOutlineBlocks: js.UndefOr[Boolean] = js.native
  
  var startupShowBorders: js.UndefOr[Boolean] = js.native
  
  var stylesSet: js.UndefOr[String | Boolean | js.Array[styleObject]] = js.native
  
  var stylesheetParser_skipSelectors: js.UndefOr[js.RegExp] = js.native
  
  var stylesheetParser_validSelectors: js.UndefOr[js.RegExp] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var tabSpaces: js.UndefOr[Double] = js.native
  
  var templates: js.UndefOr[String] = js.native
  
  var templates_files: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var templates_replaceContent: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String | Boolean] = js.native
  
  var toolbar: js.UndefOr[String | (js.Array[String | js.Array[String] | Groups]) | Null] = js.native
  
  var toolbarCanCollapse: js.UndefOr[Boolean] = js.native
  
  var toolbarGroupCycling: js.UndefOr[Boolean] = js.native
  
  var toolbarGroups: js.UndefOr[js.Array[typingsSlinky.ckeditor.CKEDITOR.toolbarGroups | String]] = js.native
  
  var toolbarLocation: js.UndefOr[String] = js.native
  
  var toolbarStartupExpanded: js.UndefOr[Boolean] = js.native
  
  var uiColor: js.UndefOr[String] = js.native
  
  var undoStackSize: js.UndefOr[Double] = js.native
  
  var uploadUrl: js.UndefOr[String] = js.native
  
  var useComputedState: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
  
  var wsc_cmd: js.UndefOr[String] = js.native
  
  var wsc_customDictionaryIds: js.UndefOr[String] = js.native
  
  var wsc_customLoaderScript: js.UndefOr[String] = js.native
  
  var wsc_customerId: js.UndefOr[String] = js.native
  
  var wsc_height: js.UndefOr[String] = js.native
  
  var wsc_lang: js.UndefOr[String] = js.native
  
  var wsc_left: js.UndefOr[String] = js.native
  
  var wsc_top: js.UndefOr[String] = js.native
  
  var wsc_userDictionaryName: js.UndefOr[String] = js.native
  
  var wsc_width: js.UndefOr[String] = js.native
}
object config {
  
  @scala.inline
  def apply(): config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[config]
  }
  
  @scala.inline
  implicit class configMutableBuilder[Self <: config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedContent(value: Boolean | allowedContentRules): Self = StObject.set(x, "allowedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedContentUndefined: Self = StObject.set(x, "allowedContent", js.undefined)
    
    @scala.inline
    def setAllowedContentVarargs(value: allowedContentRule*): Self = StObject.set(x, "allowedContent", js.Array(value :_*))
    
    @scala.inline
    def setAutoEmbed_widget(value: String | (js.Function1[/* url */ String, String])): Self = StObject.set(x, "autoEmbed_widget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoEmbed_widgetFunction1(value: /* url */ String => String): Self = StObject.set(x, "autoEmbed_widget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutoEmbed_widgetUndefined: Self = StObject.set(x, "autoEmbed_widget", js.undefined)
    
    @scala.inline
    def setAutoGrow_bottomSpace(value: Double): Self = StObject.set(x, "autoGrow_bottomSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGrow_bottomSpaceUndefined: Self = StObject.set(x, "autoGrow_bottomSpace", js.undefined)
    
    @scala.inline
    def setAutoGrow_maxHeight(value: Double): Self = StObject.set(x, "autoGrow_maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGrow_maxHeightUndefined: Self = StObject.set(x, "autoGrow_maxHeight", js.undefined)
    
    @scala.inline
    def setAutoGrow_minHeight(value: Double): Self = StObject.set(x, "autoGrow_minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGrow_minHeightUndefined: Self = StObject.set(x, "autoGrow_minHeight", js.undefined)
    
    @scala.inline
    def setAutoGrow_onStartup(value: Boolean): Self = StObject.set(x, "autoGrow_onStartup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGrow_onStartupUndefined: Self = StObject.set(x, "autoGrow_onStartup", js.undefined)
    
    @scala.inline
    def setAutoUpdateElement(value: Boolean): Self = StObject.set(x, "autoUpdateElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateElementUndefined: Self = StObject.set(x, "autoUpdateElement", js.undefined)
    
    @scala.inline
    def setBaseFloatZIndex(value: Double): Self = StObject.set(x, "baseFloatZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseFloatZIndexUndefined: Self = StObject.set(x, "baseFloatZIndex", js.undefined)
    
    @scala.inline
    def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
    
    @scala.inline
    def setBasicEntities(value: Boolean): Self = StObject.set(x, "basicEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicEntitiesUndefined: Self = StObject.set(x, "basicEntities", js.undefined)
    
    @scala.inline
    def setBlockedKeystrokes(value: js.Array[Double]): Self = StObject.set(x, "blockedKeystrokes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedKeystrokesUndefined: Self = StObject.set(x, "blockedKeystrokes", js.undefined)
    
    @scala.inline
    def setBlockedKeystrokesVarargs(value: Double*): Self = StObject.set(x, "blockedKeystrokes", js.Array(value :_*))
    
    @scala.inline
    def setBodyClass(value: String): Self = StObject.set(x, "bodyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyClassUndefined: Self = StObject.set(x, "bodyClass", js.undefined)
    
    @scala.inline
    def setBodyId(value: String): Self = StObject.set(x, "bodyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyIdUndefined: Self = StObject.set(x, "bodyId", js.undefined)
    
    @scala.inline
    def setBrowserContextMenuOnCtrl(value: Boolean): Self = StObject.set(x, "browserContextMenuOnCtrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserContextMenuOnCtrlUndefined: Self = StObject.set(x, "browserContextMenuOnCtrl", js.undefined)
    
    @scala.inline
    def setClipboard_defaultContentType(value: html | text): Self = StObject.set(x, "clipboard_defaultContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipboard_defaultContentTypeUndefined: Self = StObject.set(x, "clipboard_defaultContentType", js.undefined)
    
    @scala.inline
    def setClipboard_notificationDuration(value: Double): Self = StObject.set(x, "clipboard_notificationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipboard_notificationDurationUndefined: Self = StObject.set(x, "clipboard_notificationDuration", js.undefined)
    
    @scala.inline
    def setCloudServices_tokenUrl(value: String): Self = StObject.set(x, "cloudServices_tokenUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudServices_tokenUrlUndefined: Self = StObject.set(x, "cloudServices_tokenUrl", js.undefined)
    
    @scala.inline
    def setCloudServices_uploadUrl(value: String): Self = StObject.set(x, "cloudServices_uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudServices_uploadUrlUndefined: Self = StObject.set(x, "cloudServices_uploadUrl", js.undefined)
    
    @scala.inline
    def setCoceSnippet_theme(value: String): Self = StObject.set(x, "coceSnippet_theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoceSnippet_themeUndefined: Self = StObject.set(x, "coceSnippet_theme", js.undefined)
    
    @scala.inline
    def setCodeSnippetGeshi_url(value: String): Self = StObject.set(x, "codeSnippetGeshi_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSnippetGeshi_urlUndefined: Self = StObject.set(x, "codeSnippetGeshi_url", js.undefined)
    
    @scala.inline
    def setCodeSnippet_codeClass(value: String): Self = StObject.set(x, "codeSnippet_codeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSnippet_codeClassUndefined: Self = StObject.set(x, "codeSnippet_codeClass", js.undefined)
    
    @scala.inline
    def setCodeSnippet_languages(value: StringDictionary[js.Any]): Self = StObject.set(x, "codeSnippet_languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSnippet_languagesUndefined: Self = StObject.set(x, "codeSnippet_languages", js.undefined)
    
    @scala.inline
    def setColorButton_backStyle(value: styleObject): Self = StObject.set(x, "colorButton_backStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorButton_backStyleUndefined: Self = StObject.set(x, "colorButton_backStyle", js.undefined)
    
    @scala.inline
    def setColorButton_colors(value: String): Self = StObject.set(x, "colorButton_colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorButton_colorsPerRow(value: Double): Self = StObject.set(x, "colorButton_colorsPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorButton_colorsPerRowUndefined: Self = StObject.set(x, "colorButton_colorsPerRow", js.undefined)
    
    @scala.inline
    def setColorButton_colorsUndefined: Self = StObject.set(x, "colorButton_colors", js.undefined)
    
    @scala.inline
    def setColorButton_enableAutomatic(value: Boolean): Self = StObject.set(x, "colorButton_enableAutomatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorButton_enableAutomaticUndefined: Self = StObject.set(x, "colorButton_enableAutomatic", js.undefined)
    
    @scala.inline
    def setColorButton_enableMore(value: Boolean): Self = StObject.set(x, "colorButton_enableMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorButton_enableMoreUndefined: Self = StObject.set(x, "colorButton_enableMore", js.undefined)
    
    @scala.inline
    def setColorButton_foreStyle(value: styleObject): Self = StObject.set(x, "colorButton_foreStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorButton_foreStyleUndefined: Self = StObject.set(x, "colorButton_foreStyle", js.undefined)
    
    @scala.inline
    def setColorButton_normalizeBackground(value: Boolean): Self = StObject.set(x, "colorButton_normalizeBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorButton_normalizeBackgroundUndefined: Self = StObject.set(x, "colorButton_normalizeBackground", js.undefined)
    
    @scala.inline
    def setContentsCss(value: String | js.Array[String]): Self = StObject.set(x, "contentsCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsCssUndefined: Self = StObject.set(x, "contentsCss", js.undefined)
    
    @scala.inline
    def setContentsCssVarargs(value: String*): Self = StObject.set(x, "contentsCss", js.Array(value :_*))
    
    @scala.inline
    def setContentsLangDirection(value: String): Self = StObject.set(x, "contentsLangDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsLangDirectionUndefined: Self = StObject.set(x, "contentsLangDirection", js.undefined)
    
    @scala.inline
    def setContentsLanguage(value: String): Self = StObject.set(x, "contentsLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsLanguageUndefined: Self = StObject.set(x, "contentsLanguage", js.undefined)
    
    @scala.inline
    def setCopyFormatting_allowRules(value: String): Self = StObject.set(x, "copyFormatting_allowRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyFormatting_allowRulesUndefined: Self = StObject.set(x, "copyFormatting_allowRules", js.undefined)
    
    @scala.inline
    def setCopyFormatting_allowedContexts(value: Boolean | js.Array[String]): Self = StObject.set(x, "copyFormatting_allowedContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyFormatting_allowedContextsUndefined: Self = StObject.set(x, "copyFormatting_allowedContexts", js.undefined)
    
    @scala.inline
    def setCopyFormatting_allowedContextsVarargs(value: String*): Self = StObject.set(x, "copyFormatting_allowedContexts", js.Array(value :_*))
    
    @scala.inline
    def setCopyFormatting_keystrokeCopy(value: Double): Self = StObject.set(x, "copyFormatting_keystrokeCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyFormatting_keystrokeCopyUndefined: Self = StObject.set(x, "copyFormatting_keystrokeCopy", js.undefined)
    
    @scala.inline
    def setCopyFormatting_keystrokePaste(value: Double): Self = StObject.set(x, "copyFormatting_keystrokePaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyFormatting_keystrokePasteUndefined: Self = StObject.set(x, "copyFormatting_keystrokePaste", js.undefined)
    
    @scala.inline
    def setCopyFormatting_outerCursor(value: Boolean): Self = StObject.set(x, "copyFormatting_outerCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyFormatting_outerCursorUndefined: Self = StObject.set(x, "copyFormatting_outerCursor", js.undefined)
    
    @scala.inline
    def setCoreStyles_bold(value: styleObject): Self = StObject.set(x, "coreStyles_bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreStyles_boldUndefined: Self = StObject.set(x, "coreStyles_bold", js.undefined)
    
    @scala.inline
    def setCoreStyles_italic(value: styleObject): Self = StObject.set(x, "coreStyles_italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreStyles_italicUndefined: Self = StObject.set(x, "coreStyles_italic", js.undefined)
    
    @scala.inline
    def setCoreStyles_strike(value: styleObject): Self = StObject.set(x, "coreStyles_strike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreStyles_strikeUndefined: Self = StObject.set(x, "coreStyles_strike", js.undefined)
    
    @scala.inline
    def setCoreStyles_subscript(value: styleObject): Self = StObject.set(x, "coreStyles_subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreStyles_subscriptUndefined: Self = StObject.set(x, "coreStyles_subscript", js.undefined)
    
    @scala.inline
    def setCoreStyles_superscript(value: styleObject): Self = StObject.set(x, "coreStyles_superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreStyles_superscriptUndefined: Self = StObject.set(x, "coreStyles_superscript", js.undefined)
    
    @scala.inline
    def setCoreStyles_underline(value: styleObject): Self = StObject.set(x, "coreStyles_underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreStyles_underlineUndefined: Self = StObject.set(x, "coreStyles_underline", js.undefined)
    
    @scala.inline
    def setCustomConfig(value: String): Self = StObject.set(x, "customConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomConfigUndefined: Self = StObject.set(x, "customConfig", js.undefined)
    
    @scala.inline
    def setDataIndentationChars(value: String): Self = StObject.set(x, "dataIndentationChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIndentationCharsUndefined: Self = StObject.set(x, "dataIndentationChars", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    @scala.inline
    def setDevtools_styles(value: String): Self = StObject.set(x, "devtools_styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevtools_stylesUndefined: Self = StObject.set(x, "devtools_styles", js.undefined)
    
    @scala.inline
    def setDevtools_textCallback(
      value: (/* editor */ editor, /* dialog */ dialog, /* element */ element, /* tabName */ String) => String
    ): Self = StObject.set(x, "devtools_textCallback", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDevtools_textCallbackUndefined: Self = StObject.set(x, "devtools_textCallback", js.undefined)
    
    @scala.inline
    def setDialog_backgroundCoverColor(value: String): Self = StObject.set(x, "dialog_backgroundCoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_backgroundCoverColorUndefined: Self = StObject.set(x, "dialog_backgroundCoverColor", js.undefined)
    
    @scala.inline
    def setDialog_backgroundCoverOpacity(value: Double): Self = StObject.set(x, "dialog_backgroundCoverOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_backgroundCoverOpacityUndefined: Self = StObject.set(x, "dialog_backgroundCoverOpacity", js.undefined)
    
    @scala.inline
    def setDialog_buttonsOrder(value: String): Self = StObject.set(x, "dialog_buttonsOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_buttonsOrderUndefined: Self = StObject.set(x, "dialog_buttonsOrder", js.undefined)
    
    @scala.inline
    def setDialog_magnetDistance(value: Double): Self = StObject.set(x, "dialog_magnetDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_magnetDistanceUndefined: Self = StObject.set(x, "dialog_magnetDistance", js.undefined)
    
    @scala.inline
    def setDialog_noConfirmCancel(value: Boolean): Self = StObject.set(x, "dialog_noConfirmCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_noConfirmCancelUndefined: Self = StObject.set(x, "dialog_noConfirmCancel", js.undefined)
    
    @scala.inline
    def setDialog_startupFocusTab(value: Boolean): Self = StObject.set(x, "dialog_startupFocusTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_startupFocusTabUndefined: Self = StObject.set(x, "dialog_startupFocusTab", js.undefined)
    
    @scala.inline
    def setDisableNativeObjectResizing(value: Boolean): Self = StObject.set(x, "disableNativeObjectResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableNativeObjectResizingUndefined: Self = StObject.set(x, "disableNativeObjectResizing", js.undefined)
    
    @scala.inline
    def setDisableNativeReadonlyStyling(value: Boolean): Self = StObject.set(x, "disableNativeReadonlyStyling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableNativeReadonlyStylingUndefined: Self = StObject.set(x, "disableNativeReadonlyStyling", js.undefined)
    
    @scala.inline
    def setDisableNativeSpellChecker(value: Boolean): Self = StObject.set(x, "disableNativeSpellChecker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableNativeSpellCheckerUndefined: Self = StObject.set(x, "disableNativeSpellChecker", js.undefined)
    
    @scala.inline
    def setDisableNativeTableHandles(value: Boolean): Self = StObject.set(x, "disableNativeTableHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableNativeTableHandlesUndefined: Self = StObject.set(x, "disableNativeTableHandles", js.undefined)
    
    @scala.inline
    def setDisallowedContent(value: disallowedContentRules): Self = StObject.set(x, "disallowedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallowedContentUndefined: Self = StObject.set(x, "disallowedContent", js.undefined)
    
    @scala.inline
    def setDiv_wrapTable(value: Boolean): Self = StObject.set(x, "div_wrapTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiv_wrapTableUndefined: Self = StObject.set(x, "div_wrapTable", js.undefined)
    
    @scala.inline
    def setDocType(value: String): Self = StObject.set(x, "docType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocTypeUndefined: Self = StObject.set(x, "docType", js.undefined)
    
    @scala.inline
    def setEasyimage_class(value: String): Self = StObject.set(x, "easyimage_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasyimage_classUndefined: Self = StObject.set(x, "easyimage_class", js.undefined)
    
    @scala.inline
    def setEasyimage_defaultStyle(value: String): Self = StObject.set(x, "easyimage_defaultStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasyimage_defaultStyleUndefined: Self = StObject.set(x, "easyimage_defaultStyle", js.undefined)
    
    @scala.inline
    def setEasyimage_styles(value: StringDictionary[js.Any]): Self = StObject.set(x, "easyimage_styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasyimage_stylesUndefined: Self = StObject.set(x, "easyimage_styles", js.undefined)
    
    @scala.inline
    def setEasyimage_toolbar(value: js.Array[String] | String): Self = StObject.set(x, "easyimage_toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasyimage_toolbarUndefined: Self = StObject.set(x, "easyimage_toolbar", js.undefined)
    
    @scala.inline
    def setEasyimage_toolbarVarargs(value: String*): Self = StObject.set(x, "easyimage_toolbar", js.Array(value :_*))
    
    @scala.inline
    def setEmailProtection(value: String): Self = StObject.set(x, "emailProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailProtectionUndefined: Self = StObject.set(x, "emailProtection", js.undefined)
    
    @scala.inline
    def setEmbed_provider(value: String): Self = StObject.set(x, "embed_provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbed_providerUndefined: Self = StObject.set(x, "embed_provider", js.undefined)
    
    @scala.inline
    def setEmoji_emojiListUrl(value: String): Self = StObject.set(x, "emoji_emojiListUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmoji_emojiListUrlUndefined: Self = StObject.set(x, "emoji_emojiListUrl", js.undefined)
    
    @scala.inline
    def setEmoji_minChars(value: Double): Self = StObject.set(x, "emoji_minChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmoji_minCharsUndefined: Self = StObject.set(x, "emoji_minChars", js.undefined)
    
    @scala.inline
    def setEnableContextMenu(value: Boolean): Self = StObject.set(x, "enableContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableContextMenuUndefined: Self = StObject.set(x, "enableContextMenu", js.undefined)
    
    @scala.inline
    def setEnableTabKeyTools(value: Boolean): Self = StObject.set(x, "enableTabKeyTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTabKeyToolsUndefined: Self = StObject.set(x, "enableTabKeyTools", js.undefined)
    
    @scala.inline
    def setEnterMode(value: Double): Self = StObject.set(x, "enterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterModeUndefined: Self = StObject.set(x, "enterMode", js.undefined)
    
    @scala.inline
    def setEntities(value: Boolean): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntities_additional(value: String): Self = StObject.set(x, "entities_additional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntities_additionalUndefined: Self = StObject.set(x, "entities_additional", js.undefined)
    
    @scala.inline
    def setEntities_greek(value: Boolean): Self = StObject.set(x, "entities_greek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntities_greekUndefined: Self = StObject.set(x, "entities_greek", js.undefined)
    
    @scala.inline
    def setEntities_latin(value: Boolean): Self = StObject.set(x, "entities_latin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntities_latinUndefined: Self = StObject.set(x, "entities_latin", js.undefined)
    
    @scala.inline
    def setEntities_processNumerical(value: Boolean | String): Self = StObject.set(x, "entities_processNumerical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntities_processNumericalUndefined: Self = StObject.set(x, "entities_processNumerical", js.undefined)
    
    @scala.inline
    def setExtraAllowedContent(value: allowedContentRules): Self = StObject.set(x, "extraAllowedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraAllowedContentUndefined: Self = StObject.set(x, "extraAllowedContent", js.undefined)
    
    @scala.inline
    def setExtraAllowedContentVarargs(value: allowedContentRule*): Self = StObject.set(x, "extraAllowedContent", js.Array(value :_*))
    
    @scala.inline
    def setExtraPlugins(value: String): Self = StObject.set(x, "extraPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraPluginsUndefined: Self = StObject.set(x, "extraPlugins", js.undefined)
    
    @scala.inline
    def setFileTools_defaultFileName(value: String): Self = StObject.set(x, "fileTools_defaultFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTools_defaultFileNameUndefined: Self = StObject.set(x, "fileTools_defaultFileName", js.undefined)
    
    @scala.inline
    def setFileTools_requestHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "fileTools_requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTools_requestHeadersUndefined: Self = StObject.set(x, "fileTools_requestHeaders", js.undefined)
    
    @scala.inline
    def setFilebrowserBrowseUrl(value: String): Self = StObject.set(x, "filebrowserBrowseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilebrowserBrowseUrlUndefined: Self = StObject.set(x, "filebrowserBrowseUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserFlashBrowseUrl(value: String): Self = StObject.set(x, "filebrowserFlashBrowseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilebrowserFlashBrowseUrlUndefined: Self = StObject.set(x, "filebrowserFlashBrowseUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserFlashUploadUrl(value: String): Self = StObject.set(x, "filebrowserFlashUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilebrowserFlashUploadUrlUndefined: Self = StObject.set(x, "filebrowserFlashUploadUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserImageBrowseLinkUrl(value: String): Self = StObject.set(x, "filebrowserImageBrowseLinkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilebrowserImageBrowseLinkUrlUndefined: Self = StObject.set(x, "filebrowserImageBrowseLinkUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserImageBrowseUrl(value: String): Self = StObject.set(x, "filebrowserImageBrowseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilebrowserImageBrowseUrlUndefined: Self = StObject.set(x, "filebrowserImageBrowseUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserImageUploadUrl(value: String): Self = StObject.set(x, "filebrowserImageUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilebrowserImageUploadUrlUndefined: Self = StObject.set(x, "filebrowserImageUploadUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserUploadMethod(value: String): Self = StObject.set(x, "filebrowserUploadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilebrowserUploadMethodUndefined: Self = StObject.set(x, "filebrowserUploadMethod", js.undefined)
    
    @scala.inline
    def setFilebrowserUploadUrl(value: String): Self = StObject.set(x, "filebrowserUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilebrowserUploadUrlUndefined: Self = StObject.set(x, "filebrowserUploadUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserWindowFeatures(value: String): Self = StObject.set(x, "filebrowserWindowFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilebrowserWindowFeaturesUndefined: Self = StObject.set(x, "filebrowserWindowFeatures", js.undefined)
    
    @scala.inline
    def setFilebrowserWindowHeight(value: Double | String): Self = StObject.set(x, "filebrowserWindowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilebrowserWindowHeightUndefined: Self = StObject.set(x, "filebrowserWindowHeight", js.undefined)
    
    @scala.inline
    def setFilebrowserWindowWidth(value: Double | String): Self = StObject.set(x, "filebrowserWindowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilebrowserWindowWidthUndefined: Self = StObject.set(x, "filebrowserWindowWidth", js.undefined)
    
    @scala.inline
    def setFillEmptyBlocks(
      value: Boolean | (js.Function1[/* element */ typingsSlinky.ckeditor.CKEDITOR.htmlParser.element, Boolean])
    ): Self = StObject.set(x, "fillEmptyBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillEmptyBlocksFunction1(value: /* element */ typingsSlinky.ckeditor.CKEDITOR.htmlParser.element => Boolean): Self = StObject.set(x, "fillEmptyBlocks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFillEmptyBlocksUndefined: Self = StObject.set(x, "fillEmptyBlocks", js.undefined)
    
    @scala.inline
    def setFind_highlight(value: styleObject): Self = StObject.set(x, "find_highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFind_highlightUndefined: Self = StObject.set(x, "find_highlight", js.undefined)
    
    @scala.inline
    def setFlashAddEmbedTag(value: Boolean): Self = StObject.set(x, "flashAddEmbedTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashAddEmbedTagUndefined: Self = StObject.set(x, "flashAddEmbedTag", js.undefined)
    
    @scala.inline
    def setFlashConvertOnEdit(value: Boolean): Self = StObject.set(x, "flashConvertOnEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashConvertOnEditUndefined: Self = StObject.set(x, "flashConvertOnEdit", js.undefined)
    
    @scala.inline
    def setFlashEmbedTagOnly(value: Boolean): Self = StObject.set(x, "flashEmbedTagOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashEmbedTagOnlyUndefined: Self = StObject.set(x, "flashEmbedTagOnly", js.undefined)
    
    @scala.inline
    def setFloatSpaceDockedOffsetX(value: Double): Self = StObject.set(x, "floatSpaceDockedOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatSpaceDockedOffsetXUndefined: Self = StObject.set(x, "floatSpaceDockedOffsetX", js.undefined)
    
    @scala.inline
    def setFloatSpaceDockedOffsetY(value: Double): Self = StObject.set(x, "floatSpaceDockedOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatSpaceDockedOffsetYUndefined: Self = StObject.set(x, "floatSpaceDockedOffsetY", js.undefined)
    
    @scala.inline
    def setFloatSpacePinnedOffsetX(value: Double): Self = StObject.set(x, "floatSpacePinnedOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatSpacePinnedOffsetXUndefined: Self = StObject.set(x, "floatSpacePinnedOffsetX", js.undefined)
    
    @scala.inline
    def setFloatSpacePinnedOffsetY(value: Double): Self = StObject.set(x, "floatSpacePinnedOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatSpacePinnedOffsetYUndefined: Self = StObject.set(x, "floatSpacePinnedOffsetY", js.undefined)
    
    @scala.inline
    def setFloatSpacePreferRight(value: Boolean): Self = StObject.set(x, "floatSpacePreferRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatSpacePreferRightUndefined: Self = StObject.set(x, "floatSpacePreferRight", js.undefined)
    
    @scala.inline
    def setFontSize_defaultLabel(value: String): Self = StObject.set(x, "fontSize_defaultLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize_defaultLabelUndefined: Self = StObject.set(x, "fontSize_defaultLabel", js.undefined)
    
    @scala.inline
    def setFontSize_sizes(value: String): Self = StObject.set(x, "fontSize_sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize_sizesUndefined: Self = StObject.set(x, "fontSize_sizes", js.undefined)
    
    @scala.inline
    def setFontSize_style(value: styleObject): Self = StObject.set(x, "fontSize_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize_styleUndefined: Self = StObject.set(x, "fontSize_style", js.undefined)
    
    @scala.inline
    def setFont_defaultLabel(value: String): Self = StObject.set(x, "font_defaultLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_defaultLabelUndefined: Self = StObject.set(x, "font_defaultLabel", js.undefined)
    
    @scala.inline
    def setFont_names(value: String): Self = StObject.set(x, "font_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_namesUndefined: Self = StObject.set(x, "font_names", js.undefined)
    
    @scala.inline
    def setFont_style(value: styleObject): Self = StObject.set(x, "font_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_styleUndefined: Self = StObject.set(x, "font_style", js.undefined)
    
    @scala.inline
    def setForceEnterMode(value: Boolean): Self = StObject.set(x, "forceEnterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceEnterModeUndefined: Self = StObject.set(x, "forceEnterMode", js.undefined)
    
    @scala.inline
    def setForcePasteAsPlainText(value: Boolean): Self = StObject.set(x, "forcePasteAsPlainText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcePasteAsPlainTextUndefined: Self = StObject.set(x, "forcePasteAsPlainText", js.undefined)
    
    @scala.inline
    def setForceSimpleAmpersand(value: Boolean): Self = StObject.set(x, "forceSimpleAmpersand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSimpleAmpersandUndefined: Self = StObject.set(x, "forceSimpleAmpersand", js.undefined)
    
    @scala.inline
    def setFormat_address(value: styleObject): Self = StObject.set(x, "format_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_addressUndefined: Self = StObject.set(x, "format_address", js.undefined)
    
    @scala.inline
    def setFormat_div(value: styleObject): Self = StObject.set(x, "format_div", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_divUndefined: Self = StObject.set(x, "format_div", js.undefined)
    
    @scala.inline
    def setFormat_h1(value: styleObject): Self = StObject.set(x, "format_h1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_h1Undefined: Self = StObject.set(x, "format_h1", js.undefined)
    
    @scala.inline
    def setFormat_h2(value: styleObject): Self = StObject.set(x, "format_h2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_h2Undefined: Self = StObject.set(x, "format_h2", js.undefined)
    
    @scala.inline
    def setFormat_h3(value: styleObject): Self = StObject.set(x, "format_h3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_h3Undefined: Self = StObject.set(x, "format_h3", js.undefined)
    
    @scala.inline
    def setFormat_h4(value: styleObject): Self = StObject.set(x, "format_h4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_h4Undefined: Self = StObject.set(x, "format_h4", js.undefined)
    
    @scala.inline
    def setFormat_h5(value: styleObject): Self = StObject.set(x, "format_h5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_h5Undefined: Self = StObject.set(x, "format_h5", js.undefined)
    
    @scala.inline
    def setFormat_h6(value: styleObject): Self = StObject.set(x, "format_h6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_h6Undefined: Self = StObject.set(x, "format_h6", js.undefined)
    
    @scala.inline
    def setFormat_p(value: styleObject): Self = StObject.set(x, "format_p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_pUndefined: Self = StObject.set(x, "format_p", js.undefined)
    
    @scala.inline
    def setFormat_pre(value: styleObject): Self = StObject.set(x, "format_pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_preUndefined: Self = StObject.set(x, "format_pre", js.undefined)
    
    @scala.inline
    def setFormat_tags(value: String): Self = StObject.set(x, "format_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_tagsUndefined: Self = StObject.set(x, "format_tags", js.undefined)
    
    @scala.inline
    def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullPageUndefined: Self = StObject.set(x, "fullPage", js.undefined)
    
    @scala.inline
    def setGrayt_autoStartup(value: Boolean): Self = StObject.set(x, "grayt_autoStartup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayt_autoStartupUndefined: Self = StObject.set(x, "grayt_autoStartup", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHtmlEncodeOutput(value: Boolean): Self = StObject.set(x, "htmlEncodeOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEncodeOutputUndefined: Self = StObject.set(x, "htmlEncodeOutput", js.undefined)
    
    @scala.inline
    def setIgnoreEmptyParagraph(value: Boolean): Self = StObject.set(x, "ignoreEmptyParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreEmptyParagraphUndefined: Self = StObject.set(x, "ignoreEmptyParagraph", js.undefined)
    
    @scala.inline
    def setImage2_alignClasses(value: js.Array[String]): Self = StObject.set(x, "image2_alignClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage2_alignClassesUndefined: Self = StObject.set(x, "image2_alignClasses", js.undefined)
    
    @scala.inline
    def setImage2_alignClassesVarargs(value: String*): Self = StObject.set(x, "image2_alignClasses", js.Array(value :_*))
    
    @scala.inline
    def setImage2_altRequired(value: Boolean): Self = StObject.set(x, "image2_altRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage2_altRequiredUndefined: Self = StObject.set(x, "image2_altRequired", js.undefined)
    
    @scala.inline
    def setImage2_captionedClass(value: String): Self = StObject.set(x, "image2_captionedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage2_captionedClassUndefined: Self = StObject.set(x, "image2_captionedClass", js.undefined)
    
    @scala.inline
    def setImage2_disableResizer(value: Boolean): Self = StObject.set(x, "image2_disableResizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage2_disableResizerUndefined: Self = StObject.set(x, "image2_disableResizer", js.undefined)
    
    @scala.inline
    def setImage2_prefillDimensions(value: Boolean): Self = StObject.set(x, "image2_prefillDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage2_prefillDimensionsUndefined: Self = StObject.set(x, "image2_prefillDimensions", js.undefined)
    
    @scala.inline
    def setImageUploadUrl(value: String): Self = StObject.set(x, "imageUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUploadUrlUndefined: Self = StObject.set(x, "imageUploadUrl", js.undefined)
    
    @scala.inline
    def setImage_prefillDimensions(value: Boolean): Self = StObject.set(x, "image_prefillDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_prefillDimensionsUndefined: Self = StObject.set(x, "image_prefillDimensions", js.undefined)
    
    @scala.inline
    def setImage_previewText(value: String): Self = StObject.set(x, "image_previewText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_previewTextUndefined: Self = StObject.set(x, "image_previewText", js.undefined)
    
    @scala.inline
    def setImage_removeLinkByEmptyUrl(value: Boolean): Self = StObject.set(x, "image_removeLinkByEmptyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_removeLinkByEmptyUrlUndefined: Self = StObject.set(x, "image_removeLinkByEmptyUrl", js.undefined)
    
    @scala.inline
    def setIndentClasses(value: js.Array[String]): Self = StObject.set(x, "indentClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentClassesUndefined: Self = StObject.set(x, "indentClasses", js.undefined)
    
    @scala.inline
    def setIndentClassesVarargs(value: String*): Self = StObject.set(x, "indentClasses", js.Array(value :_*))
    
    @scala.inline
    def setIndentOffset(value: Double): Self = StObject.set(x, "indentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentOffsetUndefined: Self = StObject.set(x, "indentOffset", js.undefined)
    
    @scala.inline
    def setIndentUnit(value: String): Self = StObject.set(x, "indentUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUnitUndefined: Self = StObject.set(x, "indentUnit", js.undefined)
    
    @scala.inline
    def setJqueryOverrideVal(value: Boolean): Self = StObject.set(x, "jqueryOverrideVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJqueryOverrideValUndefined: Self = StObject.set(x, "jqueryOverrideVal", js.undefined)
    
    @scala.inline
    def setJustifyClasses(value: js.Array[String]): Self = StObject.set(x, "justifyClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyClassesUndefined: Self = StObject.set(x, "justifyClasses", js.undefined)
    
    @scala.inline
    def setJustifyClassesVarargs(value: String*): Self = StObject.set(x, "justifyClasses", js.Array(value :_*))
    
    @scala.inline
    def setKeystrokes(value: js.Array[js.Tuple2[Double, String]]): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeystrokesUndefined: Self = StObject.set(x, "keystrokes", js.undefined)
    
    @scala.inline
    def setKeystrokesVarargs(value: (js.Tuple2[Double, String])*): Self = StObject.set(x, "keystrokes", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLanguage_list(value: js.Array[String]): Self = StObject.set(x, "language_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_listUndefined: Self = StObject.set(x, "language_list", js.undefined)
    
    @scala.inline
    def setLanguage_listVarargs(value: String*): Self = StObject.set(x, "language_list", js.Array(value :_*))
    
    @scala.inline
    def setLinkJavaScriptLinksAllowed(value: Boolean): Self = StObject.set(x, "linkJavaScriptLinksAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkJavaScriptLinksAllowedUndefined: Self = StObject.set(x, "linkJavaScriptLinksAllowed", js.undefined)
    
    @scala.inline
    def setLinkShowAdvancedTab(value: Boolean): Self = StObject.set(x, "linkShowAdvancedTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkShowAdvancedTabUndefined: Self = StObject.set(x, "linkShowAdvancedTab", js.undefined)
    
    @scala.inline
    def setLinkShowTargetTab(value: Boolean): Self = StObject.set(x, "linkShowTargetTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkShowTargetTabUndefined: Self = StObject.set(x, "linkShowTargetTab", js.undefined)
    
    @scala.inline
    def setMagicline_color(value: String): Self = StObject.set(x, "magicline_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagicline_colorUndefined: Self = StObject.set(x, "magicline_color", js.undefined)
    
    @scala.inline
    def setMagicline_everywhere(value: Boolean): Self = StObject.set(x, "magicline_everywhere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagicline_everywhereUndefined: Self = StObject.set(x, "magicline_everywhere", js.undefined)
    
    @scala.inline
    def setMagicline_holdDistance(value: Double): Self = StObject.set(x, "magicline_holdDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagicline_holdDistanceUndefined: Self = StObject.set(x, "magicline_holdDistance", js.undefined)
    
    @scala.inline
    def setMagicline_keystrokeNext(value: Double): Self = StObject.set(x, "magicline_keystrokeNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagicline_keystrokeNextUndefined: Self = StObject.set(x, "magicline_keystrokeNext", js.undefined)
    
    @scala.inline
    def setMagicline_keystrokePrevious(value: Double): Self = StObject.set(x, "magicline_keystrokePrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagicline_keystrokePreviousUndefined: Self = StObject.set(x, "magicline_keystrokePrevious", js.undefined)
    
    @scala.inline
    def setMagicline_tabuList(value: js.Array[String]): Self = StObject.set(x, "magicline_tabuList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagicline_tabuListUndefined: Self = StObject.set(x, "magicline_tabuList", js.undefined)
    
    @scala.inline
    def setMagicline_tabuListVarargs(value: String*): Self = StObject.set(x, "magicline_tabuList", js.Array(value :_*))
    
    @scala.inline
    def setMagicline_triggerOffset(value: Double): Self = StObject.set(x, "magicline_triggerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagicline_triggerOffsetUndefined: Self = StObject.set(x, "magicline_triggerOffset", js.undefined)
    
    @scala.inline
    def setMathJaxClass(value: String): Self = StObject.set(x, "mathJaxClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMathJaxClassUndefined: Self = StObject.set(x, "mathJaxClass", js.undefined)
    
    @scala.inline
    def setMathJaxLib(value: String): Self = StObject.set(x, "mathJaxLib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMathJaxLibUndefined: Self = StObject.set(x, "mathJaxLib", js.undefined)
    
    @scala.inline
    def setMenu_groups(value: String): Self = StObject.set(x, "menu_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu_groupsUndefined: Self = StObject.set(x, "menu_groups", js.undefined)
    
    @scala.inline
    def setMenu_subMenuDelay(value: Double): Self = StObject.set(x, "menu_subMenuDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu_subMenuDelayUndefined: Self = StObject.set(x, "menu_subMenuDelay", js.undefined)
    
    @scala.inline
    def setNewpage_html(value: String): Self = StObject.set(x, "newpage_html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewpage_htmlUndefined: Self = StObject.set(x, "newpage_html", js.undefined)
    
    @scala.inline
    def setNotification_duration(value: Double): Self = StObject.set(x, "notification_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification_durationUndefined: Self = StObject.set(x, "notification_duration", js.undefined)
    
    @scala.inline
    def setOn(value: eventObject): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setPasteFilter(value: String): Self = StObject.set(x, "pasteFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteFilterUndefined: Self = StObject.set(x, "pasteFilter", js.undefined)
    
    @scala.inline
    def setPasteFromWordCleanupFile(value: String): Self = StObject.set(x, "pasteFromWordCleanupFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteFromWordCleanupFileUndefined: Self = StObject.set(x, "pasteFromWordCleanupFile", js.undefined)
    
    @scala.inline
    def setPasteFromWordNumberedHeadingToList(value: Boolean): Self = StObject.set(x, "pasteFromWordNumberedHeadingToList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteFromWordNumberedHeadingToListUndefined: Self = StObject.set(x, "pasteFromWordNumberedHeadingToList", js.undefined)
    
    @scala.inline
    def setPasteFromWordPromptCleanup(value: Boolean): Self = StObject.set(x, "pasteFromWordPromptCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteFromWordPromptCleanupUndefined: Self = StObject.set(x, "pasteFromWordPromptCleanup", js.undefined)
    
    @scala.inline
    def setPasteFromWordRemoveFontStyles(value: Boolean): Self = StObject.set(x, "pasteFromWordRemoveFontStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteFromWordRemoveFontStylesUndefined: Self = StObject.set(x, "pasteFromWordRemoveFontStyles", js.undefined)
    
    @scala.inline
    def setPasteFromWordRemoveStyles(value: Boolean): Self = StObject.set(x, "pasteFromWordRemoveStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteFromWordRemoveStylesUndefined: Self = StObject.set(x, "pasteFromWordRemoveStyles", js.undefined)
    
    @scala.inline
    def setPasteFromWord_heuristicsEdgeList(value: Boolean): Self = StObject.set(x, "pasteFromWord_heuristicsEdgeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteFromWord_heuristicsEdgeListUndefined: Self = StObject.set(x, "pasteFromWord_heuristicsEdgeList", js.undefined)
    
    @scala.inline
    def setPasteFromWord_inlineImages(value: Boolean): Self = StObject.set(x, "pasteFromWord_inlineImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteFromWord_inlineImagesUndefined: Self = StObject.set(x, "pasteFromWord_inlineImages", js.undefined)
    
    @scala.inline
    def setPlugins(value: String): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setProtectedSource(value: js.Array[js.RegExp]): Self = StObject.set(x, "protectedSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedSourceUndefined: Self = StObject.set(x, "protectedSource", js.undefined)
    
    @scala.inline
    def setProtectedSourceVarargs(value: js.RegExp*): Self = StObject.set(x, "protectedSource", js.Array(value :_*))
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRemoveButtons(value: String): Self = StObject.set(x, "removeButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveButtonsUndefined: Self = StObject.set(x, "removeButtons", js.undefined)
    
    @scala.inline
    def setRemoveDialogTabs(value: String): Self = StObject.set(x, "removeDialogTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveDialogTabsUndefined: Self = StObject.set(x, "removeDialogTabs", js.undefined)
    
    @scala.inline
    def setRemoveFormatAttributes(value: String): Self = StObject.set(x, "removeFormatAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFormatAttributesUndefined: Self = StObject.set(x, "removeFormatAttributes", js.undefined)
    
    @scala.inline
    def setRemoveFormatTags(value: String): Self = StObject.set(x, "removeFormatTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFormatTagsUndefined: Self = StObject.set(x, "removeFormatTags", js.undefined)
    
    @scala.inline
    def setRemovePlugins(value: String): Self = StObject.set(x, "removePlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovePluginsUndefined: Self = StObject.set(x, "removePlugins", js.undefined)
    
    @scala.inline
    def setResize_dir(value: String): Self = StObject.set(x, "resize_dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize_dirUndefined: Self = StObject.set(x, "resize_dir", js.undefined)
    
    @scala.inline
    def setResize_enabled(value: Boolean): Self = StObject.set(x, "resize_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize_enabledUndefined: Self = StObject.set(x, "resize_enabled", js.undefined)
    
    @scala.inline
    def setResize_maxHeight(value: Double): Self = StObject.set(x, "resize_maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize_maxHeightUndefined: Self = StObject.set(x, "resize_maxHeight", js.undefined)
    
    @scala.inline
    def setResize_maxWidth(value: Double): Self = StObject.set(x, "resize_maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize_maxWidthUndefined: Self = StObject.set(x, "resize_maxWidth", js.undefined)
    
    @scala.inline
    def setResize_minHeight(value: Double): Self = StObject.set(x, "resize_minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize_minHeightUndefined: Self = StObject.set(x, "resize_minHeight", js.undefined)
    
    @scala.inline
    def setResize_minWidth(value: Double): Self = StObject.set(x, "resize_minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize_minWidthUndefined: Self = StObject.set(x, "resize_minWidth", js.undefined)
    
    @scala.inline
    def setScayt_autoStartup(value: Boolean): Self = StObject.set(x, "scayt_autoStartup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_autoStartupUndefined: Self = StObject.set(x, "scayt_autoStartup", js.undefined)
    
    @scala.inline
    def setScayt_contextCommands(value: String): Self = StObject.set(x, "scayt_contextCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_contextCommandsUndefined: Self = StObject.set(x, "scayt_contextCommands", js.undefined)
    
    @scala.inline
    def setScayt_contextMenuItemsOrder(value: String): Self = StObject.set(x, "scayt_contextMenuItemsOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_contextMenuItemsOrderUndefined: Self = StObject.set(x, "scayt_contextMenuItemsOrder", js.undefined)
    
    @scala.inline
    def setScayt_customDictionaryIds(value: String): Self = StObject.set(x, "scayt_customDictionaryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_customDictionaryIdsUndefined: Self = StObject.set(x, "scayt_customDictionaryIds", js.undefined)
    
    @scala.inline
    def setScayt_customerId(value: String): Self = StObject.set(x, "scayt_customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_customerIdUndefined: Self = StObject.set(x, "scayt_customerId", js.undefined)
    
    @scala.inline
    def setScayt_disableOptionsStorage(value: String | js.Array[String]): Self = StObject.set(x, "scayt_disableOptionsStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_disableOptionsStorageUndefined: Self = StObject.set(x, "scayt_disableOptionsStorage", js.undefined)
    
    @scala.inline
    def setScayt_disableOptionsStorageVarargs(value: String*): Self = StObject.set(x, "scayt_disableOptionsStorage", js.Array(value :_*))
    
    @scala.inline
    def setScayt_elementsToIgnore(value: String): Self = StObject.set(x, "scayt_elementsToIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_elementsToIgnoreUndefined: Self = StObject.set(x, "scayt_elementsToIgnore", js.undefined)
    
    @scala.inline
    def setScayt_handleCheckDirty(value: String): Self = StObject.set(x, "scayt_handleCheckDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_handleCheckDirtyUndefined: Self = StObject.set(x, "scayt_handleCheckDirty", js.undefined)
    
    @scala.inline
    def setScayt_handleUndoRedo(value: String): Self = StObject.set(x, "scayt_handleUndoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_handleUndoRedoUndefined: Self = StObject.set(x, "scayt_handleUndoRedo", js.undefined)
    
    @scala.inline
    def setScayt_ignoreAllCapsWords(value: Boolean): Self = StObject.set(x, "scayt_ignoreAllCapsWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_ignoreAllCapsWordsUndefined: Self = StObject.set(x, "scayt_ignoreAllCapsWords", js.undefined)
    
    @scala.inline
    def setScayt_ignoreDomainNames(value: Boolean): Self = StObject.set(x, "scayt_ignoreDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_ignoreDomainNamesUndefined: Self = StObject.set(x, "scayt_ignoreDomainNames", js.undefined)
    
    @scala.inline
    def setScayt_ignoreWordsWithMixedCases(value: Boolean): Self = StObject.set(x, "scayt_ignoreWordsWithMixedCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_ignoreWordsWithMixedCasesUndefined: Self = StObject.set(x, "scayt_ignoreWordsWithMixedCases", js.undefined)
    
    @scala.inline
    def setScayt_ignoreWordsWithNumbers(value: Boolean): Self = StObject.set(x, "scayt_ignoreWordsWithNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_ignoreWordsWithNumbersUndefined: Self = StObject.set(x, "scayt_ignoreWordsWithNumbers", js.undefined)
    
    @scala.inline
    def setScayt_inlineModeImmediateMarkup(value: Boolean): Self = StObject.set(x, "scayt_inlineModeImmediateMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_inlineModeImmediateMarkupUndefined: Self = StObject.set(x, "scayt_inlineModeImmediateMarkup", js.undefined)
    
    @scala.inline
    def setScayt_maxSuggestions(value: Double): Self = StObject.set(x, "scayt_maxSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_maxSuggestionsUndefined: Self = StObject.set(x, "scayt_maxSuggestions", js.undefined)
    
    @scala.inline
    def setScayt_minWordLength(value: Double): Self = StObject.set(x, "scayt_minWordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_minWordLengthUndefined: Self = StObject.set(x, "scayt_minWordLength", js.undefined)
    
    @scala.inline
    def setScayt_moreSuggestions(value: String): Self = StObject.set(x, "scayt_moreSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_moreSuggestionsUndefined: Self = StObject.set(x, "scayt_moreSuggestions", js.undefined)
    
    @scala.inline
    def setScayt_multiLanguageMode(value: Boolean): Self = StObject.set(x, "scayt_multiLanguageMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_multiLanguageModeUndefined: Self = StObject.set(x, "scayt_multiLanguageMode", js.undefined)
    
    @scala.inline
    def setScayt_multiLanguageStyles(value: StringDictionary[js.Any]): Self = StObject.set(x, "scayt_multiLanguageStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_multiLanguageStylesUndefined: Self = StObject.set(x, "scayt_multiLanguageStyles", js.undefined)
    
    @scala.inline
    def setScayt_sLang(value: String): Self = StObject.set(x, "scayt_sLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_sLangUndefined: Self = StObject.set(x, "scayt_sLang", js.undefined)
    
    @scala.inline
    def setScayt_serviceHost(value: String): Self = StObject.set(x, "scayt_serviceHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_serviceHostUndefined: Self = StObject.set(x, "scayt_serviceHost", js.undefined)
    
    @scala.inline
    def setScayt_servicePath(value: String): Self = StObject.set(x, "scayt_servicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_servicePathUndefined: Self = StObject.set(x, "scayt_servicePath", js.undefined)
    
    @scala.inline
    def setScayt_servicePort(value: String): Self = StObject.set(x, "scayt_servicePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_servicePortUndefined: Self = StObject.set(x, "scayt_servicePort", js.undefined)
    
    @scala.inline
    def setScayt_serviceProtocol(value: String): Self = StObject.set(x, "scayt_serviceProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_serviceProtocolUndefined: Self = StObject.set(x, "scayt_serviceProtocol", js.undefined)
    
    @scala.inline
    def setScayt_srcUrl(value: String): Self = StObject.set(x, "scayt_srcUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_srcUrlUndefined: Self = StObject.set(x, "scayt_srcUrl", js.undefined)
    
    @scala.inline
    def setScayt_uiTabs(value: String): Self = StObject.set(x, "scayt_uiTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_uiTabsUndefined: Self = StObject.set(x, "scayt_uiTabs", js.undefined)
    
    @scala.inline
    def setScayt_userDictionaryName(value: String): Self = StObject.set(x, "scayt_userDictionaryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScayt_userDictionaryNameUndefined: Self = StObject.set(x, "scayt_userDictionaryName", js.undefined)
    
    @scala.inline
    def setSharedSpaces(value: sharedSpace): Self = StObject.set(x, "sharedSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedSpacesUndefined: Self = StObject.set(x, "sharedSpaces", js.undefined)
    
    @scala.inline
    def setShiftEnterMode(value: Double): Self = StObject.set(x, "shiftEnterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftEnterModeUndefined: Self = StObject.set(x, "shiftEnterMode", js.undefined)
    
    @scala.inline
    def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    @scala.inline
    def setSmiley_columns(value: Double): Self = StObject.set(x, "smiley_columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmiley_columnsUndefined: Self = StObject.set(x, "smiley_columns", js.undefined)
    
    @scala.inline
    def setSmiley_descriptions(value: js.Array[String]): Self = StObject.set(x, "smiley_descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmiley_descriptionsUndefined: Self = StObject.set(x, "smiley_descriptions", js.undefined)
    
    @scala.inline
    def setSmiley_descriptionsVarargs(value: String*): Self = StObject.set(x, "smiley_descriptions", js.Array(value :_*))
    
    @scala.inline
    def setSmiley_images(value: js.Array[String]): Self = StObject.set(x, "smiley_images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmiley_imagesUndefined: Self = StObject.set(x, "smiley_images", js.undefined)
    
    @scala.inline
    def setSmiley_imagesVarargs(value: String*): Self = StObject.set(x, "smiley_images", js.Array(value :_*))
    
    @scala.inline
    def setSmiley_path(value: String): Self = StObject.set(x, "smiley_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmiley_pathUndefined: Self = StObject.set(x, "smiley_path", js.undefined)
    
    @scala.inline
    def setSourceAreaTabSize(value: Double): Self = StObject.set(x, "sourceAreaTabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAreaTabSizeUndefined: Self = StObject.set(x, "sourceAreaTabSize", js.undefined)
    
    @scala.inline
    def setSpecialChars(value: js.Array[String | (js.Tuple2[String, String])]): Self = StObject.set(x, "specialChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialCharsUndefined: Self = StObject.set(x, "specialChars", js.undefined)
    
    @scala.inline
    def setSpecialCharsVarargs(value: (String | (js.Tuple2[String, String]))*): Self = StObject.set(x, "specialChars", js.Array(value :_*))
    
    @scala.inline
    def setStartupFocus(value: String | Boolean): Self = StObject.set(x, "startupFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartupFocusUndefined: Self = StObject.set(x, "startupFocus", js.undefined)
    
    @scala.inline
    def setStartupMode(value: String): Self = StObject.set(x, "startupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartupModeUndefined: Self = StObject.set(x, "startupMode", js.undefined)
    
    @scala.inline
    def setStartupOutlineBlocks(value: Boolean): Self = StObject.set(x, "startupOutlineBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartupOutlineBlocksUndefined: Self = StObject.set(x, "startupOutlineBlocks", js.undefined)
    
    @scala.inline
    def setStartupShowBorders(value: Boolean): Self = StObject.set(x, "startupShowBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartupShowBordersUndefined: Self = StObject.set(x, "startupShowBorders", js.undefined)
    
    @scala.inline
    def setStylesSet(value: String | Boolean | js.Array[styleObject]): Self = StObject.set(x, "stylesSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesSetUndefined: Self = StObject.set(x, "stylesSet", js.undefined)
    
    @scala.inline
    def setStylesSetVarargs(value: styleObject*): Self = StObject.set(x, "stylesSet", js.Array(value :_*))
    
    @scala.inline
    def setStylesheetParser_skipSelectors(value: js.RegExp): Self = StObject.set(x, "stylesheetParser_skipSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheetParser_skipSelectorsUndefined: Self = StObject.set(x, "stylesheetParser_skipSelectors", js.undefined)
    
    @scala.inline
    def setStylesheetParser_validSelectors(value: js.RegExp): Self = StObject.set(x, "stylesheetParser_validSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheetParser_validSelectorsUndefined: Self = StObject.set(x, "stylesheetParser_validSelectors", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTabSpaces(value: Double): Self = StObject.set(x, "tabSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSpacesUndefined: Self = StObject.set(x, "tabSpaces", js.undefined)
    
    @scala.inline
    def setTemplates(value: String): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setTemplates_files(value: StringDictionary[js.Any]): Self = StObject.set(x, "templates_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplates_filesUndefined: Self = StObject.set(x, "templates_files", js.undefined)
    
    @scala.inline
    def setTemplates_replaceContent(value: Boolean): Self = StObject.set(x, "templates_replaceContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplates_replaceContentUndefined: Self = StObject.set(x, "templates_replaceContent", js.undefined)
    
    @scala.inline
    def setTitle(value: String | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToolbar(value: String | (js.Array[String | js.Array[String] | Groups])): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarCanCollapse(value: Boolean): Self = StObject.set(x, "toolbarCanCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarCanCollapseUndefined: Self = StObject.set(x, "toolbarCanCollapse", js.undefined)
    
    @scala.inline
    def setToolbarGroupCycling(value: Boolean): Self = StObject.set(x, "toolbarGroupCycling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarGroupCyclingUndefined: Self = StObject.set(x, "toolbarGroupCycling", js.undefined)
    
    @scala.inline
    def setToolbarGroups(value: js.Array[toolbarGroups | String]): Self = StObject.set(x, "toolbarGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarGroupsUndefined: Self = StObject.set(x, "toolbarGroups", js.undefined)
    
    @scala.inline
    def setToolbarGroupsVarargs(value: (toolbarGroups | String)*): Self = StObject.set(x, "toolbarGroups", js.Array(value :_*))
    
    @scala.inline
    def setToolbarLocation(value: String): Self = StObject.set(x, "toolbarLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarLocationUndefined: Self = StObject.set(x, "toolbarLocation", js.undefined)
    
    @scala.inline
    def setToolbarNull: Self = StObject.set(x, "toolbar", null)
    
    @scala.inline
    def setToolbarStartupExpanded(value: Boolean): Self = StObject.set(x, "toolbarStartupExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarStartupExpandedUndefined: Self = StObject.set(x, "toolbarStartupExpanded", js.undefined)
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(value: (String | js.Array[String] | Groups)*): Self = StObject.set(x, "toolbar", js.Array(value :_*))
    
    @scala.inline
    def setUiColor(value: String): Self = StObject.set(x, "uiColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiColorUndefined: Self = StObject.set(x, "uiColor", js.undefined)
    
    @scala.inline
    def setUndoStackSize(value: Double): Self = StObject.set(x, "undoStackSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndoStackSizeUndefined: Self = StObject.set(x, "undoStackSize", js.undefined)
    
    @scala.inline
    def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
    
    @scala.inline
    def setUseComputedState(value: Boolean): Self = StObject.set(x, "useComputedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseComputedStateUndefined: Self = StObject.set(x, "useComputedState", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWsc_cmd(value: String): Self = StObject.set(x, "wsc_cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsc_cmdUndefined: Self = StObject.set(x, "wsc_cmd", js.undefined)
    
    @scala.inline
    def setWsc_customDictionaryIds(value: String): Self = StObject.set(x, "wsc_customDictionaryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsc_customDictionaryIdsUndefined: Self = StObject.set(x, "wsc_customDictionaryIds", js.undefined)
    
    @scala.inline
    def setWsc_customLoaderScript(value: String): Self = StObject.set(x, "wsc_customLoaderScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsc_customLoaderScriptUndefined: Self = StObject.set(x, "wsc_customLoaderScript", js.undefined)
    
    @scala.inline
    def setWsc_customerId(value: String): Self = StObject.set(x, "wsc_customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsc_customerIdUndefined: Self = StObject.set(x, "wsc_customerId", js.undefined)
    
    @scala.inline
    def setWsc_height(value: String): Self = StObject.set(x, "wsc_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsc_heightUndefined: Self = StObject.set(x, "wsc_height", js.undefined)
    
    @scala.inline
    def setWsc_lang(value: String): Self = StObject.set(x, "wsc_lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsc_langUndefined: Self = StObject.set(x, "wsc_lang", js.undefined)
    
    @scala.inline
    def setWsc_left(value: String): Self = StObject.set(x, "wsc_left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsc_leftUndefined: Self = StObject.set(x, "wsc_left", js.undefined)
    
    @scala.inline
    def setWsc_top(value: String): Self = StObject.set(x, "wsc_top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsc_topUndefined: Self = StObject.set(x, "wsc_top", js.undefined)
    
    @scala.inline
    def setWsc_userDictionaryName(value: String): Self = StObject.set(x, "wsc_userDictionaryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsc_userDictionaryNameUndefined: Self = StObject.set(x, "wsc_userDictionaryName", js.undefined)
    
    @scala.inline
    def setWsc_width(value: String): Self = StObject.set(x, "wsc_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsc_widthUndefined: Self = StObject.set(x, "wsc_width", js.undefined)
  }
  
  @js.native
  trait styleObject extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var element: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var overrides: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var styles: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object styleObject {
    
    @scala.inline
    def apply(element: String): styleObject = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[styleObject]
    }
    
    @scala.inline
    implicit class styleObjectMutableBuilder[Self <: styleObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOverrides(value: StringDictionary[js.Any]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setStyles(value: StringDictionary[js.Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
