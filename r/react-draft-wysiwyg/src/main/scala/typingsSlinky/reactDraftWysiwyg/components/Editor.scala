package typingsSlinky.reactDraftWysiwyg.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactDraftWysiwyg.mod.ContentBlock
import typingsSlinky.reactDraftWysiwyg.mod.EditorProps
import typingsSlinky.reactDraftWysiwyg.mod.EditorState
import typingsSlinky.reactDraftWysiwyg.mod.RawDraftContentState
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Editor
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDraftWysiwyg.mod.Editor] {
  @JSImport("react-draft-wysiwyg", "Editor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: placeholder, readOnly, spellCheck, tabIndex */
  def apply(
    ariaActiveDescendantID: String = null,
    ariaAutoComplete: String = null,
    ariaDescribedBy: String = null,
    ariaExpanded: String = null,
    ariaHasPopup: String = null,
    ariaLabel: String = null,
    ariaOwneeID: String = null,
    contentState: RawDraftContentState = null,
    customBlockRenderFunc: /* block */ ContentBlock => _ = null,
    customDecorators: js.Array[js.Object] = null,
    customStyleMap: js.Object = null,
    defaultContentState: RawDraftContentState = null,
    defaultEditorState: EditorState = null,
    editorClassName: String = null,
    editorRef: /* ref */ js.Object => Unit = null,
    editorState: EditorState = null,
    editorStyle: CSSProperties = null,
    handlePastedText: (/* text */ String, /* html */ String, /* editorState */ EditorState, /* onChange */ js.Function1[/* editorState */ EditorState, Unit]) => Boolean = null,
    hashtag: js.Object = null,
    initialContentState: RawDraftContentState = null,
    locale: String = null,
    localization: js.Object = null,
    mention: js.Object = null,
    onBlur: SyntheticEvent[EventTarget with js.Object, Event_] => Unit = null,
    onChange: /* contentState */ RawDraftContentState => Unit = null,
    onContentStateChange: /* contentState */ RawDraftContentState => Unit = null,
    onEditorStateChange: /* editorState */ EditorState => Unit = null,
    onFocus: SyntheticEvent[EventTarget with js.Object, Event_] => Unit = null,
    onTab: SyntheticKeyboardEvent[js.Object] => Unit = null,
    stripPastedStyles: js.UndefOr[Boolean] = js.undefined,
    textAlignment: String = null,
    toolbar: js.Object = null,
    toolbarClassName: String = null,
    toolbarCustomButtons: js.Array[ReactElement] = null,
    toolbarHidden: js.UndefOr[Boolean] = js.undefined,
    toolbarOnFocus: js.UndefOr[Boolean] = js.undefined,
    toolbarStyle: js.Object = null,
    uploadCallback: /* file */ js.Object => js.Promise[js.Object] = null,
    wrapperClassName: String = null,
    wrapperId: Int | Double = null,
    wrapperStyle: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDraftWysiwyg.mod.Editor] = {
    val __obj = js.Dynamic.literal()
    if (ariaActiveDescendantID != null) __obj.updateDynamic("ariaActiveDescendantID")(ariaActiveDescendantID.asInstanceOf[js.Any])
    if (ariaAutoComplete != null) __obj.updateDynamic("ariaAutoComplete")(ariaAutoComplete.asInstanceOf[js.Any])
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaExpanded != null) __obj.updateDynamic("ariaExpanded")(ariaExpanded.asInstanceOf[js.Any])
    if (ariaHasPopup != null) __obj.updateDynamic("ariaHasPopup")(ariaHasPopup.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaOwneeID != null) __obj.updateDynamic("ariaOwneeID")(ariaOwneeID.asInstanceOf[js.Any])
    if (contentState != null) __obj.updateDynamic("contentState")(contentState.asInstanceOf[js.Any])
    if (customBlockRenderFunc != null) __obj.updateDynamic("customBlockRenderFunc")(js.Any.fromFunction1(customBlockRenderFunc))
    if (customDecorators != null) __obj.updateDynamic("customDecorators")(customDecorators.asInstanceOf[js.Any])
    if (customStyleMap != null) __obj.updateDynamic("customStyleMap")(customStyleMap.asInstanceOf[js.Any])
    if (defaultContentState != null) __obj.updateDynamic("defaultContentState")(defaultContentState.asInstanceOf[js.Any])
    if (defaultEditorState != null) __obj.updateDynamic("defaultEditorState")(defaultEditorState.asInstanceOf[js.Any])
    if (editorClassName != null) __obj.updateDynamic("editorClassName")(editorClassName.asInstanceOf[js.Any])
    if (editorRef != null) __obj.updateDynamic("editorRef")(js.Any.fromFunction1(editorRef))
    if (editorState != null) __obj.updateDynamic("editorState")(editorState.asInstanceOf[js.Any])
    if (editorStyle != null) __obj.updateDynamic("editorStyle")(editorStyle.asInstanceOf[js.Any])
    if (handlePastedText != null) __obj.updateDynamic("handlePastedText")(js.Any.fromFunction4(handlePastedText))
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (initialContentState != null) __obj.updateDynamic("initialContentState")(initialContentState.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localization != null) __obj.updateDynamic("localization")(localization.asInstanceOf[js.Any])
    if (mention != null) __obj.updateDynamic("mention")(mention.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onContentStateChange != null) __obj.updateDynamic("onContentStateChange")(js.Any.fromFunction1(onContentStateChange))
    if (onEditorStateChange != null) __obj.updateDynamic("onEditorStateChange")(js.Any.fromFunction1(onEditorStateChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onTab != null) __obj.updateDynamic("onTab")(js.Any.fromFunction1(onTab))
    if (!js.isUndefined(stripPastedStyles)) __obj.updateDynamic("stripPastedStyles")(stripPastedStyles.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (toolbarClassName != null) __obj.updateDynamic("toolbarClassName")(toolbarClassName.asInstanceOf[js.Any])
    if (toolbarCustomButtons != null) __obj.updateDynamic("toolbarCustomButtons")(toolbarCustomButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarHidden)) __obj.updateDynamic("toolbarHidden")(toolbarHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarOnFocus)) __obj.updateDynamic("toolbarOnFocus")(toolbarOnFocus.asInstanceOf[js.Any])
    if (toolbarStyle != null) __obj.updateDynamic("toolbarStyle")(toolbarStyle.asInstanceOf[js.Any])
    if (uploadCallback != null) __obj.updateDynamic("uploadCallback")(js.Any.fromFunction1(uploadCallback))
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName.asInstanceOf[js.Any])
    if (wrapperId != null) __obj.updateDynamic("wrapperId")(wrapperId.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDraftWysiwyg.mod.Editor] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDraftWysiwyg.mod.Editor](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = EditorProps
}

