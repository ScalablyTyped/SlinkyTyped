package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoredResourceInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource being monitored.
    */
  var arn: js.UndefOr[ResourceArn] = js.native
  /**
    * The name of the Lightsail resource being monitored.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The Lightsail resource type of the resource being monitored. Instances, load balancers, and relational databases are the only Lightsail resources that can currently be monitored by alarms.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object MonitoredResourceInfo {
  @scala.inline
  def apply(): MonitoredResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoredResourceInfo]
  }
  @scala.inline
  implicit class MonitoredResourceInfoOps[Self <: MonitoredResourceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
  }
  
}

