package typingsSlinky.gapiClientSearchconsole.gapi.client.searchconsole

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSearchconsole.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileFriendlyTestResource extends js.Object {
  /** Runs Mobile-Friendly Test for a given URL. */
  def run(request: AnonAccesstoken): Request_[RunMobileFriendlyTestResponse] = js.native
}

object MobileFriendlyTestResource {
  @scala.inline
  def apply(run: AnonAccesstoken => Request_[RunMobileFriendlyTestResponse]): MobileFriendlyTestResource = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[MobileFriendlyTestResource]
  }
  @scala.inline
  implicit class MobileFriendlyTestResourceOps[Self <: MobileFriendlyTestResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRun(value: AnonAccesstoken => Request_[RunMobileFriendlyTestResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

