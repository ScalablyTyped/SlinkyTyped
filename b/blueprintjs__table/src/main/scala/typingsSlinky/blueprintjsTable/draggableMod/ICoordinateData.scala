package typingsSlinky.blueprintjsTable.draggableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoordinateData extends js.Object {
  /**
    * The client coordinates where the interaction was activated.
    */
  var activation: IClientCoordinates = js.native
  /**
    * The client coordinates of the current mouse event.
    */
  var current: IClientCoordinates = js.native
  /**
    * The difference between current and last client coordinates.
    */
  var delta: IClientCoordinates = js.native
  /**
    * The client coordinates of the previous mouse event.
    */
  var last: IClientCoordinates = js.native
  /**
    * The difference between current and activation client coordinates.
    */
  var offset: IClientCoordinates = js.native
}

object ICoordinateData {
  @scala.inline
  def apply(
    activation: IClientCoordinates,
    current: IClientCoordinates,
    delta: IClientCoordinates,
    last: IClientCoordinates,
    offset: IClientCoordinates
  ): ICoordinateData = {
    val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoordinateData]
  }
  @scala.inline
  implicit class ICoordinateDataOps[Self <: ICoordinateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivation(value: IClientCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: IClientCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelta(value: IClientCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast(value: IClientCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: IClientCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

