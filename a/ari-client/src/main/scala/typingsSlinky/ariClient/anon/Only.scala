package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Only extends js.Object {
  var only: js.UndefOr[String | js.Array[String]] = js.native
}

object Only {
  @scala.inline
  def apply(): Only = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Only]
  }
  @scala.inline
  implicit class OnlyOps[Self <: Only] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnly(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
  }
  
}

