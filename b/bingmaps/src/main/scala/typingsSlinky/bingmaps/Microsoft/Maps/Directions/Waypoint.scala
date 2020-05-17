package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import typingsSlinky.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Waypoint extends js.Object {
  /** Releases any resources associated with the waypoint. */
  def dispose(): Unit = js.native
  /**
    * Gets the address associated with the waypoint.
    * @returns The address associated with the waypoint.
    */
  def getAddress(): String = js.native
  /**
    * Gets the location of the waypoint.
    * @returns The location of the waypoint.
    */
  def getLocation(): Location = js.native
  /**
    * Gets a boolean value indicating whether the waypoint is a via point.
    * @returns A boolean value indicating whether the waypoint is a via point.
    */
  def isViapoint(): Boolean = js.native
  /**
    * Sets options for the waypoint. For these options to take effect, you must recalculate the route.
    * @param options Options used to define the Waypoint.
    */
  def setOptions(options: IWaypointOptions): Unit = js.native
}

object Waypoint {
  @scala.inline
  def apply(
    dispose: () => Unit,
    getAddress: () => String,
    getLocation: () => Location,
    isViapoint: () => Boolean,
    setOptions: IWaypointOptions => Unit
  ): Waypoint = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getAddress = js.Any.fromFunction0(getAddress), getLocation = js.Any.fromFunction0(getLocation), isViapoint = js.Any.fromFunction0(isViapoint), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Waypoint]
  }
  @scala.inline
  implicit class WaypointOps[Self <: Waypoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAddress(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAddress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocation(value: () => Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsViapoint(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isViapoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetOptions(value: IWaypointOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

