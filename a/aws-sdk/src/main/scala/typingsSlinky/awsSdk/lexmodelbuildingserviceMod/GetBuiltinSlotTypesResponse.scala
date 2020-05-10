package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBuiltinSlotTypesResponse extends js.Object {
  /**
    * If the response is truncated, the response includes a pagination token that you can use in your next request to fetch the next page of slot types.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of BuiltInSlotTypeMetadata objects, one entry for each slot type returned.
    */
  var slotTypes: js.UndefOr[BuiltinSlotTypeMetadataList] = js.native
}

object GetBuiltinSlotTypesResponse {
  @scala.inline
  def apply(): GetBuiltinSlotTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinSlotTypesResponse]
  }
  @scala.inline
  implicit class GetBuiltinSlotTypesResponseOps[Self <: GetBuiltinSlotTypesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    def withSlotTypes(value: BuiltinSlotTypeMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotTypes")(js.undefined)
        ret
    }
  }
  
}

