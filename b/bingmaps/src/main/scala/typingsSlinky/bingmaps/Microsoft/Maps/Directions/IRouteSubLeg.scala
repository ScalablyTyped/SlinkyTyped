package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import typingsSlinky.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouteSubLeg extends js.Object {
  /** The location of the last waypoint of the sub leg. */
  var actualEnd: Location = js.native
  /** The location of the first waypoint of the sub leg. */
  var actualStart: Location = js.native
  /** The description of the last waypoint of the sub leg. */
  var endDescription: String = js.native
  /** The description of the first waypoint of the sub leg. */
  var startDescription: String = js.native
}

object IRouteSubLeg {
  @scala.inline
  def apply(actualEnd: Location, actualStart: Location, endDescription: String, startDescription: String): IRouteSubLeg = {
    val __obj = js.Dynamic.literal(actualEnd = actualEnd.asInstanceOf[js.Any], actualStart = actualStart.asInstanceOf[js.Any], endDescription = endDescription.asInstanceOf[js.Any], startDescription = startDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteSubLeg]
  }
  @scala.inline
  implicit class IRouteSubLegOps[Self <: IRouteSubLeg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualEnd(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActualStart(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDescription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

