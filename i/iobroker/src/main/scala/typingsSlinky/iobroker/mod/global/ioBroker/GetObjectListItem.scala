package typingsSlinky.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectListItem extends GetObjectViewItem {
  /** The same as @link{value} */
  var doc: Object = js.native
  /** A copy of the object */
  @JSName("value")
  var value_GetObjectListItem: Object = js.native
}

object GetObjectListItem {
  @scala.inline
  def apply(doc: Object, id: String, value: Object): GetObjectListItem = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectListItem]
  }
  @scala.inline
  implicit class GetObjectListItemOps[Self <: GetObjectListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc(value: Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

