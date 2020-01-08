package typingsSlinky.betterDashSqlite3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object betterDashSqlite3Mod {
  import org.scalablytyped.runtime.Instantiable2
  import typingsSlinky.betterDashSqlite3.TypeofInteger
  import typingsSlinky.integer.integerMod.IntClass
  import typingsSlinky.integer.integerMod.IntLike

  type ArgumentTypes[F /* <: VariableArgFunction */] = js.Any
  type ColumnDefinition = typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3.ColumnDefinition
  type Database = typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3.Database
  type Integer = (js.Function1[/* val */ IntLike, IntClass]) with TypeofInteger
  type SqliteError = Instantiable2[
    /* message */ String, 
    /* code */ String, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias better-sqlite3.better-sqlite3.SqliteError */ js.Object
  ]
  type Statement[BindParameters /* <: js.Array[_] | js.Object */] = typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3.Statement[js.Array[BindParameters] | BindParameters]
  type Transaction = typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3.Transaction[VariableArgFunction]
  type VariableArgFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
