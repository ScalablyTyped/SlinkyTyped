package typingsSlinky.gapiDotClientDotPlaymoviespartner.gapi.client.playmoviespartner

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotPlaymoviespartner.Anon_AccesstokenAccountIdAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryResource extends js.Object {
  /**
    * Get a StoreInfo given its video id and country.
    *
    * See _Authentication and Authorization rules_ and
    * _Get methods rules_ for more information about this method.
    */
  def get(request: Anon_AccesstokenAccountIdAltBearertokenCallback): Request[StoreInfo]
}

object CountryResource {
  @scala.inline
  def apply(get: Anon_AccesstokenAccountIdAltBearertokenCallback => Request[StoreInfo]): CountryResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[CountryResource]
  }
}

