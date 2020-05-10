package typingsSlinky.primereact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMultiSortMeta extends js.Object {
  var multiSortMeta: js.Any = js.native
  var sortField: String = js.native
  var sortOrder: Double = js.native
}

object AnonMultiSortMeta {
  @scala.inline
  def apply(multiSortMeta: js.Any, sortField: String, sortOrder: Double): AnonMultiSortMeta = {
    val __obj = js.Dynamic.literal(multiSortMeta = multiSortMeta.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMultiSortMeta]
  }
  @scala.inline
  implicit class AnonMultiSortMetaOps[Self <: AnonMultiSortMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiSortMeta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSortMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

