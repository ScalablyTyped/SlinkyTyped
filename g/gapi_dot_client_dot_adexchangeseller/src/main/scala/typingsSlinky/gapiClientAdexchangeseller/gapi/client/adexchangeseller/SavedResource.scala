package typingsSlinky.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangeseller.anon.AccountId
import typingsSlinky.gapiClientAdexchangeseller.anon.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedResource extends js.Object {
  /** Generate an Ad Exchange report based on the saved report ID sent in the query parameters. */
  def generate(request: Locale): Request[Report]
  /** List all saved reports in this Ad Exchange account. */
  def list(request: AccountId): Request[SavedReports]
}

object SavedResource {
  @scala.inline
  def apply(generate: Locale => Request[Report], list: AccountId => Request[SavedReports]): SavedResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SavedResource]
  }
}

