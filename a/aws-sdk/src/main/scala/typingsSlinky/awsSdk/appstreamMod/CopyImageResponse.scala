package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyImageResponse extends js.Object {
  /**
    * The name of the destination image.
    */
  var DestinationImageName: js.UndefOr[Name] = js.native
}

object CopyImageResponse {
  @scala.inline
  def apply(): CopyImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyImageResponse]
  }
  @scala.inline
  implicit class CopyImageResponseOps[Self <: CopyImageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationImageName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationImageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationImageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationImageName")(js.undefined)
        ret
    }
  }
  
}

