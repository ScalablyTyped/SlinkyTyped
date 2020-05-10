package typingsSlinky.androiduix.android.widget.ExpandableListView

import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnGroupClickListener extends js.Object {
  def onGroupClick(
    parent: typingsSlinky.androiduix.android.widget.ExpandableListView,
    v: View,
    groupPosition: Double,
    id: Double
  ): Boolean = js.native
}

object OnGroupClickListener {
  @scala.inline
  def apply(
    onGroupClick: (typingsSlinky.androiduix.android.widget.ExpandableListView, View, Double, Double) => Boolean
  ): OnGroupClickListener = {
    val __obj = js.Dynamic.literal(onGroupClick = js.Any.fromFunction4(onGroupClick))
    __obj.asInstanceOf[OnGroupClickListener]
  }
  @scala.inline
  implicit class OnGroupClickListenerOps[Self <: OnGroupClickListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnGroupClick(
      value: (typingsSlinky.androiduix.android.widget.ExpandableListView, View, Double, Double) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupClick")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

