package typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.betterDashSqlite3.TypeofInteger
import typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod.Options
import typingsSlinky.integer.integerMod.IntClass
import typingsSlinky.integer.integerMod.IntLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConstructor
  extends Instantiable1[
      /* filename */ String, 
      typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3.Database
    ]
     with Instantiable2[
      /* filename */ String, 
      /* options */ Options, 
      typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3.Database
    ] {
  @JSName("Integer")
  var Integer_Original: (js.Function1[/* val */ IntLike, IntClass]) with TypeofInteger = js.native
  var SqliteError: Instantiable2[
    /* message */ String, 
    /* code */ String, 
    typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod.SqliteError
  ] = js.native
  def apply(filename: String): typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3.Database = js.native
  def apply(filename: String, options: Options): typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3.Database = js.native
  def Integer(`val`: IntLike): IntClass = js.native
}

