package typingsSlinky.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EggContextHttpClient = typingsSlinky.urllib.mod.HttpClient[typingsSlinky.urllib.mod.RequestOptions2]
  type EggHttpClient = typingsSlinky.urllib.mod.HttpClient[typingsSlinky.urllib.mod.RequestOptions2]
  type EggLoader = typingsSlinky.eggCore.mod.EggLoader[
    typingsSlinky.eggCore.mod.EggCore[typingsSlinky.eggCore.mod.PlainObject[js.Any]], 
    js.Any
  ]
  type EggLoaderOptions = typingsSlinky.eggCore.mod.EggLoaderOptions
  type IApplicationLocals = typingsSlinky.egg.mod.PlainObject[js.Any]
  type IContextLocals = typingsSlinky.egg.mod.PlainObject[js.Any]
  type IController = typingsSlinky.egg.mod.PlainObject[js.Any]
  type IMiddleware = typingsSlinky.egg.mod.PlainObject[js.Any]
  type IService = typingsSlinky.egg.mod.PlainObject[js.Any]
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
}
