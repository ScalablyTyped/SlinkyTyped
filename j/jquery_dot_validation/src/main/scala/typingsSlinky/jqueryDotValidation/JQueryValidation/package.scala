package typingsSlinky.jqueryDotValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryValidation {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.HTMLElement
  import typingsSlinky.jquery.JQueryEventObject

  type ErrorDictionary = StringDictionary[String]
  type RulesDictionary = StringDictionary[js.Any]
  type ShouldValidatePredicate = Boolean | ValidatePredicate
  type ValidatePredicate = js.Function2[/* element */ HTMLElement, /* event */ JQueryEventObject, Unit]
}
