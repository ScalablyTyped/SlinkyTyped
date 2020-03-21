package typingsSlinky.objection.mod

import typingsSlinky.knex.mod.Knex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction_
  extends Knex[js.Any, js.Array[js.Any]] {
  def commit[QM](): js.Promise[QM] = js.native
  def commit[QM](value: js.Any): js.Promise[QM] = js.native
  def rollback[QM](): js.Promise[QM] = js.native
  def rollback[QM](error: js.Error): js.Promise[QM] = js.native
  def savepoint(transactionScope: js.Function1[/* trx */ this.type, _]): js.Promise[_] = js.native
}

