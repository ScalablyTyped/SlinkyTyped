package typingsSlinky.maquette.interfacesMod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  /**
    * The DOM node that is used as the root of this [[Projection]].
    */
  val domNode: Element = js.native
  def getLastRender(): VNode = js.native
  /**
    * Updates the real DOM to match the new virtual DOM tree.
    * @param updatedVnode The updated virtual DOM tree. Note: The selector for the root of the [[VNode]] tree may not change.
    */
  def update(updatedVnode: VNode): Unit = js.native
}

object Projection {
  @scala.inline
  def apply(domNode: Element, getLastRender: () => VNode, update: VNode => Unit): Projection = {
    val __obj = js.Dynamic.literal(domNode = domNode.asInstanceOf[js.Any], getLastRender = js.Any.fromFunction0(getLastRender), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Projection]
  }
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomNode(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLastRender(value: () => VNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: VNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

