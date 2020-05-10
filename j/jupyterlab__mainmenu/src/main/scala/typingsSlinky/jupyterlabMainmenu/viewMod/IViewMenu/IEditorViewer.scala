package typingsSlinky.jupyterlabMainmenu.viewMod.IViewMenu

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a text editor viewer to register
  * itself with the text editor extension points.
  */
@js.native
trait IEditorViewer[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * Whether line numbers are toggled.
    */
  var lineNumbersToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.native
  /**
    * Whether match brackets is toggled.
    */
  var matchBracketsToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.native
  /**
    * Whether to show line numbers in the editor.
    */
  var toggleLineNumbers: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  /**
    * Whether to match brackets in the editor.
    */
  var toggleMatchBrackets: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  /**
    * Whether to word-wrap the editor.
    */
  var toggleWordWrap: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  /**
    * Whether word wrap is toggled.
    */
  var wordWrapToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.native
}

object IEditorViewer {
  @scala.inline
  def apply[T](tracker: IWidgetTracker[T]): IEditorViewer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorViewer[T]]
  }
  @scala.inline
  implicit class IEditorViewerOps[Self[t] <: IEditorViewer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withLineNumbersToggled(value: /* widget */ T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbersToggled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLineNumbersToggled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbersToggled")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchBracketsToggled(value: /* widget */ T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBracketsToggled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMatchBracketsToggled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBracketsToggled")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleLineNumbers(value: /* widget */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleLineNumbers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleLineNumbers: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleLineNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleMatchBrackets(value: /* widget */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMatchBrackets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleMatchBrackets: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMatchBrackets")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleWordWrap(value: /* widget */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleWordWrap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleWordWrap: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleWordWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrapToggled(value: /* widget */ T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapToggled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWordWrapToggled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapToggled")(js.undefined)
        ret
    }
  }
  
}

