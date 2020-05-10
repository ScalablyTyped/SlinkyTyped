package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTableSelectionChangeEvent extends js.Object {
  var added: js.Array[FeatureTableSelectionChangeEventAdded] = js.native
  var removed: js.Array[FeatureTableSelectionChangeEventRemoved] = js.native
}

object FeatureTableSelectionChangeEvent {
  @scala.inline
  def apply(
    added: js.Array[FeatureTableSelectionChangeEventAdded],
    removed: js.Array[FeatureTableSelectionChangeEventRemoved]
  ): FeatureTableSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTableSelectionChangeEvent]
  }
  @scala.inline
  implicit class FeatureTableSelectionChangeEventOps[Self <: FeatureTableSelectionChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: js.Array[FeatureTableSelectionChangeEventAdded]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[FeatureTableSelectionChangeEventRemoved]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

