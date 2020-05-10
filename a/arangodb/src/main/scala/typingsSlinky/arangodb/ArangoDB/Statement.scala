package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement[T] extends js.Object {
  def bind(name: String, value: js.Any): Unit = js.native
  def execute(): Cursor[T] = js.native
  def getBatchSize(): Double = js.native
  def setBatchSize(size: Double): Unit = js.native
}

object Statement {
  @scala.inline
  def apply[T](
    bind: (String, js.Any) => Unit,
    execute: () => Cursor[T],
    getBatchSize: () => Double,
    setBatchSize: Double => Unit
  ): Statement[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), execute = js.Any.fromFunction0(execute), getBatchSize = js.Any.fromFunction0(getBatchSize), setBatchSize = js.Any.fromFunction1(setBatchSize))
    __obj.asInstanceOf[Statement[T]]
  }
  @scala.inline
  implicit class StatementOps[Self[t] <: Statement[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBind(value: (String, js.Any) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExecute(value: () => Cursor[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBatchSize(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBatchSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBatchSize(value: Double => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBatchSize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

