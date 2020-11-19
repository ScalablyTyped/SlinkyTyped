package typingsSlinky.asyncValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ErrorList = js.Array[typingsSlinky.asyncValidator.mod.ValidateError]
  
  type FieldErrorList = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.asyncValidator.mod.ValidateError]]
  
  type Rules = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.asyncValidator.mod.RuleItem | js.Array[typingsSlinky.asyncValidator.mod.RuleItem]
  ]
  
  type ValidateSource = org.scalablytyped.runtime.StringDictionary[js.Any]
}
