package typingsSlinky.idyllCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AST = js.Array[typingsSlinky.idyllCompiler.mod.Node]
  
  type Node = typingsSlinky.idyllCompiler.mod.TreeNode | java.lang.String
  
  type PostProcessor = (js.Function1[/* ast */ typingsSlinky.idyllCompiler.mod.AST, typingsSlinky.idyllCompiler.mod.AST]) | (js.Function2[
    /* ast */ typingsSlinky.idyllCompiler.mod.AST, 
    /* callback */ js.Function2[/* err */ js.Any, /* value */ typingsSlinky.idyllCompiler.mod.AST, scala.Unit], 
    scala.Unit
  ])
  
  type PropData = java.lang.String | scala.Double | scala.Boolean
  
  type PropKey = java.lang.String
  
  type PropValue = js.Tuple2[typingsSlinky.idyllCompiler.mod.PropType, typingsSlinky.idyllCompiler.mod.PropData]
  
  type Property = js.Tuple2[typingsSlinky.idyllCompiler.mod.PropKey, typingsSlinky.idyllCompiler.mod.PropValue]
  
  type RecursiveNode[T] = js.Tuple3[java.lang.String, js.Array[typingsSlinky.idyllCompiler.mod.Property], js.Array[T]]
}
