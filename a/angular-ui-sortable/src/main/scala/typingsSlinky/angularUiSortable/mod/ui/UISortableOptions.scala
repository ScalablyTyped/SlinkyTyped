package typingsSlinky.angularUiSortable.mod.ui

import typingsSlinky.angularUiSortable.angularUiSortableStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UISortableOptions[T] extends SortableOptions[T] {
  var `ui-floating`: js.UndefOr[auto | Boolean] = js.native
}

object UISortableOptions {
  @scala.inline
  def apply[T](): UISortableOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UISortableOptions[T]]
  }
  @scala.inline
  implicit class UISortableOptionsOps[Self[t] <: UISortableOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def `withUi-floating`(value: auto | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-floating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-floating`: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-floating")(js.undefined)
        ret
    }
  }
  
}

