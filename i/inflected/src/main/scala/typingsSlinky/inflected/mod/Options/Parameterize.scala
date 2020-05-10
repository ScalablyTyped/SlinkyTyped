package typingsSlinky.inflected.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameterize extends js.Object {
  var separator: String = js.native
}

object Parameterize {
  @scala.inline
  def apply(separator: String): Parameterize = {
    val __obj = js.Dynamic.literal(separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameterize]
  }
  @scala.inline
  implicit class ParameterizeOps[Self <: Parameterize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

