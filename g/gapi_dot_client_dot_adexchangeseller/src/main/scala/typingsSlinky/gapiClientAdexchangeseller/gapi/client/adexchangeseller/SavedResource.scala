package typingsSlinky.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangeseller.AnonAccountId
import typingsSlinky.gapiClientAdexchangeseller.AnonLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedResource extends js.Object {
  /** Generate an Ad Exchange report based on the saved report ID sent in the query parameters. */
  def generate(request: AnonLocale): Request_[Report] = js.native
  /** List all saved reports in this Ad Exchange account. */
  def list(request: AnonAccountId): Request_[SavedReports] = js.native
}

object SavedResource {
  @scala.inline
  def apply(generate: AnonLocale => Request_[Report], list: AnonAccountId => Request_[SavedReports]): SavedResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SavedResource]
  }
  @scala.inline
  implicit class SavedResourceOps[Self <: SavedResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerate(value: AnonLocale => Request_[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAccountId => Request_[SavedReports]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

