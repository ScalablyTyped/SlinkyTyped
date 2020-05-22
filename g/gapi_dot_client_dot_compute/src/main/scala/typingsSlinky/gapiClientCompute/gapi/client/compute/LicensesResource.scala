package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesResource extends js.Object {
  /** Returns the specified License resource. */
  def get(request: typingsSlinky.gapiClientCompute.anon.License): Request[License]
}

object LicensesResource {
  @scala.inline
  def apply(get: typingsSlinky.gapiClientCompute.anon.License => Request[License]): LicensesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[LicensesResource]
  }
}

