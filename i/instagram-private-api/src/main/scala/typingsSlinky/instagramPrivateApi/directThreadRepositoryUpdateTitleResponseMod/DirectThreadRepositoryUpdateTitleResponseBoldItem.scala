package typingsSlinky.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadRepositoryUpdateTitleResponseBoldItem extends js.Object {
  var end: Double = js.native
  var start: Double = js.native
}

object DirectThreadRepositoryUpdateTitleResponseBoldItem {
  @scala.inline
  def apply(end: Double, start: Double): DirectThreadRepositoryUpdateTitleResponseBoldItem = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseBoldItem]
  }
  @scala.inline
  implicit class DirectThreadRepositoryUpdateTitleResponseBoldItemOps[Self <: DirectThreadRepositoryUpdateTitleResponseBoldItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

