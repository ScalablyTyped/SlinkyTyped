package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveWidget extends js.Object {
  def getAttribution(): Attribution = js.native
  def getPlace(): Place = js.native
  def setAttribution(attribution: Attribution): Unit = js.native
  def setOptions(opts: SaveWidgetOptions): Unit = js.native
  def setPlace(place: Place): Unit = js.native
}

object SaveWidget {
  @scala.inline
  def apply(
    getAttribution: () => Attribution,
    getPlace: () => Place,
    setAttribution: Attribution => Unit,
    setOptions: SaveWidgetOptions => Unit,
    setPlace: Place => Unit
  ): SaveWidget = {
    val __obj = js.Dynamic.literal(getAttribution = js.Any.fromFunction0(getAttribution), getPlace = js.Any.fromFunction0(getPlace), setAttribution = js.Any.fromFunction1(setAttribution), setOptions = js.Any.fromFunction1(setOptions), setPlace = js.Any.fromFunction1(setPlace))
    __obj.asInstanceOf[SaveWidget]
  }
  @scala.inline
  implicit class SaveWidgetOps[Self <: SaveWidget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAttribution(value: () => Attribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribution")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPlace(value: () => Place): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAttribution(value: Attribution => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttribution")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOptions(value: SaveWidgetOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPlace(value: Place => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPlace")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

