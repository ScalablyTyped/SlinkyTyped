package typingsSlinky.androiduix.android.widget.AdapterView

import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemLongClickListener extends js.Object {
  def onItemLongClick(
    parent: typingsSlinky.androiduix.android.widget.AdapterView[_],
    view: View,
    position: Double,
    id: Double
  ): Boolean
}

object OnItemLongClickListener {
  @scala.inline
  def apply(
    onItemLongClick: (typingsSlinky.androiduix.android.widget.AdapterView[_], View, Double, Double) => Boolean
  ): OnItemLongClickListener = {
    val __obj = js.Dynamic.literal(onItemLongClick = js.Any.fromFunction4(onItemLongClick))
  
    __obj.asInstanceOf[OnItemLongClickListener]
  }
}

