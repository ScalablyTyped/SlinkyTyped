package typingsSlinky.reactForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormError = js.UndefOr[java.lang.String]
  type FormErrors = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactForm.mod.FormError]
  type FormValue = js.Any
  type FormValues = typingsSlinky.reactForm.mod.Nested[typingsSlinky.reactForm.mod.FormValue]
  type NestedErrors = typingsSlinky.reactForm.mod.Nested[typingsSlinky.reactForm.mod.FormErrors]
  type RenderReturn = slinky.core.facade.ReactElement | typingsSlinky.reactForm.reactFormBooleans.`false` | scala.Null | js.Array[scala.Nothing]
  type SelectOptions = js.Array[typingsSlinky.reactForm.AnonLabel]
  type Touched = typingsSlinky.reactForm.mod.Nested[scala.Boolean]
  type ValidateValuesFunction = js.Function1[
    /* values */ typingsSlinky.reactForm.mod.FormValues, 
    typingsSlinky.reactForm.mod.FormErrors
  ]
}
