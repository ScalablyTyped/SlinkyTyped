package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMLModelInput extends js.Object {
  
  /**
    * The ID assigned to the MLModel at creation.
    */
  var MLModelId: EntityId = js.native
  
  /**
    * Specifies whether the GetMLModel operation should return Recipe. If true, Recipe is returned. If false, Recipe is not returned.
    */
  var Verbose: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.Verbose] = js.native
}
object GetMLModelInput {
  
  @scala.inline
  def apply(MLModelId: EntityId): GetMLModelInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLModelInput]
  }
  
  @scala.inline
  implicit class GetMLModelInputOps[Self <: GetMLModelInput] (val x: Self) extends AnyVal {
    
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
    def setMLModelId(value: EntityId): Self = this.set("MLModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Verbose): Self = this.set("Verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("Verbose", js.undefined)
  }
}
