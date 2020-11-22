package typingsSlinky.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "SelectQuery")
@js.native
class SelectQuery[T] protected () extends IQuery[T] {
  def this(_table: Table[T]) = this()
  
  /* private */ def parseQueryResult(result: js.Any, criteria: ICriteriaParts): typingsSlinky.bluebird.mod.^[_] = js.native
  
  /**
    * Executes the select and returns the Promise.
    */
  def promise(rawCriteria: js.Any): typingsSlinky.bluebird.mod.^[js.Array[T]] = js.native
  def promise(rawCriteria: js.Any, callback: js.Function1[/* _results */ js.Array[T], _]): typingsSlinky.bluebird.mod.^[js.Array[T]] = js.native
}
