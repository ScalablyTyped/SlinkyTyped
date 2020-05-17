package typingsSlinky.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blocksize extends js.Object {
  /**
  			 * Blocksize for pixelate
  			 * @default 4
  			 */
  var blocksize: js.UndefOr[Double] = js.native
}

object Blocksize {
  @scala.inline
  def apply(): Blocksize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blocksize]
  }
  @scala.inline
  implicit class BlocksizeOps[Self <: Blocksize] (val x: Self) extends AnyVal {
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

