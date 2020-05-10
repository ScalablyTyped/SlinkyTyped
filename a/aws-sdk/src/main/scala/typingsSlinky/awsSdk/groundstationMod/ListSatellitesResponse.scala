package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSatellitesResponse extends js.Object {
  /**
    * Next token that can be supplied in the next call to get the next page of satellites.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * List of satellites.
    */
  var satellites: js.UndefOr[SatelliteList] = js.native
}

object ListSatellitesResponse {
  @scala.inline
  def apply(): ListSatellitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSatellitesResponse]
  }
  @scala.inline
  implicit class ListSatellitesResponseOps[Self <: ListSatellitesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSatellites(value: SatelliteList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satellites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSatellites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satellites")(js.undefined)
        ret
    }
  }
  
}

