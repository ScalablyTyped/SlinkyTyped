package typingsSlinky.reactTextMask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndexesOfPipedChars extends js.Object {
  var indexesOfPipedChars: js.Array[Double] = js.native
  var value: String = js.native
}

object AnonIndexesOfPipedChars {
  @scala.inline
  def apply(indexesOfPipedChars: js.Array[Double], value: String): AnonIndexesOfPipedChars = {
    val __obj = js.Dynamic.literal(indexesOfPipedChars = indexesOfPipedChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndexesOfPipedChars]
  }
  @scala.inline
  implicit class AnonIndexesOfPipedCharsOps[Self <: AnonIndexesOfPipedChars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexesOfPipedChars(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexesOfPipedChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

