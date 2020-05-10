package typingsSlinky.materialTabScroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAREASELECTOR extends js.Object {
  var AREA_SELECTOR: String = js.native
  var CONTENT_SELECTOR: String = js.native
}

object AnonAREASELECTOR {
  @scala.inline
  def apply(AREA_SELECTOR: String, CONTENT_SELECTOR: String): AnonAREASELECTOR = {
    val __obj = js.Dynamic.literal(AREA_SELECTOR = AREA_SELECTOR.asInstanceOf[js.Any], CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAREASELECTOR]
  }
  @scala.inline
  implicit class AnonAREASELECTOROps[Self <: AnonAREASELECTOR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAREA_SELECTOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AREA_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCONTENT_SELECTOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

