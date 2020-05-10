package typingsSlinky.cordovaPluginNetworkInformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConnection extends js.Object {
  /**
    * This plugin provides an implementation of an old version of the Network Information API.
    * It provides information about the device's cellular and wifi connection, and whether the device has an internet connection.
    */
  var connection: Connection = js.native
}

object AnonConnection {
  @scala.inline
  def apply(connection: Connection): AnonConnection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnection]
  }
  @scala.inline
  implicit class AnonConnectionOps[Self <: AnonConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

