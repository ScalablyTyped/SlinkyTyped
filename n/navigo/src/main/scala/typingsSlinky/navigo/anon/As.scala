package typingsSlinky.navigo.anon

import typingsSlinky.navigo.mod.Params
import typingsSlinky.navigo.mod.RouteHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As extends RouteHandler {
  var as: String = js.native
  def uses(params: Params, query: String): Unit = js.native
}

object As {
  @scala.inline
  def apply(as: String, uses: (Params, String) => Unit): As = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], uses = js.Any.fromFunction2(uses))
    __obj.asInstanceOf[As]
  }
  @scala.inline
  implicit class AsOps[Self <: As] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUses(value: (Params, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uses")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

