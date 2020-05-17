package typingsSlinky.idyllCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AST = js.Array[typingsSlinky.idyllCompiler.mod.Node]
  type PropKey = java.lang.String
  type PropValue = js.Tuple2[typingsSlinky.idyllCompiler.mod.PropType, typingsSlinky.idyllCompiler.mod.PropData]
  type Property = js.Tuple2[typingsSlinky.idyllCompiler.mod.PropKey, typingsSlinky.idyllCompiler.mod.PropValue]
  type RecursiveNode[T] = js.Tuple3[java.lang.String, js.Array[typingsSlinky.idyllCompiler.mod.Property], js.Array[T]]
}
