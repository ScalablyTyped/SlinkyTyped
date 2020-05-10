package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgHtmlEditor
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event fired after a toolbar item is clicked.
  	 */
  var actionExecuted: js.UndefOr[ActionExecutedEvent] = js.native
  /**
  	 * Event fired before a toolbar item is clicked.
  	 */
  var actionExecuting: js.UndefOr[ActionExecutingEvent] = js.native
  /**
  	 * Event is fired on keyboard copy action.
  	 */
  var copy: js.UndefOr[CopyEvent] = js.native
  /**
  	 * The html editor custom toolbars list.
  	 *
  	 */
  var customToolbars: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Event is fired on keyboard cut action.
  	 */
  var cut: js.UndefOr[CutEvent] = js.native
  /**
  	 * The height of the html editor. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * The name attribute of the html editor source view.
  	 *
  	 */
  var inputName: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Event is fired on keyboard paste action.
  	 */
  var paste: js.UndefOr[PasteEvent] = js.native
  /**
  	 * Event is fired on keyboard redo action.
  	 */
  var redo: js.UndefOr[RedoEvent] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Event fired after the html editor widget has been rendered.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
  	 * Event fired before the html editor widget is rendered.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.native
  /**
  	 * Shows/hides the "Copy Paste" toolbar.
  	 *
  	 */
  var showCopyPasteToolbar: js.UndefOr[Boolean] = js.native
  /**
  	 * Shows/hides the "Formatting" toolbar.
  	 *
  	 */
  var showFormattingToolbar: js.UndefOr[Boolean] = js.native
  /**
  	 * Shows/hides the "Insert Object" toolbar.
  	 *
  	 */
  var showInsertObjectToolbar: js.UndefOr[Boolean] = js.native
  /**
  	 * Shows/hides the "Text" toolbar.
  	 *
  	 */
  var showTextToolbar: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired after a toolbar is collapsed.
  	 */
  var toolbarCollapsed: js.UndefOr[ToolbarCollapsedEvent] = js.native
  /**
  	 * Event fired before a toolbar is collapsed.
  	 */
  var toolbarCollapsing: js.UndefOr[ToolbarCollapsingEvent] = js.native
  /**
  	 * Event fired after a toolbar is expanded.
  	 */
  var toolbarExpanded: js.UndefOr[ToolbarExpandedEvent] = js.native
  /**
  	 * Event fired before a toolbar is expanded.
  	 */
  var toolbarExpanding: js.UndefOr[ToolbarExpandingEvent] = js.native
  /**
  	 * The html editor toolbars list.
  	 *
  	 */
  var toolbarSettings: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Event is fired on keyboard undo action.
  	 */
  var undo: js.UndefOr[UndoEvent] = js.native
  /**
  	 * Used to render inside the html editor as initial content
  	 *
  	 */
  var value: js.UndefOr[String] = js.native
  /**
  	 * The width of the html editor. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 */
  var width: js.UndefOr[String | Double] = js.native
  /**
  	 * Event is fired after the workspace has been resized
  	 */
  var workspaceResized: js.UndefOr[WorkspaceResizedEvent] = js.native
}

object IgHtmlEditor {
  @scala.inline
  def apply(): IgHtmlEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHtmlEditor]
  }
  @scala.inline
  implicit class IgHtmlEditorOps[Self <: IgHtmlEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionExecuted(value: (/* event */ Event_, /* ui */ ActionExecutedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecuted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActionExecuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecuted")(js.undefined)
        ret
    }
    @scala.inline
    def withActionExecuting(value: (/* event */ Event_, /* ui */ ActionExecutingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecuting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActionExecuting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecuting")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: (/* event */ Event_, /* ui */ CopyEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomToolbars(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomToolbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolbars")(js.undefined)
        ret
    }
    @scala.inline
    def withCut(value: (/* event */ Event_, /* ui */ CutEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(js.undefined)
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
    def withInputName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(js.undefined)
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
    def withLocale(value: js.Any): Self = {
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
    def withPaste(value: (/* event */ Event_, /* ui */ PasteEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
    @scala.inline
    def withRedo(value: (/* event */ Event_, /* ui */ RedoEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRedo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRendered(value: (/* event */ Event_, /* ui */ RenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.undefined)
        ret
    }
    @scala.inline
    def withRendering(value: (/* event */ Event_, /* ui */ RenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCopyPasteToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCopyPasteToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCopyPasteToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCopyPasteToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFormattingToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFormattingToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFormattingToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFormattingToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInsertObjectToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInsertObjectToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInsertObjectToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInsertObjectToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTextToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTextToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTextToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTextToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarCollapsed(value: (/* event */ Event_, /* ui */ ToolbarCollapsedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarCollapsed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToolbarCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarCollapsing(value: (/* event */ Event_, /* ui */ ToolbarCollapsingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarCollapsing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToolbarCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarCollapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarExpanded(value: (/* event */ Event_, /* ui */ ToolbarExpandedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarExpanded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToolbarExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarExpanding(value: (/* event */ Event_, /* ui */ ToolbarExpandingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarExpanding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToolbarExpanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarExpanding")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarSettings(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withUndo(value: (/* event */ Event_, /* ui */ UndoEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
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
    def withWorkspaceResized(value: (/* event */ Event_, /* ui */ WorkspaceResizedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceResized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWorkspaceResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceResized")(js.undefined)
        ret
    }
  }
  
}

