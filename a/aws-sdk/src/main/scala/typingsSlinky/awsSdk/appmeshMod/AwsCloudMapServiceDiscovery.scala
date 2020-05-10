package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudMapServiceDiscovery extends js.Object {
  /**
    * A string map that contains attributes with values that you can use to filter instances
    by any custom attribute that you specified when you registered the instance. Only instances
    that match all of the specified key/value pairs will be returned.
    */
  var attributes: js.UndefOr[AwsCloudMapInstanceAttributes] = js.native
  /**
    * The name of the AWS Cloud Map namespace to use.
    */
  var namespaceName: AwsCloudMapName = js.native
  /**
    * The name of the AWS Cloud Map service to use.
    */
  var serviceName: AwsCloudMapName = js.native
}

object AwsCloudMapServiceDiscovery {
  @scala.inline
  def apply(namespaceName: AwsCloudMapName, serviceName: AwsCloudMapName): AwsCloudMapServiceDiscovery = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudMapServiceDiscovery]
  }
  @scala.inline
  implicit class AwsCloudMapServiceDiscoveryOps[Self <: AwsCloudMapServiceDiscovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespaceName(value: AwsCloudMapName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: AwsCloudMapName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: AwsCloudMapInstanceAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
  }
  
}

