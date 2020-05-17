package typingsSlinky.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defaults extends js.Object {
  def defaults(options: PartialServerOptions): Unit = js.native
}

object Defaults {
  @scala.inline
  def apply(defaults: PartialServerOptions => Unit): Defaults = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[Defaults]
  }
  @scala.inline
  implicit class DefaultsOps[Self <: Defaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: PartialServerOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

