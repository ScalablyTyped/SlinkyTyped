package typingsSlinky.levelTtl.mod

import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.abstractLeveldown.mod.ErrorCallback
import typingsSlinky.levelup.mod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelTTL[K, V] extends LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] {
  
  def stop(): Unit = js.native
  def stop(callback: ErrorCallback): Unit = js.native
  
  def ttl(key: K, ttl: Double): Unit = js.native
  def ttl(key: K, ttl: Double, callback: ErrorCallback): Unit = js.native
}
