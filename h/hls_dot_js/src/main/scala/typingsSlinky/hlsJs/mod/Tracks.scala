package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracks extends js.Object {
  var codec: String = js.native
  var container: js.Any = js.native
  var initSegment: js.Any = js.native
  var levelCodec: js.Any = js.native
  var metadata: js.Any = js.native
}

object Tracks {
  @scala.inline
  def apply(codec: String, container: js.Any, initSegment: js.Any, levelCodec: js.Any, metadata: js.Any): Tracks = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], initSegment = initSegment.asInstanceOf[js.Any], levelCodec = levelCodec.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracks]
  }
  @scala.inline
  implicit class TracksOps[Self <: Tracks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitSegment(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevelCodec(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelCodec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

