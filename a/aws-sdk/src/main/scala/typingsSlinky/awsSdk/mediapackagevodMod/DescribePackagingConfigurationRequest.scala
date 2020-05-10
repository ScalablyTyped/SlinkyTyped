package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePackagingConfigurationRequest extends js.Object {
  /**
    * The ID of a MediaPackage VOD PackagingConfiguration resource.
    */
  var Id: string = js.native
}

object DescribePackagingConfigurationRequest {
  @scala.inline
  def apply(Id: string): DescribePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackagingConfigurationRequest]
  }
  @scala.inline
  implicit class DescribePackagingConfigurationRequestOps[Self <: DescribePackagingConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

