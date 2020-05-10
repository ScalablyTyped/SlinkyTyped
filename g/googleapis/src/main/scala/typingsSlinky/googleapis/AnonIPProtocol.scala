package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIPProtocol extends js.Object {
  var IPProtocol: js.UndefOr[String] = js.native
  var ports: js.UndefOr[js.Array[String]] = js.native
}

object AnonIPProtocol {
  @scala.inline
  def apply(): AnonIPProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIPProtocol]
  }
  @scala.inline
  implicit class AnonIPProtocolOps[Self <: AnonIPProtocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIPProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
  }
  
}

