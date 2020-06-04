package typingsSlinky.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentCreationData extends js.Object {
  var format: js.UndefOr[MomentFormatSpecification] = js.undefined
  var input: MomentInput
  var isUTC: Boolean
  var locale: Locale_
  var strict: js.UndefOr[Boolean] = js.undefined
}

object MomentCreationData {
  @scala.inline
  def apply(input: MomentInput, isUTC: Boolean, locale: Locale_): MomentCreationData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], isUTC = isUTC.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentCreationData]
  }
  @scala.inline
  implicit class MomentCreationDataOps[Self <: MomentCreationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInputDate(value: js.Date): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: MomentInput): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsUTC(value: Boolean): Self = this.set("isUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale_): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: MomentFormatSpecification): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

