package typingsSlinky.maquette.interfacesMod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNode extends VNodeChild {
  /**
    * Array of [[VNode]]s to be used as children. This array is already flattened.
    */
  val children: js.UndefOr[js.Array[VNode]] = js.native
  /**
    * Used by maquette to store the domNode that was produced from this [[VNode]].
    */
  var domNode: Node | Null = js.native
  /**
    * Object containing attributes, properties, event handlers and more, see [[h]].
    */
  val properties: js.UndefOr[VNodeProperties] = js.native
  /**
    * Used in a special case when a [[VNode]] only has one child node which is a text node. Only used in combination with children === undefined.
    */
  val text: js.UndefOr[String] = js.native
  /**
    * The CSS selector containing tagname, css classnames and id. An empty string is used to denote a text node.
    */
  val vnodeSelector: String = js.native
}

object VNode {
  @scala.inline
  def apply(vnodeSelector: String): VNode = {
    val __obj = js.Dynamic.literal(vnodeSelector = vnodeSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
  @scala.inline
  implicit class VNodeOps[Self <: VNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVnodeSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vnodeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[VNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDomNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domNode")(null)
        ret
    }
    @scala.inline
    def withProperties(value: VNodeProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

