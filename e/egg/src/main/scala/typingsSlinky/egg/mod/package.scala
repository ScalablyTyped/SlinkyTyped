package typingsSlinky.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EggContextHttpClient = typingsSlinky.urllib.mod.HttpClient[typingsSlinky.urllib.mod.RequestOptions2]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.egg.eggStrings.local
    - typingsSlinky.egg.eggStrings.unittest
    - typingsSlinky.egg.eggStrings.prod
    - java.lang.String
  */
  type EggEnvType = typingsSlinky.egg.mod._EggEnvType | java.lang.String
  type EggHttpClient = typingsSlinky.urllib.mod.HttpClient[typingsSlinky.urllib.mod.RequestOptions2]
  type EggLoader = typingsSlinky.eggCore.mod.EggLoader[
    typingsSlinky.eggCore.mod.EggCore[typingsSlinky.eggCore.mod.PlainObject[js.Any]], 
    js.Any
  ]
  type EggLoaderOptions = typingsSlinky.eggCore.mod.EggLoaderOptions
  type EggLogger = typingsSlinky.eggLogger.mod.EggLogger
  type EggPluginItem = typingsSlinky.egg.mod.IEggPluginItem | scala.Boolean
  type IApplicationLocals = typingsSlinky.egg.mod.PlainObject[js.Any]
  type IContextLocals = typingsSlinky.egg.mod.PlainObject[js.Any]
  type IController = typingsSlinky.egg.mod.PlainObject[js.Any]
  type IMiddleware = typingsSlinky.egg.mod.PlainObject[js.Any]
  type IService = typingsSlinky.egg.mod.PlainObject[js.Any]
  type IgnoreItem = java.lang.String | js.RegExp | (js.Function1[/* ctx */ typingsSlinky.egg.mod.Context, scala.Boolean])
  type IgnoreOrMatch = typingsSlinky.egg.mod.IgnoreItem | js.Array[typingsSlinky.egg.mod.IgnoreItem]
  type LoggerLevel = typingsSlinky.eggLogger.mod.LoggerLevel
  // plain object
  type PlainObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  type PowerPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ U in keyof T ]:? T[U] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias egg.egg.PowerPartial<T[U]> * / object : T[U]}
    */ typingsSlinky.egg.eggStrings.PowerPartial with org.scalablytyped.runtime.TopLevel[js.Any]
  // Remove specific property from the specific class
  type RemoveSpecProp[T, P] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, P]]
  type RequestArrayBody = js.Array[js.Any]
  type RequestObjectBody = typingsSlinky.egg.mod.PlainObject[js.Any]
  type RouterPath = java.lang.String | js.RegExp
}
