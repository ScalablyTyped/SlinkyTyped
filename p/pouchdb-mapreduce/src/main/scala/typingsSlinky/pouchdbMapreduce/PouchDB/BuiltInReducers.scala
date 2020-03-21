package typingsSlinky.pouchdbMapreduce.PouchDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pouchdbMapreduce.pouchdbMapreduceStrings._sum
  - typingsSlinky.pouchdbMapreduce.pouchdbMapreduceStrings._count
  - typingsSlinky.pouchdbMapreduce.pouchdbMapreduceStrings._stats
*/
trait BuiltInReducers extends js.Object

object BuiltInReducers {
  @scala.inline
  def _count: typingsSlinky.pouchdbMapreduce.pouchdbMapreduceStrings._count = this.cast("_count")
  @scala.inline
  def _stats: typingsSlinky.pouchdbMapreduce.pouchdbMapreduceStrings._stats = this.cast("_stats")
  @scala.inline
  def _sum: typingsSlinky.pouchdbMapreduce.pouchdbMapreduceStrings._sum = this.cast("_sum")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

