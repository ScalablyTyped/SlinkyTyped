package typingsSlinky.pulumiKubernetes.v1beta1PriorityClassListMod

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typingsSlinky.pulumiKubernetes.inputMod.scheduling.v1beta1.PriorityClass
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1beta1
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriorityClassListArgs extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: js.UndefOr[Input[schedulingDotk8sDotioSlashv1beta1]] = js.native
  
  /**
    * items is the list of PriorityClasses
    */
  val items: Input[js.Array[Input[PriorityClass]]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityClassList]] = js.native
  
  /**
    * Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: js.UndefOr[Input[ListMeta]] = js.native
}
object PriorityClassListArgs {
  
  @scala.inline
  def apply(items: Input[js.Array[Input[PriorityClass]]]): PriorityClassListArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityClassListArgs]
  }
  
  @scala.inline
  implicit class PriorityClassListArgsOps[Self <: PriorityClassListArgs] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Input[PriorityClass]*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: Input[js.Array[Input[PriorityClass]]]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersion(value: Input[schedulingDotk8sDotioSlashv1beta1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityClassList]): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: Input[ListMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
