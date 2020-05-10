package typingsSlinky.dojo.dojox.main

import typingsSlinky.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/main.charting.html
  *
  *
  */
@js.native
trait charting extends js.Object {
  /**
    * Hides the tooltip displayed around the given shape.
    *
    * @param gfxObject A gfx shape.
    */
  def hideTooltip(gfxObject: Shape): Unit = js.native
  /**
    * Show a Tooltip displaying the given HTML message around the given gfx shape.
    *
    * @param innerHTML The message to display as a HTML string.
    * @param gfxObject The gfx shape around which the tooltip will be placed.
    * @param positions               Optional
    */
  def showTooltip(innerHTML: String, gfxObject: Shape, positions: js.Array[String]): Unit = js.native
}

object charting {
  @scala.inline
  def apply(hideTooltip: Shape => Unit, showTooltip: (String, Shape, js.Array[String]) => Unit): charting = {
    val __obj = js.Dynamic.literal(hideTooltip = js.Any.fromFunction1(hideTooltip), showTooltip = js.Any.fromFunction3(showTooltip))
    __obj.asInstanceOf[charting]
  }
  @scala.inline
  implicit class chartingOps[Self <: charting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideTooltip(value: Shape => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowTooltip(value: (String, Shape, js.Array[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

