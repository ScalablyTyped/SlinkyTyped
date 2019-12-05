package typingsSlinky.androiduix.android.widget.ExpandableListView

import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChildClickListener extends js.Object {
  def onChildClick(
    parent: typingsSlinky.androiduix.android.widget.ExpandableListView,
    v: View,
    groupPosition: Double,
    childPosition: Double,
    id: Double
  ): Boolean
}

object OnChildClickListener {
  @scala.inline
  def apply(
    onChildClick: (typingsSlinky.androiduix.android.widget.ExpandableListView, View, Double, Double, Double) => Boolean
  ): OnChildClickListener = {
    val __obj = js.Dynamic.literal(onChildClick = js.Any.fromFunction5(onChildClick))
  
    __obj.asInstanceOf[OnChildClickListener]
  }
}

