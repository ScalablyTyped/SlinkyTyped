package typingsSlinky.nes.mod

import typingsSlinky.nes.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NesClassExports extends js.Object {
  var Client: AnonInstantiable = js.native
}

object NesClassExports {
  @scala.inline
  def apply(Client: AnonInstantiable): NesClassExports = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
    __obj.asInstanceOf[NesClassExports]
  }
  @scala.inline
  implicit class NesClassExportsOps[Self <: NesClassExports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: AnonInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

