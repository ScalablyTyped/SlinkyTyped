package typingsSlinky.pulumiAws.virtualServiceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.appmesh.VirtualServiceSpec
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualServiceState extends js.Object {
  
  /**
    * The ARN of the virtual service.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The creation date of the virtual service.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The last update date of the virtual service.
    */
  val lastUpdatedDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the service mesh in which to create the virtual service.
    */
  val meshName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name to use for the virtual service.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The virtual service specification to apply.
    */
  val spec: js.UndefOr[Input[VirtualServiceSpec]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object VirtualServiceState {
  
  @scala.inline
  def apply(): VirtualServiceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualServiceState]
  }
  
  @scala.inline
  implicit class VirtualServiceStateOps[Self <: VirtualServiceState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Input[String]): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Input[String]): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setMeshName(value: Input[String]): Self = this.set("meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshName: Self = this.set("meshName", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSpec(value: Input[VirtualServiceSpec]): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
