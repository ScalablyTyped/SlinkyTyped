package typingsSlinky.reactNativeZssRichTextEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ACTIONS extends StObject
@JSImport("react-native-zss-rich-text-editor", "ACTIONS")
@js.native
object ACTIONS extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACTIONS with String] = js.native
  
  @js.native
  sealed trait alignCenter extends ACTIONS
  /* "justifyCenter" */ val alignCenter: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.alignCenter with String = js.native
  
  @js.native
  sealed trait alignFull extends ACTIONS
  /* "justifyFull" */ val alignFull: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.alignFull with String = js.native
  
  @js.native
  sealed trait alignLeft extends ACTIONS
  /* "justifyLeft" */ val alignLeft: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.alignLeft with String = js.native
  
  @js.native
  sealed trait alignRight extends ACTIONS
  /* "justifyRight" */ val alignRight: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.alignRight with String = js.native
  
  @js.native
  sealed trait blurContentEditor extends ACTIONS
  /* "BLUR_CONTENT_EDITOR" */ val blurContentEditor: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.blurContentEditor with String = js.native
  
  @js.native
  sealed trait blurTitleEditor extends ACTIONS
  /* "BLUR_TITLE_EDITOR" */ val blurTitleEditor: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.blurTitleEditor with String = js.native
  
  @js.native
  sealed trait enableOnChange extends ACTIONS
  /* "ENABLE_ON_CHANGE" */ val enableOnChange: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.enableOnChange with String = js.native
  
  @js.native
  sealed trait focusContent extends ACTIONS
  /* "FOCUS_CONTENT" */ val focusContent: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.focusContent with String = js.native
  
  @js.native
  sealed trait focusTitle extends ACTIONS
  /* "FOCUS_TITLE" */ val focusTitle: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.focusTitle with String = js.native
  
  @js.native
  sealed trait getContentHtml extends ACTIONS
  /* "GET_CONTENT_HTML" */ val getContentHtml: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.getContentHtml with String = js.native
  
  @js.native
  sealed trait getSelectedText extends ACTIONS
  /* "GET_SELECTED_TEXT" */ val getSelectedText: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.getSelectedText with String = js.native
  
  @js.native
  sealed trait getTitleHtml extends ACTIONS
  /* "GET_TITLE_HTML" */ val getTitleHtml: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.getTitleHtml with String = js.native
  
  @js.native
  sealed trait getTitleText extends ACTIONS
  /* "GET_TITLE_TEXT" */ val getTitleText: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.getTitleText with String = js.native
  
  @js.native
  sealed trait heading1 extends ACTIONS
  /* "h1" */ val heading1: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.heading1 with String = js.native
  
  @js.native
  sealed trait heading2 extends ACTIONS
  /* "h2" */ val heading2: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.heading2 with String = js.native
  
  @js.native
  sealed trait heading3 extends ACTIONS
  /* "h3" */ val heading3: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.heading3 with String = js.native
  
  @js.native
  sealed trait heading4 extends ACTIONS
  /* "h4" */ val heading4: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.heading4 with String = js.native
  
  @js.native
  sealed trait heading5 extends ACTIONS
  /* "h5" */ val heading5: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.heading5 with String = js.native
  
  @js.native
  sealed trait heading6 extends ACTIONS
  /* "h6" */ val heading6: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.heading6 with String = js.native
  
  @js.native
  sealed trait hideTitle extends ACTIONS
  /* "HIDE_TITLE" */ val hideTitle: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.hideTitle with String = js.native
  
  @js.native
  sealed trait init extends ACTIONS
  /* "ZSSS_INIT" */ val init: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.init with String = js.native
  
  @js.native
  sealed trait insertBulletsList extends ACTIONS
  /* "unorderedList" */ val insertBulletsList: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.insertBulletsList with String = js.native
  
  @js.native
  sealed trait insertImage extends ACTIONS
  /* "INST_IMAGE" */ val insertImage: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.insertImage with String = js.native
  
  @js.native
  sealed trait insertLink extends ACTIONS
  /* "INST_LINK" */ val insertLink: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.insertLink with String = js.native
  
  @js.native
  sealed trait insertOrderedList extends ACTIONS
  /* "orderedList" */ val insertOrderedList: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.insertOrderedList with String = js.native
  
  @js.native
  sealed trait prepareInsert extends ACTIONS
  /* "PREPARE_INSERT" */ val prepareInsert: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.prepareInsert with String = js.native
  
  @js.native
  sealed trait removeFormat extends ACTIONS
  /* "REMOVE_FORMAT" */ val removeFormat: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.removeFormat with String = js.native
  
  @js.native
  sealed trait restoreSelection extends ACTIONS
  /* "RESTORE_SELECTION" */ val restoreSelection: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.restoreSelection with String = js.native
  
  @js.native
  sealed trait setBackgroundColor extends ACTIONS
  /* "SET_BACKGROUND_COLOR" */ val setBackgroundColor: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setBackgroundColor with String = js.native
  
  @js.native
  sealed trait setBold extends ACTIONS
  /* "bold" */ val setBold: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setBold with String = js.native
  
  @js.native
  sealed trait setContentFocusHandler extends ACTIONS
  /* "SET_CONTENT_FOCUS_HANDLER" */ val setContentFocusHandler: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setContentFocusHandler with String = js.native
  
  @js.native
  sealed trait setContentHtml extends ACTIONS
  /* "SET_CONTENT_HTML" */ val setContentHtml: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setContentHtml with String = js.native
  
  @js.native
  sealed trait setContentPlaceholder extends ACTIONS
  /* "SET_CONTENT_PLACEHOLDER" */ val setContentPlaceholder: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setContentPlaceholder with String = js.native
  
  @js.native
  sealed trait setCustomCSS extends ACTIONS
  /* "SET_CUSTOM_CSS" */ val setCustomCSS: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setCustomCSS with String = js.native
  
  @js.native
  sealed trait setEditorHeight extends ACTIONS
  /* "SET_EDITOR_HEIGHT" */ val setEditorHeight: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setEditorHeight with String = js.native
  
  @js.native
  sealed trait setFooterHeight extends ACTIONS
  /* "SET_FOOTER_HEIGHT" */ val setFooterHeight: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setFooterHeight with String = js.native
  
  @js.native
  sealed trait setHR extends ACTIONS
  /* "horizontalRule" */ val setHR: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setHR with String = js.native
  
  @js.native
  sealed trait setIndent extends ACTIONS
  /* "indent" */ val setIndent: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setIndent with String = js.native
  
  @js.native
  sealed trait setItalic extends ACTIONS
  /* "italic" */ val setItalic: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setItalic with String = js.native
  
  @js.native
  sealed trait setOutdent extends ACTIONS
  /* "outdent" */ val setOutdent: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setOutdent with String = js.native
  
  @js.native
  sealed trait setParagraph extends ACTIONS
  /* "SET_PARAGRAPH" */ val setParagraph: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setParagraph with String = js.native
  
  @js.native
  sealed trait setPlatform extends ACTIONS
  /* "SET_PLATFORM" */ val setPlatform: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setPlatform with String = js.native
  
  @js.native
  sealed trait setStrikethrough extends ACTIONS
  /* "strikeThrough" */ val setStrikethrough: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setStrikethrough with String = js.native
  
  @js.native
  sealed trait setSubscript extends ACTIONS
  /* "subscript" */ val setSubscript: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setSubscript with String = js.native
  
  @js.native
  sealed trait setSuperscript extends ACTIONS
  /* "superscript" */ val setSuperscript: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setSuperscript with String = js.native
  
  @js.native
  sealed trait setTextColor extends ACTIONS
  /* "SET_TEXT_COLOR" */ val setTextColor: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setTextColor with String = js.native
  
  @js.native
  sealed trait setTitleFocusHandler extends ACTIONS
  /* "SET_TITLE_FOCUS_HANDLER" */ val setTitleFocusHandler: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setTitleFocusHandler with String = js.native
  
  @js.native
  sealed trait setTitleHtml extends ACTIONS
  /* "SET_TITLE_HTML" */ val setTitleHtml: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setTitleHtml with String = js.native
  
  @js.native
  sealed trait setTitlePlaceholder extends ACTIONS
  /* "SET_TITLE_PLACEHOLDER" */ val setTitlePlaceholder: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setTitlePlaceholder with String = js.native
  
  @js.native
  sealed trait setUnderline extends ACTIONS
  /* "underline" */ val setUnderline: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.setUnderline with String = js.native
  
  @js.native
  sealed trait showTitle extends ACTIONS
  /* "SHOW_TITLE" */ val showTitle: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.showTitle with String = js.native
  
  @js.native
  sealed trait toggleTitle extends ACTIONS
  /* "TOGGLE_TITLE" */ val toggleTitle: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.toggleTitle with String = js.native
  
  @js.native
  sealed trait updateLink extends ACTIONS
  /* "UPDATE_LINK" */ val updateLink: typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS.updateLink with String = js.native
}
