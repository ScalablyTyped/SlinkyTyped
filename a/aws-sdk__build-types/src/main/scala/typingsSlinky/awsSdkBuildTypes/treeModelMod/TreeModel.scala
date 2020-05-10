package typingsSlinky.awsSdkBuildTypes.treeModelMod

import typingsSlinky.awsSdkTypes.protocolMod.ServiceMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeModel
  extends Documented
     with Named {
  var metadata: ServiceMetadata = js.native
  var operations: TreeModelOperationMap = js.native
  var shapes: TreeModelShapeMap = js.native
}

object TreeModel {
  @scala.inline
  def apply(
    documentation: String,
    metadata: ServiceMetadata,
    name: String,
    operations: TreeModelOperationMap,
    shapes: TreeModelShapeMap
  ): TreeModel = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModel]
  }
  @scala.inline
  implicit class TreeModelOps[Self <: TreeModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: ServiceMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperations(value: TreeModelOperationMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapes(value: TreeModelShapeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

