package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFeature extends js.Object {
  var feature: js.Array[_] = js.native
  var trafficMode: String = js.native
  var transportModes: js.Array[String] = js.native
  var `type`: String = js.native
}

object AnonFeature {
  @scala.inline
  def apply(feature: js.Array[_], trafficMode: String, transportModes: js.Array[String], `type`: String): AnonFeature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], trafficMode = trafficMode.asInstanceOf[js.Any], transportModes = transportModes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeature]
  }
  @scala.inline
  implicit class AnonFeatureOps[Self <: AnonFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeature(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportModes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportModes")(value.asInstanceOf[js.Any])
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

