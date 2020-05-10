package typingsSlinky.dojo.dojox.app.utils

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/utils/layout.html
  *
  *
  */
@js.native
trait layout extends js.Object {
  /**
    * Layout a bunch of child dom nodes within a parent dom node
    *
    * @param container parent node
    * @param dim {l, t, w, h} object specifying dimensions of container into which to place children
    * @param children a list of children
    * @param changedRegionId               OptionalIf specified, the slider for the region with the specified id has been dragged, and thusthe region's height or width should be adjusted according to changedRegionSize
    * @param changedRegionSize               OptionalSee changedRegionId.
    */
  def layoutChildren(
    container: HTMLElement,
    dim: js.Object,
    children: js.Array[_],
    changedRegionId: String,
    changedRegionSize: Double
  ): Unit = js.native
  /**
    * Given the margin-box size of a node, return its content box size.
    * Functions like domGeometry.contentBox() but is more reliable since it doesn't have
    * to wait for the browser to compute sizes.
    *
    * @param node
    * @param mb
    */
  def marginBox2contentBox(node: HTMLElement, mb: js.Object): js.Object = js.native
}

object layout {
  @scala.inline
  def apply(
    layoutChildren: (HTMLElement, js.Object, js.Array[_], String, Double) => Unit,
    marginBox2contentBox: (HTMLElement, js.Object) => js.Object
  ): layout = {
    val __obj = js.Dynamic.literal(layoutChildren = js.Any.fromFunction5(layoutChildren), marginBox2contentBox = js.Any.fromFunction2(marginBox2contentBox))
    __obj.asInstanceOf[layout]
  }
  @scala.inline
  implicit class layoutOps[Self <: layout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutChildren(value: (HTMLElement, js.Object, js.Array[_], String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutChildren")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withMarginBox2contentBox(value: (HTMLElement, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBox2contentBox")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

