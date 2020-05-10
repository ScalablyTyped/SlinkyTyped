package typingsSlinky.ebml.mod

import typingsSlinky.ebml.ebmlStrings.b
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleBlock extends Block {
  /** the value of the element's Discardable flag */
  var discarable: Boolean = js.native
  /** set to `true` if the payload starts an I frame */
  var keyframe: Boolean = js.native
}

object SimpleBlock {
  @scala.inline
  def apply(
    data: Buffer,
    dataSize: Double,
    discarable: Boolean,
    end: Double,
    keyframe: Boolean,
    name: String,
    payload: Buffer,
    start: Double,
    tag: Double,
    tagStr: String,
    track: Double,
    `type`: b,
    value: Double
  ): SimpleBlock = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], discarable = discarable.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], keyframe = keyframe.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagStr = tagStr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleBlock]
  }
  @scala.inline
  implicit class SimpleBlockOps[Self <: SimpleBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscarable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discarable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyframe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframe")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

