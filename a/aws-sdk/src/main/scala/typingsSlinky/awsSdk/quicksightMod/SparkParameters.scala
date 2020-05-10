package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkParameters extends js.Object {
  /**
    * Host.
    */
  var Host: typingsSlinky.awsSdk.quicksightMod.Host = js.native
  /**
    * Port.
    */
  var Port: typingsSlinky.awsSdk.quicksightMod.Port = js.native
}

object SparkParameters {
  @scala.inline
  def apply(Host: Host, Port: Port): SparkParameters = {
    val __obj = js.Dynamic.literal(Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkParameters]
  }
  @scala.inline
  implicit class SparkParametersOps[Self <: SparkParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: Host): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Port): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

