package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonEndpoint contains information about a single Daemon endpoint.
  */
@js.native
trait DaemonEndpoint extends js.Object {
  /**
    * Port number of the given endpoint.
    */
  val Port: Double = js.native
}

object DaemonEndpoint {
  @scala.inline
  def apply(Port: Double): DaemonEndpoint = {
    val __obj = js.Dynamic.literal(Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonEndpoint]
  }
  @scala.inline
  implicit class DaemonEndpointOps[Self <: DaemonEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

