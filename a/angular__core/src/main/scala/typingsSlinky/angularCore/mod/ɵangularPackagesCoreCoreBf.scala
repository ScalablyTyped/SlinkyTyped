package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵangularPackagesCoreCoreBf
  extends TNode
     with TNodeWithLocalRefs {
  @JSName("child")
  var child_ɵangularPackagesCoreCoreBf: ɵangularPackagesCoreCoreBf | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | Null = js.native
  /**
    * Element nodes will have parents unless they are the first node of a component or
    * embedded view (which means their parent is in a different view and must be
    * retrieved using viewData[HOST_NODE]).
    */
  @JSName("parent")
  var parent_ɵangularPackagesCoreCoreBf: ɵangularPackagesCoreCoreBf | TElementContainerNode | Null = js.native
  /**
    * If this is a component TNode with projection, this will be an array of projected
    * TNodes or native nodes (see TNode.projection for more info). If it's a regular element node or
    * a component without projection, it will be null.
    */
  @JSName("projection")
  var projection_ɵangularPackagesCoreCoreBf: (js.Array[TNode | js.Array[RNode]]) | Null = js.native
  @JSName("tViews")
  var tViews_ɵangularPackagesCoreCoreBf: Null = js.native
}

object ɵangularPackagesCoreCoreBf {
  @scala.inline
  def apply(
    directiveEnd: Double,
    directiveStart: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    propertyMetadataEndIndex: Double,
    propertyMetadataStartIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    tViews: Null,
    `type`: TNodeType
  ): ɵangularPackagesCoreCoreBf = {
    val __obj = js.Dynamic.literal(directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], propertyMetadataEndIndex = propertyMetadataEndIndex.asInstanceOf[js.Any], propertyMetadataStartIndex = propertyMetadataStartIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵangularPackagesCoreCoreBf]
  }
  @scala.inline
  implicit class ɵangularPackagesCoreCoreBfOps[Self <: ɵangularPackagesCoreCoreBf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTViews(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChild(
      value: ɵangularPackagesCoreCoreBf | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(null)
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
    @scala.inline
    def withProjection(value: js.Array[TNode | js.Array[RNode]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(null)
        ret
    }
  }
  
}

