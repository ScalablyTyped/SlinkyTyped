package typingsSlinky.reduxOrm.querySetMod.QuerySet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional ordering direction.
  *
  * {@see QuerySet.orderBy}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxOrm.reduxOrmBooleans.`true`
  - typingsSlinky.reduxOrm.reduxOrmBooleans.`false`
  - typingsSlinky.reduxOrm.reduxOrmStrings.asc
  - typingsSlinky.reduxOrm.reduxOrmStrings.desc
*/
trait SortOrder extends js.Object

object SortOrder {
  @scala.inline
  def asc: typingsSlinky.reduxOrm.reduxOrmStrings.asc = "asc".asInstanceOf[typingsSlinky.reduxOrm.reduxOrmStrings.asc]
  @scala.inline
  def desc: typingsSlinky.reduxOrm.reduxOrmStrings.desc = "desc".asInstanceOf[typingsSlinky.reduxOrm.reduxOrmStrings.desc]
  @scala.inline
  def `false`: typingsSlinky.reduxOrm.reduxOrmBooleans.`false` = false.asInstanceOf[typingsSlinky.reduxOrm.reduxOrmBooleans.`false`]
  @scala.inline
  def `true`: typingsSlinky.reduxOrm.reduxOrmBooleans.`true` = true.asInstanceOf[typingsSlinky.reduxOrm.reduxOrmBooleans.`true`]
}

