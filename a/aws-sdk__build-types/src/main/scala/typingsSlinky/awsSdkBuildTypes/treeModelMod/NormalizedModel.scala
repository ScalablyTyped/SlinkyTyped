package typingsSlinky.awsSdkBuildTypes.treeModelMod

import typingsSlinky.awsSdkBuildTypes.apiModelMod.ApiModel
import typingsSlinky.awsSdkBuildTypes.apiModelMod.ShapeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizedModel extends ApiModel {
  
  @JSName("operations")
  var operations_NormalizedModel: NormalizedOperationMap = js.native
}
object NormalizedModel {
  
  @scala.inline
  def apply(
    metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any,
    operations: NormalizedOperationMap,
    shapes: ShapeMap
  ): NormalizedModel = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedModel]
  }
  
  @scala.inline
  implicit class NormalizedModelOps[Self <: NormalizedModel] (val x: Self) extends AnyVal {
    
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
    def setOperations(value: NormalizedOperationMap): Self = this.set("operations", value.asInstanceOf[js.Any])
  }
}
