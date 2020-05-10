package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationComponent extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ComponentName] = js.native
  /**
    * Indicates whether the application component is monitored. 
    */
  var Monitor: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Monitor] = js.native
  /**
    * The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB, Application ELB, and SQS Queue.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ResourceType] = js.native
  /**
    * The stack tier of the application component.
    */
  var Tier: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Tier] = js.native
}

object ApplicationComponent {
  @scala.inline
  def apply(): ApplicationComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationComponent]
  }
  @scala.inline
  implicit class ApplicationComponentOps[Self <: ApplicationComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentName(value: ComponentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComponentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComponentName")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitor(value: Monitor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Monitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Monitor")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: Tier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(js.undefined)
        ret
    }
  }
  
}

