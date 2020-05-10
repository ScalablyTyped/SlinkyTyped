package typingsSlinky.pulumiAws.getProductMod

import typingsSlinky.pulumiAws.inputMod.pricing.GetProductFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProductArgs extends js.Object {
  /**
    * A list of filters. Passed directly to the API (see GetProducts API reference). These filters must describe a single product, this resource will fail if more than one product is returned by the API.
    */
  val filters: js.Array[GetProductFilter] = js.native
  /**
    * The code of the service. Available service codes can be fetched using the DescribeServices pricing API call.
    */
  val serviceCode: String = js.native
}

object GetProductArgs {
  @scala.inline
  def apply(filters: js.Array[GetProductFilter], serviceCode: String): GetProductArgs = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProductArgs]
  }
  @scala.inline
  implicit class GetProductArgsOps[Self <: GetProductArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[GetProductFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

