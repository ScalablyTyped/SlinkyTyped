package typingsSlinky.blueprintjsCore.treeNodeMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeNodeProps[T] extends ITreeNode[T] {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var contentRef: js.UndefOr[js.Function2[/* node */ TreeNode[T], /* element */ HTMLDivElement | Null, Unit]] = js.native
  var depth: Double = js.native
  var key: js.UndefOr[String | Double] = js.native
  var onClick: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement], Unit]
  ] = js.native
  var onCollapse: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLSpanElement], Unit]
  ] = js.native
  var onContextMenu: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement], Unit]
  ] = js.native
  var onDoubleClick: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement], Unit]
  ] = js.native
  var onExpand: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLSpanElement], Unit]
  ] = js.native
  var onMouseEnter: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement], Unit]
  ] = js.native
  var onMouseLeave: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement], Unit]
  ] = js.native
  var path: js.Array[Double] = js.native
}

object ITreeNodeProps {
  @scala.inline
  def apply[T](depth: Double, id: String | Double, label: String | ReactElement, path: js.Array[Double]): ITreeNodeProps[T] = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeNodeProps[T]]
  }
  @scala.inline
  implicit class ITreeNodePropsOps[Self[t] <: ITreeNodeProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDepth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withContentRef(value: (/* node */ TreeNode[T], /* element */ HTMLDivElement | Null) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRef")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutContentRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollapse(value: (/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLSpanElement]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCollapse: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: (/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: (/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpand(value: (/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLSpanElement]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnExpand: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: (/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: (/* node */ TreeNode[T], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
  }
  
}

