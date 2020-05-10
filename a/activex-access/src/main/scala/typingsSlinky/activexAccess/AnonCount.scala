package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCount extends js.Object {
  val Count: Double = js.native
  val Page: Boolean = js.native
}

object AnonCount {
  @scala.inline
  def apply(Count: Double, Page: Boolean): AnonCount = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Page = Page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
  @scala.inline
  implicit class AnonCountOps[Self <: AnonCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Page")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

