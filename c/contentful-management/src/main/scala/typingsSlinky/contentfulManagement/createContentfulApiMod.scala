package typingsSlinky.contentfulManagement

import typingsSlinky.contentfulManagement.anon.CreatePersonalAccessToken
import typingsSlinky.contentfulManagement.anon.Http
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createContentfulApiMod {
  
  @JSImport("contentful-management/dist/typings/create-contentful-api", JSImport.Default)
  @js.native
  def default(hasHttp: Http): CreatePersonalAccessToken = js.native
  
  type ClientAPI = ReturnType[js.Function1[/* hasHttp */ Http, CreatePersonalAccessToken]]
}
