package typingsSlinky.bingmaps.Microsoft.Maps.Traffic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficManager extends js.Object {
  /** Hides all traffic data. */
  def hide(): Unit = js.native
  /** Hides the traffic flow layer. */
  def hideFlow(): Unit = js.native
  /** Hides all traffic incidents. */
  def hideIncidents(): Unit = js.native
  /** Hides the traffic legend. */
  def hideLegend(): Unit = js.native
  /**
    * Sets the options for the traffic manager.
    * @param options The options for the traffic manager.
    */
  def setOptions(options: ITrafficOptions): Unit = js.native
  /** Displays all traffic data. */
  def show(): Unit = js.native
  /** Displays the traffic flow layer. */
  def showFlow(): Unit = js.native
  /** Displays all traffic incidents. */
  def showIncidents(): Unit = js.native
  /** Displays the traffic legend. */
  def showLegend(): Unit = js.native
}

object TrafficManager {
  @scala.inline
  def apply(
    hide: () => Unit,
    hideFlow: () => Unit,
    hideIncidents: () => Unit,
    hideLegend: () => Unit,
    setOptions: ITrafficOptions => Unit,
    show: () => Unit,
    showFlow: () => Unit,
    showIncidents: () => Unit,
    showLegend: () => Unit
  ): TrafficManager = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), hideFlow = js.Any.fromFunction0(hideFlow), hideIncidents = js.Any.fromFunction0(hideIncidents), hideLegend = js.Any.fromFunction0(hideLegend), setOptions = js.Any.fromFunction1(setOptions), show = js.Any.fromFunction0(show), showFlow = js.Any.fromFunction0(showFlow), showIncidents = js.Any.fromFunction0(showIncidents), showLegend = js.Any.fromFunction0(showLegend))
    __obj.asInstanceOf[TrafficManager]
  }
  @scala.inline
  implicit class TrafficManagerOps[Self <: TrafficManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideFlow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFlow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideIncidents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIncidents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideLegend(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLegend")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetOptions(value: ITrafficOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowFlow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFlow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowIncidents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIncidents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowLegend(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegend")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

