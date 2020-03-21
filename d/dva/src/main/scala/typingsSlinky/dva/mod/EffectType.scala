package typingsSlinky.dva.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dva.dvaStrings.takeEvery
  - typingsSlinky.dva.dvaStrings.takeLatest
  - typingsSlinky.dva.dvaStrings.watcher
  - typingsSlinky.dva.dvaStrings.throttle
*/
trait EffectType extends js.Object

object EffectType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def takeEvery: typingsSlinky.dva.dvaStrings.takeEvery = this.cast("takeEvery")
  @scala.inline
  def takeLatest: typingsSlinky.dva.dvaStrings.takeLatest = this.cast("takeLatest")
  @scala.inline
  def throttle: typingsSlinky.dva.dvaStrings.throttle = this.cast("throttle")
  @scala.inline
  def watcher: typingsSlinky.dva.dvaStrings.watcher = this.cast("watcher")
}

