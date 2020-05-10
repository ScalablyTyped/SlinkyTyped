package typingsSlinky.oracleOraclejet.ojlegendMod.ojLegend

import typingsSlinky.oracleOraclejet.AnonSections
import typingsSlinky.oracleOraclejet.AnonTextString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait SectionContext extends js.Object {
  var getItems: AnonTextString = js.native
  var getSection: AnonSections = js.native
  var items: js.Array[js.Object] = js.native
  var sections: js.Array[js.Object] = js.native
  var title: String = js.native
}

object SectionContext {
  @scala.inline
  def apply(
    getItems: AnonTextString,
    getSection: AnonSections,
    items: js.Array[js.Object],
    sections: js.Array[js.Object],
    title: String
  ): SectionContext = {
    val __obj = js.Dynamic.literal(getItems = getItems.asInstanceOf[js.Any], getSection = getSection.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionContext]
  }
  @scala.inline
  implicit class SectionContextOps[Self <: SectionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetItems(value: AnonTextString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSection(value: AnonSections): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[js.Object]): Self = {
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
  }
  
}

