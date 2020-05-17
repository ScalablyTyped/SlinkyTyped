package typingsSlinky.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamId_ extends js.Object {
  var ruploadParams: js.Any = js.native
  var streamId: js.Any = js.native
}

object StreamId_ {
  @scala.inline
  def apply(ruploadParams: js.Any, streamId: js.Any): StreamId_ = {
    val __obj = js.Dynamic.literal(ruploadParams = ruploadParams.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamId_]
  }
  @scala.inline
  implicit class StreamId_Ops[Self <: StreamId_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuploadParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruploadParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

