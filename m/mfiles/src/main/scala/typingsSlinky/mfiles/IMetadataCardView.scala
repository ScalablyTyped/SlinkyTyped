package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardView extends js.Object {
  var DashboardID: String = js.native
  val Events: IEvents = js.native
  var Name: String = js.native
}

object IMetadataCardView {
  @scala.inline
  def apply(DashboardID: String, Events: IEvents, Name: String): IMetadataCardView = {
    val __obj = js.Dynamic.literal(DashboardID = DashboardID.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardView]
  }
  @scala.inline
  implicit class IMetadataCardViewOps[Self <: IMetadataCardView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashboardID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: IEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

