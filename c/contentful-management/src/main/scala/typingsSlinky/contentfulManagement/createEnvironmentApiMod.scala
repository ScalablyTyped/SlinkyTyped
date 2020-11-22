package typingsSlinky.contentfulManagement

import typingsSlinky.contentfulManagement.anon.CreateAppInstallation
import typingsSlinky.contentfulManagement.anon.HttpUpload
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/create-environment-api", JSImport.Namespace)
@js.native
object createEnvironmentApiMod extends js.Object {
  
  def default(hasHttpHttpUpload: HttpUpload): CreateAppInstallation = js.native
  
  type ContentfulEnvironmentAPI = ReturnType[js.Function1[/* hasHttpHttpUpload */ HttpUpload, CreateAppInstallation]]
}
