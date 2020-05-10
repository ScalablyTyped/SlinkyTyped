package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNotFoundContent extends js.Object {
  var notFoundContent: String = js.native
}

object AnonNotFoundContent {
  @scala.inline
  def apply(notFoundContent: String): AnonNotFoundContent = {
    val __obj = js.Dynamic.literal(notFoundContent = notFoundContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotFoundContent]
  }
  @scala.inline
  implicit class AnonNotFoundContentOps[Self <: AnonNotFoundContent] (val x: Self) extends AnyVal {
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

