package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongosOptions
  extends SSLOptions
     with HighAvailabilityOptions {
  /**
    * Default: 15; Cutoff latency point in MS for MongoS proxy selection
    */
  var acceptableLatencyMS: js.UndefOr[scala.Double] = js.native
  /**
    * Socket Options
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.native
}

object MongosOptions {
  @scala.inline
  def apply(): MongosOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongosOptions]
  }
  @scala.inline
  implicit class MongosOptionsOps[Self <: MongosOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptableLatencyMS(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptableLatencyMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptableLatencyMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptableLatencyMS")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketOptions(value: SocketOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketOptions")(js.undefined)
        ret
    }
  }
  
}

