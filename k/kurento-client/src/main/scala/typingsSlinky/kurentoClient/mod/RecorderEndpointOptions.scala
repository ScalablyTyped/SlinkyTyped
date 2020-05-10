package typingsSlinky.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderEndpointOptions extends js.Object {
  var stopOnEndOfStream: js.UndefOr[Boolean] = js.native
  var uri: String = js.native
}

object RecorderEndpointOptions {
  @scala.inline
  def apply(uri: String): RecorderEndpointOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderEndpointOptions]
  }
  @scala.inline
  implicit class RecorderEndpointOptionsOps[Self <: RecorderEndpointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopOnEndOfStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnEndOfStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnEndOfStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnEndOfStream")(js.undefined)
        ret
    }
  }
  
}

