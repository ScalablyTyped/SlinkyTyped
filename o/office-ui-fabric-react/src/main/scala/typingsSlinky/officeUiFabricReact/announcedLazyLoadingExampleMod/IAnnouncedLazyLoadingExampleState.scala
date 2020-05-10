package typingsSlinky.officeUiFabricReact.announcedLazyLoadingExampleMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnnouncedLazyLoadingExampleState extends js.Object {
  var announced: js.UndefOr[ReactElement] = js.native
  var loading: Boolean = js.native
  var timeSinceLastAnnounce: Double = js.native
  /** Number of photos loaded so far */
  var total: Double = js.native
}

object IAnnouncedLazyLoadingExampleState {
  @scala.inline
  def apply(loading: Boolean, timeSinceLastAnnounce: Double, total: Double): IAnnouncedLazyLoadingExampleState = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], timeSinceLastAnnounce = timeSinceLastAnnounce.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedLazyLoadingExampleState]
  }
  @scala.inline
  implicit class IAnnouncedLazyLoadingExampleStateOps[Self <: IAnnouncedLazyLoadingExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSinceLastAnnounce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSinceLastAnnounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnounced(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnounced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announced")(js.undefined)
        ret
    }
  }
  
}

