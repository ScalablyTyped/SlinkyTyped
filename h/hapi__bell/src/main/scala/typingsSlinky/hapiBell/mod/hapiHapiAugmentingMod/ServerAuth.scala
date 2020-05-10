package typingsSlinky.hapiBell.mod.hapiHapiAugmentingMod

import typingsSlinky.hapiBell.hapiBellStrings.bell
import typingsSlinky.hapiBell.mod.BellOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_bell(name: String, scheme: bell, options: BellOptions): Unit = js.native
}

object ServerAuth {
  @scala.inline
  def apply(strategy: (String, bell, BellOptions) => Unit): ServerAuth = {
    val __obj = js.Dynamic.literal(strategy = js.Any.fromFunction3(strategy))
    __obj.asInstanceOf[ServerAuth]
  }
  @scala.inline
  implicit class ServerAuthOps[Self <: ServerAuth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStrategy(value: (String, bell, BellOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

