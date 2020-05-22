package typingsSlinky.feathersjsFeathers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // tslint:disable-next-line void-return
  type Hook = js.Function1[
    /* hook */ typingsSlinky.feathersjsFeathers.mod.HookContext[js.Any], 
    (js.Promise[
      typingsSlinky.feathersjsFeathers.mod.HookContext[js.Any] | typingsSlinky.feathersjsFeathers.mod.SkipSymbol | scala.Unit
    ]) | typingsSlinky.feathersjsFeathers.mod.HookContext[js.Any] | typingsSlinky.feathersjsFeathers.mod.SkipSymbol | scala.Unit
  ]
  type Id = scala.Double | java.lang.String
  type NullableId = typingsSlinky.feathersjsFeathers.mod.Id | scala.Null
  type Query = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ServerSideParams = typingsSlinky.feathersjsFeathers.mod.Params
  type Service[T] = typingsSlinky.feathersjsFeathers.mod.ServiceOverloads[T] with typingsSlinky.feathersjsFeathers.mod.ServiceAddons[T] with typingsSlinky.feathersjsFeathers.mod.ServiceMethods[T]
  type SkipSymbol = js.Symbol | typingsSlinky.feathersjsFeathers.feathersjsFeathersStrings.__feathersSkipHooks
}
