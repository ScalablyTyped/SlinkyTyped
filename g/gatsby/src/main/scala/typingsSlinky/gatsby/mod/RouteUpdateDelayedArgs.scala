package typingsSlinky.gatsby.mod

import org.scalajs.dom.raw.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteUpdateDelayedArgs extends BrowserPluginArgs {
  var location: Location = js.native
}

object RouteUpdateDelayedArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    location: Location
  ): RouteUpdateDelayedArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteUpdateDelayedArgs]
  }
  @scala.inline
  implicit class RouteUpdateDelayedArgsOps[Self <: RouteUpdateDelayedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

