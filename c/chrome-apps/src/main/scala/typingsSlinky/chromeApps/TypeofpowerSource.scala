package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chrome.system.powerSource.PowerSourceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofpowerSource extends js.Object {
  /**
    * Event for changes in the set of connected power sources.
    */
  val onPowerChanged: Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]] = js.native
  /**
    * Requests information on attached power sources.
    * @param callback The callback to invoke with the results or undefined if the power source information is not known.
    */
  def getPowerSourceInfo(callback: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit]): Unit = js.native
  /**
    * Requests a power source status update.
    * Resulting power source status updates are observable using *onPowerChanged*.
    */
  def requestStatusUpdate(): Unit = js.native
}

object TypeofpowerSource {
  @scala.inline
  def apply(
    getPowerSourceInfo: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit] => Unit,
    onPowerChanged: Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]],
    requestStatusUpdate: () => Unit
  ): TypeofpowerSource = {
    val __obj = js.Dynamic.literal(getPowerSourceInfo = js.Any.fromFunction1(getPowerSourceInfo), onPowerChanged = onPowerChanged.asInstanceOf[js.Any], requestStatusUpdate = js.Any.fromFunction0(requestStatusUpdate))
    __obj.asInstanceOf[TypeofpowerSource]
  }
  @scala.inline
  implicit class TypeofpowerSourceOps[Self <: TypeofpowerSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPowerSourceInfo(value: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPowerSourceInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPowerChanged(value: Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPowerChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestStatusUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStatusUpdate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

