package typingsSlinky.activexDao.DAO

import typingsSlinky.activexDao.activexDaoNumbers.`1`
import typingsSlinky.activexDao.activexDaoNumbers.`2`
import typingsSlinky.activexDao.activexDaoNumbers.`3`
import typingsSlinky.activexDao.activexDaoNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexDao.activexDaoNumbers.`3`
  - typingsSlinky.activexDao.activexDaoNumbers.`5`
  - typingsSlinky.activexDao.activexDaoNumbers.`1`
  - typingsSlinky.activexDao.activexDaoNumbers.`2`
*/
trait LockTypeEnum extends js.Object

object LockTypeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbOptimistic: `3` = this.cast(3)
  @scala.inline
  def dbOptimisticBatch: `5` = this.cast(5)
  @scala.inline
  def dbOptimisticValue: `1` = this.cast(1)
  @scala.inline
  def dbPessimistic: `2` = this.cast(2)
}

