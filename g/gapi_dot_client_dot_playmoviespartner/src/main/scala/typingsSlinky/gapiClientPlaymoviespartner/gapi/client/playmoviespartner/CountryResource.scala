package typingsSlinky.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPlaymoviespartner.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryResource extends js.Object {
  /**
    * Get a StoreInfo given its video id and country.
    *
    * See _Authentication and Authorization rules_ and
    * _Get methods rules_ for more information about this method.
    */
  def get(request: Callback): Request[StoreInfo] = js.native
}

object CountryResource {
  @scala.inline
  def apply(get: Callback => Request[StoreInfo]): CountryResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[CountryResource]
  }
  @scala.inline
  implicit class CountryResourceOps[Self <: CountryResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Callback => Request[StoreInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

