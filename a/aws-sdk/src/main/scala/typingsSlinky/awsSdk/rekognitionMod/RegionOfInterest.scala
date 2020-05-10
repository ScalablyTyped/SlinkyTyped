package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionOfInterest extends js.Object {
  /**
    * The box representing a region of interest on screen.
    */
  var BoundingBox: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.BoundingBox] = js.native
}

object RegionOfInterest {
  @scala.inline
  def apply(): RegionOfInterest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionOfInterest]
  }
  @scala.inline
  implicit class RegionOfInterestOps[Self <: RegionOfInterest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingBox(value: BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BoundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BoundingBox")(js.undefined)
        ret
    }
  }
  
}

