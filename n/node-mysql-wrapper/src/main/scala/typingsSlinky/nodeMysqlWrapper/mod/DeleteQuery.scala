package typingsSlinky.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "DeleteQuery")
@js.native
class DeleteQuery[T] protected () extends IQuery[T] {
  def this(_table: Table[T]) = this()
  
  def execute(criteriaOrID: String): typingsSlinky.bluebird.mod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, _]): typingsSlinky.bluebird.mod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: Double): typingsSlinky.bluebird.mod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, _]): typingsSlinky.bluebird.mod.^[DeleteAnswer] = js.native
}
