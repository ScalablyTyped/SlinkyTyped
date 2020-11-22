package typingsSlinky.contentfulManagement

import typingsSlinky.contentfulManagement.anon.CreateAppDefinition
import typingsSlinky.contentfulManagement.anon.Http
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/create-organization-api", JSImport.Namespace)
@js.native
object createOrganizationApiMod extends js.Object {
  
  def default(hasHttp: Http): CreateAppDefinition = js.native
  
  type ContentfulOrganizationAPI = ReturnType[js.Function1[/* hasHttp */ Http, CreateAppDefinition]]
}
