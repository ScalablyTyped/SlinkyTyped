package typingsSlinky.betterSqlite3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArgumentTypes[F /* <: typingsSlinky.betterSqlite3.mod.VariableArgFunction */] = js.Any
  
  type ColumnDefinition = typingsSlinky.betterSqlite3.mod.BetterSqlite3.ColumnDefinition
  
  type Database = typingsSlinky.betterSqlite3.mod.BetterSqlite3.Database
  
  type Integer = (js.Function1[/* val */ typingsSlinky.integer.mod.IntLike, typingsSlinky.integer.mod.IntClass]) with typingsSlinky.betterSqlite3.anon.TypeofInteger
  
  type SqliteError = org.scalablytyped.runtime.Instantiable2[
    /* message */ java.lang.String, 
    /* code */ java.lang.String, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias better-sqlite3.better-sqlite3.SqliteError */ js.Object
  ]
  
  type Statement[BindParameters /* <: js.Array[_] | js.Object */] = typingsSlinky.betterSqlite3.mod.BetterSqlite3.Statement[js.Array[BindParameters] | BindParameters]
  
  type Transaction = typingsSlinky.betterSqlite3.mod.BetterSqlite3.Transaction[typingsSlinky.betterSqlite3.mod.VariableArgFunction]
  
  type VariableArgFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
