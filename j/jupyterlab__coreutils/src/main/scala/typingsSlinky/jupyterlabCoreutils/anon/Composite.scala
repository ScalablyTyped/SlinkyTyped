package typingsSlinky.jupyterlabCoreutils.anon

import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Composite extends js.Object {
  var composite: JSONValue = js.native
  var user: JSONValue = js.native
}

object Composite {
  @scala.inline
  def apply(): Composite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Composite]
  }
  @scala.inline
  implicit class CompositeOps[Self <: Composite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposite(value: JSONValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompositeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(null)
        ret
    }
    @scala.inline
    def withUser(value: JSONValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(null)
        ret
    }
  }
  
}

