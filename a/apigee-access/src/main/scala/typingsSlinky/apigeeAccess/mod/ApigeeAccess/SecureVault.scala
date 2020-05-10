package typingsSlinky.apigeeAccess.mod.ApigeeAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureVault extends js.Object {
  def get(key: String, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
  def getKeys(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
}

object SecureVault {
  @scala.inline
  def apply(
    get: (String, js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]) => Unit,
    getKeys: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit] => Unit
  ): SecureVault = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), getKeys = js.Any.fromFunction1(getKeys))
    __obj.asInstanceOf[SecureVault]
  }
  @scala.inline
  implicit class SecureVaultOps[Self <: SecureVault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (String, js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetKeys(value: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeys")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

