package typingsSlinky.pulumiAws.getProductMod

import typingsSlinky.pulumiAws.outputMod.pricing.GetProductFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProductResult extends js.Object {
  val filters: js.Array[GetProductFilter] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Set to the product returned from the API.
    */
  val result: String = js.native
  val serviceCode: String = js.native
}

object GetProductResult {
  @scala.inline
  def apply(filters: js.Array[GetProductFilter], id: String, result: String, serviceCode: String): GetProductResult = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProductResult]
  }
  @scala.inline
  implicit class GetProductResultOps[Self <: GetProductResult] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
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

