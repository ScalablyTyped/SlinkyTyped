package typingsSlinky.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.AnonGroups
import typingsSlinky.ckeditor.CKEDITOR.config.styleObject
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.editor.eventObject
import typingsSlinky.ckeditor.CKEDITOR.filter.allowedContentRules
import typingsSlinky.ckeditor.CKEDITOR.filter.disallowedContentRules
import typingsSlinky.ckeditor.ckeditorStrings.html
import typingsSlinky.ckeditor.ckeditorStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://docs.com/ckeditor4/latest/api/CKEDITOR_config.html
@js.native
trait config_ extends js.Object {
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
  var toolbar: js.UndefOr[String | (js.Array[String | js.Array[String] | AnonGroups]) | Null] = js.native
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

object config_ {
  @scala.inline
  def apply(): config_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[config_]
  }
  @scala.inline
  implicit class config_Ops[Self <: config_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedContent(value: Boolean | allowedContentRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoEmbed_widgetFunction1(value: /* url */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEmbed_widget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAutoEmbed_widget(value: String | (js.Function1[/* url */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEmbed_widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoEmbed_widget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEmbed_widget")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGrow_bottomSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGrow_bottomSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGrow_bottomSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGrow_bottomSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGrow_maxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGrow_maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGrow_maxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGrow_maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGrow_minHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGrow_minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGrow_minHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGrow_minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGrow_onStartup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGrow_onStartup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGrow_onStartup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGrow_onStartup")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpdateElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdateElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateElement")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseFloatZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFloatZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFloatZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFloatZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseHref")(js.undefined)
        ret
    }
    @scala.inline
    def withBasicEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasicEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockedKeystrokes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedKeystrokes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockedKeystrokes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedKeystrokes")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyId")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserContextMenuOnCtrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserContextMenuOnCtrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserContextMenuOnCtrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserContextMenuOnCtrl")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboard_defaultContentType(value: html | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard_defaultContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboard_defaultContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard_defaultContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboard_notificationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard_notificationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboard_notificationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard_notificationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudServices_tokenUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudServices_tokenUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudServices_tokenUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudServices_tokenUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudServices_uploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudServices_uploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudServices_uploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudServices_uploadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCoceSnippet_theme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coceSnippet_theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoceSnippet_theme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coceSnippet_theme")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeSnippetGeshi_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeSnippetGeshi_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeSnippetGeshi_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeSnippetGeshi_url")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeSnippet_codeClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeSnippet_codeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeSnippet_codeClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeSnippet_codeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeSnippet_languages(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeSnippet_languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeSnippet_languages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeSnippet_languages")(js.undefined)
        ret
    }
    @scala.inline
    def withColorButton_backStyle(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_backStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorButton_backStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_backStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withColorButton_colors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorButton_colors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_colors")(js.undefined)
        ret
    }
    @scala.inline
    def withColorButton_colorsPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_colorsPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorButton_colorsPerRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_colorsPerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withColorButton_enableAutomatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_enableAutomatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorButton_enableAutomatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_enableAutomatic")(js.undefined)
        ret
    }
    @scala.inline
    def withColorButton_enableMore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_enableMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorButton_enableMore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_enableMore")(js.undefined)
        ret
    }
    @scala.inline
    def withColorButton_foreStyle(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_foreStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorButton_foreStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_foreStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withColorButton_normalizeBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_normalizeBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorButton_normalizeBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorButton_normalizeBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withContentsCss(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentsCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsCss")(js.undefined)
        ret
    }
    @scala.inline
    def withContentsLangDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsLangDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentsLangDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsLangDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withContentsLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentsLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyFormatting_allowRules(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFormatting_allowRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyFormatting_allowRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFormatting_allowRules")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyFormatting_allowedContexts(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFormatting_allowedContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyFormatting_allowedContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFormatting_allowedContexts")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyFormatting_keystrokeCopy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFormatting_keystrokeCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyFormatting_keystrokeCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFormatting_keystrokeCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyFormatting_keystrokePaste(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFormatting_keystrokePaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyFormatting_keystrokePaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFormatting_keystrokePaste")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyFormatting_outerCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFormatting_outerCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyFormatting_outerCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFormatting_outerCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withCoreStyles_bold(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreStyles_bold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_bold")(js.undefined)
        ret
    }
    @scala.inline
    def withCoreStyles_italic(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreStyles_italic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_italic")(js.undefined)
        ret
    }
    @scala.inline
    def withCoreStyles_strike(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_strike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreStyles_strike: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_strike")(js.undefined)
        ret
    }
    @scala.inline
    def withCoreStyles_subscript(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_subscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreStyles_subscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_subscript")(js.undefined)
        ret
    }
    @scala.inline
    def withCoreStyles_superscript(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_superscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreStyles_superscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_superscript")(js.undefined)
        ret
    }
    @scala.inline
    def withCoreStyles_underline(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_underline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreStyles_underline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreStyles_underline")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDataIndentationChars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndentationChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataIndentationChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndentationChars")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withDevtools_styles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools_styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevtools_styles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools_styles")(js.undefined)
        ret
    }
    @scala.inline
    def withDevtools_textCallback(
      value: (/* editor */ editor, /* dialog */ dialog, /* element */ element, /* tabName */ String) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools_textCallback")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutDevtools_textCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools_textCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withDialog_backgroundCoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_backgroundCoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialog_backgroundCoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_backgroundCoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDialog_backgroundCoverOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_backgroundCoverOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialog_backgroundCoverOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_backgroundCoverOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withDialog_buttonsOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_buttonsOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialog_buttonsOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_buttonsOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withDialog_magnetDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_magnetDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialog_magnetDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_magnetDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withDialog_noConfirmCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_noConfirmCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialog_noConfirmCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_noConfirmCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withDialog_startupFocusTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_startupFocusTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialog_startupFocusTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_startupFocusTab")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNativeObjectResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNativeObjectResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNativeObjectResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNativeObjectResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNativeReadonlyStyling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNativeReadonlyStyling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNativeReadonlyStyling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNativeReadonlyStyling")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNativeSpellChecker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNativeSpellChecker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNativeSpellChecker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNativeSpellChecker")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNativeTableHandles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNativeTableHandles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNativeTableHandles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNativeTableHandles")(js.undefined)
        ret
    }
    @scala.inline
    def withDisallowedContent(value: disallowedContentRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisallowedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withDiv_wrapTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div_wrapTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiv_wrapTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div_wrapTable")(js.undefined)
        ret
    }
    @scala.inline
    def withDocType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docType")(js.undefined)
        ret
    }
    @scala.inline
    def withEasyimage_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easyimage_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasyimage_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easyimage_class")(js.undefined)
        ret
    }
    @scala.inline
    def withEasyimage_defaultStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easyimage_defaultStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasyimage_defaultStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easyimage_defaultStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEasyimage_styles(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easyimage_styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasyimage_styles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easyimage_styles")(js.undefined)
        ret
    }
    @scala.inline
    def withEasyimage_toolbar(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easyimage_toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasyimage_toolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easyimage_toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailProtection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbed_provider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed_provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbed_provider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed_provider")(js.undefined)
        ret
    }
    @scala.inline
    def withEmoji_emojiListUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji_emojiListUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmoji_emojiListUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji_emojiListUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withEmoji_minChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji_minChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmoji_minChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji_minChars")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTabKeyTools(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTabKeyTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTabKeyTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTabKeyTools")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
    @scala.inline
    def withEntities_additional(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities_additional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities_additional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities_additional")(js.undefined)
        ret
    }
    @scala.inline
    def withEntities_greek(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities_greek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities_greek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities_greek")(js.undefined)
        ret
    }
    @scala.inline
    def withEntities_latin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities_latin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities_latin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities_latin")(js.undefined)
        ret
    }
    @scala.inline
    def withEntities_processNumerical(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities_processNumerical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities_processNumerical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities_processNumerical")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraAllowedContent(value: allowedContentRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraAllowedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraAllowedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraAllowedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraPlugins(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withFileTools_defaultFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTools_defaultFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTools_defaultFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTools_defaultFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFileTools_requestHeaders(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTools_requestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTools_requestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTools_requestHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withFilebrowserBrowseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserBrowseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilebrowserBrowseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserBrowseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFilebrowserFlashBrowseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserFlashBrowseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilebrowserFlashBrowseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserFlashBrowseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFilebrowserFlashUploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserFlashUploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilebrowserFlashUploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserFlashUploadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFilebrowserImageBrowseLinkUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserImageBrowseLinkUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilebrowserImageBrowseLinkUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserImageBrowseLinkUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFilebrowserImageBrowseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserImageBrowseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilebrowserImageBrowseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserImageBrowseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFilebrowserImageUploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserImageUploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilebrowserImageUploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserImageUploadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFilebrowserUploadMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserUploadMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilebrowserUploadMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserUploadMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withFilebrowserUploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserUploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilebrowserUploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserUploadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFilebrowserWindowFeatures(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserWindowFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilebrowserWindowFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserWindowFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withFilebrowserWindowHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserWindowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilebrowserWindowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserWindowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFilebrowserWindowWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserWindowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilebrowserWindowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filebrowserWindowWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFillEmptyBlocksFunction1(value: /* element */ typingsSlinky.ckeditor.CKEDITOR.htmlParser.element => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillEmptyBlocks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFillEmptyBlocks(
      value: Boolean | (js.Function1[/* element */ typingsSlinky.ckeditor.CKEDITOR.htmlParser.element, Boolean])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillEmptyBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillEmptyBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillEmptyBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withFind_highlight(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find_highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFind_highlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find_highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashAddEmbedTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashAddEmbedTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashAddEmbedTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashAddEmbedTag")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashConvertOnEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashConvertOnEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashConvertOnEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashConvertOnEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashEmbedTagOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashEmbedTagOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashEmbedTagOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashEmbedTagOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatSpaceDockedOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatSpaceDockedOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatSpaceDockedOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatSpaceDockedOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatSpaceDockedOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatSpaceDockedOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatSpaceDockedOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatSpaceDockedOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatSpacePinnedOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatSpacePinnedOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatSpacePinnedOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatSpacePinnedOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatSpacePinnedOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatSpacePinnedOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatSpacePinnedOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatSpacePinnedOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatSpacePreferRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatSpacePreferRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatSpacePreferRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatSpacePreferRight")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize_defaultLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize_defaultLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize_defaultLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize_defaultLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize_sizes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize_sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize_sizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize_sizes")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize_style(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize_style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize_style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize_style")(js.undefined)
        ret
    }
    @scala.inline
    def withFont_defaultLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_defaultLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont_defaultLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_defaultLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFont_names(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont_names: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_names")(js.undefined)
        ret
    }
    @scala.inline
    def withFont_style(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont_style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_style")(js.undefined)
        ret
    }
    @scala.inline
    def withForceEnterMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceEnterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceEnterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceEnterMode")(js.undefined)
        ret
    }
    @scala.inline
    def withForcePasteAsPlainText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePasteAsPlainText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcePasteAsPlainText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePasteAsPlainText")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSimpleAmpersand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSimpleAmpersand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSimpleAmpersand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSimpleAmpersand")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_address(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_address")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_div(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_div")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_div: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_div")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_h1(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_h1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h1")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_h2(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_h2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h2")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_h3(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_h3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h3")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_h4(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_h4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h4")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_h5(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_h5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h5")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_h6(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_h6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_h6")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_p(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_p: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_p")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_pre(value: styleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_pre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_pre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_pre")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat_tags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat_tags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_tags")(js.undefined)
        ret
    }
    @scala.inline
    def withFullPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPage")(js.undefined)
        ret
    }
    @scala.inline
    def withGrayt_autoStartup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayt_autoStartup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrayt_autoStartup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayt_autoStartup")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlEncodeOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlEncodeOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlEncodeOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlEncodeOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEmptyParagraph(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptyParagraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEmptyParagraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptyParagraph")(js.undefined)
        ret
    }
    @scala.inline
    def withImage2_alignClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2_alignClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage2_alignClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2_alignClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withImage2_altRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2_altRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage2_altRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2_altRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withImage2_captionedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2_captionedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage2_captionedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2_captionedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withImage2_disableResizer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2_disableResizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage2_disableResizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2_disableResizer")(js.undefined)
        ret
    }
    @scala.inline
    def withImage2_prefillDimensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2_prefillDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage2_prefillDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2_prefillDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUploadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withImage_prefillDimensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_prefillDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_prefillDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_prefillDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withImage_previewText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_previewText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_previewText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_previewText")(js.undefined)
        ret
    }
    @scala.inline
    def withImage_removeLinkByEmptyUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_removeLinkByEmptyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_removeLinkByEmptyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_removeLinkByEmptyUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withJqueryOverrideVal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryOverrideVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJqueryOverrideVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryOverrideVal")(js.undefined)
        ret
    }
    @scala.inline
    def withJustifyClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifyClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withKeystrokes(value: js.Array[js.Tuple2[Double, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystrokes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeystrokes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystrokes")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
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
    def withLanguage_list(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage_list: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_list")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkJavaScriptLinksAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkJavaScriptLinksAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkJavaScriptLinksAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkJavaScriptLinksAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkShowAdvancedTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkShowAdvancedTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkShowAdvancedTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkShowAdvancedTab")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkShowTargetTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkShowTargetTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkShowTargetTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkShowTargetTab")(js.undefined)
        ret
    }
    @scala.inline
    def withMagicline_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagicline_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_color")(js.undefined)
        ret
    }
    @scala.inline
    def withMagicline_everywhere(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_everywhere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagicline_everywhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_everywhere")(js.undefined)
        ret
    }
    @scala.inline
    def withMagicline_holdDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_holdDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagicline_holdDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_holdDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withMagicline_keystrokeNext(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_keystrokeNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagicline_keystrokeNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_keystrokeNext")(js.undefined)
        ret
    }
    @scala.inline
    def withMagicline_keystrokePrevious(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_keystrokePrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagicline_keystrokePrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_keystrokePrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withMagicline_tabuList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_tabuList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagicline_tabuList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_tabuList")(js.undefined)
        ret
    }
    @scala.inline
    def withMagicline_triggerOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_triggerOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagicline_triggerOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicline_triggerOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withMathJaxClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathJaxClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMathJaxClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathJaxClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMathJaxLib(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathJaxLib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMathJaxLib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathJaxLib")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu_groups(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu_groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu_groups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu_groups")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu_subMenuDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu_subMenuDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu_subMenuDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu_subMenuDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withNewpage_html(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newpage_html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewpage_html: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newpage_html")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification_duration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification_duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification_duration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification_duration")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: eventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteFromWordCleanupFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWordCleanupFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteFromWordCleanupFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWordCleanupFile")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteFromWordNumberedHeadingToList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWordNumberedHeadingToList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteFromWordNumberedHeadingToList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWordNumberedHeadingToList")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteFromWordPromptCleanup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWordPromptCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteFromWordPromptCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWordPromptCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteFromWordRemoveFontStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWordRemoveFontStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteFromWordRemoveFontStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWordRemoveFontStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteFromWordRemoveStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWordRemoveStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteFromWordRemoveStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWordRemoveStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteFromWord_heuristicsEdgeList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWord_heuristicsEdgeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteFromWord_heuristicsEdgeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWord_heuristicsEdgeList")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteFromWord_inlineImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWord_inlineImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteFromWord_inlineImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWord_inlineImages")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectedSource(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedSource")(js.undefined)
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
    def withRemoveButtons(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveDialogTabs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDialogTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveDialogTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDialogTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFormatAttributes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFormatAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveFormatAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFormatAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFormatTags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFormatTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveFormatTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFormatTags")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovePlugins(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovePlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withResize_dir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize_dir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_dir")(js.undefined)
        ret
    }
    @scala.inline
    def withResize_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withResize_maxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize_maxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withResize_maxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize_maxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withResize_minHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize_minHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withResize_minWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize_minWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize_minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_autoStartup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_autoStartup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_autoStartup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_autoStartup")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_contextCommands(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_contextCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_contextCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_contextCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_contextMenuItemsOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_contextMenuItemsOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_contextMenuItemsOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_contextMenuItemsOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_customDictionaryIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_customDictionaryIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_customDictionaryIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_customDictionaryIds")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_customerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_customerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_disableOptionsStorage(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_disableOptionsStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_disableOptionsStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_disableOptionsStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_elementsToIgnore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_elementsToIgnore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_elementsToIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_elementsToIgnore")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_handleCheckDirty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_handleCheckDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_handleCheckDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_handleCheckDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_handleUndoRedo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_handleUndoRedo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_handleUndoRedo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_handleUndoRedo")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_ignoreAllCapsWords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_ignoreAllCapsWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_ignoreAllCapsWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_ignoreAllCapsWords")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_ignoreDomainNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_ignoreDomainNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_ignoreDomainNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_ignoreDomainNames")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_ignoreWordsWithMixedCases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_ignoreWordsWithMixedCases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_ignoreWordsWithMixedCases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_ignoreWordsWithMixedCases")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_ignoreWordsWithNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_ignoreWordsWithNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_ignoreWordsWithNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_ignoreWordsWithNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_inlineModeImmediateMarkup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_inlineModeImmediateMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_inlineModeImmediateMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_inlineModeImmediateMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_maxSuggestions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_maxSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_maxSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_maxSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_minWordLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_minWordLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_minWordLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_minWordLength")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_moreSuggestions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_moreSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_moreSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_moreSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_multiLanguageMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_multiLanguageMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_multiLanguageMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_multiLanguageMode")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_multiLanguageStyles(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_multiLanguageStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_multiLanguageStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_multiLanguageStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_sLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_sLang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_sLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_sLang")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_serviceHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_serviceHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_serviceHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_serviceHost")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_servicePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_servicePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_servicePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_servicePath")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_servicePort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_servicePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_servicePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_servicePort")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_serviceProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_serviceProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_serviceProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_serviceProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_srcUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_srcUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_srcUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_srcUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_uiTabs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_uiTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_uiTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_uiTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withScayt_userDictionaryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_userDictionaryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScayt_userDictionaryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scayt_userDictionaryName")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedSpaces(value: sharedSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedSpaces")(js.undefined)
        ret
    }
    @scala.inline
    def withShiftEnterMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftEnterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShiftEnterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftEnterMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin(value: String): Self = {
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
    def withSmiley_columns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smiley_columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmiley_columns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smiley_columns")(js.undefined)
        ret
    }
    @scala.inline
    def withSmiley_descriptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smiley_descriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmiley_descriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smiley_descriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSmiley_images(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smiley_images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmiley_images: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smiley_images")(js.undefined)
        ret
    }
    @scala.inline
    def withSmiley_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smiley_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmiley_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smiley_path")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAreaTabSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAreaTabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAreaTabSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAreaTabSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialChars(value: js.Array[String | (js.Tuple2[String, String])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialChars")(js.undefined)
        ret
    }
    @scala.inline
    def withStartupFocus(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartupFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withStartupMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartupMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStartupOutlineBlocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupOutlineBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartupOutlineBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupOutlineBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withStartupShowBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupShowBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartupShowBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupShowBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesSet(value: String | Boolean | js.Array[styleObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesSet")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetParser_skipSelectors(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheetParser_skipSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetParser_skipSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheetParser_skipSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetParser_validSelectors(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheetParser_validSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetParser_validSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheetParser_validSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTabSpaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSpaces")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates_files(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates_files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates_files: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates_files")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates_replaceContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates_replaceContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates_replaceContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates_replaceContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | Boolean): Self = {
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
    @scala.inline
    def withToolbar(value: String | (js.Array[String | js.Array[String] | AnonGroups])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(null)
        ret
    }
    @scala.inline
    def withToolbarCanCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarCanCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarCanCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarCanCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarGroupCycling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarGroupCycling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarGroupCycling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarGroupCycling")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarGroups(value: js.Array[toolbarGroups | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarStartupExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarStartupExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarStartupExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarStartupExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withUiColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiColor")(js.undefined)
        ret
    }
    @scala.inline
    def withUndoStackSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoStackSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndoStackSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoStackSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUseComputedState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useComputedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseComputedState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useComputedState")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWsc_cmd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsc_cmd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_cmd")(js.undefined)
        ret
    }
    @scala.inline
    def withWsc_customDictionaryIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_customDictionaryIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsc_customDictionaryIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_customDictionaryIds")(js.undefined)
        ret
    }
    @scala.inline
    def withWsc_customLoaderScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_customLoaderScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsc_customLoaderScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_customLoaderScript")(js.undefined)
        ret
    }
    @scala.inline
    def withWsc_customerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsc_customerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withWsc_height(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsc_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_height")(js.undefined)
        ret
    }
    @scala.inline
    def withWsc_lang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsc_lang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_lang")(js.undefined)
        ret
    }
    @scala.inline
    def withWsc_left(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsc_left: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_left")(js.undefined)
        ret
    }
    @scala.inline
    def withWsc_top(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsc_top: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_top")(js.undefined)
        ret
    }
    @scala.inline
    def withWsc_userDictionaryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_userDictionaryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsc_userDictionaryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_userDictionaryName")(js.undefined)
        ret
    }
    @scala.inline
    def withWsc_width(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsc_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsc_width")(js.undefined)
        ret
    }
  }
  
}

