package typingsSlinky.dojo.dojox.grid.enhanced.plugins.filter

import typingsSlinky.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/FilterLayer.html
  *
  *
  */
@js.native
trait FilterLayer_ extends js.Object {
  /**
    *
    */
  def ClientSideFilterLayer(): Unit = js.native
  /**
    *
    */
  def ServerSideFilterLayer(): Unit = js.native
  /**
    * Wrap the store with the given layer.
    *
    * @param store The store to be wrapped.
    * @param funcName
    * @param layer The layer to be used
    * @param layerFuncName
    */
  def wrap(store: js.Any, funcName: js.Any, layer: StoreLayer, layerFuncName: js.Any): js.Any = js.native
}

object FilterLayer_ {
  @scala.inline
  def apply(
    ClientSideFilterLayer: () => Unit,
    ServerSideFilterLayer: () => Unit,
    wrap: (js.Any, js.Any, StoreLayer, js.Any) => js.Any
  ): FilterLayer_ = {
    val __obj = js.Dynamic.literal(ClientSideFilterLayer = js.Any.fromFunction0(ClientSideFilterLayer), ServerSideFilterLayer = js.Any.fromFunction0(ServerSideFilterLayer), wrap = js.Any.fromFunction4(wrap))
    __obj.asInstanceOf[FilterLayer_]
  }
  @scala.inline
  implicit class FilterLayer_Ops[Self <: FilterLayer_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientSideFilterLayer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientSideFilterLayer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withServerSideFilterLayer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideFilterLayer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrap(value: (js.Any, js.Any, StoreLayer, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

