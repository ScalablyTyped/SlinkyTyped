package typingsSlinky.ecmarkup.biblioMod

import typingsSlinky.ecmarkup.ecmarkupStrings.clause
import typingsSlinky.ecmarkup.ecmarkupStrings.example
import typingsSlinky.ecmarkup.ecmarkupStrings.figure
import typingsSlinky.ecmarkup.ecmarkupStrings.note
import typingsSlinky.ecmarkup.ecmarkupStrings.op
import typingsSlinky.ecmarkup.ecmarkupStrings.production
import typingsSlinky.ecmarkup.ecmarkupStrings.table
import typingsSlinky.ecmarkup.ecmarkupStrings.term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ecmarkup.biblioMod.AlgorithmBiblioEntry
  - typingsSlinky.ecmarkup.biblioMod.ProductionBiblioEntry
  - typingsSlinky.ecmarkup.biblioMod.ClauseBiblioEntry
  - typingsSlinky.ecmarkup.biblioMod.TermBiblioEntry
  - typingsSlinky.ecmarkup.biblioMod.FigureBiblioEntry
*/
trait BiblioEntry extends js.Object

object BiblioEntry {
  @scala.inline
  def ClauseBiblioEntry(
    aoid: String,
    id: String,
    number: String | Double,
    referencingIds: js.Array[String],
    title: String,
    titleHTML: String,
    `type`: clause
  ): BiblioEntry = {
    val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHTML = titleHTML.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def AlgorithmBiblioEntry(aoid: String, referencingIds: js.Array[String], `type`: op): BiblioEntry = {
    val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def TermBiblioEntry(refId: String, referencingIds: js.Array[String], term: String, `type`: term): BiblioEntry = {
    val __obj = js.Dynamic.literal(refId = refId.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def ProductionBiblioEntry(name: String, referencingIds: js.Array[String], `type`: production): BiblioEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
  @scala.inline
  def FigureBiblioEntry(
    id: String,
    number: String | Double,
    referencingIds: js.Array[String],
    `type`: table | figure | example | note
  ): BiblioEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntry]
  }
}

