package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientFirebasedynamiclinks.AnonAccesstoken
import typingsSlinky.gapiClientFirebasedynamiclinks.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V1Resource extends js.Object {
  /**
    * Fetches analytics stats of a short Dynamic Link for a given
    * duration. Metrics include number of clicks, redirects, installs,
    * app first opens, and app reopens.
    */
  def getLinkStats(request: AnonAlt): Request_[DynamicLinkStats] = js.native
  /** Get iOS strong/weak-match info for post-install attribution. */
  def installAttribution(request: AnonAccesstoken): Request_[GetIosPostInstallAttributionResponse] = js.native
}

object V1Resource {
  @scala.inline
  def apply(
    getLinkStats: AnonAlt => Request_[DynamicLinkStats],
    installAttribution: AnonAccesstoken => Request_[GetIosPostInstallAttributionResponse]
  ): V1Resource = {
    val __obj = js.Dynamic.literal(getLinkStats = js.Any.fromFunction1(getLinkStats), installAttribution = js.Any.fromFunction1(installAttribution))
    __obj.asInstanceOf[V1Resource]
  }
  @scala.inline
  implicit class V1ResourceOps[Self <: V1Resource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLinkStats(value: AnonAlt => Request_[DynamicLinkStats]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLinkStats")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInstallAttribution(value: AnonAccesstoken => Request_[GetIosPostInstallAttributionResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installAttribution")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

