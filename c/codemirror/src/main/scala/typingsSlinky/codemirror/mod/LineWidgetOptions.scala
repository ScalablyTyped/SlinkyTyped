package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineWidgetOptions extends js.Object {
  /** Causes the widget to be placed above instead of below the text of the line. */
  var above: js.UndefOr[Boolean] = js.native
  /** Add an extra CSS class name to the wrapper element created for the widget. */
  var className: js.UndefOr[String] = js.native
  /** Whether the widget should cover the gutter. */
  var coverGutter: js.UndefOr[Boolean] = js.native
  /** Determines whether the editor will capture mouse and drag events occurring in this widget. 
    Default is false—the events will be left alone for the default browser handler, or specific handlers on the widget, to capture. */
  var handleMouseEvents: js.UndefOr[Boolean] = js.native
  /** By default, the widget is added below other widgets for the line. 
    This option can be used to place it at a different position (zero for the top, N to put it after the Nth other widget). 
    Note that this only has effect once, when the widget is created. */
  var insertAt: js.UndefOr[Double] = js.native
  /** Whether the widget should stay fixed in the face of horizontal scrolling. */
  var noHScroll: js.UndefOr[Boolean] = js.native
  /** When true, will cause the widget to be rendered even if the line it is associated with is hidden. */
  var showIfHidden: js.UndefOr[Boolean] = js.native
}

object LineWidgetOptions {
  @scala.inline
  def apply(): LineWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineWidgetOptions]
  }
  @scala.inline
  implicit class LineWidgetOptionsOps[Self <: LineWidgetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("above")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("above")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverGutter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleMouseEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMouseEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleMouseEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMouseEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAt")(js.undefined)
        ret
    }
    @scala.inline
    def withNoHScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noHScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoHScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noHScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIfHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIfHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIfHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIfHidden")(js.undefined)
        ret
    }
  }
  
}

