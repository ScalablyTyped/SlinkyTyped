package typingsSlinky.mongodbMemoryServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull
  - typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest
  - typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1
  - typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger
*/
trait StorageEngineT extends js.Object

object StorageEngineT {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devnull: typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull = this.cast("devnull")
  @scala.inline
  def ephemeralForTest: typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest = this.cast("ephemeralForTest")
  @scala.inline
  def mmapv1: typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1 = this.cast("mmapv1")
  @scala.inline
  def wiredTiger: typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger = this.cast("wiredTiger")
}

