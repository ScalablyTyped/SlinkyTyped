package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import typingsSlinky.maximMazurokGapiClientSlides.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientSlides.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagesResource extends StObject {
  
  /** Gets the latest version of the specified page in the presentation. */
  def get(): typingsSlinky.gapiClient.gapi.client.Request[Page] = js.native
  def get(request: Accesstoken): typingsSlinky.gapiClient.gapi.client.Request[Page] = js.native
  
  /**
    * Generates a thumbnail of the latest version of the specified page in the presentation and returns a URL to the thumbnail image. This request counts as an [expensive read
    * request](/slides/limits) for quota purposes.
    */
  def getThumbnail(): typingsSlinky.gapiClient.gapi.client.Request[Thumbnail] = js.native
  def getThumbnail(request: Alt): typingsSlinky.gapiClient.gapi.client.Request[Thumbnail] = js.native
}
