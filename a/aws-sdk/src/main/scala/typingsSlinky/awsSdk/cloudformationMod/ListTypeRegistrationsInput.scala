package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypeRegistrationsInput extends js.Object {
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.MaxResults] = js.native
  /**
    * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * The current status of the type registration request. The default is IN_PROGRESS.
    */
  var RegistrationStatusFilter: js.UndefOr[RegistrationStatus] = js.native
  /**
    * The kind of type. Currently the only valid value is RESOURCE. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeArn: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TypeArn] = js.native
  /**
    * The name of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TypeName] = js.native
}

object ListTypeRegistrationsInput {
  @scala.inline
  def apply(): ListTypeRegistrationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypeRegistrationsInput]
  }
  @scala.inline
  implicit class ListTypeRegistrationsInputOps[Self <: ListTypeRegistrationsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationStatusFilter(value: RegistrationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationStatusFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationStatusFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationStatusFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: RegistryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeArn(value: TypeArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeName(value: TypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(js.undefined)
        ret
    }
  }
  
}

