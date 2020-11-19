package typingsSlinky.jestMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with java.lang.String
  
  type Global = typingsSlinky.node.NodeJS.Global
  
  type ModuleMocker = typingsSlinky.jestMock.mod.ModuleMockerClass
  
  type NonFunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? never : K}[keyof T] */ js.Any) with java.lang.String
  
  type SpyInstance[T, Y /* <: js.Array[_] */] = typingsSlinky.jestMock.mod.MockInstance[T, Y]
}
