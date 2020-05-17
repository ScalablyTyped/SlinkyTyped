package typingsSlinky.kendoUi.kendo.dataviz.map

import typingsSlinky.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerLayer extends Layer_ {
  var items: js.Any = js.native
  @JSName("options")
  var options_MarkerLayer: MarkerLayerOptions = js.native
  def add(marker: Marker): Unit = js.native
  def clear(): Unit = js.native
  def remove(marker: Marker): Unit = js.native
  def setDataSource(dataSource: js.Any): Unit = js.native
}

object MarkerLayer {
  @scala.inline
  def apply(
    add: Marker => Unit,
    clear: () => Unit,
    hide: () => Unit,
    items: js.Any,
    map: Map,
    options: MarkerLayerOptions,
    remove: Marker => Unit,
    setDataSource: js.Any => Unit,
    show: () => Unit
  ): MarkerLayer = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), hide = js.Any.fromFunction0(hide), items = items.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), setDataSource = js.Any.fromFunction1(setDataSource), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[MarkerLayer]
  }
  @scala.inline
  implicit class MarkerLayerOps[Self <: MarkerLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Marker => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: MarkerLayerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: Marker => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDataSource(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDataSource")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

