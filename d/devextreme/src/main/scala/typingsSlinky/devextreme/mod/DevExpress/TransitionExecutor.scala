package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.mod.global.JQuery
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionExecutor extends js.Object {
  def enter(elements: JQuery, animation: String): Unit = js.native
  /** Registers the set of elements that should be animated as "entering" using the specified animation configuration. */
  def enter(elements: JQuery, animation: animationConfig): Unit = js.native
  def leave(elements: JQuery, animation: String): Unit = js.native
  /** Registers a set of elements that should be animated as "leaving" using the specified animation configuration. */
  def leave(elements: JQuery, animation: animationConfig): Unit = js.native
  /** Deletes all the animations registered in the Transition Executor by using the enter(elements, animation) and leave(elements, animation) methods. */
  def reset(): Unit = js.native
  /** Starts all the animations registered using the enter(elements, animation) and leave(elements, animation) methods beforehand. */
  def start(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Stops all started animations. */
  def stop(): Unit = js.native
}

