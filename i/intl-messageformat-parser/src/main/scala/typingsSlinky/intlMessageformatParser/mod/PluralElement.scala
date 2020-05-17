package typingsSlinky.intlMessageformatParser.mod

import typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.cardinal
import typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.ordinal
import typingsSlinky.intlMessageformatParser.mod.TYPE.plural
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralElement
  extends BaseElement[plural]
     with MessageFormatElement {
  var offset: Double = js.native
  var options: Record[ValidPluralRule, PluralOrSelectOption] = js.native
  var pluralType: js.UndefOr[cardinal | ordinal] = js.native
}

object PluralElement {
  @scala.inline
  def apply(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String
  ): PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralElement]
  }
  @scala.inline
  implicit class PluralElementOps[Self <: PluralElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Record[ValidPluralRule, PluralOrSelectOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluralType(value: cardinal | ordinal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluralType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralType")(js.undefined)
        ret
    }
  }
  
}

