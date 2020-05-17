package typingsSlinky.reactNativeJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtensionBoundSchema = typingsSlinky.reactNativeJoi.mod.Schema with typingsSlinky.reactNativeJoi.anon.CreateError
  type LazySchema = typingsSlinky.reactNativeJoi.mod.AnySchema
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typingsSlinky.reactNativeJoi.mod.ValidationErrorItem], 
    java.lang.String | typingsSlinky.reactNativeJoi.mod.ValidationErrorItem | js.Array[typingsSlinky.reactNativeJoi.mod.ValidationErrorItem] | js.Error
  ]
}
