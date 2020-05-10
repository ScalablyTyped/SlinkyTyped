package typingsSlinky.dojo.dojox.mobile

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_maskUtils.html
  *
  * Utility methods to clip rounded corners of various elements (Switch, ScrollablePane, scrollbars in scrollable widgets).
  * Uses -webkit-mask-image on webkit, or SVG on other browsers.
  *
  */
@js.native
trait maskUtils extends js.Object {
  /**
    * Creates and sets a mask for the specified node.
    *
    * @param node
    * @param x
    * @param y
    * @param r
    * @param b
    * @param w
    * @param h
    * @param rx
    * @param ry
    * @param e
    */
  def createRoundMask(
    node: HTMLElement,
    x: js.Any,
    y: js.Any,
    r: js.Any,
    b: js.Any,
    w: js.Any,
    h: js.Any,
    rx: Double,
    ry: Double,
    e: js.Any
  ): Unit = js.native
}

object maskUtils {
  @scala.inline
  def apply(
    createRoundMask: (HTMLElement, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, Double, Double, js.Any) => Unit
  ): maskUtils = {
    val __obj = js.Dynamic.literal(createRoundMask = js.Any.fromFunction10(createRoundMask))
    __obj.asInstanceOf[maskUtils]
  }
  @scala.inline
  implicit class maskUtilsOps[Self <: maskUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateRoundMask(
      value: (HTMLElement, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, Double, Double, js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRoundMask")(js.Any.fromFunction10(value))
        ret
    }
  }
  
}

