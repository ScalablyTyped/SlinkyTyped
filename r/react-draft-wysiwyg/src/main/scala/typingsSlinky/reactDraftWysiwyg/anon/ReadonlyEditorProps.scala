package typingsSlinky.reactDraftWysiwyg.anon

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactDraftWysiwyg.mod.ContentBlock
import typingsSlinky.reactDraftWysiwyg.mod.EditorState
import typingsSlinky.reactDraftWysiwyg.mod.RawDraftContentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-draft-wysiwyg.react-draft-wysiwyg.EditorProps> */
@js.native
trait ReadonlyEditorProps extends js.Object {
  val ariaActiveDescendantID: js.UndefOr[String] = js.native
  val ariaAutoComplete: js.UndefOr[String] = js.native
  val ariaDescribedBy: js.UndefOr[String] = js.native
  val ariaExpanded: js.UndefOr[String] = js.native
  val ariaHasPopup: js.UndefOr[String] = js.native
  val ariaLabel: js.UndefOr[String] = js.native
  val ariaOwneeID: js.UndefOr[String] = js.native
  val contentState: js.UndefOr[RawDraftContentState] = js.native
  val customBlockRenderFunc: js.UndefOr[js.Function1[/* block */ ContentBlock, _]] = js.native
  val customDecorators: js.UndefOr[js.Array[js.Object]] = js.native
  val customStyleMap: js.UndefOr[js.Object] = js.native
  val defaultContentState: js.UndefOr[RawDraftContentState] = js.native
  val defaultEditorState: js.UndefOr[EditorState] = js.native
  val editorClassName: js.UndefOr[String] = js.native
  val editorRef: js.UndefOr[js.Function1[/* ref */ js.Object, Unit]] = js.native
  val editorState: js.UndefOr[EditorState] = js.native
  val editorStyle: js.UndefOr[CSSProperties] = js.native
  val handlePastedText: js.UndefOr[
    js.Function4[
      /* text */ String, 
      /* html */ String, 
      /* editorState */ EditorState, 
      /* onChange */ js.Function1[/* editorState */ EditorState, Unit], 
      Boolean
    ]
  ] = js.native
  val hashtag: js.UndefOr[js.Object] = js.native
  val initialContentState: js.UndefOr[RawDraftContentState] = js.native
  val locale: js.UndefOr[String] = js.native
  val localization: js.UndefOr[js.Object] = js.native
  val mention: js.UndefOr[js.Object] = js.native
  val onBlur: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with js.Object, Event], Unit]] = js.native
  val onChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, Unit]] = js.native
  val onContentStateChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, Unit]] = js.native
  val onEditorStateChange: js.UndefOr[js.Function1[/* editorState */ EditorState, Unit]] = js.native
  val onFocus: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with js.Object, Event], Unit]] = js.native
  val onTab: js.UndefOr[js.Function1[SyntheticKeyboardEvent[js.Object], Unit]] = js.native
  val placeholder: js.UndefOr[String] = js.native
  val readOnly: js.UndefOr[Boolean] = js.native
  val spellCheck: js.UndefOr[Boolean] = js.native
  val stripPastedStyles: js.UndefOr[Boolean] = js.native
  val tabIndex: js.UndefOr[Double] = js.native
  val textAlignment: js.UndefOr[String] = js.native
  val toolbar: js.UndefOr[js.Object] = js.native
  val toolbarClassName: js.UndefOr[String] = js.native
  val toolbarCustomButtons: js.UndefOr[js.Array[ReactElement]] = js.native
  val toolbarHidden: js.UndefOr[Boolean] = js.native
  val toolbarOnFocus: js.UndefOr[Boolean] = js.native
  val toolbarStyle: js.UndefOr[js.Object] = js.native
  val uploadCallback: js.UndefOr[js.Function1[/* file */ js.Object, js.Promise[js.Object]]] = js.native
  val wrapperClassName: js.UndefOr[String] = js.native
  val wrapperId: js.UndefOr[Double] = js.native
  val wrapperStyle: js.UndefOr[CSSProperties] = js.native
}

object ReadonlyEditorProps {
  @scala.inline
  def apply(): ReadonlyEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyEditorProps]
  }
  @scala.inline
  implicit class ReadonlyEditorPropsOps[Self <: ReadonlyEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaActiveDescendantID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaActiveDescendantID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaActiveDescendantID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaActiveDescendantID")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaAutoComplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaAutoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaAutoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaDescribedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaExpanded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaHasPopup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHasPopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaHasPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHasPopup")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaOwneeID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaOwneeID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaOwneeID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaOwneeID")(js.undefined)
        ret
    }
    @scala.inline
    def withContentState(value: RawDraftContentState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentState")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomBlockRenderFunc(value: /* block */ ContentBlock => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBlockRenderFunc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomBlockRenderFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBlockRenderFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDecorators(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDecorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDecorators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDecorators")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStyleMap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyleMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomStyleMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyleMap")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultContentState(value: RawDraftContentState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultContentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultContentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultContentState")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEditorState(value: EditorState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEditorState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEditorState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEditorState")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorRef(value: /* ref */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEditorRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorRef")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorState(value: EditorState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorState")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlePastedText(
      value: (/* text */ String, /* html */ String, /* editorState */ EditorState, /* onChange */ js.Function1[/* editorState */ EditorState, Unit]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePastedText")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutHandlePastedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePastedText")(js.undefined)
        ret
    }
    @scala.inline
    def withHashtag(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialContentState(value: RawDraftContentState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialContentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContentState")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalization(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localization")(js.undefined)
        ret
    }
    @scala.inline
    def withMention(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticEvent[EventTarget with js.Object, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* contentState */ RawDraftContentState => Unit): Self = {
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
    def withOnContentStateChange(value: /* contentState */ RawDraftContentState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContentStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditorStateChange(value: /* editorState */ EditorState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditorStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticEvent[EventTarget with js.Object, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTab(value: SyntheticKeyboardEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTab")(js.Any.fromFunction1(value))
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
    def withSpellCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(js.undefined)
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
    def withTextAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: js.Object): Self = {
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
    def withToolbarClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarCustomButtons(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarCustomButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarCustomButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarCustomButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadCallback(value: /* file */ js.Object => js.Promise[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUploadCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperId")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(js.undefined)
        ret
    }
  }
  
}

