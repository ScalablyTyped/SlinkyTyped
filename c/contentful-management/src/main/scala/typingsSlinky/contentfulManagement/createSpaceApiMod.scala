package typingsSlinky.contentfulManagement

import typingsSlinky.contentfulManagement.anon.CreateApiKey
import typingsSlinky.contentfulManagement.anon.HttpUpload
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/create-space-api", JSImport.Namespace)
@js.native
object createSpaceApiMod extends js.Object {
  
  def default(hasHttpHttpUpload: HttpUpload): CreateApiKey = js.native
  
  type ContentfulSpaceAPI = ReturnType[js.Function1[/* hasHttpHttpUpload */ HttpUpload, CreateApiKey]]
}
