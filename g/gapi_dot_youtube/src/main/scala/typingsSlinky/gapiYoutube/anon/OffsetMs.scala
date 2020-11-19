package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetMs extends js.Object {
  
  /**
    * The time offset, specified in milliseconds, that determines when the promoted item appears during video playbacks. The type propertys value determines whether the offset is measured from the start or end of the video.
    */
  var offsetMs: Double = js.native
  
  /**
    * The timing method that determines when the promoted item is inserted during the video playback. If the value is offsetFromStart, then the offsetMs field represents an offset from the start of the video. If the value is offsetFromEnd, then the offsetMs field represents an offset from the end of the video.
    */
  var `type`: String = js.native
}
object OffsetMs {
  
  @scala.inline
  def apply(offsetMs: Double, `type`: String): OffsetMs = {
    val __obj = js.Dynamic.literal(offsetMs = offsetMs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetMs]
  }
  
  @scala.inline
  implicit class OffsetMsOps[Self <: OffsetMs] (val x: Self) extends AnyVal {
    
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
    def setOffsetMs(value: Double): Self = this.set("offsetMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
