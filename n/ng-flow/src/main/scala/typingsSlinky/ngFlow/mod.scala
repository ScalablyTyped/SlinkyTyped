package typingsSlinky.ngFlow

import typingsSlinky.flowjs.mod.Flow
import typingsSlinky.flowjs.mod.FlowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object flow extends js.Object {
    
    @js.native
    trait FlowFactory extends js.Object {
      
      def create(): Flow = js.native
      def create(options: FlowOptions): Flow = js.native
    }
  }
}
