package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsStrings.basic
import typingsSlinky.dateFns.dateFnsStrings.complete
import typingsSlinky.dateFns.dateFnsStrings.date
import typingsSlinky.dateFns.dateFnsStrings.extended
import typingsSlinky.dateFns.dateFnsStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var format: js.UndefOr[extended | basic] = js.native
  var representation: js.UndefOr[complete | date | time] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: extended | basic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withRepresentation(value: complete | date | time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("representation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepresentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("representation")(js.undefined)
        ret
    }
  }
  
}

