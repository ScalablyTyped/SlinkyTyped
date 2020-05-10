package typingsSlinky.awsSdk.s3Mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordsEvent extends js.Object {
  /**
    * The byte array of partial, one or more result records.
    */
  var Payload: js.UndefOr[Buffer] = js.native
}

object RecordsEvent {
  @scala.inline
  def apply(): RecordsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordsEvent]
  }
  @scala.inline
  implicit class RecordsEventOps[Self <: RecordsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(js.undefined)
        ret
    }
  }
  
}

