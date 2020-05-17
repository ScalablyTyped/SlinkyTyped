package typingsSlinky.reactAutosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactAutosuggest.mod.AutosuggestPropsSingleSection[TSuggestion]
  - typingsSlinky.reactAutosuggest.mod.AutosuggestPropsMultiSection[TSuggestion, TSection]
*/
trait AutosuggestProps[TSuggestion, TSection] extends js.Object

object AutosuggestProps {
  @scala.inline
  implicit def apply[TSuggestion, TSection](value: AutosuggestPropsMultiSection[TSuggestion, TSection]): AutosuggestProps[TSuggestion, TSection] = value.asInstanceOf[AutosuggestProps[TSuggestion, TSection]]
  @scala.inline
  implicit def apply[TSuggestion, TSection](value: AutosuggestPropsSingleSection[TSuggestion]): AutosuggestProps[TSuggestion, TSection] = value.asInstanceOf[AutosuggestProps[TSuggestion, TSection]]
}

