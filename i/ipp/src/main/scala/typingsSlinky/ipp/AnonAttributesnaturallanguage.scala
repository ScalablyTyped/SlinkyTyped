package typingsSlinky.ipp

import typingsSlinky.ipp.mod.CharacterSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttributesnaturallanguage extends js.Object {
  var `attributes-charset`: CharacterSet = js.native
  var `attributes-natural-language`: String = js.native
  var `detailed-status-message`: js.UndefOr[String] = js.native
  var `status-message`: js.UndefOr[String] = js.native
}

object AnonAttributesnaturallanguage {
  @scala.inline
  def apply(`attributes-charset`: CharacterSet, `attributes-natural-language`: String): AnonAttributesnaturallanguage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributesnaturallanguage]
  }
  @scala.inline
  implicit class AnonAttributesnaturallanguageOps[Self <: AnonAttributesnaturallanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAttributes-charset`(value: CharacterSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAttributes-natural-language`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-natural-language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDetailed-status-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed-status-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDetailed-status-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed-status-message")(js.undefined)
        ret
    }
    @scala.inline
    def `withStatus-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStatus-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status-message")(js.undefined)
        ret
    }
  }
  
}

