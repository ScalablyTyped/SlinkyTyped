package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItems extends js.Object {
  var items: js.Array[AnonBorderColor] = js.native
  var sections: js.Array[js.Object] = js.native
  var title: String = js.native
  var titleHalign: center | end | start = js.native
  var titleStyle: js.Object = js.native
}

object AnonItems {
  @scala.inline
  def apply(
    items: js.Array[AnonBorderColor],
    sections: js.Array[js.Object],
    title: String,
    titleHalign: center | end | start,
    titleStyle: js.Object
  ): AnonItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
  @scala.inline
  implicit class AnonItemsOps[Self <: AnonItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[AnonBorderColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSections(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleHalign(value: center | end | start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleHalign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

