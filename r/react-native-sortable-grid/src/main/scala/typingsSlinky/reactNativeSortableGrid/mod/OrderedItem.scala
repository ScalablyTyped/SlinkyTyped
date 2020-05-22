package typingsSlinky.reactNativeSortableGrid.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderedItem extends js.Object {
  var key: String
  var order: Double
  var ref: ReactElement | Null
}

object OrderedItem {
  @scala.inline
  def apply(key: String, order: Double, ref: ReactElement = null): OrderedItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedItem]
  }
}

