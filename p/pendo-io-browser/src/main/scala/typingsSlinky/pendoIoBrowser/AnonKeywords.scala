package typingsSlinky.pendoIoBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeywords extends js.Object {
  var keywords: js.Array[String] = js.native
}

object AnonKeywords {
  @scala.inline
  def apply(keywords: js.Array[String]): AnonKeywords = {
    val __obj = js.Dynamic.literal(keywords = keywords.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeywords]
  }
  @scala.inline
  implicit class AnonKeywordsOps[Self <: AnonKeywords] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

