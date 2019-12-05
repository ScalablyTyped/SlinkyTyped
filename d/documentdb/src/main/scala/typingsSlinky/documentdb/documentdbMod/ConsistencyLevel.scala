package typingsSlinky.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.documentdb.documentdbStrings.Strong
  - typings.documentdb.documentdbStrings.BoundedStaleness
  - typings.documentdb.documentdbStrings.Session
  - typings.documentdb.documentdbStrings.Eventual
*/
trait ConsistencyLevel extends js.Object

object ConsistencyLevel {
  @scala.inline
  def BoundedStaleness: typingsSlinky.documentdb.documentdbStrings.BoundedStaleness = this.cast("BoundedStaleness")
  @scala.inline
  def Eventual: typingsSlinky.documentdb.documentdbStrings.Eventual = this.cast("Eventual")
  @scala.inline
  def Session: typingsSlinky.documentdb.documentdbStrings.Session = this.cast("Session")
  @scala.inline
  def Strong: typingsSlinky.documentdb.documentdbStrings.Strong = this.cast("Strong")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

