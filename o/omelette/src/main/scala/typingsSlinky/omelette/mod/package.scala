package typingsSlinky.omelette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* obj */ typingsSlinky.omelette.mod.CallbackValue, scala.Unit]
  type CallbackAsync = js.Function1[/* obj */ typingsSlinky.omelette.mod.CallbackAsyncValue, js.Promise[scala.Unit]]
  type Choices = js.Array[java.lang.String]
  type ReplyFn[T] = js.Function1[/* value */ T, scala.Unit]
  type TemplatePrimativeValue = java.lang.String | typingsSlinky.omelette.mod.Choices
  type TemplateValue = typingsSlinky.omelette.mod.TemplatePrimativeValue | typingsSlinky.omelette.mod.Callback
  type TreeValue = org.scalablytyped.runtime.StringDictionary[typingsSlinky.omelette.mod.Choices]
}
