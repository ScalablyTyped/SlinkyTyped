package typingsSlinky.awsSdkMiddlewareEc2Copysnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopySnapshotInput extends js.Object {
  var DestinationRegion: js.UndefOr[String] = js.native
  var PresignedUrl: js.UndefOr[String] = js.native
  var SourceRegion: String = js.native
}

object CopySnapshotInput {
  @scala.inline
  def apply(SourceRegion: String): CopySnapshotInput = {
    val __obj = js.Dynamic.literal(SourceRegion = SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopySnapshotInput]
  }
  @scala.inline
  implicit class CopySnapshotInputOps[Self <: CopySnapshotInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withPresignedUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresignedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresignedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresignedUrl")(js.undefined)
        ret
    }
  }
  
}

