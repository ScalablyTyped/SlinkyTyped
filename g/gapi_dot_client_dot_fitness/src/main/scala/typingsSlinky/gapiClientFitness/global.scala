package typingsSlinky.gapiClientFitness

import typingsSlinky.gapiClientFitness.gapi.client.fitness.UsersResource
import typingsSlinky.gapiClientFitness.gapiClientFitnessStrings.fitness
import typingsSlinky.gapiClientFitness.gapiClientFitnessStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Fitness v1 */
      def load(name: fitness, version: v1): js.Thenable[Unit] = js.native
      def load(name: fitness, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val users: UsersResource = js.native
    }
  }
}
