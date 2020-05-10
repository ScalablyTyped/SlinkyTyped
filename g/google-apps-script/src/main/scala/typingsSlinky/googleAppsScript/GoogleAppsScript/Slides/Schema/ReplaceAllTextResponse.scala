package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceAllTextResponse extends js.Object {
  var occurrencesChanged: js.UndefOr[Double] = js.native
}

object ReplaceAllTextResponse {
  @scala.inline
  def apply(): ReplaceAllTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllTextResponse]
  }
  @scala.inline
  implicit class ReplaceAllTextResponseOps[Self <: ReplaceAllTextResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOccurrencesChanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencesChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrencesChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencesChanged")(js.undefined)
        ret
    }
  }
  
}

