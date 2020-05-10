package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectObjectContentOutput extends js.Object {
  /**
    * The array of results.
    */
  var Payload: js.UndefOr[SelectObjectContentEventStream] = js.native
}

object SelectObjectContentOutput {
  @scala.inline
  def apply(): SelectObjectContentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectObjectContentOutput]
  }
  @scala.inline
  implicit class SelectObjectContentOutputOps[Self <: SelectObjectContentOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: SelectObjectContentEventStream): Self = {
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

