package typingsSlinky.camundaExternalTaskClientJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handler = js.Function1[/* args */ typingsSlinky.camundaExternalTaskClientJs.mod.HandlerArgs, scala.Unit]
  type Interceptor = js.Function1[/* config */ js.Any, js.Any]
  type Logger_ = typingsSlinky.camundaExternalTaskClientJs.mod.Middleware with typingsSlinky.camundaExternalTaskClientJs.anon.Error
  type Middleware = js.Function1[/* client */ typingsSlinky.camundaExternalTaskClientJs.mod.Client, scala.Unit]
  type SuccessWithTasksEvent = typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonsuccess
  type TypedValueMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.camundaExternalTaskClientJs.mod.TypedValue]
  type Value = js.Any
  type ValueMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.camundaExternalTaskClientJs.mod.Value]
}
