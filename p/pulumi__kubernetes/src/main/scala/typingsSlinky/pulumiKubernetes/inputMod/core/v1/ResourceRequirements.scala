package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceRequirements describes the compute resource requirements.
  */
@js.native
trait ResourceRequirements extends js.Object {
  
  /**
    * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  var limits: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  var requests: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ResourceRequirements {
  
  @scala.inline
  def apply(): ResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRequirements]
  }
  
  @scala.inline
  implicit class ResourceRequirementsOps[Self <: ResourceRequirements] (val x: Self) extends AnyVal {
    
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
    def setLimits(value: Input[StringDictionary[Input[String]]]): Self = this.set("limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    
    @scala.inline
    def setRequests(value: Input[StringDictionary[Input[String]]]): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
}
