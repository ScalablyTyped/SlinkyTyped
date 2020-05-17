package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotFoundContent extends js.Object {
  var notFoundContent: String = js.native
}

object NotFoundContent {
  @scala.inline
  def apply(notFoundContent: String): NotFoundContent = {
    val __obj = js.Dynamic.literal(notFoundContent = notFoundContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotFoundContent]
  }
  @scala.inline
  implicit class NotFoundContentOps[Self <: NotFoundContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotFoundContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

