package typingsSlinky.lucene.mod

import typingsSlinky.lucene.anon.Start
import typingsSlinky.lucene.luceneStrings.LessthansignimplicitGreaterthansign
import typingsSlinky.lucene.luceneStrings.both
import typingsSlinky.lucene.luceneStrings.left
import typingsSlinky.lucene.luceneStrings.none
import typingsSlinky.lucene.luceneStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lucene.mod.NodeTerm
  - typingsSlinky.lucene.mod.NodeRangedTerm
*/
trait Node extends js.Object
object Node {
  
  @scala.inline
  def NodeTerm(
    field: String | LessthansignimplicitGreaterthansign,
    quoted: Boolean,
    regex: Boolean,
    term: String,
    termLocation: Start
  ): Node = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], termLocation = termLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def NodeRangedTerm(
    field: String | LessthansignimplicitGreaterthansign,
    inclusive: both | none | left | right,
    term_max: String,
    term_min: String
  ): Node = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], term_max = term_max.asInstanceOf[js.Any], term_min = term_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}
