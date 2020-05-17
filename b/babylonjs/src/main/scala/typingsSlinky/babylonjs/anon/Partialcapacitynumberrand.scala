package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  capacity  :number,   randomTextureSize  :number}> */
@js.native
trait Partialcapacitynumberrand extends js.Object {
  var capacity: js.UndefOr[Double] = js.native
  var randomTextureSize: js.UndefOr[Double] = js.native
}

object Partialcapacitynumberrand {
  @scala.inline
  def apply(): Partialcapacitynumberrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialcapacitynumberrand]
  }
  @scala.inline
  implicit class PartialcapacitynumberrandOps[Self <: Partialcapacitynumberrand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomTextureSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomTextureSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomTextureSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomTextureSize")(js.undefined)
        ret
    }
  }
  
}

