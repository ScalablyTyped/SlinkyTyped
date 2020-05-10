package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMultiplexResponse extends js.Object {
  /**
    * The newly created multiplex.
    */
  var Multiplex: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Multiplex] = js.native
}

object CreateMultiplexResponse {
  @scala.inline
  def apply(): CreateMultiplexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMultiplexResponse]
  }
  @scala.inline
  implicit class CreateMultiplexResponseOps[Self <: CreateMultiplexResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiplex(value: Multiplex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Multiplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Multiplex")(js.undefined)
        ret
    }
  }
  
}

