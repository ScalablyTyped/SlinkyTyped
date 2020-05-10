package typingsSlinky.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotationPattern extends js.Object {
  var compactLong: CompactSignPattern = js.native
  var compactShort: CompactSignPattern = js.native
  var scientific: SignPattern = js.native
  var standard: SignPattern = js.native
}

object NotationPattern {
  @scala.inline
  def apply(
    compactLong: CompactSignPattern,
    compactShort: CompactSignPattern,
    scientific: SignPattern,
    standard: SignPattern
  ): NotationPattern = {
    val __obj = js.Dynamic.literal(compactLong = compactLong.asInstanceOf[js.Any], compactShort = compactShort.asInstanceOf[js.Any], scientific = scientific.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotationPattern]
  }
  @scala.inline
  implicit class NotationPatternOps[Self <: NotationPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompactLong(value: CompactSignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompactShort(value: CompactSignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScientific(value: SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scientific")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandard(value: SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

