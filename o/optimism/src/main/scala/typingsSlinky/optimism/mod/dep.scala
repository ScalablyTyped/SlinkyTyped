package typingsSlinky.optimism.mod

import typingsSlinky.optimism.anon.Subscribe
import typingsSlinky.optimism.depMod.OptimisticDependencyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optimism", "dep")
@js.native
object dep extends js.Object {
  def apply[TKey](): OptimisticDependencyFunction[TKey] = js.native
  def apply[TKey](options: Subscribe[TKey]): OptimisticDependencyFunction[TKey] = js.native
}

