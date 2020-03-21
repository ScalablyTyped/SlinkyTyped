package typingsSlinky.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputMod {
  type CustomValidate = (js.Function1[
    /* param */ js.UndefOr[typingsSlinky.cathoQuantum.AnonValueString], 
    java.lang.String
  ]) | typingsSlinky.cathoQuantum.AnonError
  type Input = slinky.core.ReactComponentClass[typingsSlinky.cathoQuantum.inputMod.InputProps]
  type Mask = scala.Boolean | js.RegExp | java.lang.String | typingsSlinky.cathoQuantum.inputMod.MaskFunction
  type MaskFunction = js.Function1[/* rawValue */ java.lang.String, js.Array[java.lang.String]]
  type Validate = (js.Function1[
    (/* params */ typingsSlinky.cathoQuantum.AnonMaxLength) | (/* params */ typingsSlinky.cathoQuantum.AnonMinLength) | (/* params */ typingsSlinky.cathoQuantum.AnonValue), 
    java.lang.String
  ]) | (js.Function2[
    /* params */ typingsSlinky.cathoQuantum.AnonValue, 
    /* cpf */ js.UndefOr[java.lang.String], 
    java.lang.String
  ])
}
