package typingsSlinky.fingerprintjs.FingerprintJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FingerprintOption extends js.Object {
  /**
    * If you want to use canvas fingerprinting, set true.
    */
  var canvas: js.UndefOr[Boolean] = js.native
  /**
    * If you want to use custom hashing function, set function.
    */
  var hasher: js.UndefOr[js.Function2[/* key */ String, /* seed */ Double, Double]] = js.native
  /**
    * If you want to query the IE plugins info to further diversify the fingerprinting process, set true.
    */
  var ie_activex: js.UndefOr[Boolean] = js.native
  /**
    * If you want to use the screen resolution in calculating the fingerprint, set true.
    */
  var screen_resolution: js.UndefOr[Boolean] = js.native
}

object FingerprintOption {
  @scala.inline
  def apply(): FingerprintOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FingerprintOption]
  }
  @scala.inline
  implicit class FingerprintOptionOps[Self <: FingerprintOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(js.undefined)
        ret
    }
    @scala.inline
    def withHasher(value: (/* key */ String, /* seed */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasher")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHasher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasher")(js.undefined)
        ret
    }
    @scala.inline
    def withIe_activex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie_activex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIe_activex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie_activex")(js.undefined)
        ret
    }
    @scala.inline
    def withScreen_resolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen_resolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_resolution")(js.undefined)
        ret
    }
  }
  
}

