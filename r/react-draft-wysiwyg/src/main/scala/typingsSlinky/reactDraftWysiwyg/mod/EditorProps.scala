package typingsSlinky.reactDraftWysiwyg.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorProps extends js.Object {
  
  var ariaActiveDescendantID: js.UndefOr[String] = js.native
  
  var ariaAutoComplete: js.UndefOr[String] = js.native
  
  var ariaDescribedBy: js.UndefOr[String] = js.native
  
  var ariaExpanded: js.UndefOr[String] = js.native
  
  var ariaHasPopup: js.UndefOr[String] = js.native
  
  var ariaLabel: js.UndefOr[String] = js.native
  
  var ariaOwneeID: js.UndefOr[String] = js.native
  
  var contentState: js.UndefOr[RawDraftContentState] = js.native
  
  var customBlockRenderFunc: js.UndefOr[js.Function1[/* block */ ContentBlock, _]] = js.native
  
  var customDecorators: js.UndefOr[js.Array[js.Object]] = js.native
  
  var customStyleMap: js.UndefOr[js.Object] = js.native
  
  var defaultContentState: js.UndefOr[RawDraftContentState] = js.native
  
  var defaultEditorState: js.UndefOr[EditorState] = js.native
  
  var editorClassName: js.UndefOr[String] = js.native
  
  var editorRef: js.UndefOr[js.Function1[/* ref */ js.Object, Unit]] = js.native
  
  var editorState: js.UndefOr[EditorState] = js.native
  
  var editorStyle: js.UndefOr[CSSProperties] = js.native
  
  var handlePastedText: js.UndefOr[
    js.Function4[
      /* text */ String, 
      /* html */ String, 
      /* editorState */ EditorState, 
      /* onChange */ js.Function1[/* editorState */ EditorState, Unit], 
      Boolean
    ]
  ] = js.native
  
  var hashtag: js.UndefOr[js.Object] = js.native
  
  var initialContentState: js.UndefOr[RawDraftContentState] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var localization: js.UndefOr[js.Object] = js.native
  
  var mention: js.UndefOr[js.Object] = js.native
  
  var onBlur: js.UndefOr[
    js.Function1[slinky.core.SyntheticEvent[EventTarget with js.Object, Event], Unit]
  ] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, Unit]] = js.native
  
  var onContentStateChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, Unit]] = js.native
  
  var onEditorStateChange: js.UndefOr[js.Function1[/* editorState */ EditorState, Unit]] = js.native
  
  var onFocus: js.UndefOr[
    js.Function1[slinky.core.SyntheticEvent[EventTarget with js.Object, Event], Unit]
  ] = js.native
  
  var onTab: js.UndefOr[js.Function1[slinky.web.SyntheticKeyboardEvent[js.Object], Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var spellCheck: js.UndefOr[Boolean] = js.native
  
  var stripPastedStyles: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var textAlignment: js.UndefOr[String] = js.native
  
  var toolbar: js.UndefOr[js.Object] = js.native
  
  var toolbarClassName: js.UndefOr[String] = js.native
  
  var toolbarCustomButtons: js.UndefOr[js.Array[ReactElement]] = js.native
  
  var toolbarHidden: js.UndefOr[Boolean] = js.native
  
  var toolbarOnFocus: js.UndefOr[Boolean] = js.native
  
  var toolbarStyle: js.UndefOr[js.Object] = js.native
  
  var uploadCallback: js.UndefOr[js.Function1[/* file */ js.Object, js.Promise[js.Object]]] = js.native
  
  var wrapperClassName: js.UndefOr[String] = js.native
  
  var wrapperId: js.UndefOr[Double] = js.native
  
  var wrapperStyle: js.UndefOr[CSSProperties] = js.native
}
object EditorProps {
  
  @scala.inline
  def apply(): EditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorProps]
  }
  
  @scala.inline
  implicit class EditorPropsOps[Self <: EditorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAriaActiveDescendantID(value: String): Self = this.set("ariaActiveDescendantID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaActiveDescendantID: Self = this.set("ariaActiveDescendantID", js.undefined)
    
    @scala.inline
    def setAriaAutoComplete(value: String): Self = this.set("ariaAutoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaAutoComplete: Self = this.set("ariaAutoComplete", js.undefined)
    
    @scala.inline
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    
    @scala.inline
    def setAriaExpanded(value: String): Self = this.set("ariaExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaExpanded: Self = this.set("ariaExpanded", js.undefined)
    
    @scala.inline
    def setAriaHasPopup(value: String): Self = this.set("ariaHasPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaHasPopup: Self = this.set("ariaHasPopup", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setAriaOwneeID(value: String): Self = this.set("ariaOwneeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaOwneeID: Self = this.set("ariaOwneeID", js.undefined)
    
    @scala.inline
    def setContentState(value: RawDraftContentState): Self = this.set("contentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentState: Self = this.set("contentState", js.undefined)
    
    @scala.inline
    def setCustomBlockRenderFunc(value: /* block */ ContentBlock => _): Self = this.set("customBlockRenderFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomBlockRenderFunc: Self = this.set("customBlockRenderFunc", js.undefined)
    
    @scala.inline
    def setCustomDecoratorsVarargs(value: js.Object*): Self = this.set("customDecorators", js.Array(value :_*))
    
    @scala.inline
    def setCustomDecorators(value: js.Array[js.Object]): Self = this.set("customDecorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDecorators: Self = this.set("customDecorators", js.undefined)
    
    @scala.inline
    def setCustomStyleMap(value: js.Object): Self = this.set("customStyleMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomStyleMap: Self = this.set("customStyleMap", js.undefined)
    
    @scala.inline
    def setDefaultContentState(value: RawDraftContentState): Self = this.set("defaultContentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultContentState: Self = this.set("defaultContentState", js.undefined)
    
    @scala.inline
    def setDefaultEditorState(value: EditorState): Self = this.set("defaultEditorState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEditorState: Self = this.set("defaultEditorState", js.undefined)
    
    @scala.inline
    def setEditorClassName(value: String): Self = this.set("editorClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorClassName: Self = this.set("editorClassName", js.undefined)
    
    @scala.inline
    def setEditorRef(value: /* ref */ js.Object => Unit): Self = this.set("editorRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEditorRef: Self = this.set("editorRef", js.undefined)
    
    @scala.inline
    def setEditorState(value: EditorState): Self = this.set("editorState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorState: Self = this.set("editorState", js.undefined)
    
    @scala.inline
    def setEditorStyle(value: CSSProperties): Self = this.set("editorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorStyle: Self = this.set("editorStyle", js.undefined)
    
    @scala.inline
    def setHandlePastedText(
      value: (/* text */ String, /* html */ String, /* editorState */ EditorState, /* onChange */ js.Function1[/* editorState */ EditorState, Unit]) => Boolean
    ): Self = this.set("handlePastedText", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteHandlePastedText: Self = this.set("handlePastedText", js.undefined)
    
    @scala.inline
    def setHashtag(value: js.Object): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
    
    @scala.inline
    def setInitialContentState(value: RawDraftContentState): Self = this.set("initialContentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialContentState: Self = this.set("initialContentState", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocalization(value: js.Object): Self = this.set("localization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalization: Self = this.set("localization", js.undefined)
    
    @scala.inline
    def setMention(value: js.Object): Self = this.set("mention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMention: Self = this.set("mention", js.undefined)
    
    @scala.inline
    def setOnBlur(value: slinky.core.SyntheticEvent[EventTarget with js.Object, Event] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* contentState */ RawDraftContentState => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnContentStateChange(value: /* contentState */ RawDraftContentState => Unit): Self = this.set("onContentStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentStateChange: Self = this.set("onContentStateChange", js.undefined)
    
    @scala.inline
    def setOnEditorStateChange(value: /* editorState */ EditorState => Unit): Self = this.set("onEditorStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEditorStateChange: Self = this.set("onEditorStateChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: slinky.core.SyntheticEvent[EventTarget with js.Object, Event] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnTab(value: slinky.web.SyntheticKeyboardEvent[js.Object] => Unit): Self = this.set("onTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTab: Self = this.set("onTab", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Boolean): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    
    @scala.inline
    def setStripPastedStyles(value: Boolean): Self = this.set("stripPastedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripPastedStyles: Self = this.set("stripPastedStyles", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTextAlignment(value: String): Self = this.set("textAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlignment: Self = this.set("textAlignment", js.undefined)
    
    @scala.inline
    def setToolbar(value: js.Object): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setToolbarClassName(value: String): Self = this.set("toolbarClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarClassName: Self = this.set("toolbarClassName", js.undefined)
    
    @scala.inline
    def setToolbarCustomButtonsVarargs(value: ReactElement*): Self = this.set("toolbarCustomButtons", js.Array(value :_*))
    
    @scala.inline
    def setToolbarCustomButtons(value: js.Array[ReactElement]): Self = this.set("toolbarCustomButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarCustomButtons: Self = this.set("toolbarCustomButtons", js.undefined)
    
    @scala.inline
    def setToolbarHidden(value: Boolean): Self = this.set("toolbarHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarHidden: Self = this.set("toolbarHidden", js.undefined)
    
    @scala.inline
    def setToolbarOnFocus(value: Boolean): Self = this.set("toolbarOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarOnFocus: Self = this.set("toolbarOnFocus", js.undefined)
    
    @scala.inline
    def setToolbarStyle(value: js.Object): Self = this.set("toolbarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarStyle: Self = this.set("toolbarStyle", js.undefined)
    
    @scala.inline
    def setUploadCallback(value: /* file */ js.Object => js.Promise[js.Object]): Self = this.set("uploadCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUploadCallback: Self = this.set("uploadCallback", js.undefined)
    
    @scala.inline
    def setWrapperClassName(value: String): Self = this.set("wrapperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperClassName: Self = this.set("wrapperClassName", js.undefined)
    
    @scala.inline
    def setWrapperId(value: Double): Self = this.set("wrapperId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperId: Self = this.set("wrapperId", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: CSSProperties): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
}
