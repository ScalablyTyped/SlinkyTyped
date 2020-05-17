package typingsSlinky.nvd3.mod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  var symbolMap: SymbolMap = js.native
  /* Default color chooser uses a color scale of 20 colors from D3  https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors */
  def defaultColor(): js.Array[String] = js.native
  def getColor(arg: js.Any): js.Array[String] = js.native
  def state(): State = js.native
  /* Binds callback function to run when window is resized */
  def windowResize(listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  /* Gets the browser window size */
  def windowSize(): Size = js.native
}

object Utils {
  @scala.inline
  def apply(
    defaultColor: () => js.Array[String],
    getColor: js.Any => js.Array[String],
    state: () => State,
    symbolMap: SymbolMap,
    windowResize: js.Function1[/* ev */ Event, _] => Unit,
    windowSize: () => Size
  ): Utils = {
    val __obj = js.Dynamic.literal(defaultColor = js.Any.fromFunction0(defaultColor), getColor = js.Any.fromFunction1(getColor), state = js.Any.fromFunction0(state), symbolMap = symbolMap.asInstanceOf[js.Any], windowResize = js.Any.fromFunction1(windowResize), windowSize = js.Any.fromFunction0(windowSize))
    __obj.asInstanceOf[Utils]
  }
  @scala.inline
  implicit class UtilsOps[Self <: Utils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultColor(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColor(value: js.Any => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withState(value: () => State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSymbolMap(value: SymbolMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowResize(value: js.Function1[/* ev */ Event, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWindowSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowSize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

