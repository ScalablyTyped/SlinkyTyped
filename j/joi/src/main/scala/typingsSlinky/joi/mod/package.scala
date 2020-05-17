package typingsSlinky.joi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultsFunction = js.Function1[/* root */ typingsSlinky.joi.mod.Schema, typingsSlinky.joi.mod.Schema]
  type ExtensionBoundSchema = typingsSlinky.joi.mod.Schema with typingsSlinky.joi.anon.CreateError
  type LazySchema = typingsSlinky.joi.mod.AnySchema
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typingsSlinky.joi.mod.ValidationErrorItem], 
    java.lang.String | typingsSlinky.joi.mod.ValidationErrorItem | js.Array[typingsSlinky.joi.mod.ValidationErrorItem] | js.Error
  ]
}
