package typingsSlinky.gatsby.mod

import typingsSlinky.std.Location_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteUpdateArgs extends BrowserPluginArgs {
  var location: Location_ = js.native
}

object RouteUpdateArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    location: Location_
  ): RouteUpdateArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteUpdateArgs]
  }
  @scala.inline
  implicit class RouteUpdateArgsOps[Self <: RouteUpdateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: Location_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

