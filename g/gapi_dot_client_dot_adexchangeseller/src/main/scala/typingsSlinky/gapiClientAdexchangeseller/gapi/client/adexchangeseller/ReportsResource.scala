package typingsSlinky.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangeseller.anon.Dimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  var saved: SavedResource = js.native
  /**
    * Generate an Ad Exchange report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: Dimension): Request[Report] = js.native
}

object ReportsResource {
  @scala.inline
  def apply(generate: Dimension => Request[Report], saved: SavedResource): ReportsResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), saved = saved.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportsResource]
  }
  @scala.inline
  implicit class ReportsResourceOps[Self <: ReportsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerate(value: Dimension => Request[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSaved(value: SavedResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

