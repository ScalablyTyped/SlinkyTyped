package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.realm.realmStrings.all
  - typingsSlinky.realm.realmStrings.trace
  - typingsSlinky.realm.realmStrings.debug
  - typingsSlinky.realm.realmStrings.detail
  - typingsSlinky.realm.realmStrings.info
  - typingsSlinky.realm.realmStrings.warn
  - typingsSlinky.realm.realmStrings.error
  - typingsSlinky.realm.realmStrings.fatal
  - typingsSlinky.realm.realmStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def all: typingsSlinky.realm.realmStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.realm.realmStrings.debug = this.cast("debug")
  @scala.inline
  def detail: typingsSlinky.realm.realmStrings.detail = this.cast("detail")
  @scala.inline
  def error: typingsSlinky.realm.realmStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsSlinky.realm.realmStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsSlinky.realm.realmStrings.info = this.cast("info")
  @scala.inline
  def off: typingsSlinky.realm.realmStrings.off = this.cast("off")
  @scala.inline
  def trace: typingsSlinky.realm.realmStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsSlinky.realm.realmStrings.warn = this.cast("warn")
}

