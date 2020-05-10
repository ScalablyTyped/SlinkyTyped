package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Namespace extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.Arn] = js.native
  /**
    * The date that the namespace was created, in Unix date/time format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing an operation twice. 
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  /**
    * The description that you specify for the namespace when you create it.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * The ID of a namespace.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * The name of the namespace, such as example.com.
    */
  var Name: js.UndefOr[NamespaceName] = js.native
  /**
    * A complex type that contains information that's specific to the type of the namespace.
    */
  var Properties: js.UndefOr[NamespaceProperties] = js.native
  /**
    * The number of services that are associated with the namespace.
    */
  var ServiceCount: js.UndefOr[ResourceCount] = js.native
  /**
    * The type of the namespace. Valid values are DNS_PUBLIC and DNS_PRIVATE.
    */
  var Type: js.UndefOr[NamespaceType] = js.native
}

object Namespace {
  @scala.inline
  def apply(): Namespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Namespace]
  }
  @scala.inline
  implicit class NamespaceOps[Self <: Namespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorRequestId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: ResourceDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NamespaceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: NamespaceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCount(value: ResourceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NamespaceType): Self = {
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
  }
  
}

