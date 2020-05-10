package typingsSlinky.saml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyInfoProvider extends js.Object {
  def getKeyInfo(key: String, prefix: String): String = js.native
}

object KeyInfoProvider {
  @scala.inline
  def apply(getKeyInfo: (String, String) => String): KeyInfoProvider = {
    val __obj = js.Dynamic.literal(getKeyInfo = js.Any.fromFunction2(getKeyInfo))
    __obj.asInstanceOf[KeyInfoProvider]
  }
  @scala.inline
  implicit class KeyInfoProviderOps[Self <: KeyInfoProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetKeyInfo(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeyInfo")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

