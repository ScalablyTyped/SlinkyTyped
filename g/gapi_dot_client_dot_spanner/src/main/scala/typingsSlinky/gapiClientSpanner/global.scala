package typingsSlinky.gapiClientSpanner

import typingsSlinky.gapiClientSpanner.gapi.client.spanner.ProjectsResource
import typingsSlinky.gapiClientSpanner.gapiClientSpannerStrings.spanner
import typingsSlinky.gapiClientSpanner.gapiClientSpannerStrings.v1
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
      
      /** Load Cloud Spanner API v1 */
      def load(name: spanner, version: v1): js.Thenable[Unit] = js.native
      def load(name: spanner, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
