package typingsSlinky.pendoIoBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keywords extends js.Object {
  var keywords: js.Array[String] = js.native
}

object Keywords {
  @scala.inline
  def apply(keywords: js.Array[String]): Keywords = {
    val __obj = js.Dynamic.literal(keywords = keywords.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keywords]
  }
  @scala.inline
  implicit class KeywordsOps[Self <: Keywords] (val x: Self) extends AnyVal {
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

