package typingsSlinky.ariClient

import typingsSlinky.ariClient.mod.IndexableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilterIndexableObject extends js.Object {
  var filter: js.UndefOr[IndexableObject] = js.native
}

object AnonFilterIndexableObject {
  @scala.inline
  def apply(): AnonFilterIndexableObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFilterIndexableObject]
  }
  @scala.inline
  implicit class AnonFilterIndexableObjectOps[Self <: AnonFilterIndexableObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: IndexableObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
  }
  
}

