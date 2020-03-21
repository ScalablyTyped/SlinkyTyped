package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonLicense
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesResource extends js.Object {
  /** Returns the specified License resource. */
  def get(request: AnonLicense): Request_[License]
}

object LicensesResource {
  @scala.inline
  def apply(get: AnonLicense => Request_[License]): LicensesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[LicensesResource]
  }
}

