package typingsSlinky.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eggMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.eggDashCore.eggDashCoreMod.EggCore
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick
  import typingsSlinky.urllib.urllibMod.HttpClient
  import typingsSlinky.urllib.urllibMod.RequestOptions2

  type EggContextHttpClient = HttpClient[RequestOptions2]
  /* Rewritten from type alias, can be one of: 
    - typings.egg.eggStrings.local
    - typings.egg.eggStrings.unittest
    - typings.egg.eggStrings.prod
    - java.lang.String
  */
  type EggEnvType = _EggEnvType | String
  type EggHttpClient = HttpClient[RequestOptions2]
  type EggLoader = typingsSlinky.eggDashCore.eggDashCoreMod.EggLoader[EggCore[typingsSlinky.eggDashCore.eggDashCoreMod.PlainObject[js.Any]], js.Any]
  type EggLoaderOptions = typingsSlinky.eggDashCore.eggDashCoreMod.EggLoaderOptions
  type EggPluginItem = IEggPluginItem | Boolean
  type IApplicationLocals = PlainObject[js.Any]
  type IContextLocals = PlainObject[js.Any]
  type IController = PlainObject[js.Any]
  type IMiddleware = PlainObject[js.Any]
  type IService = PlainObject[js.Any]
  type IgnoreItem = String | js.RegExp | (js.Function1[/* ctx */ Context, Boolean])
  type IgnoreOrMatch = IgnoreItem | js.Array[IgnoreItem]
  type LoggerLevel = typingsSlinky.eggDashLogger.eggDashLoggerMod.LoggerLevel
  // plain object
  type PlainObject[T] = StringDictionary[T]
  type PowerPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ U in keyof T ]:? T[U] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias egg.egg.PowerPartial<T[U]> * / object : T[U]}
    */ typingsSlinky.egg.eggStrings.PowerPartial with js.Any
  // Remove specific property from the specific class
  type RemoveSpecProp[T, P] = Pick[T, Exclude[String, P]]
  type RequestArrayBody = js.Array[js.Any]
  type RequestObjectBody = PlainObject[js.Any]
  type RouterPath = String | js.RegExp
}
