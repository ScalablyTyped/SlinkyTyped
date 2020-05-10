package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlayerSessionOutput extends js.Object {
  /**
    * Object that describes the newly created player session record.
    */
  var PlayerSession: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.PlayerSession] = js.native
}

object CreatePlayerSessionOutput {
  @scala.inline
  def apply(): CreatePlayerSessionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlayerSessionOutput]
  }
  @scala.inline
  implicit class CreatePlayerSessionOutputOps[Self <: CreatePlayerSessionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlayerSession(value: PlayerSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSession")(js.undefined)
        ret
    }
  }
  
}

