package typingsSlinky.mocBetterSqlite3.mod.MocBetterSqlite3

import typingsSlinky.mocBetterSqlite3.mod.ArgumentTypes
import typingsSlinky.mocBetterSqlite3.mod.VariableArgFunction
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction[F /* <: VariableArgFunction */] extends js.Object {
  
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  
  def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  
  def deferred(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  
  def exclusive(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
  
  def immediate(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ArgumentTypes<F> is not an array type */ params: ArgumentTypes[F]
  ): ReturnType[F] = js.native
}
