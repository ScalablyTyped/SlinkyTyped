package typingsSlinky.jqueryValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JQueryValidation {
  
  type ErrorDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type RulesDictionary = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ShouldValidatePredicate = scala.Boolean | typingsSlinky.jqueryValidation.JQueryValidation.ValidatePredicate
  
  type ValidatePredicate = js.Function2[
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    scala.Unit
  ]
}
