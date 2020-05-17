package typingsSlinky.nodemailer.anon

import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flatten extends js.Object {
  var flatten: `true` = js.native
}

object Flatten {
  @scala.inline
  def apply(flatten: `true`): Flatten = {
    val __obj = js.Dynamic.literal(flatten = flatten.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flatten]
  }
  @scala.inline
  implicit class FlattenOps[Self <: Flatten] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlatten(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

