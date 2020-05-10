package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterContainerInstanceRequest extends js.Object {
  /**
    * The container instance attributes that this container instance supports.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster with which to register your container instance. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * The ARN of the container instance (if it was previously registered).
    */
  var containerInstanceArn: js.UndefOr[String] = js.native
  /**
    * The instance identity document for the EC2 instance to register. This document can be found by running the following command from the instance: curl http://169.254.169.254/latest/dynamic/instance-identity/document/ 
    */
  var instanceIdentityDocument: js.UndefOr[String] = js.native
  /**
    * The instance identity document signature for the EC2 instance to register. This signature can be found by running the following command from the instance: curl http://169.254.169.254/latest/dynamic/instance-identity/signature/ 
    */
  var instanceIdentityDocumentSignature: js.UndefOr[String] = js.native
  /**
    * The devices that are available on the container instance. The only supported device type is a GPU.
    */
  var platformDevices: js.UndefOr[PlatformDevices] = js.native
  /**
    * The metadata that you apply to the container instance to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  /**
    * The resources available on the instance.
    */
  var totalResources: js.UndefOr[Resources] = js.native
  /**
    * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
    */
  var versionInfo: js.UndefOr[VersionInfo] = js.native
}

object RegisterContainerInstanceRequest {
  @scala.inline
  def apply(): RegisterContainerInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterContainerInstanceRequest]
  }
  @scala.inline
  implicit class RegisterContainerInstanceRequestOps[Self <: RegisterContainerInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
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
    @scala.inline
    def withCluster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInstanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceIdentityDocument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIdentityDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIdentityDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIdentityDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceIdentityDocumentSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIdentityDocumentSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIdentityDocumentSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIdentityDocumentSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformDevices(value: PlatformDevices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalResources(value: Resources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResources")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionInfo(value: VersionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(js.undefined)
        ret
    }
  }
  
}

