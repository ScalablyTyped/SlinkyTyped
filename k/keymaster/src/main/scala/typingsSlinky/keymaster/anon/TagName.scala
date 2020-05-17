package typingsSlinky.keymaster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagName extends js.Object {
  var tagName: js.UndefOr[String] = js.native
}

object TagName {
  @scala.inline
  def apply(): TagName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagName]
  }
  @scala.inline
  implicit class TagNameOps[Self <: TagName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
  }
  
}

