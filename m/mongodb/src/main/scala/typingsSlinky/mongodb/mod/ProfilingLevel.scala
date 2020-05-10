package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mongodbStrings.off
  - typingsSlinky.mongodb.mongodbStrings.slow_only
  - typingsSlinky.mongodb.mongodbStrings.all
*/
trait ProfilingLevel extends js.Object

object ProfilingLevel {
  @scala.inline
  def all: typingsSlinky.mongodb.mongodbStrings.all = "all".asInstanceOf[typingsSlinky.mongodb.mongodbStrings.all]
  @scala.inline
  def off: typingsSlinky.mongodb.mongodbStrings.off = "off".asInstanceOf[typingsSlinky.mongodb.mongodbStrings.off]
  @scala.inline
  def slow_only: typingsSlinky.mongodb.mongodbStrings.slow_only = "slow_only".asInstanceOf[typingsSlinky.mongodb.mongodbStrings.slow_only]
}

