package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceTypeOfferingsFilter extends js.Object {
  /**
    * Name of the filter. The `location` filter depends on the top-level `locationType` argument and if not specified, defaults to the current region.
    */
  var name: String = js.native
  /**
    * List of one or more values for the filter.
    */
  var values: js.Array[String] = js.native
}

object GetInstanceTypeOfferingsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetInstanceTypeOfferingsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeOfferingsFilter]
  }
  @scala.inline
  implicit class GetInstanceTypeOfferingsFilterOps[Self <: GetInstanceTypeOfferingsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

