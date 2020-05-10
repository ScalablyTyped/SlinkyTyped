package typingsSlinky.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
@js.native
trait RoutingOptions extends js.Object {
  var allowUTurns: Boolean = js.native
  var fileFormat: String = js.native
  var geometryOnly: Boolean = js.native
  var simplifyGeometry: Boolean = js.native
  var z: Double = js.native
}

object RoutingOptions {
  @scala.inline
  def apply(
    allowUTurns: Boolean,
    fileFormat: String,
    geometryOnly: Boolean,
    simplifyGeometry: Boolean,
    z: Double
  ): RoutingOptions = {
    val __obj = js.Dynamic.literal(allowUTurns = allowUTurns.asInstanceOf[js.Any], fileFormat = fileFormat.asInstanceOf[js.Any], geometryOnly = geometryOnly.asInstanceOf[js.Any], simplifyGeometry = simplifyGeometry.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingOptions]
  }
  @scala.inline
  implicit class RoutingOptionsOps[Self <: RoutingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUTurns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUTurns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometryOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimplifyGeometry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplifyGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

