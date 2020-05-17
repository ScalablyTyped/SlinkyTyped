package typingsSlinky.kendoUi.kendo.dataviz.map

import typingsSlinky.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BingLayer extends TileLayer {
  @JSName("options")
  var options_BingLayer: BingLayerOptions = js.native
  def imagerySet(): Unit = js.native
}

object BingLayer {
  @scala.inline
  def apply(hide: () => Unit, imagerySet: () => Unit, map: Map, options: BingLayerOptions, show: () => Unit): BingLayer = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), imagerySet = js.Any.fromFunction0(imagerySet), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[BingLayer]
  }
  @scala.inline
  implicit class BingLayerOps[Self <: BingLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImagerySet(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagerySet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: BingLayerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

