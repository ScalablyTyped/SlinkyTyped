package typingsSlinky.antDesignProLayout

import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.history.mod.History.PoorMansUnknown
import typingsSlinky.history.mod.Location
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBreadcrumbMap extends js.Object {
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.native
  var location: js.UndefOr[Location[PoorMansUnknown] | Anon0] = js.native
}

object AnonBreadcrumbMap {
  @scala.inline
  def apply(): AnonBreadcrumbMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBreadcrumbMap]
  }
  @scala.inline
  implicit class AnonBreadcrumbMapOps[Self <: AnonBreadcrumbMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreadcrumbMap(value: Map[String, MenuDataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreadcrumbMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbMap")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location[PoorMansUnknown] | Anon0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

