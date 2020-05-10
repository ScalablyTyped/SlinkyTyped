package typingsSlinky.hlsJs.mod

import typingsSlinky.std.SourceBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioTrack extends js.Object {
  var buffer: SourceBuffer = js.native
  var codec: String = js.native
  var container: String = js.native
  var id: String = js.native
  var initSegment: js.UndefOr[js.typedarray.Uint8Array] = js.native
  var levelCodec: String = js.native
}

object AudioTrack {
  @scala.inline
  def apply(buffer: SourceBuffer, codec: String, container: String, id: String, levelCodec: String): AudioTrack = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], levelCodec = levelCodec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrack]
  }
  @scala.inline
  implicit class AudioTrackOps[Self <: AudioTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: SourceBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevelCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelCodec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitSegment(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSegment")(js.undefined)
        ret
    }
  }
  
}

