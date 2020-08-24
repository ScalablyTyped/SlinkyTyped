package typingsSlinky.graphqlToolsLoad

import typingsSlinky.graphqlToolsLoad.anon.Add
import typingsSlinky.graphqlToolsLoad.anon.Concurrency
import typingsSlinky.graphqlToolsLoad.anon.RunAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load/utils/queue", JSImport.Namespace)
@js.native
object queueMod extends js.Object {
  def useQueue[T](): Add[T] = js.native
  def useQueue[T](options: Concurrency): Add[T] = js.native
  def useSyncQueue[T](): RunAll[T] = js.native
}

