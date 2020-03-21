package typingsSlinky.antDesignProLayout

import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.history.mod.History.PoorMansUnknown
import typingsSlinky.history.mod.Location
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBreadcrumbMap extends js.Object {
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.undefined
  var location: js.UndefOr[Location[PoorMansUnknown] | Anon0] = js.undefined
}

object AnonBreadcrumbMap {
  @scala.inline
  def apply(
    breadcrumbMap: Map[String, MenuDataItem] = null,
    location: Location[PoorMansUnknown] | Anon0 = null
  ): AnonBreadcrumbMap = {
    val __obj = js.Dynamic.literal()
    if (breadcrumbMap != null) __obj.updateDynamic("breadcrumbMap")(breadcrumbMap.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBreadcrumbMap]
  }
}

