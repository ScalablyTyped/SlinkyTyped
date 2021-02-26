package typingsSlinky.emberRunloop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.emberRunloop.emberRunloopStrings.sync
    - typingsSlinky.emberRunloop.emberRunloopStrings.actions
    - typingsSlinky.emberRunloop.emberRunloopStrings.routerTransitions
    - typingsSlinky.emberRunloop.emberRunloopStrings.render
    - typingsSlinky.emberRunloop.emberRunloopStrings.afterRender
    - typingsSlinky.emberRunloop.emberRunloopStrings.destroy
  */
  trait EmberRunQueues extends StObject
  object EmberRunQueues {
    
    @scala.inline
    def actions: typingsSlinky.emberRunloop.emberRunloopStrings.actions = "actions".asInstanceOf[typingsSlinky.emberRunloop.emberRunloopStrings.actions]
    
    @scala.inline
    def afterRender: typingsSlinky.emberRunloop.emberRunloopStrings.afterRender = "afterRender".asInstanceOf[typingsSlinky.emberRunloop.emberRunloopStrings.afterRender]
    
    @scala.inline
    def destroy: typingsSlinky.emberRunloop.emberRunloopStrings.destroy = "destroy".asInstanceOf[typingsSlinky.emberRunloop.emberRunloopStrings.destroy]
    
    @scala.inline
    def render: typingsSlinky.emberRunloop.emberRunloopStrings.render = "render".asInstanceOf[typingsSlinky.emberRunloop.emberRunloopStrings.render]
    
    @scala.inline
    def routerTransitions: typingsSlinky.emberRunloop.emberRunloopStrings.routerTransitions = "routerTransitions".asInstanceOf[typingsSlinky.emberRunloop.emberRunloopStrings.routerTransitions]
    
    @scala.inline
    def sync: typingsSlinky.emberRunloop.emberRunloopStrings.sync = "sync".asInstanceOf[typingsSlinky.emberRunloop.emberRunloopStrings.sync]
  }
  
  type RunMethod[Target, Ret] = (js.ThisFunction1[/* this */ Target, /* repeated */ js.Any, Ret]) | (/* keyof Target */ String)
}
