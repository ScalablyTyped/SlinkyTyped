package typingsSlinky.angularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncValidatorFn = js.Function1[
    /* control */ typingsSlinky.angularForms.mod.AbstractControl, 
    (js.Promise[typingsSlinky.angularForms.mod.ValidationErrors | scala.Null]) | (typingsSlinky.rxjs.mod.Observable_[typingsSlinky.angularForms.mod.ValidationErrors | scala.Null])
  ]
  type ValidationErrors = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ValidatorFn = js.Function1[
    /* control */ typingsSlinky.angularForms.mod.AbstractControl, 
    typingsSlinky.angularForms.mod.ValidationErrors | scala.Null
  ]
}
