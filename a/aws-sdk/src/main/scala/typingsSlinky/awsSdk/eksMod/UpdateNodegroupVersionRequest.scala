package typingsSlinky.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateNodegroupVersionRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the Amazon EKS cluster that is associated with the managed node group to update.
    */
  var clusterName: String = js.native
  
  /**
    * Force the update if the existing node group's pods are unable to be drained due to a pod disruption budget issue. If an update fails because pods could not be drained, you can force the update after it fails to terminate the old node whether or not any pods are running on the node.
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * An object representing a node group's launch template specification. You can only update a node group using a launch template if the node group was originally deployed with a launch template.
    */
  var launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  
  /**
    * The name of the managed node group to update.
    */
  var nodegroupName: String = js.native
  
  /**
    * The AMI version of the Amazon EKS-optimized AMI to use for the update. By default, the latest available AMI version for the node group's Kubernetes version is used. For more information, see Amazon EKS-Optimized Linux AMI Versions  in the Amazon EKS User Guide. If you specify launchTemplate, and your launch template uses a custom AMI, then don't specify releaseVersion, or the node group update will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var releaseVersion: js.UndefOr[String] = js.native
  
  /**
    * The Kubernetes version to update to. If no version is specified, then the Kubernetes version of the node group does not change. You can specify the Kubernetes version of the cluster to update the node group to the latest AMI version of the cluster's Kubernetes version. If you specify launchTemplate, and your launch template uses a custom AMI, then don't specify version, or the node group update will fail. For more information about using launch templates with Amazon EKS, see Launch template support in the Amazon EKS User Guide.
    */
  var version: js.UndefOr[String] = js.native
}
object UpdateNodegroupVersionRequest {
  
  @scala.inline
  def apply(clusterName: String, nodegroupName: String): UpdateNodegroupVersionRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNodegroupVersionRequest]
  }
  
  @scala.inline
  implicit class UpdateNodegroupVersionRequestMutableBuilder[Self <: UpdateNodegroupVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
    
    @scala.inline
    def setNodegroupName(value: String): Self = StObject.set(x, "nodegroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseVersion(value: String): Self = StObject.set(x, "releaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseVersionUndefined: Self = StObject.set(x, "releaseVersion", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
