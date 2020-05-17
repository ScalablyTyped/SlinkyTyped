package typingsSlinky.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPlaymoviespartner.anon.Countries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreInfosResource extends js.Object {
  var country: CountryResource = js.native
  /**
    * List StoreInfos owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: Countries): Request[ListStoreInfosResponse] = js.native
}

object StoreInfosResource {
  @scala.inline
  def apply(country: CountryResource, list: Countries => Request[ListStoreInfosResponse]): StoreInfosResource = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[StoreInfosResource]
  }
  @scala.inline
  implicit class StoreInfosResourceOps[Self <: StoreInfosResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: CountryResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: Countries => Request[ListStoreInfosResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

