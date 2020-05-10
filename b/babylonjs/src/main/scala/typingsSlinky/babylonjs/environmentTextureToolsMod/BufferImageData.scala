package typingsSlinky.babylonjs.environmentTextureToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines One Image in the file. It requires only the position in the file
  * as well as the length.
  */
@js.native
trait BufferImageData extends js.Object {
  /**
    * Length of the image data.
    */
  var length: Double = js.native
  /**
    * Position of the data from the null terminator delimiting the end of the JSON.
    */
  var position: Double = js.native
}

object BufferImageData {
  @scala.inline
  def apply(length: Double, position: Double): BufferImageData = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferImageData]
  }
  @scala.inline
  implicit class BufferImageDataOps[Self <: BufferImageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

