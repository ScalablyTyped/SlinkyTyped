package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionSettings extends js.Object {
  /**
    * The time, in seconds, that the connection is allowed to be idle (no data has been sent over the connection) before it is closed by the load balancer.
    */
  var IdleTimeout: typingsSlinky.awsSdk.elbMod.IdleTimeout = js.native
}

object ConnectionSettings {
  @scala.inline
  def apply(IdleTimeout: IdleTimeout): ConnectionSettings = {
    val __obj = js.Dynamic.literal(IdleTimeout = IdleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionSettings]
  }
  @scala.inline
  implicit class ConnectionSettingsOps[Self <: ConnectionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdleTimeout(value: IdleTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdleTimeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

