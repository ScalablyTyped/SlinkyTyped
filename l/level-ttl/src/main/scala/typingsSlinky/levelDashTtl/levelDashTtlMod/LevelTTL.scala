package typingsSlinky.levelDashTtl.levelDashTtlMod

import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIterator
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback
import typingsSlinky.levelup.levelupMod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelTTL[K, V] extends LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] {
  def stop(): Unit = js.native
  def stop(callback: ErrorCallback): Unit = js.native
  def ttl(key: K, ttl: Double): Unit = js.native
  def ttl(key: K, ttl: Double, callback: ErrorCallback): Unit = js.native
}

