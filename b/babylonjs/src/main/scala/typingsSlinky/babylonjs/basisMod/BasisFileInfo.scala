package typingsSlinky.babylonjs.basisMod

import typingsSlinky.babylonjs.AnonLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info about the .basis files
  */
@js.native
trait BasisFileInfo extends js.Object {
  /**
    * If the file has alpha
    */
  var hasAlpha: Boolean = js.native
  /**
    * Info about each image of the basis file
    */
  var images: js.Array[AnonLevels] = js.native
}

object BasisFileInfo {
  @scala.inline
  def apply(hasAlpha: Boolean, images: js.Array[AnonLevels]): BasisFileInfo = {
    val __obj = js.Dynamic.literal(hasAlpha = hasAlpha.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasisFileInfo]
  }
  @scala.inline
  implicit class BasisFileInfoOps[Self <: BasisFileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[AnonLevels]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

