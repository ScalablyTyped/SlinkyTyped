package typingsSlinky.knockoutSecureBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutStatic extends js.Object {
  var secureBindingsProvider: AnonInstantiable = js.native
}

object KnockoutStatic {
  @scala.inline
  def apply(secureBindingsProvider: AnonInstantiable): KnockoutStatic = {
    val __obj = js.Dynamic.literal(secureBindingsProvider = secureBindingsProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  @scala.inline
  implicit class KnockoutStaticOps[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecureBindingsProvider(value: AnonInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureBindingsProvider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

