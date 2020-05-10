package typingsSlinky.draftJs.mod.Draft.Component.Base

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftDragType
import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftHandleValue
import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.DraftInlineStyle
import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState
import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.SelectionState
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraftEditorProps extends js.Object {
  var ariaActiveDescendantID: js.UndefOr[String] = js.native
  var ariaAutoComplete: js.UndefOr[String] = js.native
  var ariaControls: js.UndefOr[String] = js.native
  var ariaDescribedBy: js.UndefOr[String] = js.native
  var ariaExpanded: js.UndefOr[Boolean] = js.native
  var ariaLabel: js.UndefOr[String] = js.native
  var ariaLabelledBy: js.UndefOr[String] = js.native
  var ariaMultiline: js.UndefOr[Boolean] = js.native
  var ariaOwneeID: js.UndefOr[String] = js.native
  // exposed especially to help improve mobile web behaviors
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  /**
    * Provide a map of block rendering configurations. Each block type maps to
    * an element tag and an optional react element wrapper. This configuration
    * is used for both rendering and paste processing.
    */
  var blockRenderMap: js.UndefOr[DraftBlockRenderMap] = js.native
  /**
    * For a given `ContentBlock` object, return an object that specifies
    * a custom block component and/or props. If no object is returned,
    * the default `TextEditorBlock` is used.
    */
  var blockRendererFn: js.UndefOr[js.Function1[/* block */ ContentBlock, _]] = js.native
  /**
    * Function that allows to define class names to apply to the given block when it is rendered.
    */
  var blockStyleFn: js.UndefOr[js.Function1[/* block */ ContentBlock, String]] = js.native
  /**
    * Define a function to transform inline styles to CSS objects
    * that are applied to spans of text.
    */
  var customStyleFn: js.UndefOr[
    js.Function2[/* style */ DraftInlineStyle, /* block */ ContentBlock, CSSProperties]
  ] = js.native
  /**
    * Provide a map of inline style names corresponding to CSS style objects
    * that will be rendered for matching ranges.
    */
  var customStyleMap: js.UndefOr[DraftStyleMap] = js.native
  /**
    * If using server-side rendering, this prop is required to be set to
    * avoid client/server mismatches.
    */
  var editorKey: js.UndefOr[String] = js.native
  var editorState: EditorState = js.native
  /**
    * Handle intended text insertion before the insertion occurs. This may be
    * useful in cases where the user has entered characters that you would like
    * to trigger some special behavior. E.g. immediately converting `:)` to an
    * emoji Unicode character, or replacing ASCII quote characters with smart
    * quotes.
    */
  var handleBeforeInput: js.UndefOr[
    js.Function3[
      /* chars */ String, 
      /* editorState */ EditorState, 
      /* eventTimeStamp */ Double, 
      DraftHandleValue
    ]
  ] = js.native
  /** Handle other drops to prevent default text movement/insertion behaviour */
  var handleDrop: js.UndefOr[
    js.Function3[
      /* selection */ SelectionState, 
      /* dataTransfer */ js.Object, 
      /* isInternal */ DraftDragType, 
      DraftHandleValue
    ]
  ] = js.native
  /** Handle dropped files */
  var handleDroppedFiles: js.UndefOr[
    js.Function2[/* selection */ SelectionState, /* files */ js.Array[Blob], DraftHandleValue]
  ] = js.native
  /**
    * Map a key command string provided by your key binding function to a
    * specified behavior.
    */
  var handleKeyCommand: js.UndefOr[
    js.Function3[
      /* command */ EditorCommand, 
      /* editorState */ EditorState, 
      /* eventTimeStamp */ Double, 
      DraftHandleValue
    ]
  ] = js.native
  var handlePastedFiles: js.UndefOr[js.Function1[/* files */ js.Array[Blob], DraftHandleValue]] = js.native
  var handlePastedText: js.UndefOr[
    js.Function3[
      /* text */ String, 
      /* html */ js.UndefOr[String], 
      /* editorState */ EditorState, 
      DraftHandleValue
    ]
  ] = js.native
  // Cancelable event handlers, handled from the top level down. A handler
  // that returns `handled` will be the last handler to execute for that event.
  /**
    * Useful for managing special behavior for pressing the `Return` key. E.g.
    * removing the style from an empty list item.
    */
  var handleReturn: js.UndefOr[
    js.Function2[SyntheticKeyboardEvent[js.Object], /* editorState */ EditorState, DraftHandleValue]
  ] = js.native
  /**
    * A function that accepts a synthetic key event and returns
    * the matching DraftEditorCommand constant, or null if no command should
    * be invoked.
    */
  var keyBindingFn: js.UndefOr[js.Function1[SyntheticKeyboardEvent[js.Object], EditorCommand | Null]] = js.native
  var onBlur: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with js.Object, Event_], Unit]] = js.native
  var onDownArrow: js.UndefOr[js.Function1[SyntheticKeyboardEvent[js.Object], Unit]] = js.native
  // Non-cancelable event triggers.
  var onEscape: js.UndefOr[js.Function1[SyntheticKeyboardEvent[js.Object], Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with js.Object, Event_], Unit]] = js.native
  var onLeftArrow: js.UndefOr[js.Function1[SyntheticKeyboardEvent[js.Object], Unit]] = js.native
  var onRightArrow: js.UndefOr[js.Function1[SyntheticKeyboardEvent[js.Object], Unit]] = js.native
  var onTab: js.UndefOr[js.Function1[SyntheticKeyboardEvent[js.Object], Unit]] = js.native
  var onUpArrow: js.UndefOr[js.Function1[SyntheticKeyboardEvent[js.Object], Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Set whether the `DraftEditor` component should be editable. Useful for
    * temporarily disabling edit behavior or allowing `DraftEditor` rendering
    * to be used for consumption purposes.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
  /**
    * Note: spellcheck is always disabled for IE. If enabled in Safari, OSX
    * autocorrect is enabled as well.
    */
  var spellCheck: js.UndefOr[Boolean] = js.native
  /**
    * Set whether to remove all style information from pasted content. If your
    * use case should not have any block or inline styles, it is recommended
    * that you set this to `true`.
    */
  var stripPastedStyles: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * Specify whether text alignment should be forced in a direction
    * regardless of input characters.
    */
  var textAlignment: js.UndefOr[DraftTextAlignment] = js.native
  /**
    * Specify whether text directionality should be forced in a direction
    * regardless of input characters.
    */
  var textDirectionality: js.UndefOr[DraftTextDirectionality] = js.native
  var webDriverTestID: js.UndefOr[String] = js.native
  def onChange(editorState: EditorState): Unit = js.native
}

object DraftEditorProps {
  @scala.inline
  def apply(editorState: EditorState, onChange: EditorState => Unit): DraftEditorProps = {
    val __obj = js.Dynamic.literal(editorState = editorState.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[DraftEditorProps]
  }
  @scala.inline
  implicit class DraftEditorPropsOps[Self <: DraftEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditorState(value: EditorState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: EditorState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
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
    def withAriaControls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaControls")(js.undefined)
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
    def withAriaExpanded(value: Boolean): Self = {
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
    def withAriaLabelledBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaMultiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaMultiline")(js.undefined)
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
    def withAutoCapitalize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoComplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCorrect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockRenderMap(value: DraftBlockRenderMap): Self = {
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
    def withBlockRendererFn(value: /* block */ ContentBlock => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRendererFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBlockRendererFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRendererFn")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockStyleFn(value: /* block */ ContentBlock => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStyleFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBlockStyleFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStyleFn")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStyleFn(value: (/* style */ DraftInlineStyle, /* block */ ContentBlock) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyleFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomStyleFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyleFn")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStyleMap(value: DraftStyleMap): Self = {
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
    def withEditorKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorKey")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleBeforeInput(
      value: (/* chars */ String, /* editorState */ EditorState, /* eventTimeStamp */ Double) => DraftHandleValue
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleBeforeInput")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandleBeforeInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleBeforeInput")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleDrop(
      value: (/* selection */ SelectionState, /* dataTransfer */ js.Object, /* isInternal */ DraftDragType) => DraftHandleValue
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDrop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandleDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleDroppedFiles(value: (/* selection */ SelectionState, /* files */ js.Array[Blob]) => DraftHandleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDroppedFiles")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHandleDroppedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDroppedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleKeyCommand(
      value: (/* command */ EditorCommand, /* editorState */ EditorState, /* eventTimeStamp */ Double) => DraftHandleValue
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyCommand")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandleKeyCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlePastedFiles(value: /* files */ js.Array[Blob] => DraftHandleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePastedFiles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandlePastedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePastedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlePastedText(
      value: (/* text */ String, /* html */ js.UndefOr[String], /* editorState */ EditorState) => DraftHandleValue
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePastedText")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandlePastedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePastedText")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleReturn(value: (SyntheticKeyboardEvent[js.Object], /* editorState */ EditorState) => DraftHandleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleReturn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHandleReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyBindingFn(value: SyntheticKeyboardEvent[js.Object] => EditorCommand | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindingFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyBindingFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindingFn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticEvent[EventTarget with js.Object, Event_] => Unit): Self = {
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
    def withOnDownArrow(value: SyntheticKeyboardEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownArrow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDownArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEscape(value: SyntheticKeyboardEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticEvent[EventTarget with js.Object, Event_] => Unit): Self = {
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
    def withOnLeftArrow(value: SyntheticKeyboardEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeftArrow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLeftArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeftArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRightArrow(value: SyntheticKeyboardEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightArrow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRightArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightArrow")(js.undefined)
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
    def withOnUpArrow(value: SyntheticKeyboardEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpArrow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpArrow")(js.undefined)
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
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
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
    def withTextAlignment(value: DraftTextAlignment): Self = {
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
    def withTextDirectionality(value: DraftTextDirectionality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDirectionality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDirectionality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDirectionality")(js.undefined)
        ret
    }
    @scala.inline
    def withWebDriverTestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDriverTestID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebDriverTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDriverTestID")(js.undefined)
        ret
    }
  }
  
}

