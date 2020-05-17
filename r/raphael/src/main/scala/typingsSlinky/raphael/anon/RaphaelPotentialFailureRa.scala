package typingsSlinky.raphael.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined raphael.raphael.RaphaelPotentialFailure<raphael.raphael.RaphaelFullComponentInfo> */
@js.native
trait RaphaelPotentialFailureRa extends js.Object {
  /** The RGB blue channel */
  /**
    * The HSB brightness channel.
    */
  var b: Double = js.native
  /**
    * If present and set to `1`, indicates that the operation that produced this result failed. Other fields
    * properties in this object may not be valid.
    */
  var error: js.UndefOr[Double] = js.native
  /** The RGB green channel */
  var g: Double = js.native
  /**
    * The HSB or HSL hue channel.
    */
  var h: Double = js.native
  /** Hex string of the color, in the format `#XXXXXX`. */
  var hex: String = js.native
  /**
    * The HSL luminosity channel.
    */
  var l: Double = js.native
  /** The RGB red channel */
  var r: Double = js.native
  /**
    * The HSB or HSL saturation channel.
    */
  var s: Double = js.native
}

object RaphaelPotentialFailureRa {
  @scala.inline
  def apply(b: Double, g: Double, h: Double, hex: String, l: Double, r: Double, s: Double): RaphaelPotentialFailureRa = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelPotentialFailureRa]
  }
  @scala.inline
  implicit class RaphaelPotentialFailureRaOps[Self <: RaphaelPotentialFailureRa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

