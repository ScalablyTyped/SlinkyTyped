package typingsSlinky.preact.internalMod

import org.scalajs.dom.raw.Text
import typingsSlinky.preact.AnonChildren
import typingsSlinky.preact.mod.ComponentType
import typingsSlinky.preact.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNode[P]
  extends typingsSlinky.preact.mod.VNode[P] {
  var _children: js.Array[VNode[_]] | Null = js.native
  var _component: (Component[js.Object, js.Object]) | Null = js.native
  var _depth: Double | Null = js.native
  /**
  	 * The [first (for Fragments)] DOM child of a VNode
  	 */
  var _dom: PreactElement | Text | Null = js.native
  /**
  	 * The last dom child of a Fragment, or components that return a Fragment
  	 */
  var _nextDom: PreactElement | Text | Null = js.native
  var _parent: VNode[js.Object] | Null = js.native
  var constructor: js.UndefOr[scala.Nothing] = js.native
}

object VNode {
  @scala.inline
  def apply[P](key: Key, props: P with AnonChildren, `type`: ComponentType[P] | String): VNode[P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[P]]
  }
  @scala.inline
  implicit class VNodeOps[Self[p] <: VNode[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def with_children(value: js.Array[VNode[_]]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_childrenNull: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_children")(null)
        ret
    }
    @scala.inline
    def with_component(value: Component[js.Object, js.Object]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_componentNull: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_component")(null)
        ret
    }
    @scala.inline
    def with_depth(value: Double): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_depthNull: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_depth")(null)
        ret
    }
    @scala.inline
    def with_domText(value: Text): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_dom(value: PreactElement | Text): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_domNull: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dom")(null)
        ret
    }
    @scala.inline
    def with_nextDomText(value: Text): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_nextDom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_nextDom(value: PreactElement | Text): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_nextDom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_nextDomNull: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_nextDom")(null)
        ret
    }
    @scala.inline
    def with_parent(value: VNode[js.Object]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_parentNull: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parent")(null)
        ret
    }
    @scala.inline
    def withConstructor(value: scala.Nothing): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstructor: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.undefined)
        ret
    }
  }
  
}

