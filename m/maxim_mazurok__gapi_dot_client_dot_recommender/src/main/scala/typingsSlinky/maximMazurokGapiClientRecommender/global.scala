package typingsSlinky.maximMazurokGapiClientRecommender

import typingsSlinky.maximMazurokGapiClientRecommender.gapi.client.recommender.ProjectsResource
import typingsSlinky.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.recommender
import typingsSlinky.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.v1
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
      
      /** Load Recommender API v1 */
      def load(name: recommender, version: v1): js.Thenable[Unit] = js.native
      def load(name: recommender, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object recommender extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
