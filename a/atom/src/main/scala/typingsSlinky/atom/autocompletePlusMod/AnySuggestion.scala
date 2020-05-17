package typingsSlinky.atom.autocompletePlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.atom.autocompletePlusMod.TextSuggestion
  - typingsSlinky.atom.autocompletePlusMod.SnippetSuggestion
*/
trait AnySuggestion extends js.Object

object AnySuggestion {
  @scala.inline
  implicit def apply(value: SnippetSuggestion): AnySuggestion = value.asInstanceOf[AnySuggestion]
  @scala.inline
  implicit def apply(value: TextSuggestion): AnySuggestion = value.asInstanceOf[AnySuggestion]
}

