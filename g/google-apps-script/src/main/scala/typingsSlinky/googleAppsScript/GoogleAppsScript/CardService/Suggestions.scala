package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Autocomplete suggestions to supplement a TextInput widget.
  *
  *     var textInput = CardService.newTextInput()
  *         .setSuggestions(CardService.newSuggestions()
  *             .addSuggestion("First suggestion")
  *             .addSuggestion("Second suggestion"))
  */
@js.native
trait Suggestions extends StObject {
  
  def addSuggestion(suggestion: String): Suggestions = js.native
  
  def addSuggestions(suggestions: js.Array[String]): Suggestions = js.native
}
object Suggestions {
  
  @scala.inline
  def apply(addSuggestion: String => Suggestions, addSuggestions: js.Array[String] => Suggestions): Suggestions = {
    val __obj = js.Dynamic.literal(addSuggestion = js.Any.fromFunction1(addSuggestion), addSuggestions = js.Any.fromFunction1(addSuggestions))
    __obj.asInstanceOf[Suggestions]
  }
  
  @scala.inline
  implicit class SuggestionsMutableBuilder[Self <: Suggestions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSuggestion(value: String => Suggestions): Self = StObject.set(x, "addSuggestion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSuggestions(value: js.Array[String] => Suggestions): Self = StObject.set(x, "addSuggestions", js.Any.fromFunction1(value))
  }
}
