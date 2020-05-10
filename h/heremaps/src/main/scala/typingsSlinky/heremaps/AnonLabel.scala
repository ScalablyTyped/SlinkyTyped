package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabel extends js.Object {
  var label: String = js.native
  var linkId: String = js.native
  var mappedPosition: AnonLatitude = js.native
  var mappedRoadName: String = js.native
  var originalPosition: AnonLatitude = js.native
  var shapeIndex: Double = js.native
  var sideOfStreet: String = js.native
  var spot: Double = js.native
  var `type`: String = js.native
}

object AnonLabel {
  @scala.inline
  def apply(
    label: String,
    linkId: String,
    mappedPosition: AnonLatitude,
    mappedRoadName: String,
    originalPosition: AnonLatitude,
    shapeIndex: Double,
    sideOfStreet: String,
    spot: Double,
    `type`: String
  ): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], linkId = linkId.asInstanceOf[js.Any], mappedPosition = mappedPosition.asInstanceOf[js.Any], mappedRoadName = mappedRoadName.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], shapeIndex = shapeIndex.asInstanceOf[js.Any], sideOfStreet = sideOfStreet.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
  @scala.inline
  implicit class AnonLabelOps[Self <: AnonLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMappedPosition(value: AnonLatitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappedPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMappedRoadName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappedRoadName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalPosition(value: AnonLatitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSideOfStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideOfStreet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpot(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

