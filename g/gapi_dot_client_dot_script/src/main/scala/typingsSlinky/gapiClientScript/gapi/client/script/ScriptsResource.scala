package typingsSlinky.gapiClientScript.gapi.client.script

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientScript.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptsResource extends js.Object {
  /**
    * Runs a function in an Apps Script project. The project must be deployed
    * for use with the Apps Script Execution API.
    *
    * This method requires authorization with an OAuth 2.0 token that includes at
    * least one of the scopes listed in the [Authorization](#authorization)
    * section; script projects that do not require authorization cannot be
    * executed through this API. To find the correct scopes to include in the
    * authentication token, open the project in the script editor, then select
    * &#42;&#42;File > Project properties&#42;&#42; and click the &#42;&#42;Scopes&#42;&#42; tab.
    */
  def run(request: AnonAccesstoken): Request_[Operation] = js.native
}

object ScriptsResource {
  @scala.inline
  def apply(run: AnonAccesstoken => Request_[Operation]): ScriptsResource = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[ScriptsResource]
  }
  @scala.inline
  implicit class ScriptsResourceOps[Self <: ScriptsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRun(value: AnonAccesstoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

