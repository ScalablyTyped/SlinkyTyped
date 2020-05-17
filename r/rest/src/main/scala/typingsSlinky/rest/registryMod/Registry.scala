package typingsSlinky.rest.registryMod

import typingsSlinky.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Registry extends js.Object {
  def lookup(mimeType: String): Promise[MIMEConverter] = js.native
  def register(mimeType: String, converter: MIMEConverter): Unit = js.native
}

object Registry {
  @scala.inline
  def apply(lookup: String => Promise[MIMEConverter], register: (String, MIMEConverter) => Unit): Registry = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Registry]
  }
  @scala.inline
  implicit class RegistryOps[Self <: Registry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLookup(value: String => Promise[MIMEConverter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegister(value: (String, MIMEConverter) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

