package typingsSlinky.emberRunloop

import typingsSlinky.emberRunloop.privateTypesMod.EmberRunQueues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emberRunloopStrings {
  
  @scala.inline
  def actions: actions = "actions".asInstanceOf[actions]
  
  @scala.inline
  def afterRender: afterRender = "afterRender".asInstanceOf[afterRender]
  
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @scala.inline
  def render: render = "render".asInstanceOf[render]
  
  @scala.inline
  def routerTransitions: routerTransitions = "routerTransitions".asInstanceOf[routerTransitions]
  
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait actions extends EmberRunQueues
  
  @js.native
  sealed trait afterRender extends EmberRunQueues
  
  @js.native
  sealed trait destroy extends EmberRunQueues
  
  @js.native
  sealed trait render extends EmberRunQueues
  
  @js.native
  sealed trait routerTransitions extends EmberRunQueues
  
  @js.native
  sealed trait sync extends EmberRunQueues
}
