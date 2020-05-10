package typingsSlinky.blueprintjsCore.treeMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.treeNodeMod.ITreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeProps[T] extends IProps {
  /**
    * The data specifying the contents and appearance of the tree.
    */
  var contents: js.Array[ITreeNode[T]] = js.native
  /**
    * Invoked when a node is clicked anywhere other than the caret for expanding/collapsing the node.
    */
  var onNodeClick: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when caret of an expanded node is clicked.
    */
  var onNodeCollapse: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when a node is right-clicked or the context menu button is pressed on a focused node.
    */
  var onNodeContextMenu: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when a node is double-clicked. Be careful when using this in combination with
    * an `onNodeClick` (single-click) handler, as the way this behaves can vary between browsers.
    * See http://stackoverflow.com/q/5497073/3124288
    */
  var onNodeDoubleClick: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when the caret of a collapsed node is clicked.
    */
  var onNodeExpand: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when the mouse is moved over a node.
    */
  var onNodeMouseEnter: js.UndefOr[TreeEventHandler[T]] = js.native
  /**
    * Invoked when the mouse is moved out of a node.
    */
  var onNodeMouseLeave: js.UndefOr[TreeEventHandler[T]] = js.native
}

object ITreeProps {
  @scala.inline
  def apply[T](contents: js.Array[ITreeNode[T]]): ITreeProps[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeProps[T]]
  }
  @scala.inline
  implicit class ITreePropsOps[Self[t] <: ITreeProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContents(value: js.Array[ITreeNode[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnNodeClick(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNodeClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeCollapse(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeCollapse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNodeCollapse: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeContextMenu(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeContextMenu")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNodeContextMenu: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeDoubleClick(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeDoubleClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNodeDoubleClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeExpand(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeExpand")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNodeExpand: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeMouseEnter(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeMouseEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNodeMouseEnter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeMouseLeave(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeMouseLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNodeMouseLeave: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeMouseLeave")(js.undefined)
        ret
    }
  }
  
}

