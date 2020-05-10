package typingsSlinky.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArcFourVariant extends js.Object {
  var ArcFourVariant: Double = js.native
  var ChaCha20: Double = js.native
  var Null: Double = js.native
  var Salsa20: Double = js.native
}

object AnonArcFourVariant {
  @scala.inline
  def apply(ArcFourVariant: Double, ChaCha20: Double, Null: Double, Salsa20: Double): AnonArcFourVariant = {
    val __obj = js.Dynamic.literal(ArcFourVariant = ArcFourVariant.asInstanceOf[js.Any], ChaCha20 = ChaCha20.asInstanceOf[js.Any], Null = Null.asInstanceOf[js.Any], Salsa20 = Salsa20.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArcFourVariant]
  }
  @scala.inline
  implicit class AnonArcFourVariantOps[Self <: AnonArcFourVariant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArcFourVariant(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArcFourVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChaCha20(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChaCha20")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNull(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Null")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSalsa20(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Salsa20")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

