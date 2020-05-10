package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainNameResponse extends js.Object {
  /**
    * The API mapping selection expression.
    */
  var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * The name of the DomainName resource.
    */
  var DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.native
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.DomainNameConfigurations] = js.native
  /**
    * The collection of tags associated with a domain name.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.Tags] = js.native
}

object UpdateDomainNameResponse {
  @scala.inline
  def apply(): UpdateDomainNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDomainNameResponse]
  }
  @scala.inline
  implicit class UpdateDomainNameResponseOps[Self <: UpdateDomainNameResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiMappingSelectionExpression(value: SelectionExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiMappingSelectionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiMappingSelectionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiMappingSelectionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: StringWithLengthBetween1And512): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainNameConfigurations(value: DomainNameConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNameConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainNameConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNameConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

