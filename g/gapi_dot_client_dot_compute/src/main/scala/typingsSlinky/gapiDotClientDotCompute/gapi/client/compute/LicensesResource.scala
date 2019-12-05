package typingsSlinky.gapiDotClientDotCompute.gapi.client.compute

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotCompute.Anon_AltFieldsKeyLicense
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesResource extends js.Object {
  /** Returns the specified License resource. */
  def get(request: Anon_AltFieldsKeyLicense): Request[License]
}

object LicensesResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKeyLicense => Request[License]): LicensesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[LicensesResource]
  }
}

