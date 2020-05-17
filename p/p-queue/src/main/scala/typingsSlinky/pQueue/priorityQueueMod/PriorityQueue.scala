package typingsSlinky.pQueue.priorityQueueMod

import typingsSlinky.pQueue.anon.PartialPriorityQueueOptio
import typingsSlinky.pQueue.queueMod.Queue
import typingsSlinky.pQueue.queueMod.RunFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueue extends Queue[RunFunction, PriorityQueueOptions] {
  val _queue: js.Any = js.native
  def enqueue(run: RunFunction, options: PartialPriorityQueueOptio): Unit = js.native
  def filter(options: PartialPriorityQueueOptio): js.Array[RunFunction] = js.native
  @JSName("size")
  def size_MPriorityQueue: Double = js.native
}

