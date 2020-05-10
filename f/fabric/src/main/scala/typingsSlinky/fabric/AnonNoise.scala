package typingsSlinky.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNoise extends js.Object {
  /** @default 0 */
  var noise: Double = js.native
}

object AnonNoise {
  @scala.inline
  def apply(noise: Double): AnonNoise = {
    val __obj = js.Dynamic.literal(noise = noise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoise]
  }
  @scala.inline
  implicit class AnonNoiseOps[Self <: AnonNoise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoise(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

