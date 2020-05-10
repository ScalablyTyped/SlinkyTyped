package typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that wants to register a 'Clear...' menu item
  */
@js.native
trait IClearer[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A function to clear all of an activity.
    */
  var clearAll: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  /**
    * A function to clear the currently portion of activity.
    */
  var clearCurrent: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  /**
    * A name for the thing to be cleared, used for labeling `clearCurrent`.
    */
  var noun: js.UndefOr[String] = js.native
  /**
    * A plural name for the thing to be cleared, used for labeling `clearAll`.
    */
  var pluralNoun: js.UndefOr[String] = js.native
}

object IClearer {
  @scala.inline
  def apply[T](tracker: IWidgetTracker[T]): IClearer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClearer[T]]
  }
  @scala.inline
  implicit class IClearerOps[Self[t] <: IClearer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClearAll(value: /* widget */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClearAll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAll")(js.undefined)
        ret
    }
    @scala.inline
    def withClearCurrent(value: /* widget */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCurrent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClearCurrent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withNoun(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoun: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noun")(js.undefined)
        ret
    }
    @scala.inline
    def withPluralNoun(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralNoun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluralNoun: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralNoun")(js.undefined)
        ret
    }
  }
  
}

