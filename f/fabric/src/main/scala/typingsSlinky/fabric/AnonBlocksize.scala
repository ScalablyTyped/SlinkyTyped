package typingsSlinky.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlocksize extends js.Object {
  /**
  			 * Blocksize for pixelate
  			 * @default 4
  			 */
  var blocksize: js.UndefOr[Double] = js.native
}

object AnonBlocksize {
  @scala.inline
  def apply(): AnonBlocksize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBlocksize]
  }
  @scala.inline
  implicit class AnonBlocksizeOps[Self <: AnonBlocksize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocksize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocksize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksize")(js.undefined)
        ret
    }
  }
  
}

