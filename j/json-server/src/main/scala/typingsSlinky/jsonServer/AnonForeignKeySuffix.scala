package typingsSlinky.jsonServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForeignKeySuffix extends js.Object {
  var foreignKeySuffix: String = js.native
}

object AnonForeignKeySuffix {
  @scala.inline
  def apply(foreignKeySuffix: String): AnonForeignKeySuffix = {
    val __obj = js.Dynamic.literal(foreignKeySuffix = foreignKeySuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForeignKeySuffix]
  }
  @scala.inline
  implicit class AnonForeignKeySuffixOps[Self <: AnonForeignKeySuffix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForeignKeySuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeySuffix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

