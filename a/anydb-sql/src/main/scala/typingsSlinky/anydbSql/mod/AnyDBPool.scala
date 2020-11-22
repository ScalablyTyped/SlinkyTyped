package typingsSlinky.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyDBPool extends DatabaseConnection {
  
  def begin(): Transaction = js.native
  
  def close(err: js.Error): Unit = js.native
  
  def query(
    text: String,
    values: js.Array[_],
    callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
  ): Unit = js.native
}
