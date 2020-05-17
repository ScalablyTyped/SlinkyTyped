package typingsSlinky.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipArtType extends js.Object {
  var clipArtType: Double = js.native
  var lineDrawingType: Double = js.native
}

object ClipArtType {
  @scala.inline
  def apply(clipArtType: Double, lineDrawingType: Double): ClipArtType = {
    val __obj = js.Dynamic.literal(clipArtType = clipArtType.asInstanceOf[js.Any], lineDrawingType = lineDrawingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipArtType]
  }
  @scala.inline
  implicit class ClipArtTypeOps[Self <: ClipArtType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipArtType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipArtType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineDrawingType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDrawingType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

