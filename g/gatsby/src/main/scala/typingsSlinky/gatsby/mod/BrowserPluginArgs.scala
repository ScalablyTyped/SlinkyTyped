package typingsSlinky.gatsby.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserPluginArgs
  extends /* key */ StringDictionary[js.Any] {
  var getResourceURLsForPathname: js.Function = js.native
  var getResourcesForPathname: js.Function = js.native
  var getResourcesForPathnameSync: js.Function = js.native
}

object BrowserPluginArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function
  ): BrowserPluginArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserPluginArgs]
  }
  @scala.inline
  implicit class BrowserPluginArgsOps[Self <: BrowserPluginArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetResourceURLsForPathname(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResourceURLsForPathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetResourcesForPathname(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResourcesForPathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetResourcesForPathnameSync(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResourcesForPathnameSync")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

