package typingsSlinky.gapiClientCustomsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCorrectedQuery extends js.Object {
  var correctedQuery: js.UndefOr[String] = js.native
  var htmlCorrectedQuery: js.UndefOr[String] = js.native
}

object AnonCorrectedQuery {
  @scala.inline
  def apply(): AnonCorrectedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCorrectedQuery]
  }
  @scala.inline
  implicit class AnonCorrectedQueryOps[Self <: AnonCorrectedQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrectedQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrectedQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctedQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlCorrectedQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlCorrectedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlCorrectedQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlCorrectedQuery")(js.undefined)
        ret
    }
  }
  
}

