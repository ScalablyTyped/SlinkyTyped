package typingsSlinky.ebml.mod

import typingsSlinky.ebml.ebmlStrings.b
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDiscarable(value: Boolean): Self = this.set("discarable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyframe(value: Boolean): Self = this.set("keyframe", value.asInstanceOf[js.Any])
  }
}
