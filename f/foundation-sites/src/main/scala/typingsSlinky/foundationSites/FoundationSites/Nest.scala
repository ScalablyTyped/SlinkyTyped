package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nest extends js.Object {
  def Burn(menu: js.Any, `type`: js.Any): Unit = js.native
  def Feather(menu: js.Any, `type`: js.Any): Unit = js.native
}

object Nest {
  @scala.inline
  def apply(Burn: (js.Any, js.Any) => Unit, Feather: (js.Any, js.Any) => Unit): Nest = {
    val __obj = js.Dynamic.literal(Burn = js.Any.fromFunction2(Burn), Feather = js.Any.fromFunction2(Feather))
    __obj.asInstanceOf[Nest]
  }
  @scala.inline
  implicit class NestOps[Self <: Nest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBurn(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Burn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFeather(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Feather")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

