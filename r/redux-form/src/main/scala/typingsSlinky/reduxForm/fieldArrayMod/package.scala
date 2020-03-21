package typingsSlinky.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fieldArrayMod {
  type BaseFieldArrayProps[P, FieldValue] = (P | typingsSlinky.reduxForm.AnonProps[P]) with (typingsSlinky.reduxForm.fieldArrayMod._BaseFieldArrayProps[P, FieldValue])
  type FieldIterate[FieldValue, R] = js.Function3[
    /* name */ java.lang.String, 
    /* index */ scala.Double, 
    /* fields */ typingsSlinky.reduxForm.fieldArrayMod.FieldArrayFieldsProps[FieldValue], 
    R
  ]
}
