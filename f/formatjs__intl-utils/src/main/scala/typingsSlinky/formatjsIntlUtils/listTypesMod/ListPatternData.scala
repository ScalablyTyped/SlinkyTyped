package typingsSlinky.formatjsIntlUtils.listTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPatternData extends js.Object {
  var long: ListPattern = js.native
  var narrow: js.UndefOr[ListPattern] = js.native
  var short: js.UndefOr[ListPattern] = js.native
}

object ListPatternData {
  @scala.inline
  def apply(long: ListPattern): ListPatternData = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPatternData]
  }
  @scala.inline
  implicit class ListPatternDataOps[Self <: ListPatternData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLong(value: ListPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNarrow(value: ListPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNarrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(js.undefined)
        ret
    }
    @scala.inline
    def withShort(value: ListPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(js.undefined)
        ret
    }
  }
  
}

