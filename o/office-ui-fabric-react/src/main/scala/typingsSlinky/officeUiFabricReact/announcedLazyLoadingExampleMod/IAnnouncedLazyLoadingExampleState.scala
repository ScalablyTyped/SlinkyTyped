package typingsSlinky.officeUiFabricReact.announcedLazyLoadingExampleMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnouncedLazyLoadingExampleState extends js.Object {
  var announced: js.UndefOr[ReactElement] = js.undefined
  var loading: Boolean
  var timeSinceLastAnnounce: Double
  /** Number of photos loaded so far */
  var total: Double
}

object IAnnouncedLazyLoadingExampleState {
  @scala.inline
  def apply(loading: Boolean, timeSinceLastAnnounce: Double, total: Double, announced: ReactElement = null): IAnnouncedLazyLoadingExampleState = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], timeSinceLastAnnounce = timeSinceLastAnnounce.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (announced != null) __obj.updateDynamic("announced")(announced.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedLazyLoadingExampleState]
  }
}

