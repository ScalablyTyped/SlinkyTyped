package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for a view  */
@js.native
trait TViewNode extends TNode {
  @JSName("child")
  var child_TViewNode: ɵangularPackagesCoreCoreBf | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | Null = js.native
  @JSName("parent")
  var parent_TViewNode: TContainerNode | Null = js.native
  @JSName("projection")
  var projection_TViewNode: Null = js.native
  @JSName("tViews")
  var tViews_TViewNode: Null = js.native
}

object TViewNode {
  @scala.inline
  def apply(
    directiveEnd: Double,
    directiveStart: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    projection: Null,
    propertyMetadataEndIndex: Double,
    propertyMetadataStartIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    tViews: Null,
    `type`: TNodeType
  ): TViewNode = {
    val __obj = js.Dynamic.literal(directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], propertyMetadataEndIndex = propertyMetadataEndIndex.asInstanceOf[js.Any], propertyMetadataStartIndex = propertyMetadataStartIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TViewNode]
  }
  @scala.inline
  implicit class TViewNodeOps[Self <: TViewNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjection(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withParent(value: TContainerNode): Self = {
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

