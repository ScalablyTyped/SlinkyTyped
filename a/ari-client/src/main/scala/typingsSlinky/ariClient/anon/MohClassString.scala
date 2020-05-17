package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MohClassString extends js.Object {
  var mohClass: js.UndefOr[String] = js.native
}

object MohClassString {
  @scala.inline
  def apply(): MohClassString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MohClassString]
  }
  @scala.inline
  implicit class MohClassStringOps[Self <: MohClassString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMohClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mohClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMohClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mohClass")(js.undefined)
        ret
    }
  }
  
}

