package typingsSlinky.emberRunloop.privateTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emberRunloop.emberRunloopStrings.sync
  - typingsSlinky.emberRunloop.emberRunloopStrings.actions
  - typingsSlinky.emberRunloop.emberRunloopStrings.routerTransitions
  - typingsSlinky.emberRunloop.emberRunloopStrings.render
  - typingsSlinky.emberRunloop.emberRunloopStrings.afterRender
  - typingsSlinky.emberRunloop.emberRunloopStrings.destroy
*/
trait EmberRunQueues extends js.Object

object EmberRunQueues {
  @scala.inline
  def actions: typingsSlinky.emberRunloop.emberRunloopStrings.actions = this.cast("actions")
  @scala.inline
  def afterRender: typingsSlinky.emberRunloop.emberRunloopStrings.afterRender = this.cast("afterRender")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def destroy: typingsSlinky.emberRunloop.emberRunloopStrings.destroy = this.cast("destroy")
  @scala.inline
  def render: typingsSlinky.emberRunloop.emberRunloopStrings.render = this.cast("render")
  @scala.inline
  def routerTransitions: typingsSlinky.emberRunloop.emberRunloopStrings.routerTransitions = this.cast("routerTransitions")
  @scala.inline
  def sync: typingsSlinky.emberRunloop.emberRunloopStrings.sync = this.cast("sync")
}

