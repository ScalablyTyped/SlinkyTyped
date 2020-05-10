package typingsSlinky.ecmarkup.biblioMod

import typingsSlinky.ecmarkup.ecmarkupStrings.clause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClauseBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("aoid")
  var aoid_ClauseBiblioEntry: String = js.native
  @JSName("id")
  var id_ClauseBiblioEntry: String = js.native
  @JSName("number")
  var number_ClauseBiblioEntry: String | Double = js.native
  var titleHTML: String = js.native
  @JSName("title")
  var title_ClauseBiblioEntry: String = js.native
  @JSName("type")
  var type_ClauseBiblioEntry: clause = js.native
}

object ClauseBiblioEntry {
  @scala.inline
  def apply(
    aoid: String,
    id: String,
    number: String | Double,
    referencingIds: js.Array[String],
    title: String,
    titleHTML: String,
    `type`: clause
  ): ClauseBiblioEntry = {
    val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHTML = titleHTML.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClauseBiblioEntry]
  }
  @scala.inline
  implicit class ClauseBiblioEntryOps[Self <: ClauseBiblioEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAoid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: clause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

