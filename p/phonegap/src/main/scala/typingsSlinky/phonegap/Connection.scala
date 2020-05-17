package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var CELL_2G: Double = js.native
  var CELL_3G: Double = js.native
  var CELL_4G: Double = js.native
  var ETHERNET: Double = js.native
  var NONE: Double = js.native
  var UNKNOWN: Double = js.native
  var WIFI: Double = js.native
  var `type`: Double = js.native
}

object Connection {
  @scala.inline
  def apply(
    CELL_2G: Double,
    CELL_3G: Double,
    CELL_4G: Double,
    ETHERNET: Double,
    NONE: Double,
    UNKNOWN: Double,
    WIFI: Double,
    `type`: Double
  ): Connection = {
    val __obj = js.Dynamic.literal(CELL_2G = CELL_2G.asInstanceOf[js.Any], CELL_3G = CELL_3G.asInstanceOf[js.Any], CELL_4G = CELL_4G.asInstanceOf[js.Any], ETHERNET = ETHERNET.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], WIFI = WIFI.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCELL_2G(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CELL_2G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCELL_3G(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CELL_3G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCELL_4G(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CELL_4G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withETHERNET(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETHERNET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNONE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNKNOWN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWIFI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WIFI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

