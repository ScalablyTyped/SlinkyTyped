package typingsSlinky.dojo.dojox.grid.enhanced.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/_StoreLayer.html
  *
  *
  */
@js.native
trait StoreLayer_ extends js.Object {
  /**
    * Wrap the store with the given layer.
    *
    * @param store The store to be wrapped.
    * @param funcName
    * @param layer The layer to be used
    * @param layerFuncName
    */
  def wrap(
    store: js.Any,
    funcName: js.Any,
    layer: typingsSlinky.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer,
    layerFuncName: js.Any
  ): js.Any = js.native
}

object StoreLayer_ {
  @scala.inline
  def apply(
    wrap: (js.Any, js.Any, typingsSlinky.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer, js.Any) => js.Any
  ): StoreLayer_ = {
    val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction4(wrap))
    __obj.asInstanceOf[StoreLayer_]
  }
  @scala.inline
  implicit class StoreLayer_Ops[Self <: StoreLayer_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrap(
      value: (js.Any, js.Any, typingsSlinky.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer, js.Any) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

