package typingsSlinky.maximMazurokGapiClientVectortile.gapi.client.vectortile

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientVectortile.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeaturetilesResource extends js.Object {
  
  /** Gets a feature tile by its tile resource name. */
  def get(): Request[FeatureTile] = js.native
  def get(request: Accesstoken): Request[FeatureTile] = js.native
}
