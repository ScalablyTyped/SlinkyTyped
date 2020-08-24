package typingsSlinky.reactDraftWysiwyg.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactDraftWysiwyg.mod.ContentBlock
import typingsSlinky.reactDraftWysiwyg.mod.EditorProps
import typingsSlinky.reactDraftWysiwyg.mod.EditorState
import typingsSlinky.reactDraftWysiwyg.mod.RawDraftContentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Editor {
  @JSImport("react-draft-wysiwyg", "Editor")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactDraftWysiwyg.mod.Editor] {
    @scala.inline
    def ariaActiveDescendantID(value: String): this.type = set("ariaActiveDescendantID", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaAutoComplete(value: String): this.type = set("ariaAutoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaExpanded(value: String): this.type = set("ariaExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaHasPopup(value: String): this.type = set("ariaHasPopup", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaOwneeID(value: String): this.type = set("ariaOwneeID", value.asInstanceOf[js.Any])
    @scala.inline
    def contentState(value: RawDraftContentState): this.type = set("contentState", value.asInstanceOf[js.Any])
    @scala.inline
    def customBlockRenderFunc(value: /* block */ ContentBlock => _): this.type = set("customBlockRenderFunc", js.Any.fromFunction1(value))
    @scala.inline
    def customDecoratorsVarargs(value: js.Object*): this.type = set("customDecorators", js.Array(value :_*))
    @scala.inline
    def customDecorators(value: js.Array[js.Object]): this.type = set("customDecorators", value.asInstanceOf[js.Any])
    @scala.inline
    def customStyleMap(value: js.Object): this.type = set("customStyleMap", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultContentState(value: RawDraftContentState): this.type = set("defaultContentState", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultEditorState(value: EditorState): this.type = set("defaultEditorState", value.asInstanceOf[js.Any])
    @scala.inline
    def editorClassName(value: String): this.type = set("editorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def editorRef(value: /* ref */ js.Object => Unit): this.type = set("editorRef", js.Any.fromFunction1(value))
    @scala.inline
    def editorState(value: EditorState): this.type = set("editorState", value.asInstanceOf[js.Any])
    @scala.inline
    def editorStyle(value: CSSProperties): this.type = set("editorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def handlePastedText(
      value: (/* text */ String, /* html */ String, /* editorState */ EditorState, /* onChange */ js.Function1[/* editorState */ EditorState, Unit]) => Boolean
    ): this.type = set("handlePastedText", js.Any.fromFunction4(value))
    @scala.inline
    def hashtag(value: js.Object): this.type = set("hashtag", value.asInstanceOf[js.Any])
    @scala.inline
    def initialContentState(value: RawDraftContentState): this.type = set("initialContentState", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def localization(value: js.Object): this.type = set("localization", value.asInstanceOf[js.Any])
    @scala.inline
    def mention(value: js.Object): this.type = set("mention", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticEvent[EventTarget with js.Object, Event] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* contentState */ RawDraftContentState => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onContentStateChange(value: /* contentState */ RawDraftContentState => Unit): this.type = set("onContentStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onEditorStateChange(value: /* editorState */ EditorState => Unit): this.type = set("onEditorStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticEvent[EventTarget with js.Object, Event] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onTab(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onTab", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def spellCheck(value: Boolean): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def stripPastedStyles(value: Boolean): this.type = set("stripPastedStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def textAlignment(value: String): this.type = set("textAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbar(value: js.Object): this.type = set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbarClassName(value: String): this.type = set("toolbarClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbarCustomButtonsVarargs(value: ReactElement*): this.type = set("toolbarCustomButtons", js.Array(value :_*))
    @scala.inline
    def toolbarCustomButtons(value: js.Array[ReactElement]): this.type = set("toolbarCustomButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbarHidden(value: Boolean): this.type = set("toolbarHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbarOnFocus(value: Boolean): this.type = set("toolbarOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbarStyle(value: js.Object): this.type = set("toolbarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def uploadCallback(value: /* file */ js.Object => js.Promise[js.Object]): this.type = set("uploadCallback", js.Any.fromFunction1(value))
    @scala.inline
    def wrapperClassName(value: String): this.type = set("wrapperClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapperId(value: Double): this.type = set("wrapperId", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Editor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

