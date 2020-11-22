package typingsSlinky.maximMazurokGapiClientTesting

import typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing.ApplicationDetailServiceResource
import typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing.ProjectsResource
import typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing.TestEnvironmentCatalogResource
import typingsSlinky.maximMazurokGapiClientTesting.maximMazurokGapiClientTestingStrings.testing
import typingsSlinky.maximMazurokGapiClientTesting.maximMazurokGapiClientTestingStrings.v1
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
      
      /** Load Cloud Testing API v1 */
      def load(name: testing, version: v1): js.Thenable[Unit] = js.native
      def load(name: testing, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object testing extends js.Object {
        
        val applicationDetailService: ApplicationDetailServiceResource = js.native
        
        val projects: ProjectsResource = js.native
        
        val testEnvironmentCatalog: TestEnvironmentCatalogResource = js.native
      }
    }
  }
}
