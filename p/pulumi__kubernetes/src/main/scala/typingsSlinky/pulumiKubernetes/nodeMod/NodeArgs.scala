package typingsSlinky.pulumiKubernetes.nodeMod

import typingsSlinky.pulumiKubernetes.inputMod.core.v1.NodeSpec
import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeArgs extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: js.UndefOr[Input[v1]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Node]] = js.native
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  
  /**
    * Spec defines the behavior of a node. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val spec: js.UndefOr[Input[NodeSpec]] = js.native
}
object NodeArgs {
  
  @scala.inline
  def apply(): NodeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeArgs]
  }
  
  @scala.inline
  implicit class NodeArgsOps[Self <: NodeArgs] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: Input[v1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Node]): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setSpec(value: Input[NodeSpec]): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
  }
}
