package typingsSlinky.prosemirrorView.mod

import typingsSlinky.prosemirrorModel.mod.Mark
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetDecorationSpec extends js.Object {
  /**
    * When comparing decorations of this type (in order to decide
    * whether it needs to be redrawn), ProseMirror will by default
    * compare the widget DOM node by identity. If you pass a key,
    * that key will be compared instead, which can be useful when
    * you generate decorations on the fly and don't want to store
    * and reuse DOM nodes. Make sure that any widgets with the same
    * key are interchangeable—if widgets differ in, for example,
    * the behavior of some event handler, they should get
    * different keys.
    */
  var key: js.UndefOr[String | Null] = js.native
  /**
    * The precise set of marks to draw around the widget.
    */
  var marks: js.UndefOr[js.Array[Mark[_]] | Null] = js.native
  /**
    * Controls which side of the document position this widget is
    * associated with. When negative, it is drawn before a cursor
    * at its position, and content inserted at that position ends
    * up after the widget. When zero (the default) or positive, the
    * widget is drawn after the cursor and content inserted there
    * ends up before the widget.
    *
    * When there are multiple widgets at a given position, their
    * `side` values determine the order in which they appear. Those
    * with lower values appear first. The ordering of widgets with
    * the same `side` value is unspecified.
    *
    * When `marks` is null, `side` also determines the marks that
    * the widget is wrapped in—those of the node before when
    * negative, those of the node after when positive.
    */
  var side: js.UndefOr[Double | Null] = js.native
  /**
    * Can be used to control which DOM events, when they bubble out
    * of this widget, the editor view should ignore.
    */
  var stopEvent: js.UndefOr[(js.Function1[/* event */ Event_, Boolean]) | Null] = js.native
}

object WidgetDecorationSpec {
  @scala.inline
  def apply(): WidgetDecorationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetDecorationSpec]
  }
  @scala.inline
  implicit class WidgetDecorationSpecOps[Self <: WidgetDecorationSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(null)
        ret
    }
    @scala.inline
    def withMarks(value: js.Array[Mark[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(js.undefined)
        ret
    }
    @scala.inline
    def withMarksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(null)
        ret
    }
    @scala.inline
    def withSide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
    @scala.inline
    def withSideNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(null)
        ret
    }
    @scala.inline
    def withStopEvent(value: /* event */ Event_ => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStopEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withStopEventNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEvent")(null)
        ret
    }
  }
  
}

