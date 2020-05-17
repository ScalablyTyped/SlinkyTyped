package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.anon.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShouldUpdateScrollArgs extends BrowserPluginArgs {
  var getSavedScrollPosition: js.Function = js.native
  var pathname: String = js.native
  var prevRouterProps: js.UndefOr[Location] = js.native
  var routerProps: Location = js.native
}

object ShouldUpdateScrollArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    getSavedScrollPosition: js.Function,
    pathname: String,
    routerProps: Location
  ): ShouldUpdateScrollArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], getSavedScrollPosition = getSavedScrollPosition.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldUpdateScrollArgs]
  }
  @scala.inline
  implicit class ShouldUpdateScrollArgsOps[Self <: ShouldUpdateScrollArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetSavedScrollPosition(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSavedScrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouterProps(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevRouterProps(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevRouterProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevRouterProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevRouterProps")(js.undefined)
        ret
    }
  }
  
}

