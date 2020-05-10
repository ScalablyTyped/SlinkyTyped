package typingsSlinky.peerjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeerConnectOption extends js.Object {
  var label: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var reliable: js.UndefOr[Boolean] = js.native
  var serialization: js.UndefOr[String] = js.native
}

object PeerConnectOption {
  @scala.inline
  def apply(): PeerConnectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerConnectOption]
  }
  @scala.inline
  implicit class PeerConnectOptionOps[Self <: PeerConnectOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withReliable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reliable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReliable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reliable")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialization")(js.undefined)
        ret
    }
  }
  
}

