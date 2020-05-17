package typingsSlinky.jsdeferred.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object global {
  type DeferredizedFunction = js.Function1[/* repeated */ js.Any, typingsSlinky.jsdeferred.mod.global.Deferred]
  type DeferredizedFunctionWithNumber = js.Function1[/* n */ scala.Double, typingsSlinky.jsdeferred.mod.global.Deferred]
  type ErrorCallback = js.Function2[/* d */ typingsSlinky.jsdeferred.mod.global.Deferred, /* repeated */ js.Any, js.Any]
  type FunctionWithNumber = js.Function2[/* i */ scala.Double, /* o */ js.UndefOr[js.Any], js.Any]
}
