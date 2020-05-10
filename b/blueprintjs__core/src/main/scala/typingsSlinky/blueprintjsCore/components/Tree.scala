package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.treeMod.ITreeProps
import typingsSlinky.blueprintjsCore.treeNodeMod.ITreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tree {
  @JSImport("@blueprintjs/core", "Tree")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Tree[js.Any]] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def onNodeClick(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): this.type = set("onNodeClick", js.Any.fromFunction3(value))
    @scala.inline
    def onNodeCollapse(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): this.type = set("onNodeCollapse", js.Any.fromFunction3(value))
    @scala.inline
    def onNodeContextMenu(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): this.type = set("onNodeContextMenu", js.Any.fromFunction3(value))
    @scala.inline
    def onNodeDoubleClick(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): this.type = set("onNodeDoubleClick", js.Any.fromFunction3(value))
    @scala.inline
    def onNodeExpand(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): this.type = set("onNodeExpand", js.Any.fromFunction3(value))
    @scala.inline
    def onNodeMouseEnter(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): this.type = set("onNodeMouseEnter", js.Any.fromFunction3(value))
    @scala.inline
    def onNodeMouseLeave(
      value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): this.type = set("onNodeMouseLeave", js.Any.fromFunction3(value))
  }
  
  def withProps[T](p: ITreeProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](contents: js.Array[ITreeNode[T]]): Builder[T] = {
    val __props = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ITreeProps[T]]))
  }
}

