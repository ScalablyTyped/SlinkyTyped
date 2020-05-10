package typingsSlinky.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineFeedResponseClientGapEnforcerMatrixItem extends js.Object {
  var list: js.Array[Double] = js.native
}

object TimelineFeedResponseClientGapEnforcerMatrixItem {
  @scala.inline
  def apply(list: js.Array[Double]): TimelineFeedResponseClientGapEnforcerMatrixItem = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseClientGapEnforcerMatrixItem]
  }
  @scala.inline
  implicit class TimelineFeedResponseClientGapEnforcerMatrixItemOps[Self <: TimelineFeedResponseClientGapEnforcerMatrixItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

