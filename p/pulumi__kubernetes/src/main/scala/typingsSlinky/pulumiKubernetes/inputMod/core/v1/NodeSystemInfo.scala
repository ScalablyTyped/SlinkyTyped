package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
  */
@js.native
trait NodeSystemInfo extends js.Object {
  
  /**
    * The Architecture reported by the node
    */
  var architecture: Input[String] = js.native
  
  /**
    * Boot ID reported by the node.
    */
  var bootID: Input[String] = js.native
  
  /**
    * ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
    */
  var containerRuntimeVersion: Input[String] = js.native
  
  /**
    * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
    */
  var kernelVersion: Input[String] = js.native
  
  /**
    * KubeProxy Version reported by the node.
    */
  var kubeProxyVersion: Input[String] = js.native
  
  /**
    * Kubelet Version reported by the node.
    */
  var kubeletVersion: Input[String] = js.native
  
  /**
    * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
    */
  var machineID: Input[String] = js.native
  
  /**
    * The Operating System reported by the node
    */
  var operatingSystem: Input[String] = js.native
  
  /**
    * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
    */
  var osImage: Input[String] = js.native
  
  /**
    * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html
    */
  var systemUUID: Input[String] = js.native
}
object NodeSystemInfo {
  
  @scala.inline
  def apply(
    architecture: Input[String],
    bootID: Input[String],
    containerRuntimeVersion: Input[String],
    kernelVersion: Input[String],
    kubeProxyVersion: Input[String],
    kubeletVersion: Input[String],
    machineID: Input[String],
    operatingSystem: Input[String],
    osImage: Input[String],
    systemUUID: Input[String]
  ): NodeSystemInfo = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], bootID = bootID.asInstanceOf[js.Any], containerRuntimeVersion = containerRuntimeVersion.asInstanceOf[js.Any], kernelVersion = kernelVersion.asInstanceOf[js.Any], kubeProxyVersion = kubeProxyVersion.asInstanceOf[js.Any], kubeletVersion = kubeletVersion.asInstanceOf[js.Any], machineID = machineID.asInstanceOf[js.Any], operatingSystem = operatingSystem.asInstanceOf[js.Any], osImage = osImage.asInstanceOf[js.Any], systemUUID = systemUUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSystemInfo]
  }
  
  @scala.inline
  implicit class NodeSystemInfoOps[Self <: NodeSystemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArchitecture(value: Input[String]): Self = this.set("architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootID(value: Input[String]): Self = this.set("bootID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerRuntimeVersion(value: Input[String]): Self = this.set("containerRuntimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelVersion(value: Input[String]): Self = this.set("kernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubeProxyVersion(value: Input[String]): Self = this.set("kubeProxyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubeletVersion(value: Input[String]): Self = this.set("kubeletVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineID(value: Input[String]): Self = this.set("machineID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystem(value: Input[String]): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsImage(value: Input[String]): Self = this.set("osImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUUID(value: Input[String]): Self = this.set("systemUUID", value.asInstanceOf[js.Any])
  }
}
