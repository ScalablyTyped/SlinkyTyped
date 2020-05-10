package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.CREATE_UNIT_TREE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateUnitTreeDelta
  extends IDelta
     with Delta {
  /**
    * The ID of the containing unit.
    * (This relates to the project tree.)
    */
  var containerId: String = js.native
  /**
    * The name of the property of the containing unit which will contain the unit-to-create.
    * (This relates to the project tree.)
    */
  var containmentName: String = js.native
  /**
    * The qualified name of the type of unit to create.
    */
  var contentType: String = js.native
  var deltaType: CREATE_UNIT_TREE = js.native
  /**
    * The JSON of the unit tree to create.
    */
  var unitTree: IStructureJSON = js.native
}

object ICreateUnitTreeDelta {
  @scala.inline
  def apply(
    containerId: String,
    containmentName: String,
    contentType: String,
    deltaType: CREATE_UNIT_TREE,
    unitId: String,
    unitTree: IStructureJSON
  ): ICreateUnitTreeDelta = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], containmentName = containmentName.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deltaType = deltaType.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any], unitTree = unitTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateUnitTreeDelta]
  }
  @scala.inline
  implicit class ICreateUnitTreeDeltaOps[Self <: ICreateUnitTreeDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaType(value: CREATE_UNIT_TREE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnitTree(value: IStructureJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitTree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

