package typingsSlinky.rollup.mod

import typingsSlinky.rollup.anon.Duration
import typingsSlinky.rollup.anon.Error
import typingsSlinky.rollup.anon.Input
import typingsSlinky.rollup.anon.`0`
import typingsSlinky.rollup.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rollup.anon.`0`
  - typingsSlinky.rollup.anon.Input
  - typingsSlinky.rollup.anon.Duration
  - typingsSlinky.rollup.anon.`1`
  - typingsSlinky.rollup.anon.Error
*/
trait RollupWatcherEvent extends js.Object

object RollupWatcherEvent {
  @scala.inline
  implicit def apply(value: `0`): RollupWatcherEvent = value.asInstanceOf[RollupWatcherEvent]
  @scala.inline
  implicit def apply(value: `1`): RollupWatcherEvent = value.asInstanceOf[RollupWatcherEvent]
  @scala.inline
  implicit def apply(value: Duration): RollupWatcherEvent = value.asInstanceOf[RollupWatcherEvent]
  @scala.inline
  implicit def apply(value: Error): RollupWatcherEvent = value.asInstanceOf[RollupWatcherEvent]
  @scala.inline
  implicit def apply(value: Input): RollupWatcherEvent = value.asInstanceOf[RollupWatcherEvent]
}

