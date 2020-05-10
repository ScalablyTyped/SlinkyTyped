package typingsSlinky.materialTabIndicator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCONTENTSELECTOR extends js.Object {
  var CONTENT_SELECTOR: String = js.native
}

object AnonCONTENTSELECTOR {
  @scala.inline
  def apply(CONTENT_SELECTOR: String): AnonCONTENTSELECTOR = {
    val __obj = js.Dynamic.literal(CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCONTENTSELECTOR]
  }
  @scala.inline
  implicit class AnonCONTENTSELECTOROps[Self <: AnonCONTENTSELECTOR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCONTENT_SELECTOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

