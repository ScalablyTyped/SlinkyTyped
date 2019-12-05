package typingsSlinky.reactDashJsonschemaDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashJsonschemaDashFormMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.schema
  import typingsSlinky.std.Omit

  type Field = ReactComponentClass[FieldProps[js.Any]] | ReactComponentClass[FieldProps[js.Any]]
  type FieldError = String
  type FormValidation = FieldValidation with StringDictionary[FieldValidation]
  type ISubmitEvent[T] = IChangeEvent[T]
  type IdSchema = FieldId with StringDictionary[FieldId]
  type ThemeProps[T] = Omit[FormProps[T], schema]
  type Widget = ReactComponentClass[WidgetProps] | ReactComponentClass[WidgetProps]
}
