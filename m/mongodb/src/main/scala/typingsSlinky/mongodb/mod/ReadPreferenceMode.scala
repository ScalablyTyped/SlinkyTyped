package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mongodbStrings.primary
  - typingsSlinky.mongodb.mongodbStrings.primaryPreferred
  - typingsSlinky.mongodb.mongodbStrings.secondary
  - typingsSlinky.mongodb.mongodbStrings.secondaryPreferred
  - typingsSlinky.mongodb.mongodbStrings.nearest
*/
trait ReadPreferenceMode extends ReadPreferenceOrMode

object ReadPreferenceMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nearest: typingsSlinky.mongodb.mongodbStrings.nearest = this.cast("nearest")
  @scala.inline
  def primary: typingsSlinky.mongodb.mongodbStrings.primary = this.cast("primary")
  @scala.inline
  def primaryPreferred: typingsSlinky.mongodb.mongodbStrings.primaryPreferred = this.cast("primaryPreferred")
  @scala.inline
  def secondary: typingsSlinky.mongodb.mongodbStrings.secondary = this.cast("secondary")
  @scala.inline
  def secondaryPreferred: typingsSlinky.mongodb.mongodbStrings.secondaryPreferred = this.cast("secondaryPreferred")
}

