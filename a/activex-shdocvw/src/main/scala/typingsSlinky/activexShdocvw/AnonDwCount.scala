package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDwCount extends js.Object {
  val URL: js.Any = js.native
  val dwCount: Double = js.native
}

object AnonDwCount {
  @scala.inline
  def apply(URL: js.Any, dwCount: Double): AnonDwCount = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], dwCount = dwCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDwCount]
  }
  @scala.inline
  implicit class AnonDwCountOps[Self <: AnonDwCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURL(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDwCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

