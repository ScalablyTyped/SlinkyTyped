package typingsSlinky.pulumiAws.getIpRangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIpRangesResult extends js.Object {
  /**
    * The lexically ordered list of CIDR blocks.
    */
  val cidrBlocks: js.Array[String] = js.native
  /**
    * The publication time of the IP ranges (e.g. `2016-08-03-23-46-05`).
    */
  val createDate: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The lexically ordered list of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: js.Array[String] = js.native
  val regions: js.UndefOr[js.Array[String]] = js.native
  val services: js.Array[String] = js.native
  /**
    * The publication time of the IP ranges, in Unix epoch time format
    * (e.g. `1470267965`).
    */
  val syncToken: Double = js.native
  val url: js.UndefOr[String] = js.native
}

object GetIpRangesResult {
  @scala.inline
  def apply(
    cidrBlocks: js.Array[String],
    createDate: String,
    id: String,
    ipv6CidrBlocks: js.Array[String],
    services: js.Array[String],
    syncToken: Double
  ): GetIpRangesResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipv6CidrBlocks = ipv6CidrBlocks.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], syncToken = syncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIpRangesResult]
  }
  @scala.inline
  implicit class GetIpRangesResultOps[Self <: GetIpRangesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrBlocks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv6CidrBlocks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncToken(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

