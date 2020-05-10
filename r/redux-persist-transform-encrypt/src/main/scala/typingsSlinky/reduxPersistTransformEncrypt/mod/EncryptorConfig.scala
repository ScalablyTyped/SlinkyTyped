package typingsSlinky.reduxPersistTransformEncrypt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptorConfig extends js.Object {
  var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
  var secretKey: String = js.native
}

object EncryptorConfig {
  @scala.inline
  def apply(secretKey: String): EncryptorConfig = {
    val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptorConfig]
  }
  @scala.inline
  implicit class EncryptorConfigOps[Self <: EncryptorConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecretKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnError(value: /* err */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
  }
  
}

