package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackagingConfigurationsResponse extends js.Object {
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * A list of MediaPackage VOD PackagingConfiguration resources.
    */
  var PackagingConfigurations: js.UndefOr[listOfPackagingConfiguration] = js.native
}

object ListPackagingConfigurationsResponse {
  @scala.inline
  def apply(): ListPackagingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagingConfigurationsResponse]
  }
  @scala.inline
  implicit class ListPackagingConfigurationsResponseOps[Self <: ListPackagingConfigurationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: string): Self = {
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
    def withPackagingConfigurations(value: listOfPackagingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackagingConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackagingConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackagingConfigurations")(js.undefined)
        ret
    }
  }
  
}

