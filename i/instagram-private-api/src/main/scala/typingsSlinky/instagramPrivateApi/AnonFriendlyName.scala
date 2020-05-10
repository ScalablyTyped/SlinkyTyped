package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.graphqlRequestOptionsMod.InsightsFriendlyName
import typingsSlinky.instagramPrivateApi.graphqlRequestOptionsMod.InsightsSurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFriendlyName extends js.Object {
  var friendlyName: InsightsFriendlyName = js.native
  var name: js.UndefOr[InsightsSurface] = js.native
}

object AnonFriendlyName {
  @scala.inline
  def apply(friendlyName: InsightsFriendlyName): AnonFriendlyName = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFriendlyName]
  }
  @scala.inline
  implicit class AnonFriendlyNameOps[Self <: AnonFriendlyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFriendlyName(value: InsightsFriendlyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: InsightsSurface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

