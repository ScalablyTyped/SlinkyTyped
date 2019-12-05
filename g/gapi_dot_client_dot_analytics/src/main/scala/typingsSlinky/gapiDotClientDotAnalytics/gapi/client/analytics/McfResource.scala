package typingsSlinky.gapiDotClientDotAnalytics.gapi.client.analytics

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotAnalytics.Anon_AltDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait McfResource extends js.Object {
  /** Returns Analytics Multi-Channel Funnels data for a view (profile). */
  def get(request: Anon_AltDimensions): Request[McfData]
}

object McfResource {
  @scala.inline
  def apply(get: Anon_AltDimensions => Request[McfData]): McfResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[McfResource]
  }
}

