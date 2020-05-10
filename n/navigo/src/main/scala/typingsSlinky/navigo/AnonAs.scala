package typingsSlinky.navigo

import typingsSlinky.navigo.mod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAs extends js.Object {
  var as: String = js.native
  def uses(params: Params, query: String): Unit = js.native
}

object AnonAs {
  @scala.inline
  def apply(as: String, uses: (Params, String) => Unit): AnonAs = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], uses = js.Any.fromFunction2(uses))
    __obj.asInstanceOf[AnonAs]
  }
  @scala.inline
  implicit class AnonAsOps[Self <: AnonAs] (val x: Self) extends AnyVal {
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

