package typingsSlinky.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchExternal extends js.Object {
  var launchExternal: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object LaunchExternal {
  @scala.inline
  def apply(): LaunchExternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchExternal]
  }
  @scala.inline
  implicit class LaunchExternalOps[Self <: LaunchExternal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchExternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchExternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchExternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchExternal")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

