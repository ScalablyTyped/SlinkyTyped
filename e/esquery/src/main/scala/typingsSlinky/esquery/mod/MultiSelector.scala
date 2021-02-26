package typingsSlinky.esquery.mod

import typingsSlinky.esquery.esqueryStrings.compound
import typingsSlinky.esquery.esqueryStrings.has
import typingsSlinky.esquery.esqueryStrings.not
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esquery.mod.Sequence
  - typingsSlinky.esquery.mod.Negation
  - typingsSlinky.esquery.mod.Matches_
  - typingsSlinky.esquery.mod.Has
*/
trait MultiSelector extends SubjectSelector
object MultiSelector {
  
  @scala.inline
  def Has(selectors: js.Array[SubjectSelector], `type`: has): typingsSlinky.esquery.mod.Has = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Has]
  }
  
  @scala.inline
  def Matches_(selectors: js.Array[SubjectSelector], `type`: typingsSlinky.esquery.esqueryStrings.matches): typingsSlinky.esquery.mod.Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Matches_]
  }
  
  @scala.inline
  def Negation(selectors: js.Array[SubjectSelector], `type`: not): typingsSlinky.esquery.mod.Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Negation]
  }
  
  @scala.inline
  def Sequence(selectors: js.Array[SubjectSelector], `type`: compound): typingsSlinky.esquery.mod.Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.esquery.mod.Sequence]
  }
}
