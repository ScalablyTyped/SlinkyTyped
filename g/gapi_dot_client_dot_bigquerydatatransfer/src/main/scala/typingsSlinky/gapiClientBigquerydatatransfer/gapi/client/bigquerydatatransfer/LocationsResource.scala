package typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBigquerydatatransfer.anon.Accesstoken
import typingsSlinky.gapiClientBigquerydatatransfer.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsResource extends js.Object {
  var dataSources: DataSourcesResource = js.native
  var transferConfigs: TransferConfigsResource = js.native
  /** Get information about a location. */
  def get(request: Accesstoken): Request[Location] = js.native
  /** Lists information about the supported locations for this service. */
  def list(request: Filter): Request[ListLocationsResponse] = js.native
}

object LocationsResource {
  @scala.inline
  def apply(
    dataSources: DataSourcesResource,
    get: Accesstoken => Request[Location],
    list: Filter => Request[ListLocationsResponse],
    transferConfigs: TransferConfigsResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(dataSources = dataSources.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), transferConfigs = transferConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSources(value: DataSourcesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: Accesstoken => Request[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Filter => Request[ListLocationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransferConfigs(value: TransferConfigsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferConfigs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

