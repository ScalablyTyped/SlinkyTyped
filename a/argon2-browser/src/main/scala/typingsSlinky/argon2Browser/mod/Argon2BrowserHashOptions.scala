package typingsSlinky.argon2Browser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Argon2BrowserHashOptions extends js.Object {
  var distPath: js.UndefOr[String] = js.native
  var hashLen: js.UndefOr[Double] = js.native
  var mem: js.UndefOr[Double] = js.native
  var parallelism: js.UndefOr[Double] = js.native
  var pass: String | js.typedarray.Uint8Array = js.native
  var salt: String | js.typedarray.Uint8Array = js.native
  var time: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[ArgonType] = js.native
}

object Argon2BrowserHashOptions {
  @scala.inline
  def apply(pass: String | js.typedarray.Uint8Array, salt: String | js.typedarray.Uint8Array): Argon2BrowserHashOptions = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argon2BrowserHashOptions]
  }
  @scala.inline
  implicit class Argon2BrowserHashOptionsOps[Self <: Argon2BrowserHashOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPass(value: String | js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaltUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSalt(value: String | js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distPath")(js.undefined)
        ret
    }
    @scala.inline
    def withHashLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashLen")(js.undefined)
        ret
    }
    @scala.inline
    def withMem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mem")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelism(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelism")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ArgonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

