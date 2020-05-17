package typingsSlinky.jupyterlabCoreutils.interfacesMod.IPoll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The phase of the poll when the current tick was scheduled.
  *
  * @typeparam T - A type for any additional tick phases a poll supports.
  */
/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.constructed
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.disposed
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.reconnected
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.refreshed
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.rejected
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.resolved
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.standby
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.started
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stopped
*/
trait Phase[T /* <: String */] extends js.Object

object Phase {
  @scala.inline
  def constructed[T]: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.constructed = "constructed".asInstanceOf[typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.constructed]
  @scala.inline
  def disposed[T]: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.disposed = "disposed".asInstanceOf[typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.disposed]
  @scala.inline
  def reconnected[T]: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.reconnected = "reconnected".asInstanceOf[typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.reconnected]
  @scala.inline
  def refreshed[T]: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.refreshed = "refreshed".asInstanceOf[typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.refreshed]
  @scala.inline
  def rejected[T]: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.rejected = "rejected".asInstanceOf[typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.rejected]
  @scala.inline
  def resolved[T]: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.resolved = "resolved".asInstanceOf[typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.resolved]
  @scala.inline
  def standby[T]: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.standby = "standby".asInstanceOf[typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.standby]
  @scala.inline
  def started[T]: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.started = "started".asInstanceOf[typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.started]
  @scala.inline
  def stopped[T]: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stopped = "stopped".asInstanceOf[typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stopped]
  @scala.inline
  implicit def apply[T](value: T): Phase[T] = value.asInstanceOf[Phase[T]]
}

