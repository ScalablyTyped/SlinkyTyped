package typingsSlinky.mapbox.mod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocoderControl_ extends js.Object {
  def getURL(): String = js.native
  /**
  			 * Bind a listener to an event emitted by the geocoder control. Supported additional events are
  			 */
  def on(event: String, callback: js.Function): js.Any = js.native
  def onAdd(map: Map_): js.Any = js.native
  /**
  			 * Set the map id used for geocoding.
  			 */
  def setID(id: String): js.Any = js.native
  /**
  			 * Set the TileJSON used for geocoding.
  			 */
  def setTileJSON(tilejson: js.Any): js.Any = js.native
  /**
  			 * Set the url used for geocoding.
  			 */
  def setURL(url: String): js.Any = js.native
}

object GeocoderControl_ {
  @scala.inline
  def apply(
    getURL: () => String,
    on: (String, js.Function) => js.Any,
    onAdd: Map_ => js.Any,
    setID: String => js.Any,
    setTileJSON: js.Any => js.Any,
    setURL: String => js.Any
  ): GeocoderControl_ = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction0(getURL), on = js.Any.fromFunction2(on), onAdd = js.Any.fromFunction1(onAdd), setID = js.Any.fromFunction1(setID), setTileJSON = js.Any.fromFunction1(setTileJSON), setURL = js.Any.fromFunction1(setURL))
    __obj.asInstanceOf[GeocoderControl_]
  }
  @scala.inline
  implicit class GeocoderControl_Ops[Self <: GeocoderControl_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetURL(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getURL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnAdd(value: Map_ => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetID(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTileJSON(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTileJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetURL(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setURL")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

