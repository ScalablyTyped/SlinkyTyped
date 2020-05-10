package typingsSlinky.otplib

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotpOptionsInterface extends HmacOptions {
  var createHmacSecret: js.UndefOr[typingsSlinky.otplib.createHmacSecret] = js.native
  var crypto: js.UndefOr[js.Any] = js.native
  var digits: js.UndefOr[Double] = js.native
}

object HotpOptionsInterface {
  @scala.inline
  def apply(): HotpOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotpOptionsInterface]
  }
  @scala.inline
  implicit class HotpOptionsInterfaceOps[Self <: HotpOptionsInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateHmacSecret(value: (/* secret */ String, /* options */ HmacOptions) => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHmacSecret")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreateHmacSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHmacSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withCrypto(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrypto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto")(js.undefined)
        ret
    }
    @scala.inline
    def withDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(js.undefined)
        ret
    }
  }
  
}

