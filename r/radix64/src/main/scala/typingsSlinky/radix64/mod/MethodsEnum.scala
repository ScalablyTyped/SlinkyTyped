package typingsSlinky.radix64.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodsEnum extends js.Object {
  var BASE64: MethodsString = js.native
  var BASE64ASCII: MethodsString = js.native
  var BASE64NATURAL: MethodsString = js.native
  var BASE64URL: MethodsString = js.native
  var DEFAULT: MethodsString = js.native
}

object MethodsEnum {
  @scala.inline
  def apply(
    BASE64: MethodsString,
    BASE64ASCII: MethodsString,
    BASE64NATURAL: MethodsString,
    BASE64URL: MethodsString,
    DEFAULT: MethodsString
  ): MethodsEnum = {
    val __obj = js.Dynamic.literal(BASE64 = BASE64.asInstanceOf[js.Any], BASE64ASCII = BASE64ASCII.asInstanceOf[js.Any], BASE64NATURAL = BASE64NATURAL.asInstanceOf[js.Any], BASE64URL = BASE64URL.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodsEnum]
  }
  @scala.inline
  implicit class MethodsEnumOps[Self <: MethodsEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBASE64(value: MethodsString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBASE64ASCII(value: MethodsString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE64ASCII")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBASE64NATURAL(value: MethodsString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE64NATURAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBASE64URL(value: MethodsString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASE64URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDEFAULT(value: MethodsString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

