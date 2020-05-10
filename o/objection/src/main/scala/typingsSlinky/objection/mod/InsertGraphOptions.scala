package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertGraphOptions extends js.Object {
  var relate: js.UndefOr[Boolean | js.Array[String]] = js.native
}

object InsertGraphOptions {
  @scala.inline
  def apply(): InsertGraphOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertGraphOptions]
  }
  @scala.inline
  implicit class InsertGraphOptionsOps[Self <: InsertGraphOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelate(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relate")(js.undefined)
        ret
    }
  }
  
}

