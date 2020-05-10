package typingsSlinky.blueprintjsCore.treeNodeMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeNode[T] extends IProps {
  /**
    * Child tree nodes of this node.
    */
  var childNodes: js.UndefOr[js.Array[ITreeNode[T]]] = js.native
  /**
    * Whether this tree node is non-interactive. Enabling this prop will ignore
    * mouse event handlers (in particular click, down, enter, leave).
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the caret to expand/collapse a node should be shown.
    * If not specified, this will be true if the node has children and false otherwise.
    */
  var hasCaret: js.UndefOr[Boolean] = js.native
  /**
    * The name of a Blueprint icon (or an icon element) to render next to the node's label.
    */
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
  /**
    * A unique identifier for the node.
    */
  var id: String | Double = js.native
  /**
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  /**
    * Whether this node is selected.
    * @default false
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  /**
    * The main label for the node.
    */
  var label: String | ReactElement = js.native
  /**
    * An optional custom user object to associate with the node.
    * This property can then be used in the `onClick`, `onContextMenu` and `onDoubleClick`
    * event handlers for doing custom logic per node.
    */
  var nodeData: js.UndefOr[T] = js.native
  /**
    * A secondary label/component that is displayed at the right side of the node.
    */
  var secondaryLabel: js.UndefOr[String | MaybeElement] = js.native
}

object ITreeNode {
  @scala.inline
  def apply[T](id: String | Double, label: String | ReactElement): ITreeNode[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeNode[T]]
  }
  @scala.inline
  implicit class ITreeNodeOps[Self[t] <: ITreeNode[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withId(value: String | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String | ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNodes(value: js.Array[ITreeNode[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildNodes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCaret(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCaret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCaret: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCaret")(js.undefined)
        ret
    }
    @scala.inline
    def withIconReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: IconName | MaybeElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(null)
        ret
    }
    @scala.inline
    def withIsExpanded(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeData")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryLabelReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryLabel(value: String | MaybeElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryLabelNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryLabel")(null)
        ret
    }
  }
  
}

