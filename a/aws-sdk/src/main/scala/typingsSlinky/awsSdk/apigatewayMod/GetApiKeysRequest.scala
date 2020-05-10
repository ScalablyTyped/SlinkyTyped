package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApiKeysRequest extends js.Object {
  /**
    * The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * A boolean flag to specify whether (true) or not (false) the result contains key values.
    */
  var includeValues: js.UndefOr[NullableBoolean] = js.native
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  /**
    * The name of queried API keys.
    */
  var nameQuery: js.UndefOr[String] = js.native
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
}

object GetApiKeysRequest {
  @scala.inline
  def apply(): GetApiKeysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApiKeysRequest]
  }
  @scala.inline
  implicit class GetApiKeysRequestOps[Self <: GetApiKeysRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeValues(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeValues")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withNameQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

