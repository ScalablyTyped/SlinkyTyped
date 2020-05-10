package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordMarkerDecisionAttributes extends js.Object {
  /**
    *  The details of the marker.
    */
  var details: js.UndefOr[Data] = js.native
  /**
    *  The name of the marker.
    */
  var markerName: MarkerName = js.native
}

object RecordMarkerDecisionAttributes {
  @scala.inline
  def apply(markerName: MarkerName): RecordMarkerDecisionAttributes = {
    val __obj = js.Dynamic.literal(markerName = markerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordMarkerDecisionAttributes]
  }
  @scala.inline
  implicit class RecordMarkerDecisionAttributesOps[Self <: RecordMarkerDecisionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkerName(value: MarkerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
  }
  
}

