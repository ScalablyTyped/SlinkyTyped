package typingsSlinky.ecmarkup.biblioMod

import typingsSlinky.ecmarkup.ecmarkupStrings.term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("refId")
  var refId_TermBiblioEntry: String = js.native
  @JSName("term")
  var term_TermBiblioEntry: String = js.native
  @JSName("type")
  var type_TermBiblioEntry: term = js.native
}

object TermBiblioEntry {
  @scala.inline
  def apply(refId: String, referencingIds: js.Array[String], term: String, `type`: term): TermBiblioEntry = {
    val __obj = js.Dynamic.literal(refId = refId.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermBiblioEntry]
  }
  @scala.inline
  implicit class TermBiblioEntryOps[Self <: TermBiblioEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: term): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

