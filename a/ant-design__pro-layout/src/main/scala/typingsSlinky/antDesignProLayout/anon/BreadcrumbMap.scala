package typingsSlinky.antDesignProLayout.anon

import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.history.mod.History.PoorMansUnknown
import typingsSlinky.history.mod.Location
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbMap extends js.Object {
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.native
  var location: js.UndefOr[Location[PoorMansUnknown] | `0`] = js.native
}

object BreadcrumbMap {
  @scala.inline
  def apply(): BreadcrumbMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbMap]
  }
  @scala.inline
  implicit class BreadcrumbMapOps[Self <: BreadcrumbMap] (val x: Self) extends AnyVal {
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
    def withLocation(value: Location[PoorMansUnknown] | `0`): Self = {
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

