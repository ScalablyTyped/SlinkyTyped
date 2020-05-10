package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for an LContainer */
@js.native
trait TContainerNode
  extends TNode
     with TNodeWithLocalRefs {
  @JSName("child")
  var child_TContainerNode: Null = js.native
  /**
    * Container nodes will have parents unless:
    *
    * - They are the first node of a component or embedded view
    * - They are dynamically created
    */
  @JSName("parent")
  var parent_TContainerNode: ɵangularPackagesCoreCoreBf | TElementContainerNode | Null = js.native
  @JSName("projection")
  var projection_TContainerNode: Null = js.native
}

object TContainerNode {
  @scala.inline
  def apply(
    child: Null,
    directiveEnd: Double,
    directiveStart: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    projection: Null,
    propertyMetadataEndIndex: Double,
    propertyMetadataStartIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    `type`: TNodeType
  ): TContainerNode = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], propertyMetadataEndIndex = propertyMetadataEndIndex.asInstanceOf[js.Any], propertyMetadataStartIndex = propertyMetadataStartIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TContainerNode]
  }
  @scala.inline
  implicit class TContainerNodeOps[Self <: TContainerNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChild(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjection(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ɵangularPackagesCoreCoreBf | TElementContainerNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
  }
  
}

